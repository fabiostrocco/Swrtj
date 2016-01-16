package org.xtext.example.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.xtext.example.swrtj.AnonimousRecord;
import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.Block;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.ExpressionStatement;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.IfThenElseStatement;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.RequiredMethod;
import org.xtext.example.swrtj.Statement;
import org.xtext.example.swrtj.TraitElement;
import org.xtext.example.swrtj.Type;
import org.xtext.example.swrtj.WhileStatement;
import org.xtext.example.swrtj.util.SwrtjSwitch;

/**
 * Checks for duplicated elements.
 * @author Strocco Fabio
 */
public class DuplicateChecker {

	
	/**
	 * Creates a new istance of this class.
	 */
	public DuplicateChecker() {}
	
	/**
	 * Checks if the specified element has already been declared somewhere.
	 * Not that a conflict is detected only if an element of the same type with the same name is
	 * found. For instance the list {class A, class A} is a conflict, but {class A, interface A} is ok.
	 * @param fileList the files to be checked. For a correct error highlithing the file in witch show
	 * errors should be the first element of the list.
	 * @return an error message list if there are duplicates exists, an empty list otherwise.
	 */
	public Collection<ErrorMessage> checkDuplicateElements(List<File> fileList) {
		Set<String> nameSet = new HashSet<String>();
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		File originalFile = fileList.get(0);
		int fileIndex = 0;
		
		for(File f : fileList) {
			List<Element> elementList = f.getElementList();
			
		 	for(Element e : elementList) {
		 		//This name should be unique(otherwise a conflict will be detected)
		 		String name = e.getName();
		 		
		 		Element feature = null;
		 		if(isDuplicate(nameSet, name) && (feature = (f != originalFile ? getFeature(name, originalFile) : e)) != null)
		 			errorList.add(new ErrorMessage(name + " has already been used to define an element(class, interface, or something else)", 
		 					                       feature));
		 	}
		 	fileIndex++;
		}
		
		return errorList;
	}
	
	/**
	 * Checks that there are no duplicated interfaces.
	 * @param interfaceList the interface list to check.
	 * @param the owner element in which mark the errors.
	 * @return an error message if there are duplication, an empty list otherwise.
	 */
	public Collection<ErrorMessage> checkDuplicateInterfaces(Element owner, Collection<Interface> interfaceList) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		Set<String> nameSet = new HashSet<String>();
		
		for(Interface i : interfaceList) {
			if(isDuplicate(nameSet, i.getName()))
				errorList.add(new ErrorMessage("Duplicated interfaces: " + i.getName(), owner));
		}
		
		return errorList;
	}
	
	/**
	 * Checks that there are no duplicated extendsd interfaces.
	 * @param interfaceType the interface to check.
	 * @return an error message if there are duplication, an empty list otherwise.
	 */
	public Collection<ErrorMessage> checkDuplicateInterfaces(Interface interfaceType) {
		return checkDuplicateInterfaces(interfaceType, interfaceType.getExtendsList());
	}
	
	/**
	 * Checks that there are no duplicated implemented interfaces.
	 * @param classType the class to check.
	 * @return an error message if there are duplication, an empty list otherwise.
	 */
	public Collection<ErrorMessage> checkDuplicateInterfaces(Class classType) {
		return (checkDuplicateInterfaces(classType, classType.getImplementsList()));
	}
	
	/**
	 * Checks if there is any method name conflict in the interface extends graph.
	 * @param interface the interface to check.
	 * @return an error message if there is a name conflict(same name but different signatures), an empty list otherwise.
	 */
	public Collection<ErrorMessage> checkMethodConflicts(Interface interfaceType) {
		Set<String> nameSet = new HashSet<String>();
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		List<Method> methodList = interfaceType.getRequiredMethodList();
		Map<String, Method> methodMap = new HashMap<String, Method>();
		
		for(Method method : methodList) {
			if(method.getMethodRef() != null && isDuplicate(nameSet, method.getMethodRef().getName()))
				errorList.add(new ErrorMessage("Duplicated method", method));
			else if(method.getMethodRef() != null) methodMap.put(method.getMethodRef().getName(), method);
		}
		
		Collection<Interface> extendedInterfaces = new Lookup().getAllExtendedInterfaces(interfaceType).values();
		Set<String> checkedMethodNames = new HashSet<String>();
		
		for(Interface i : extendedInterfaces) {
			methodList = i.getRequiredMethodList();
			for(Method m : methodList) {
				String methodName = m.getMethodRef().getName();
				if(methodMap.containsKey(methodName) && !checkedMethodNames.contains(methodName) &&
				   !equalsSignature(m, methodMap.get(methodName))) {
					errorList.add(new ErrorMessage("Method name with different signature already defined", m));
					checkedMethodNames.add(methodName);
				}
			}
		}
		
		return errorList;
	}
	
	
	/**
	 * Checks if there are duplicated constructors in the specified class.
	 * @param classType the class to check.
	 * @return an error message list if there are duplicated constructors, an empty list otherwise.
	 */
	public Collection<ErrorMessage> checkConstructorConflicts(Class classType) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		Collection<Constructor> constructorList = classType.getConstructorList();
		Set<Integer> parameterCountList = new HashSet<Integer>();
		
		for(Constructor constructor : constructorList) {
			int parameterCount = constructor.getParameterList().size();
			
			if(parameterCountList.contains(parameterCount))
				errorList.add(new ErrorMessage("Constructor with " + parameterCount + " parameter already " +
						                       "defined", constructor));
				
			parameterCountList.add(parameterCount); 
		}
		
		return errorList;
	}
	
	/**
	 * Checks if there are duplicated method or fields in the specified traits.
	 * A method and a field with the same name is not a conflict.
	 * A provided method and a required method with the same name is a conflict.
	 * @param trait the trait to check.
	 * @return an error message list if there are duplicated elements, an empty list otherwise.
	 */
	public Collection<ErrorMessage> checkTraitElementConflicts(AnonimousTrait trait) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		List<TraitElement> elementList = trait.getDefinitionList();
		Set<String> methodSet = new HashSet<String>();
		Set<String> fieldSet = new HashSet<String>();
		
		for(TraitElement element : elementList) {
			String name;
			if(element instanceof Method) name = ((Method)element).getMethodRef().getName();
			else name = ((Field)element).getFieldRef().getName();

			if(element instanceof Method) {
				if(isDuplicate(methodSet, name)) errorList.add(new ErrorMessage("Duplicated method name", element));
			}
			else if(element instanceof Field) {
				if(isDuplicate(fieldSet, name)) errorList.add(new ErrorMessage("Duplicated field name", element));
			}
		}
		
		return errorList;
	}
	
	/**
	 * Checks if there are duplicated field names on the record.
	 * @param fields the collection of field to be checked.
	 * @return an error message if there are duplicate field names, <code>null</code> otherwise.
	 */
	public Collection<ErrorMessage> checkRecordConflicts(AnonimousRecord record) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		List<Field> elementList = record.getDeclarationList();
		Set<String> fieldSet = new HashSet<String>();
		
		for(Field element : elementList) {
			String name = (element.getFieldRef() != null ? element.getFieldRef().getName() : null);
			if(name != null && isDuplicate(fieldSet, name))
				errorList.add(new ErrorMessage("Duplicated fields", element));
		}
		
		return errorList;
	}
	
	/**
	 * Checks if there are duplicated parameter declaration in the specified method declaration.
	 * @param method the method to check.
	 * @return an error message list if there are duplicate parameter declarations, an empty list otherwise.
	 */
	public Collection<ErrorMessage> checkDuplicatedParameters(Method method) {
		return new DupLocalParsChecker().check(method);
	}
	
	/**
	 * Checks if there are duplicated parameter declaration in the specified constructor declaration.
	 * @param constructor the constructor.
	 * @return an error message list if there are duplicate parameter declarations, an empty list otherwise.
	 */
	public Collection<ErrorMessage> checkDuplicatedParameters(Constructor constructor) {
		return new DupLocalParsChecker().check(constructor);
	}
	
	/**
	 * Checks if the given method has the same signature.
	 * @param m1 the first method to compare.
	 * @param m2 the second method to compare.
	 * @return <code>true</code> it the methods has the same signature, <code>false</code>
	 * otherwise.
	 */
	public boolean equalsSignature(Method m1, Method m2) {
		if(!equalsType(m1.getReturnType(), m2.getReturnType())) return false;
		List<Parameter> m1ParameterList = m1.getParameterList();
		List<Parameter> m2ParameterList = m2.getParameterList();
		Iterator<Parameter> iterator = m2ParameterList.iterator();
		
		if(m1ParameterList.size() != m2ParameterList.size()) return false;
		
		for(Parameter parameter1 : m1ParameterList) {
			Parameter parameter2 = (iterator.hasNext() ? iterator.next() : null);
			
			if(parameter2 == null || !equalsType(parameter1.getType(), parameter2.getType())) return false;
		}
		
		return true;
	}
	
	/**
	 * Checks if the given type are equals.
	 * @param type1 the first type.
	 * @param type2 the second type.
	 * @return <code>true</code> it the types are equals, <code>false</code> otherwise.
	 */
	public boolean equalsType(Type type1, Type type2) {
		if(type1 == null || type2 == null) return false;
		
		if(type1.getPrimitiveType() != null) {
			if(!type1.getPrimitiveType().equals(type2.getPrimitiveType())) {
				return false;
			}
		} else if(type1.getInterfaceType() != null) {
			if(type2.getInterfaceType() == null) {
				return false;
			}
			
			if(type1.getInterfaceType().getName() != null &&
			   !type1.getInterfaceType().getName().equals(type2.getInterfaceType().getName())) {
				return false;
			}
		}
		
		return true;
	}
	
	/* Service methods */
	
	private static boolean isDuplicate(Set<String> nameSet, String name) {
		return !nameSet.add(name);
	}
	
	private Element getFeature(String name, File file) {
		Collection<Element> elementList = file.getElementList();
		for(Element element : elementList) {
			if(element.getName().equals(name))
				return element;
		}
		
		return null;
	}
	
	/* Nested classes */
	
	private class DupLocalParsChecker extends SwrtjSwitch<Collection<ErrorMessage>> {
		private Set<String> nameSet = new HashSet<String>();
		
		public Collection<ErrorMessage> check(Constructor constructor) {
			return check(constructor.getBlock(), constructor.getParameterList());
		}
		
		public Collection<ErrorMessage> check(Method method) {
			return doSwitch(method);
		}
		
		public Collection<ErrorMessage> check(Block block, Collection<Parameter> initialParameterList) {
			Collection<Parameter> parameterList = new LinkedList<Parameter>();
			Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
			Collection<Statement> statementList = new LinkedList<Statement>();
			
			if(block != null) parameterList.addAll(block.getParameterList());
			if(initialParameterList != null) parameterList.addAll(initialParameterList);
			if(block != null) statementList.addAll(block.getStatementList());
			
			
			for(Parameter parameter : parameterList) {
				String name = parameter.getName();
				if(isDuplicate(nameSet, name))
					errorList.add(getErrorMessage(parameter));
			}
			
			for(Statement statement : statementList) {
				errorList.addAll(doSwitch(statement));
			}
			
			return errorList;
		}
		
		public Collection<ErrorMessage> check(Block block) {
			return check(block, null);
		}
		
		public Collection<ErrorMessage> check(Collection<Parameter> parameterList) {
			return check(null, parameterList);
		}
		
		@Override
		public Collection<ErrorMessage> caseRequiredMethod(RequiredMethod method) {
			return check(method.getParameterList());
		}
		
		@Override
		public Collection<ErrorMessage> caseProvidedMethod(ProvidedMethod method) {
			return check(method.getBlock(), method.getParameterList());
		}
		
		@Override
		public Collection<ErrorMessage> caseExpressionStatement(ExpressionStatement statement) {
			return new LinkedList<ErrorMessage>();
		}
		
		@Override
		public Collection<ErrorMessage> caseIfThenElseStatement(IfThenElseStatement statement) {
			Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
			Block trueBlock = statement.getTrueBranch();
			Block falseBlock = statement.getFalseBranch();
			
			if(trueBlock != null) errorList.addAll(check(trueBlock));
			if(falseBlock != null) errorList.addAll(check(falseBlock));
			
			return errorList;
		}
		
		@Override
		public Collection<ErrorMessage> caseWhileStatement(WhileStatement statement) {
			Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
			Block whileBlock = statement.getWhileBlock();
			
			if(whileBlock != null) errorList.addAll(check(whileBlock));
			
			return errorList;
		}
		
		private ErrorMessage getErrorMessage(Parameter parameter) {
			return new ErrorMessage("Duplicated local variable", parameter);
		}
	}
}