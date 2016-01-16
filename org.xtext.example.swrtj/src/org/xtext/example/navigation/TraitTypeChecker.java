package org.xtext.example.navigation;

import java.util.Collection;
import java.util.LinkedList;

import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.BaseTrait;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.NestedTraitExpression;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.RequiredMethod;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.swrtj.TraitAlias;
import org.xtext.example.swrtj.TraitElement;
import org.xtext.example.swrtj.TraitExclude;
import org.xtext.example.swrtj.TraitExpression;
import org.xtext.example.swrtj.TraitFieldRename;
import org.xtext.example.swrtj.TraitMethodRename;
import org.xtext.example.swrtj.TraitName;
import org.xtext.example.swrtj.TraitOperation;
import org.xtext.example.typechecking.Constraints;
import org.xtext.example.typechecking.MethodTypingJudgment;
import org.xtext.example.typechecking.TraitTypingJudgment;
import org.xtext.example.typechecking.TypeChecker;
import org.xtext.example.typechecking.TypingJudgmentInference;
import org.xtext.example.utils.DuplicateChecker;
import org.xtext.example.utils.ErrorMessage;
import org.xtext.example.utils.Lookup;
import org.xtext.example.validation.SwrtjJavaValidator;

public class TraitTypeChecker extends Navigator<Collection<ErrorMessage>> {
	private TypeChecker typeChecker;
	private DuplicateChecker duplicateChecker = new DuplicateChecker();
	private TypingJudgmentInference typeInference = new TypingJudgmentInference();
	private Lookup lookup = new Lookup();
	
	private TraitTypingJudgment elements = new TraitTypingJudgment();
	private TraitTypingJudgment current;
	
	/**
	 * Creates a new trait typechecker.
	 * @param typeChecker the main typechecker that uses this trait typechecker.
	 */
	public TraitTypeChecker(TypeChecker typeChecker) {
		this.typeChecker = typeChecker;
	}
	
	/**
	 * Navigate on the trait and collects the results.
	 * @param trait the trait to navigate.
	 * @return the target result.
	 */
	public Collection<ErrorMessage> navigate(Trait trait) {
		if(trait == null) return defaultConstructor();
		
		TraitExpression expression = trait.getExpression();
		if(expression == null) return defaultConstructor();
		
		Collection<ErrorMessage> errorList = doNavigate(expression);
		errorList.addAll(new TraitCicleChecker().navigate(trait));
		typeChecker.setTraitJudgment(elements);
		
		return errorList;
	}
	
	/**
	 * Navigate on the trait and collects the results.
	 * @param expression the trait expression to navigate.
	 * @return the target result.
	 */
	public Collection<ErrorMessage> navigate(TraitExpression expression) {
		if(expression == null) return defaultConstructor();
		Collection<ErrorMessage> errorList = doNavigate(expression);
		typeChecker.setTraitJudgment(elements);
		
		return errorList;
	}
	
	/**
	 * Navigate on the base trait and collects the results.
	 * @param base the base trait to navigate.
	 * @return the target result.
	 */
	public Collection<ErrorMessage> navigate(BaseTrait base) {
		if(base == null) return defaultConstructor();
		
		Collection<ErrorMessage> errorList = doSwitch(base);
		typeChecker.setTraitJudgment(elements);
		return errorList;
	}
	
	/**
	 * Starts the navigation.
	 * @param expression the trait expression.
	 * @param check checks for duplicate if this parameter is <code>true</false>.
	 * @return the trait accessible elements.
	 */
	protected Collection<ErrorMessage> doNavigate(TraitExpression expression, boolean check) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		Collection<BaseTrait> traitList = expression.getTraitList();
		
		for(BaseTrait trait : traitList) {
			//current = elements contained in trait(without considering expressions)
			errorList.addAll(doSwitch(trait));
			
			Collection<TraitOperation> operations = trait.getOperationList();
			
			for(TraitOperation operation : operations) {
				//Uses current in order to check base trait elements and remove or rename elements
				errorList.addAll(doSwitch(operation));
			}
			
			if(!check) return errorList;
			
			//Collection<String> totalNames = elements.getAllMethodNames();
			Collection<String> currentNames = current.getAllMethodNames();
			Constraints totalConstraints = elements.getAllConstraints();
			Constraints currentConstraints = current.getAllConstraints();
			//Collection<FieldName> totalFields = totalConstraints.getRequiredFields();
			Collection<FieldName> currentFields = currentConstraints.getRequiredFields();
			//Collection<MethodName> totalMethods = totalConstraints.getRequiredMethods();
			Collection<MethodName> currentMethods = currentConstraints.getRequiredMethods();
			
			//Provided method conflict check
			for(String name : currentNames) {
				boolean errors = false;
				if(elements.getMethodTypingJudgment(name) != null) {
					errorList.add(new ErrorMessage("Provided method conflict detected '" + name + "': rename, or " +
							                       "remove it", trait));
					errors = true;
				}
				
				MethodName method = totalConstraints.getRequiredMethod(name);
				
				if(method != null && 
				   !duplicateChecker.equalsSignature(lookup.getOwnerMethod(current.getMethodTypingJudgment(name).getMethod()), 
						                             lookup.getOwnerMethod(method))) {
					errorList.add(new ErrorMessage("Method conflict detected '" + name + "': rename, or " +
		                                           "remove it", trait));
					errors = true;
				}
				
				if(!errors) {
					elements.addMethodTypingJudgment(current.getMethodTypingJudgment(name));
				}
			}
			
			//Required field confilct check
			for(FieldName name : currentFields) {
				if(totalConstraints.contains(name) && 
				   !duplicateChecker.equalsType(lookup.getType(name), 
					                            lookup.getType(totalConstraints.getRequiredField(name.getName())))) {
					errorList.add(new ErrorMessage("Required field conflict detected '" + name.getName() + "': rename, or " +
		                                           "remove it", trait));
				}
			}
			
			//Required method confilct check
			for(MethodName name : currentMethods) {
				if(totalConstraints.contains(name) && 
				   !duplicateChecker.equalsSignature(lookup.getOwnerMethod(name), 
					                                 lookup.getOwnerMethod(totalConstraints.getRequiredMethod(name.getName())))) {
					errorList.add(new ErrorMessage("Required method conflict detected '" + name.getName() + "': rename, or " +
		                                           "remove it", trait));
				}
				
				MethodName method = currentConstraints.getRequiredMethod(name.getName());
				
				if(method != null && 
				   elements.getMethodTypingJudgment(name.getName()) != null &&
				   !duplicateChecker.equalsSignature(lookup.getOwnerMethod(elements.getMethodTypingJudgment(name.getName()).getMethod()), 
						                             lookup.getOwnerMethod(method))) {
					errorList.add(new ErrorMessage("Method conflict detected '" + name.getName() + "': rename, or " +
		                                           "remove it", trait));
				}
			}
		}
		
		return errorList;
	}
	
	/**
	 * Starts the navigation.
	 * @param expression the record expression.
	 * @return the record accessible fields.
	 */
	protected Collection<ErrorMessage> doNavigate(TraitExpression expression) {
		return doNavigate(expression, true);
	}
	
	@Override
	public Collection<ErrorMessage> caseAnonimousTrait(AnonimousTrait trait) {
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		errorList.addAll(duplicateChecker.checkTraitElementConflicts(trait));
		
		
		current = new TraitTypingJudgment();
		Collection<TraitElement> elementList = trait.getDefinitionList();
		
		for(TraitElement element : elementList) {
			if(element instanceof ProvidedMethod) {
				ProvidedMethod method = (ProvidedMethod)element;
				MethodTypingJudgment judgment = typeInference.inferMethodTypingJudgment(method);
				current.addMethodTypingJudgment(judgment);
				errorList.addAll(typeChecker.caseProvidedMethod(method));
			}
		}
		
		Constraints c = current.getAllConstraints();
		//test constraint <<>> requests
		Collection<TraitElement> traitElementList = trait.getDefinitionList();		
		for(TraitElement element : traitElementList) {
			if(element instanceof Field && !c.contains(((Field)element).getFieldRef()))
				errorList.add(new ErrorMessage("Unused required field", SwrtjJavaValidator.UNUSED_REQUIRED_FIELD, ((Field)element).getFieldRef(), null));
			else if(element instanceof RequiredMethod && !c.contains(((RequiredMethod)element).getMethodRef()))
				errorList.add(new ErrorMessage("Unused required method", SwrtjJavaValidator.UNUSED_REQUIRED_METHOD, ((RequiredMethod)element).getMethodRef(), 0));
		}
				
		return errorList;
	}
	
	@Override
	public Collection<ErrorMessage> caseTraitName(TraitName trait) {
		current = new TraitConstraintInference().navigate(trait.getTrait());
		
		return defaultConstructor();
	}
	
	@Override
	public Collection<ErrorMessage> caseNestedTraitExpression(NestedTraitExpression trait) {	
		TraitExpression expression = trait.getExpression();
		Collection<ErrorMessage> errorList = defaultConstructor();
		
		if(expression != null) {
			TraitTypeChecker typeChecker = new TraitTypeChecker(this.typeChecker);
			errorList = typeChecker.navigate(expression);
			current = new TraitConstraintInference().navigate(trait);
		}
		
		//TODO ???
		current = new TraitConstraintInference().navigate(expression);
		
		return errorList;
	}
	
	@Override
	public Collection<ErrorMessage> caseTraitExclude(TraitExclude operation) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		if(operation.getMethod() == null) return errorList;
		String name = operation.getMethod().getName();
		
		if(current.getMethodTypingJudgment(name) == null && current.getAllConstraints().getRequiredMethodsMap().containsKey(name)) {
			errorList.add(new ErrorMessage("Cannot exclude required methods",
					                       operation, 
					                       SwrtjPackage.TRAIT_EXCLUDE__METHOD));
		} else if(current.getMethodTypingJudgment(name) == null)
			errorList.add(new ErrorMessage("Cannot exclude provided method " + name + ": method not exists in this trait: it has " +
					                       "been removed in previous exclude or renaming operations", 
					                       operation, 
					                       SwrtjPackage.TRAIT_EXCLUDE__METHOD));
		current.removeMethodTypingJudgment(name);
		
		return errorList;
	}
	
	@Override
	public Collection<ErrorMessage> caseTraitAlias(TraitAlias operation) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		String originalName = (operation.getOriginalMethod() != null ? operation.getOriginalMethod().getName() : null);
		String newName = (operation.getNewMethod() != null ? operation.getNewMethod().getName() : null);
		if(newName == null || originalName == null) return errorList;
		
		if(current.getMethodTypingJudgment(originalName) == null && current.getAllConstraints().getRequiredMethodsMap().containsKey(originalName)) {
			errorList.add(new ErrorMessage("Cannot alias required methods",
					                       operation, 
					                       SwrtjPackage.TRAIT_METHOD_RENAME__ORIGINAL_METHOD));
		} else if(current.getMethodTypingJudgment(originalName) == null)
			errorList.add(new ErrorMessage("Cannot alias method " + originalName + ": method not exists in this trait: it has " +
                                           "been removed in previous exclude or renaming operations or it refers to a required method", 
                                           operation, SwrtjPackage.TRAIT_METHOD_RENAME__ORIGINAL_METHOD));
		if(current.getMethodTypingJudgment(newName) != null)
			errorList.add(new ErrorMessage("Cannot alias method to existing method: " + newName,
                                           operation, SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD));
		
		if(!errorList.isEmpty()) return errorList;
				
		MethodTypingJudgment methodJudgment = current.getMethodTypingJudgment(operation.getOriginalMethod().getName());
		if(methodJudgment == null) return new LinkedList<ErrorMessage>();
		Constraints constraints = new Constraints();
		constraints.merge(methodJudgment.getConstraints());
		MethodTypingJudgment judgment = new MethodTypingJudgment(operation.getNewMethod(), constraints);
		current.addMethodTypingJudgment(judgment);
		return errorList;
	}
	
	@Override
	public Collection<ErrorMessage> caseTraitMethodRename(TraitMethodRename operation) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		String originalName = (operation.getOriginalMethod() != null ? operation.getOriginalMethod().getName() : null);
		String newName = (operation.getNewMethod() != null ? operation.getNewMethod().getName() : null);
		if(newName == null || originalName == null) return errorList;
		
		if(current.getMethodTypingJudgment(originalName) == null && current.getAllConstraints().getRequiredMethod(originalName) == null)
			errorList.add(new ErrorMessage("Cannot rename method " + originalName + ": method not exists in this trait: it has " +
                                           "been removed in previous exclude or renaming operations", 
                                           operation, SwrtjPackage.TRAIT_METHOD_RENAME__ORIGINAL_METHOD));
		if(current.getMethodTypingJudgment(newName) != null)
			errorList.add(new ErrorMessage("Cannot rename method to existing method: " + newName,
                                           operation, SwrtjPackage.TRAIT_METHOD_RENAME__NEW_METHOD));
		
		if(!errorList.isEmpty()) return errorList;
				
		current.renameTo(operation.getOriginalMethod(), operation.getNewMethod());
		return errorList;
	}
	
	@Override
	public Collection<ErrorMessage> caseTraitFieldRename(TraitFieldRename operation) {
		Collection<ErrorMessage> errorList = defaultConstructor();
		String originalName = (operation.getOriginalField() != null ? operation.getOriginalField().getName() : null);
		String newName = (operation.getNewField() != null ? operation.getNewField().getName() : null);
		if(newName == null || originalName == null) return errorList;
		
		if(current.getMethodTypingJudgment(originalName) == null && current.getAllConstraints().getRequiredField(originalName) == null)
			errorList.add(new ErrorMessage("Cannot rename field " + originalName + ": field not exists in this trait: it has " +
                                           "been removed in previous exclude or renaming operations", 
                                           operation, SwrtjPackage.TRAIT_FIELD_RENAME__ORIGINAL_FIELD));
		
		if(!errorList.isEmpty()) return errorList;
				
		current.renameTo(operation.getOriginalField(), operation.getNewField());
		return errorList;
	}
	
	@Override
	protected Collection<ErrorMessage> defaultConstructor() {
		return new LinkedList<ErrorMessage>();
	}
}
