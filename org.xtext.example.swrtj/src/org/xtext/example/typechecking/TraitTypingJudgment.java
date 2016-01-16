package org.xtext.example.typechecking;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.MethodName;

/**
 * This class represent a typing judgment for a specific trait.
 * @author Strocco Fabio
 */
public class TraitTypingJudgment implements Cloneable {
	private Map<String, MethodTypingJudgment> judgmentList = new HashMap<String, MethodTypingJudgment>();
	
	/**
	 * Adds a method typing judgment to the map.
	 * @param judgment the judgment to add.
	 */
	public void addMethodTypingJudgment(MethodTypingJudgment judgment) {
		judgmentList.put(judgment.getMethodName(), judgment);
	}
	
	/**
	 * Returns the method typing judgment bound to the given method name.
	 * @param methodName the name of the method of the bound typing judgment.
	 * @return the bound method typing judgment or <code>null</code> if
	 * the method name is not bound.
	 */
	public MethodTypingJudgment getMethodTypingJudgment(String methodName) {
		return judgmentList.get(methodName);
	}
	
	/**
	 * Merges this judgment with the given parameter.
	 * @param judgment the judgment to merge with this.
	 */
	public void merge(TraitTypingJudgment judgment) {
		judgmentList.putAll(judgment.judgmentList);
	}
	
	/**
	 * Removes the method typing judgment bound to the given method name.
	 * @param methodName the name of the method of the bound typing judgment.
	 */
	public void removeMethodTypingJudgment(String methodName) {
		judgmentList.remove(methodName);
	}
	
	/**
	 * Returns all the constraints of this judgment.
	 * @return all the constraints of this judgment.
	 */
	public Constraints getAllConstraints() {
		Collection<MethodTypingJudgment> judgments = judgmentList.values();
		Constraints constraints = new Constraints();
		
		for(MethodTypingJudgment judgment : judgments) {
			constraints.merge(judgment.getConstraints());
		}
		
		return constraints;
	}
	
	/**
	 * Return all the method names of this judgment
	 * @return all the methods of this judgment
	 */
	public Collection<String> getAllMethodNames() {
		return judgmentList.keySet();
	}
	
	/**
	 * Get all the provided methods.
	 * @return the provided methods.
	 */
	public Map<String, MethodName> getProvidedMethodsMap() {
		Map<String, MethodName> result = new HashMap<String, MethodName>();
		Collection<String> names = getAllMethodNames();
		
		for(String name : names) {
			result.put(name, getMethodTypingJudgment(name).getMethod());
		}
		
		return result;
	}
	
	/**
	 * Substitute the originalMethod name in judgment(i.e. constraints and method name list)
	 * with the new method name.
	 * @param originalMethod the method to be substituted.
	 * @param newMethod the method to substitute.
	 */
	public void renameTo(MethodName originalMethod, MethodName newMethod) {
		if(originalMethod == null || newMethod == null) return;
		Collection<MethodTypingJudgment> constraintList = judgmentList.values();
		
		for(MethodTypingJudgment judgment : constraintList) {
			judgment.getConstraints().renameTo(originalMethod, newMethod);
		}
		
		//If originalMethod is not provided returns
		if(!judgmentList.containsKey(originalMethod.getName())) return;
		Constraints constraints = getMethodTypingJudgment(originalMethod.getName()).getConstraints();
		MethodTypingJudgment judgment = new MethodTypingJudgment(newMethod, constraints);
		removeMethodTypingJudgment(originalMethod.getName());
		addMethodTypingJudgment(judgment);
	}
	
	/**
	 * Substitute the originalField name in constraints with the new field name.
	 * @param originalField the method to be substituted.
	 * @param newField the field to substitute.
	 */
	public void renameTo(FieldName originalField, FieldName newField) {
		if(originalField == null || newField == null) return;
		Collection<MethodTypingJudgment> constraintList = judgmentList.values();
		
		for(MethodTypingJudgment judgment : constraintList) {
			judgment.getConstraints().renameTo(originalField, newField);
		}
	}
	
	@Override
	public TraitTypingJudgment clone() {
		TraitTypingJudgment result = new TraitTypingJudgment();
		
		for(String method : judgmentList.keySet()) {
			result.judgmentList.put(method, judgmentList.get(method).clone());
		}
		
		return result;
	}
	
	public String toString() {
		return this.judgmentList.toString();
	}
}
