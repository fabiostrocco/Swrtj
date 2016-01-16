package org.xtext.example.typechecking;

import java.util.*;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.linker.ElementFactory;
import org.xtext.example.navigation.*;
import org.xtext.example.swrtj.*;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.util.SwrtjSwitch;
import org.xtext.example.utils.*;
import org.xtext.example.validation.SwrtjJavaValidator;

/**
 * This class make the typechecking for every construct.
 * @author Strocco Fabio
 */
public class TypeChecker extends SwrtjSwitch<Collection<ErrorMessage>> {
	private Lookup lookup = new Lookup();
	private DuplicateChecker duplicateChecker = new DuplicateChecker();
	private TraitTypingJudgment lastJudgment;
	private ExpressionTypeChecker nestedTypeChecker;
	
	/**
	 * Creates a new TypeChecker.
	 * @param nestedTypeChecker the possible typechecker that creates this
	 * object.
	 */
	public TypeChecker(ExpressionTypeChecker nestedTypeChecker) {
		this.nestedTypeChecker = nestedTypeChecker;
	}
	
	/**
	 * Creates a new TypeChecker.
	 */
	public TypeChecker() {
		this(null);
	}

	/**
	 * Typechecks the expression.
	 * @param expression the expression to check.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseExpression(Expression expression) {	
		Collection<ErrorMessage> errorList = new ExpressionTypeChecker(nestedTypeChecker).navigate(expression);
		return (errorList == null ? new LinkedList<ErrorMessage>() : errorList);
	}
	
	/**
	 * Typechecks the block.
	 * @param trait the trait to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseBlock(Block block) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		if(block == null) return errorList;
		Collection<Parameter> parameterList = block.getParameterList();
		Collection<Statement> statementList = block.getStatementList();
		
		for(Parameter parameter : parameterList) {
			ExpressionType valueType = ExpressionType.createInstance(((LocalParameter)parameter).getValue());
			ExpressionType parameterType = ExpressionType.createInstance(parameter.getType());
			
			if(valueType != null && !valueType.isSubtype(parameterType)) {
				errorList.add(new ErrorMessage("Invalid local parameter assignment: " + valueType.getName() +
						                       " is not subtype of " + parameterType.getName(), parameter));
			}
			
			errorList.addAll(doSwitch(((LocalParameter)parameter).getValue()));
		}
		
		for(Statement statement : statementList) {
			errorList.addAll(doSwitch(statement));
		}
		
		return errorList;
	}
	
	/**
	 * Typechecks the boolean expression.
	 * @param expression the expression to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseBooleanExpression(BooleanExpression expression) {
		if(expression == null) return new LinkedList<ErrorMessage>();
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		Collection<AtomicBooleanExpression> atomicList = expression.getAtomicList();
		
		for(AtomicBooleanExpression atomic : atomicList) {
			errorList.addAll(doSwitch(atomic));
		}
		return errorList;
	}
	
	/**
	 * Typechecks the boolean expression.
	 * @param expression the expression to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseSimpleComparation(SimpleComparation expression) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		ExpressionType leftType = ExpressionType.createInstance(expression.getLeftExpression());
		ExpressionType rightType = ExpressionType.createInstance(expression.getRightExpression());
		String operator = (expression.getCompare() != null ? expression.getCompare().getOperator() : null);

		if(operator == null) {
			if(leftType != null && (leftType.getPrimitiveType() != null && 
			   !leftType.getPrimitiveType().equals("boolean") || leftType.getPrimitiveType() == null)) {
				errorList.add(new ErrorMessage("The expression must be a boolean expression", 
						      expression, SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION));
			}
		} else if(operator.equals("==") || operator.equals("!=")) {
			if((leftType != null && rightType != null) && !leftType.isSubtype(rightType) && !rightType.isSubtype(leftType)) {
				errorList.add(new ErrorMessage("Incomparable types " + leftType.getName() + " and " +
	                          rightType.getName(), expression));
			}
		} else /*< > <= >=*/ {
			if(leftType != null && rightType != null) {
				if(!orderComparable(leftType)) {
					errorList.add(new ErrorMessage("Cannot compare " + leftType.getName() + " using the '" + operator + "' operator", 
							                       expression, SwrtjPackage.SIMPLE_COMPARATION__LEFT_EXPRESSION));
				}
				
				if(!orderComparable(rightType)) {
					errorList.add(new ErrorMessage("Cannot compare " + rightType.getName() + " using the '" + operator + "' operator", 
							                       expression, SwrtjPackage.SIMPLE_COMPARATION__RIGHT_EXPRESSION));
				}
			} else if((leftType != null && rightType != null) && !leftType.isSubtype(rightType) && !rightType.isSubtype(leftType)) {
				      errorList.add(new ErrorMessage("Incomparable types " + leftType.getName() + " and " +
	                  rightType.getName(), expression));
			}
		}
		
		Collection<ErrorMessage> leftErrors = null;
		if(expression.getLeftExpression() != null) leftErrors = doSwitch(expression.getLeftExpression());
		Collection<ErrorMessage> rightErrors = null;
		if(expression.getRightExpression() != null) rightErrors = doSwitch(expression.getRightExpression());
		
		if(leftErrors != null) errorList.addAll(leftErrors);
		if(rightErrors != null) errorList.addAll(rightErrors);
		
		return errorList;
	}
	
	/**
	 * Typechecks the boolean expression.
	 * @param expression the expression to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseNestedBooleanExpression(NestedBooleanExpression expression) {
		return caseBooleanExpression((BooleanExpression)expression.getNestedExpression());
	}
	
	/**
	 * Typechecks the expression statement.
	 * @param expression the expression to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseExpressionStatement(ExpressionStatement statement) {
		Collection<ErrorMessage> errorList = caseExpression((Expression)statement.getExpression());
		return errorList;
	}
	
	/**
	 * Typechecks the if then else statement.
	 * @param trait the trait to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseIfThenElseStatement(IfThenElseStatement statement) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		errorList.addAll(caseBooleanExpression((BooleanExpression)statement.getCondiction()));
		errorList.addAll(caseBlock(statement.getTrueBranch()));
		errorList.addAll(caseBlock(statement.getFalseBranch()));
				
		return errorList;
	}
	
	/**
	 * Typechecks the while statement.
	 * @param trait the trait to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseWhileStatement(WhileStatement statement) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		errorList.addAll(caseBooleanExpression((BooleanExpression)statement.getCondiction()));
		errorList.addAll(caseBlock(statement.getWhileBlock()));

		return errorList;
	}
	
	/**
	 * Typechecks the method. 
	 * @param method the method to check.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseProvidedMethod(ProvidedMethod method) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();

		//Block type checking
		errorList.addAll(caseBlock(method.getBlock()));
		
		ReturnStatement returnStatement = method.getReturnStatement();

		//Return type check
		
		Expression returnExpression = (returnStatement == null ? null : 
			                           (Expression)method.getReturnStatement().getExpression());
		ExpressionType returnExpressionType = null;
		ExpressionType returnType = ExpressionType.createInstance(method.getReturnType());
		
		if(returnExpression != null) {
			Collection<ErrorMessage> errors = caseExpression(returnExpression);
			if(errors != null) errorList.addAll(errors);
			returnExpressionType = ExpressionType.createInstance(returnExpression);
		}
		
		if(returnExpressionType == null) {
			if(!returnType.isVoid()) {
				errorList.add(new ErrorMessage("Missing return type in non-void method", method));
			}
		} else if(!returnExpressionType.isSubtype(returnType) && !returnType.isVoid()) {
			errorList.add(new ErrorMessage("Invalid return type: cannot convert " +
					                      returnExpressionType.getName() + " to " + returnType.getName(),
					                      returnExpression));
		} else if(returnType.isVoid() && returnExpression != null)
			errorList.add(new ErrorMessage("Return expression not allowed in methods with void return type", method.getReturnStatement()));
		
		return errorList;
	}
	
	/**
	 * Typechecks the trait.
	 * @param trait the trait to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseTrait(Trait trait) {
		Collection<ErrorMessage> errorList = new TraitTypeChecker(this).navigate(trait);
		
		return errorList;
	}
	
	/**
	 * Typechecks the trait.
	 * @param trait the trait to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseTraitExpression(TraitExpression trait) {
		Collection<ErrorMessage> errorList = new TraitTypeChecker(this).navigate(trait);
		
		return errorList;
	}
	
	/**
	 * Typechecks the record.
	 * @param record the record to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseRecord(Record record) {
		Collection<ErrorMessage> errorList = new RecordTypeChecker().navigate(record);
		errorList.addAll(new RecordCicleChecker().navigate(record));
		
		return errorList;
	}
	
	/**
	 * Typechecks the record.
	 * @param record the record to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseRecordExpression(RecordExpression record) {
		Collection<ErrorMessage> errorList = new RecordTypeChecker().navigate(record);
		
		return errorList;
	}
	
	/**
	 * Typechecks the interface.
	 * @param interfaceType the interface to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseInterface(Interface interfaceType) {
		if(ElementFactory.getFactory().exists(interfaceType.getName())) 
			return new LinkedList<ErrorMessage>();
		
		Collection<ErrorMessage> errorList = new DuplicateChecker().checkMethodConflicts(interfaceType);		
		InterfaceMap interfaces = new InterfaceMap();
		interfaces.add(interfaceType);
		if(!cycleCheck(interfaceType, interfaceType, interfaces))
			errorList.add(new ErrorMessage("Cyclic interface definition", interfaceType, SwrtjPackage.INTERFACE__NAME));
		
		return errorList;
	}
	
	/**
	 * Typechecks the class.
	 * @param classType the class to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseClass(Class classType) {
		if(ElementFactory.getFactory().exists(classType.getName())) 
			return new LinkedList<ErrorMessage>();
		
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();		
		RecordExpression record = classType.getRecordExpression();
		TraitExpression trait = classType.getTraitExpression();
		
		errorList.addAll(caseRecordExpression(record));
		errorList.addAll(caseTraitExpression(trait));
		
		Constraints constraints = (lastJudgment == null ? new Constraints() : lastJudgment.getAllConstraints());
		Map<String, FieldName> providedFields = lookup.getProvidedFields(record);
		Collection<FieldName> requiredFields = constraints.getRequiredFields();
		Map<String, MethodName> providedMethods = lookup.getProvidedMethods(trait);

		Collection<MethodName> requiredMethods = constraints.getRequiredMethods();
		Collection<Interface> allProvidedInterfaces = lookup.getAllImplementedInterfaces(classType).values();
		Collection<Interface> requiredInterfaces = constraints.getRequiredInterfaces();
		InterfaceMap allRequiredInterfaces = lookup.getAllInterfaces(requiredInterfaces);
		
		
		boolean unprovidedFields = false;
		// Field check
		for(FieldName requiredField : requiredFields) {
			String name = requiredField.getName();
			if(name == null) continue;
			FieldName providedField = providedFields.get(name);
			EObject owner = lookup.getOwner(requiredField);
			String location = (owner == null ? "" : owner instanceof AnonimousTrait ? "" :
				               " in trait " + ((Trait)owner).getName());
			
			if(!providedFields.containsKey(name)) {
				errorList.add(new ErrorMessage("Required field " + name + location +
	                                           " is not provided by this class", classType));
				unprovidedFields = true;
			} else if (!duplicateChecker.equalsType(lookup.getType(requiredField), 
					                                lookup.getType(providedField))){
				errorList.add(new ErrorMessage("Field " + name + 
						                       " doesn't match with the request", classType));
			}
		}
		
		if(unprovidedFields) {
			errorList.add(new ErrorMessage("Some required fields are not provided by the traits", SwrtjJavaValidator.UNPROVIDED_FIELDS, classType, 0));
		}
		
		boolean unprovidedTraitMethods = false;
		// Method check
		for(MethodName requiredMethod : requiredMethods) {
			String name = requiredMethod.getName();
			MethodName providedMethod = providedMethods.get(name);
			EObject owner = lookup.getOwner(requiredMethod);
			String location = (owner == null ? "" : owner instanceof Trait ? " in trait " + ((Trait)owner).getName() :
				               "");
			
			if(!providedMethods.containsKey(name)) {
				errorList.add(new ErrorMessage("Required method " + name + location +
						                       " is not provided by this class", classType));
				unprovidedTraitMethods = true;
			} else if (!duplicateChecker.equalsSignature(lookup.getOwnerMethod(requiredMethod), lookup.getOwnerMethod(providedMethod))){
				errorList.add(new ErrorMessage("Method " + name + 
						                       " doesn't match with the request", classType));
			}
		}
		
		if(unprovidedTraitMethods) {
			errorList.add(new ErrorMessage("Some trait method requests are not provided by the traits", SwrtjJavaValidator.TRAIT_UNPROVIDED_METHODS, classType, 0));
		}
		
		// Interface check
		for(Interface providedInterface : allProvidedInterfaces) {
			allRequiredInterfaces.remove(providedInterface);
			if(allRequiredInterfaces.isEmpty()) break;
		}
		
		Collection<Interface> unprovidedInterfaces = allRequiredInterfaces.values();
		
		for(Interface i : unprovidedInterfaces) {
			if(requiredInterfaces.contains(i)) {
				errorList.add(new ErrorMessage("Required interface " + i.getName() + ", or one of its subtype " + 
						                       "is not provided by this class", classType));
			}
		}
		
		boolean interfaceRequest = false;
		// Interface required methods
		Set<Method> methodSet = lookup.getAllInterfaceRequiredMethods(classType);
		
		for(Method requiredMethod : methodSet) {
			if(requiredMethod == null || requiredMethod.getMethodRef() == null) {continue;}
			String name = requiredMethod.getMethodRef().getName();
			MethodName providedMethod =  providedMethods.get(name);
			
			if(!providedMethods.containsKey(name)) {
				errorList.add(new ErrorMessage("Required method " + name + " in interface " + 
						                       ((Interface)lookup.getOwner(requiredMethod)).getName() +
						                       " is not provided by this class", classType));
				interfaceRequest = true;
			} else if (!duplicateChecker.equalsSignature(requiredMethod, lookup.getOwnerMethod(providedMethod))){
				errorList.add(new ErrorMessage("Method " + name + " doesn't match with the required one in the interface " +
						                       ((Interface)lookup.getOwner(requiredMethod)).getName(), 
						                       classType));
			}
		}
		if(interfaceRequest) {
			errorList.add(new ErrorMessage("Some interface method requests are not provided by the traits", SwrtjJavaValidator.INTERFACE_UNPROVIDED_METHODS, classType, 0));
		}

		
		// Constructor overloading
		errorList.addAll(duplicateChecker.checkConstructorConflicts(classType));
		Collection<Constructor> constructorList = classType.getConstructorList();
		
		for(Constructor c : constructorList) {
			Collection<ErrorMessage> errors = caseBlock(c.getBlock());
			errors.addAll(duplicateChecker.checkDuplicatedParameters(c));
			if(errors != null) errorList.addAll(errors);
		}
		
		return errorList;
	}
	
	/**
	 * Typechecks the program.
	 * @param program the program to typecheck.
	 * @return an error message list if the typecheck fails, an empty list otherwise.
	 */
	@Override
	public Collection<ErrorMessage> caseProgram(Program program) {
		return caseBlock(program.getBlock());
	}
		
	/**
	 * Typecheck all the elements contained in the file.
	 * @param file the file to typecheck.
	 * @return the list of all the errors found during the typechecking.
	 */
	public Collection<ErrorMessage> typeCheck(File file) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		Collection<Element> elementList = file.getElementList();
		
		for(Element element : elementList) {
			errorList.addAll(doSwitch(element));
		}
		
		return errorList;
	}
	
	/**
	 * Sets the last typing judgment.
	 * @param judgment the last typing judgment.
	 */
	public void setTraitJudgment(TraitTypingJudgment judgment) {
		this.lastJudgment = judgment;
	}
	
	
	/* Service methods */
	
	private boolean cycleCheck(Interface baseInterface, Interface interfaceType, InterfaceMap interfaces) {
		Collection<Interface> directExtendsList = lookup.getExtendedInterfaces(interfaceType).values();
		
		for(Interface i : directExtendsList) {
			if(baseInterface.getName().equals(i.getName())) 
				return false;
			else if(!interfaces.contains(i)) {
				interfaces.add(i);
				if(!cycleCheck(baseInterface, i, interfaces)) return false;
			}
		}
		
		return true;
	}
	
	private boolean orderComparable(ExpressionType type) {
		String typeName = type.getPrimitiveType();
		if(typeName == null) return false;
		
		if(typeName.equals("void") ||
		   typeName.equals("boolean")  || 
		   typeName.equals("char")) {
			return false;
		}
		
		return true;
	}
}