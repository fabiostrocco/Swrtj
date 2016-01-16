/**
 * 
 */
package org.xtext.example.navigation;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.swrtj.Args;
import org.xtext.example.swrtj.BooleanConstant;
import org.xtext.example.swrtj.BooleanExpression;
import org.xtext.example.swrtj.Cast;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.ConstructorInvocation;
import org.xtext.example.swrtj.DottedExpression;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.FieldAccess;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.GenericExpression;
import org.xtext.example.swrtj.Input;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.MethodInvocation;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.NestedExpression;
import org.xtext.example.swrtj.Null;
import org.xtext.example.swrtj.Number;
import org.xtext.example.swrtj.Output;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.ParameterAssignment;
import org.xtext.example.swrtj.ParameterReference;
import org.xtext.example.swrtj.StringConstant;
import org.xtext.example.swrtj.This;
import org.xtext.example.swrtj.Type;
import org.xtext.example.typechecking.Constraints;
import org.xtext.example.typechecking.ExpressionType;
import org.xtext.example.typechecking.ParamArgumentChecker;
import org.xtext.example.typechecking.TypingJudgmentInference;
import org.xtext.example.utils.Lookup;

/**
 * @author Fabio
 *
 */
public class ExpressionConstraintsInference extends ExpressionNavigator<Constraints> {
	private Lookup lookup = new Lookup();

	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.FieldAccess, java.lang.Object)
	 */
	@Override
	protected Constraints bind(FieldAccess message, Constraints previousReturn) {
		Constraints c = evaluate(previousReturn);
		FieldName field = message.getField();
		if(field != null && field.getName() != null) c.addField(message.getField());
		
		return c;
	}

	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.MethodInvocation, java.lang.Object)
	 */
	@Override
	protected Constraints bind(MethodInvocation message, Constraints previousReturn) {
		Constraints c = evaluate(previousReturn);
		
		MethodName method = message.getMethod();
		if(method.getName() == null) return c;
		ExpressionType noCastExpressionType = ExpressionType.createInstance(((DottedExpression)message.eContainer()).getReceiver(), true);
		if(noCastExpressionType.isThis())
			c.addMethod(method);
		List<GenericExpression> argumentList = message.getArgumentList();
		Collection<Parameter> parameterList = lookup.getParameterList(method);
		
		inferConstraints(argumentList, (List<Parameter>)parameterList, c);
		
		return c;
	}

	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.This, java.lang.Object)
	 */
	@Override
	protected Constraints bind(This start, Constraints previousReturn) {
		return evaluate(previousReturn);
	}
	
	@Override
	protected Constraints bind(Input start, Constraints previousReturn) {
		return previousReturn;
	}
	
	@Override
	protected Constraints bind(Args start, Constraints previousReturn) {
		return previousReturn;
	}

	@Override
	protected Constraints bind(Output start, Constraints previousReturn) {
		return previousReturn;
	}

	@Override
	protected Constraints bind(BooleanConstant start, Constraints previousReturn) {
		return previousReturn;
	}

	@Override
	protected Constraints bind(Number start, Constraints previousReturn) {
		return previousReturn;
	}
	
	@Override
	protected Constraints bind(StringConstant start, Constraints previousReturn) {
		return previousReturn;
	}

	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.ParameterReference, java.lang.Object)
	 */
	@Override
	protected Constraints bind(ParameterReference start, Constraints previousReturn) {
		return evaluate(previousReturn);
	}

	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.ConstructorInvocation, java.lang.Object)
	 */
	@Override
	protected Constraints bind(ConstructorInvocation start, Constraints previousReturn) {
		Constraints c = evaluate(previousReturn);	
		if(start.getClassRef() == null) return c;
		ConstructorInvocation invocation = (ConstructorInvocation)start;
		List<GenericExpression> argumentList = invocation.getArgumentList();
		Class owningClass = invocation.getClassRef();
						
		Constructor constructor = new ParamArgumentChecker().matchConstructor(owningClass, argumentList);
		
		if(constructor == null) return c;
		List<Parameter> parameterList = constructor.getParameterList();
		
		inferConstraints(argumentList, parameterList, c);
		
		return c;
	}

	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.Cast, java.lang.Object)
	 */
	@Override
	protected Constraints bind(Cast start, Constraints previousReturn) {
		return evaluate(previousReturn);
	}

	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.NestedExpression, java.lang.Object)
	 */
	@Override
	protected Constraints bind(NestedExpression start, Constraints previousReturn) {
		return evaluate(previousReturn);
	}
	
	/**
	 * Creates a new default instance for the type Constraints.
	 * @return the default insance
	 */
	@Override
	protected Constraints defaultConstructor() {
		return new Constraints();
	}
	
	/* Service methods */
	
	private void inferConstraints(List<GenericExpression> argumentList, 
                                  List<Parameter> parameterList,
                                  Constraints c) {
		if(argumentList == null || parameterList == null) return;
		
		Iterator<Parameter> iterator = parameterList.iterator();
		Parameter parameter = (parameterList.isEmpty() ? null : iterator.next());

		for(EObject argument : argumentList) {
			/*Parameter list size might be < than argument list.
			Constraint inference will continue and the correct argument-parameter matching
			will be checked in ParameterArgumentComparator class.
			 */
			if(parameter != null) {
				ExpressionType type = null;
				
				if(argument instanceof Expression) {
					type = ExpressionType.createInstance((Expression)argument);
				} else {
					type = ExpressionType.createInstance((BooleanExpression)argument);
				}

				if(type != null && type.isThis()) {
					c.addInterface(parameter.getType().getInterfaceType());
				}
			}

			if(argument instanceof Expression) {
				c.merge(new ExpressionConstraintsInference().navigate((Expression)argument));
			} else {
				c.merge(new ExpressionConstraintsInference().navigate((BooleanExpression)argument));
			}

			parameter = (iterator.hasNext() ? iterator.next() : null);
		}
	}
	
	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.FieldAssignment, java.lang.Object)
	 */
	@Override
	protected Constraints bind(Expression expression,
			                   Constraints previousReturn) {
		Constraints result = (previousReturn == null ? new Constraints() : previousReturn);
		
		for(DottedExpression term : expression.getTermList()) {
			result = bind(term, result);
		}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.FieldAssignment, java.lang.Object)
	 */
	@Override
	protected Constraints bind(DottedExpression expression,
			                   Constraints previousReturn) {
		Constraints previous = super.bind(expression, previousReturn);
		EObject value = expression.getValue();
		if(value == null || !(expression.getMessage() instanceof FieldAccess)) return previous;
		
		previous = evaluate(previous);
		FieldName field = ((FieldAccess)expression.getMessage()).getField();
		previous.addField(field);
		
		ExpressionType exprType = 
			(value instanceof Expression ?
				ExpressionType.createInstance((Expression)value) :
				ExpressionType.createInstance("boolean"));
		
		if(exprType != null && exprType.isThis()) {
			Type t = lookup.getType(field);
			Interface type = (t != null ? t.getInterfaceType() : null);
			if(type != null) previous.addInterface(type);
		}
		
		return previous;
	}

	/* (non-Javadoc)
	 * @see org.xtext.example.navigation.ExpressionNavigator#bind(org.xtext.example.swrtj.Null, java.lang.Object)
	 */
	@Override
	protected Constraints bind(Null start, Constraints previousReturn) {
		return previousReturn;
	}

	@Override
	protected Constraints bind(BooleanExpression expression,
			Constraints previousReturn) {
		return new TypingJudgmentInference().caseBooleanExpression(expression);
	}

	@Override
	protected Constraints bind(ParameterAssignment start,
			Constraints previousReturn) {
		previousReturn = evaluate(previousReturn);
		
		if(start.getValue() instanceof This && start.getParameter().getType() != null && start.getParameter().getType().getInterfaceType() != null) {
			previousReturn.addInterface(start.getParameter().getType().getInterfaceType());
		}
		
		previousReturn.merge(navigate(start.getValue()));
		
		return previousReturn;
	}
}
