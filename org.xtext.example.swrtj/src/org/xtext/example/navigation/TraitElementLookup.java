package org.xtext.example.navigation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.BaseTrait;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.NestedTraitExpression;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.swrtj.TraitAlias;
import org.xtext.example.swrtj.TraitElement;
import org.xtext.example.swrtj.TraitExclude;
import org.xtext.example.swrtj.TraitExpression;
import org.xtext.example.swrtj.TraitFieldRename;
import org.xtext.example.swrtj.TraitMethodRename;
import org.xtext.example.swrtj.TraitName;
import org.xtext.example.swrtj.TraitOperation;

public class TraitElementLookup extends  Navigator<Map<String, EObject>> {
	private Map<String, Map<String, EObject>> traitLookups = new HashMap<String, Map<String, EObject>>();
	private Map<String, EObject> current;
	
	/**
	 * Navigates on the trait and collects the results.
	 * @param trait the trait to navigate.
	 * @return the target result.
	 */
	public Map<String, EObject> navigate(Trait trait) {
		if(trait == null) return defaultConstructor();
		
		TraitExpression expression = trait.getExpression();
		if(expression == null) return defaultConstructor();
		//Inserts an empty mapping name --> element set in order to break further cycles
		traitLookups.put(trait.getName(), defaultConstructor());
		
		Map<String, EObject> result = doNavigate(expression);
		//Inserts the real result
		traitLookups.put(trait.getName(), result);
		
		return result;
	}
	
	/**
	 * Navigate on the trait and collects the results.
	 * @param trait the trait to navigate.
	 * @return the target result.
	 */
	public Map<String, EObject> navigate(TraitExpression expression) {
		if(expression == null) return defaultConstructor();
		
		return doNavigate(expression);
	}
	
	/**
	 * Navigate on the trait and collects the results.
	 * @param base the base trait to navigate.
	 * @return the target result.
	 */
	public Map<String, EObject> navigate(BaseTrait base) {
		if(base == null) return defaultConstructor();
		
		return doSwitch(base);
	}
	
	/**
	 * Starts the navigation.
	 * @param expression the trait expression.
	 * @return the trait accessible elements.
	 */
	protected Map<String, EObject> doNavigate(TraitExpression expression) {
		Map<String, EObject> result = defaultConstructor();
		Collection<BaseTrait> traitList = expression.getTraitList();
		
		for(BaseTrait trait : traitList) {
			current = lookup(trait);
			Collection<TraitOperation> operationList = trait.getOperationList();
			
			for(TraitOperation operation : operationList) {
				applyChanges(operation);
			}
			
			result.putAll(current);
		}
		
		return result;
	}
	
	/**
	 * Bind the correct lookup.
	 * @param trait the record in which lookup elements.
	 * @return the record elements.
	 */
	protected Map<String, EObject> lookup(BaseTrait trait) {
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
	public Map<String, EObject> caseAnonimousTrait(AnonimousTrait trait) {
		Map<String, EObject> result = defaultConstructor();
		Collection<TraitElement> elementList = trait.getDefinitionList();
		
		for(TraitElement element : elementList) {
			if(element != null)
				result.putAll(doSwitch(element));
		}
		
		return result;
	}
	
	@Override
	public Map<String, EObject> caseTraitName(TraitName trait) {
		Map<String, EObject> result = defaultConstructor();
		String name = trait.getTrait().getName();
		
		if(traitLookups.containsKey(name)) {
			dump(result, traitLookups.get(name));
		} else {
			dump(result, navigate(trait.getTrait()));
		}
		
		return result;
	}
	
	@Override
	public Map<String, EObject> caseNestedTraitExpression(NestedTraitExpression trait) {
		return (trait.getExpression() == null ? defaultConstructor() : doNavigate(trait.getExpression()));
	}
	
	@Override
	public Map<String, EObject> caseTraitExclude(TraitExclude operation) {
		if(operation.getMethod() == null) return null;
		current.remove(operation.getMethod().getName());
		return null;
	}
	
	@Override
	public Map<String, EObject> caseTraitAlias(TraitAlias operation) {
		if(operation.getOriginalMethod() == null || operation.getNewMethod() == null)
			return null;
		current.put(operation.getNewMethod().getName(), operation.getNewMethod());
		return null;
	}
	
	@Override
	public Map<String, EObject> caseTraitMethodRename(TraitMethodRename operation) {
		if(operation.getOriginalMethod() == null || operation.getNewMethod() == null)
			return null;
		current.remove(operation.getOriginalMethod().getName());
		current.put(operation.getNewMethod().getName(), operation.getNewMethod());
		return null;
	}
	
	@Override
	public Map<String, EObject> caseTraitFieldRename(TraitFieldRename operation) {
		if(operation.getOriginalField() == null || operation.getNewField() == null)
			return null;
		current.remove(operation.getOriginalField().getName());
		current.put(operation.getNewField().getName(), operation.getNewField());
		return null;
	}
	
	@Override
	public Map<String, EObject> caseField(Field field) {
		return caseFieldName(field.getFieldRef());
	}
	
	@Override
	public Map<String, EObject> caseFieldName(FieldName field) {
		Map<String, EObject> singletonMap = new HashMap<String, EObject>();
		FieldName ref = field;
		if(ref != null) singletonMap.put(ref.getName(), ref);
		return singletonMap;
	}
	
	@Override
	public Map<String, EObject> caseMethod(Method method) {
		return caseMethodName(method.getMethodRef());
	}
	
	@Override
	public Map<String, EObject> caseMethodName(MethodName method) {
		Map<String, EObject> singletonMap = new HashMap<String, EObject>();
		MethodName ref = method;
		if(ref != null) singletonMap.put(ref.getName(), ref);
		return singletonMap;
	}
	
	/* Service methods */
	
	private void dump(Map<String, EObject> destination, Map<String, EObject> source) {
		Collection<EObject> elementList = source.values();
		
		for(EObject element : elementList) {
			destination.putAll(doSwitch(element));
		}
	}
	
	@Override
	protected Map<String, EObject> defaultConstructor() {
		return new HashMap<String, EObject>();
	}
}
