package org.xtext.example.navigation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.BaseTrait;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.NestedTraitExpression;
import org.xtext.example.swrtj.ProvidedMethod;
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
import org.xtext.example.typechecking.TypingJudgmentInference;

/**
 * This class infers the constraints for a trait.
 * @author Fabio Strocco
 */
public class TraitConstraintInference extends Navigator<TraitTypingJudgment> {
	private Map<String, TraitTypingJudgment> traitLookups = new HashMap<String, TraitTypingJudgment>();
	private TraitTypingJudgment current;
	private TypingJudgmentInference inference = new TypingJudgmentInference();
	
	/**
	 * Navigates on the trait and collects the results.
	 * @param trait the trait to navigate.
	 * @return the target result.
	 */
	public TraitTypingJudgment navigate(Trait trait) {
		if(trait == null) return defaultConstructor();
		
		TraitExpression expression = trait.getExpression();
		if(expression == null) return defaultConstructor();
		//Inserts an empty mapping name --> element set in order to break further cycles
		traitLookups.put(trait.getName(), defaultConstructor());
		
		TraitTypingJudgment result = doNavigate(expression);
		//Inserts the real result
		traitLookups.put(trait.getName(), result);
		
		return result;
	}
	
	/**
	 * Navigate on the trait and collects the results.
	 * @param trait the trait to navigate.
	 * @return the target result.
	 */
	public TraitTypingJudgment navigate(TraitExpression expression) {
		if(expression == null) return defaultConstructor();
		
		return doNavigate(expression);
	}
	
	/**
	 * Navigate on the trait and collects the results.
	 * @param base the base trait to navigate.
	 * @return the target result.
	 */
	public TraitTypingJudgment navigate(BaseTrait base) {
		if(base == null) return defaultConstructor();
		
		return doSwitch(base);
	}
	
	/**
	 * Starts the navigation.
	 * @param expression the trait expression.
	 * @return the trait accessible elements.
	 */
	protected TraitTypingJudgment doNavigate(TraitExpression expression) {
		TraitTypingJudgment result = defaultConstructor();
		Collection<BaseTrait> traitList = expression.getTraitList();
		
		for(BaseTrait trait : traitList) {
			current = lookup(trait);
			Collection<TraitOperation> operationList = trait.getOperationList();
			
			for(TraitOperation operation : operationList) {
				applyChanges(operation);
			}
			
			result.merge(current);

		}
		
		return result;
	}
	
	/**
	 * Bind the correct lookup.
	 * @param trait the record in which lookup elements.
	 * @return the record elements.
	 */
	protected TraitTypingJudgment lookup(BaseTrait trait) {
		return doSwitch(trait);
	}
	
	/**
	 * Apply trait operations.
	 * @param operation the current trait operations.
	 */
	protected void applyChanges(TraitOperation operation) {
		doSwitch(operation);
	}
	
	@Override
	public TraitTypingJudgment caseAnonimousTrait(AnonimousTrait trait) {
		TraitTypingJudgment result = defaultConstructor();
		Collection<TraitElement> elementList = trait.getDefinitionList();
		
		for(TraitElement element : elementList) {
			if(element != null && element instanceof ProvidedMethod) {
				ProvidedMethod method = (ProvidedMethod)element;
				result.addMethodTypingJudgment(inference.inferMethodTypingJudgment(method));
			}
		}
		
		return result;
	}
	
	@Override
	public TraitTypingJudgment caseTraitName(TraitName trait) {
		TraitTypingJudgment result = defaultConstructor();
		String name = trait.getTrait().getName();
		
		if(traitLookups.containsKey(name)) {
			dump(result, traitLookups.get(name));
		} else {
			dump(result, navigate(trait.getTrait()));
		}
		
		return result;
	}
	
	@Override
	public TraitTypingJudgment caseNestedTraitExpression(NestedTraitExpression trait) {
		return (trait.getExpression() == null ? defaultConstructor() : doNavigate(trait.getExpression()));
	}
	
	@Override
	public TraitTypingJudgment caseTraitExclude(TraitExclude operation) {
		if(operation.getMethod() == null) return null;
		current.removeMethodTypingJudgment(operation.getMethod().getName());
		return null;
	}
	
	@Override
	public TraitTypingJudgment caseTraitAlias(TraitAlias operation) {
		if(operation.getOriginalMethod() == null || operation.getNewMethod() == null)
			return null;
		MethodTypingJudgment methodJudgment = current.getMethodTypingJudgment(operation.getOriginalMethod().getName());
		if(methodJudgment == null) return null;
		Constraints constraints = new Constraints();
		constraints.merge(methodJudgment.getConstraints());
		MethodTypingJudgment judgment = new MethodTypingJudgment(operation.getNewMethod(), constraints);
		current.addMethodTypingJudgment(judgment);
		return null;
	}
	
	@Override
	public TraitTypingJudgment caseTraitMethodRename(TraitMethodRename operation) {
		if(operation.getOriginalMethod() == null || operation.getNewMethod() == null)
			return null;
		MethodName originalMethod = operation.getOriginalMethod();
		MethodName newMethod = operation.getNewMethod();
		
		current.renameTo(originalMethod, newMethod);
		return null;
	}
	
	@Override
	public TraitTypingJudgment caseTraitFieldRename(TraitFieldRename operation) {
		if(operation.getOriginalField() == null || operation.getNewField() == null)
			return null;
		FieldName originalField = operation.getOriginalField();
		FieldName newField = operation.getNewField();

		current.renameTo(originalField, newField);
		return null;
	}
	
	/* Service methods */
	
	private void dump(TraitTypingJudgment destination, TraitTypingJudgment source) {
		destination.merge(source.clone());
		/*Collection<String> elementList = source.keySet();
		
		for(String element : elementList) {
			destination.put(element, source.get(element));
		}*/
	}
	
	@Override
	protected TraitTypingJudgment defaultConstructor() {
		return new TraitTypingJudgment();
	}
}
