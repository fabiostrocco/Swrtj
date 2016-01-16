package org.xtext.example.typechecking;

import java.util.*;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.swrtj.*;
import org.xtext.example.swrtj.Class;
import org.xtext.example.utils.*;

/**
 * Checks that the declarated formal parameters of a method signature are compatible with something.
 * @author Strocco Fabio
 */
public class ParamArgumentChecker {

	/**
	 * Checks that the arguments of a method invocation matches(are subtype) with the associated method declaration formal parameters. 
	 * @param method the method declaration
	 * @param message the invocation
	 * @return an error message list if the parameters doesn't match with the declaration.
	 */
	public Collection<ErrorMessage> compareMethodParameter(Method method, MethodInvocation message) {
		if(method == null || message == null)
			return new LinkedList<ErrorMessage>();
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		Collection<Parameter> parameterList = method.getParameterList();
		Collection<GenericExpression> argumentList = message.getArgumentList();
		int difference = parameterList.size() - argumentList.size();
		
		if(difference > 0)
			errorList.add(new ErrorMessage("Missing " + difference + " " + (difference == 1 ? "parameter " : "parameters ") + 
					                       "to method " + method.getMethodRef().getName(), message));
		else if(difference < 0)
			errorList.add(new ErrorMessage("Too much arguments(" + (argumentList.size()) + " instead of " +
					                       parameterList.size() + ") in method " + 
                                           method.getMethodRef().getName(), message));
		
		errorList.addAll(compareParameters(parameterList, argumentList));
		
		return errorList;
	}

	/**
	 * Checks that the arguments of a constructor invocation matches(are subtype) with the associated constructor
	 * declaration formal parameters. 
	 * @param constructor the constructor declaration
	 * @param message the invocation
	 * @return an error message list if the parameters doesn't match with the declaration.
	 */
	public Collection<ErrorMessage> compareConstructorParameters(Constructor constructor, ConstructorInvocation send) {
		if(constructor == null || send == null) return new LinkedList<ErrorMessage>();
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		Collection<Parameter> parameterList = constructor.getParameterList();
		Collection<GenericExpression> argumentList = send.getArgumentList();
		
		errorList.addAll(compareParameters(parameterList, argumentList));
		
		return errorList;
	}
	
	/**
	 * Returns the appropriate overload version of the constructor that matches with the given
	 * argument list.
	 * @param owningClass the referenced class in the constructor.
	 * @param argumentList the argument list passed to the constructor.
	 * @return the matched constructor if it exists, <code>false</code> otherwise.
	 */
	public Constructor matchConstructor(Class owningClass, Collection<GenericExpression> argumentList) {
		List<Constructor> constructorList = (owningClass != null ? owningClass.getConstructorList() : new LinkedList<Constructor>());
		
		for(Constructor constructor : constructorList) {
			if(constructor.getParameterList().size() == argumentList.size())
				return constructor;
		}
		
		return null;
	}
	
	/* Service methods */
	
	private Collection<ErrorMessage> compareParameters(Collection<Parameter> parameterList, 
                                                       Collection<GenericExpression> argumentList) {
		Iterator<Parameter> iterator = parameterList.iterator();
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		int counter = 1;
		
		for(EObject argument : argumentList) {
			ExpressionType argumentType = null;
			
			if(argument instanceof Expression) {
				argumentType = ExpressionType.createInstance((Expression)argument);
			} else {
				argumentType = ExpressionType.createInstance((BooleanExpression)argument);
			}
			
			Parameter parameter = (iterator.hasNext() ? iterator.next() : null);
			
			if(parameter != null) {
				ExpressionType parameterType = ExpressionType.createInstance(parameter.getType());
				
				if(argumentType != null && !argumentType.isSubtype(parameterType)) {
					errorList.add(new ErrorMessage("Argument in parameter " + counter + 
							                       " is not sutype of " + typeName(parameter.getType()),
							                       argument));
				}
			} else break;
			
			counter++;
		}
		
		return errorList;
	}
	
	private String typeName(Type type) {
		String primitive = type.getPrimitiveType();
		
		return (primitive != null ? primitive : type.getInterfaceType().getName());
	}
}