package org.xtext.example.typechecking;

import java.util.*;

import org.xtext.example.swrtj.*;

/**
 * This class is formally a triple: <required fields, required methods, required interfaces>.
 * Every element is a set of requests infered in an expression, method(i.e. set of constraint 
 * infered in an expression list and method constraints), trait or class.
 * @author Strocco Fabio
 */public class Constraints implements Cloneable {
 	private Map<String, FieldName> requiredFields = new HashMap<String, FieldName>();
 	private Map<String, MethodName> requiredMethods = new HashMap<String, MethodName>();
 	private Map<String, Interface> requiredInterfaces = new HashMap<String, Interface>();
  
	/**
	 * Inserts the specified field to the constraints. If the field already exists it wont be added.
	 * @param field the field to add.
	 */
 	public void addField(FieldName field) {
 		if(field != null) requiredFields.put(field.getName(), field);
 	}

	/**
	 * Inserts the specified method to the constraints. If the method already exists it wont be added.
	 * @param method the method to add.
	 */
	public void addMethod(MethodName method) {
		if(method != null) requiredMethods.put(method.getName(), method);
	}

	/**
	 * Inserts the specified interface to the constraints. If the interface already exists it wont be added.
	 * @param interface the interface to add.
	 */
	public void addInterface(Interface interfaceType) {
		if(interfaceType != null) requiredInterfaces.put(interfaceType.getName(), interfaceType);
	}

	/**
	 * Returns all the required fields in this constraint. This is the direct copy of the set.
	 * @return all the required fields in this constraint. If no such element exists an empty
	 * list will be returned.
	 */
	public Collection<FieldName> getRequiredFields() {
		return requiredFields.values();
	}
	
	/**
	 * Returns all the required methods in this constraint. This is the direct copy of the set.
	 * @return all the required methods in this constraint. If no such element exists an empty
	 * list will be returned.
	 */
	public Collection<MethodName> getRequiredMethods() {
		return requiredMethods.values();
	}
	
	/**
	 * Returns all the required interfaces in this constraint. This is the direct copy of the set.
	 * @return all the required interfaces in this constraint. If no such element exists an empty
	 * list will be returned.
	 */
	public Collection<Interface> getRequiredInterfaces() {
		return requiredInterfaces.values();
	}
	
	/**
	 * Returns all the required fields in this constraint. This is the direct copy of the set.
	 * @return all the required fields in this constraint. If no such element exists an empty
	 * list will be returned.
	 */
	public Map<String, FieldName> getRequiredFieldsMap() {
		return requiredFields;
	}
	
	/**
	 * Returns all the required methods in this constraint. This is the direct copy of the set.
	 * @return all the required methods in this constraint. If no such element exists an empty
	 * list will be returned.
	 */
	public Map<String, MethodName> getRequiredMethodsMap() {
		return requiredMethods;
	}
	
	/**
	 * Returns all the required interfaces in this constraint. This is the direct copy of the set.
	 * @return all the required interfaces in this constraint. If no such element exists an empty
	 * list will be returned.
	 */
	public Map<String, Interface> getRequiredInterfacesMap() {
		return requiredInterfaces;
	}
	
	/**
	 * Returns the field with the given name.
	 * @param name the field name.
	 * @return the field matching with the given name.
	 */
	public FieldName getRequiredField(String name) {
		return requiredFields.get(name);
	}
	
	/**
	 * Returns the method with the given name.
	 * @param name the method name.
	 * @return the method matching with the given name.
	 */
	public MethodName getRequiredMethod(String name) {
		return requiredMethods.get(name);
	}
	
	/**
	 * Returns the interface with the given name.
	 * @param name the interface name.
	 * @return the interface matching with the given name.
	 */
	public Interface getRequiredInterface(String name) {
		return requiredInterfaces.get(name);
	}
	
	/**
	 * Checks if the field given as parameters exists in this constraints.
	 * @param field the field to check.
	 * @return <code>true</code> if this field exists in this constraints,
	 * <code>false</code> otherwise.
	 */
	public boolean contains(FieldName field) {
		if(field == null) return false;
		return requiredFields.containsKey(field.getName());
	}
	
	/**
	 * Checks if the method given as parameters exists in this constraints.
	 * @param method the method to check.
	 * @return <code>true</code> if this method exists in this constraints,
	 * <code>false</code> otherwise.
	 */
	public boolean contains(MethodName method) {
		if(method == null) return false;
		return requiredMethods.containsKey(method.getName());
	}
	
	/**
	 * Checks if the interface given as parameters exists in this constraints.
	 * @param interfaceType the interface to check.
	 * @return <code>true</code> if this interface exists in this constraints,
	 * <code>false</code> otherwise.
	 */
	public boolean contains(Interface interfaceType) {
		if(interfaceType == null) return false;
		return requiredInterfaces.containsKey(interfaceType.getName());
	}
	
	/**
	 * Checks if the method given as parameters exists in this constraints.
	 * @param method the method to check.
	 * @return <code>true</code> if this method exists in this constraints,
	 * <code>false</code> otherwise.
	 */
	public boolean containsMethod(String method) {
		if(method == null) return false;
		return requiredMethods.containsKey(method);
	}
	
	/**
	 * Merge this constraints with the specified parameter.
	 * @param constraints the constraints to merge with these.
	 */
	public void merge(Constraints constraints) {
		if(constraints == null) return;
		
		requiredFields.putAll(constraints.requiredFields);
		requiredMethods.putAll(constraints.requiredMethods);
		requiredInterfaces.putAll(constraints.requiredInterfaces);
	}
	
	/**
	 * Substitute the originalMethod name in constraints with the new method name.
	 * @param originalMethod the method to be substituted.
	 * @param newMethod the method to substitute.
	 */
	public void renameTo(MethodName originalMethod, MethodName newMethod) {
		MethodName oldMethod = null;
		Collection<MethodName> methodList = getRequiredMethods();
		
		for(MethodName method : methodList) {
			if(method.getName().equals(originalMethod.getName())) {
				oldMethod = method;
				break;
			}
		}
		if(oldMethod == null) return;
		
		requiredMethods.remove(oldMethod.getName());
		requiredMethods.put(newMethod.getName(), newMethod);
	}
	
	/**
	 * Substitute the originalField name in constraints with the new field name.
	 * @param originalField the method to be substituted.
	 * @param newField the field to substitute.
	 */
	public void renameTo(FieldName originalField, FieldName newField) {
		FieldName oldField = null;
		Collection<FieldName> fieldList = getRequiredFields();
		
		for(FieldName field : fieldList) {
			if(field.getName().equals(originalField.getName())) {
				oldField = field;
				break;
			}
		}
		if(oldField == null) return;
		
		requiredFields.remove(oldField.getName());
		requiredFields.put(newField.getName(), newField);
	}
	
	/**
	 * Returns a copy of this object.
	 * @return a new constranint triple with the same elements, that is
	 * this.getRequiredFields() != clonedObject.getRequiredFields() but this.getRequiredField(name) == clonedObject.getRequiredFied(name)
	 * this.getRequiredMethods() != clonedObject.getRequiredMethods() but this.getRequiredMethod(name) == clonedObject.getRequiredMethod(name)
	 * this.getRequiredInterfaces() != clonedObject.getRequiredInterfaces() but this.getRequiredInterface(name) == clonedObject.getRequiredInterface(name)
	 */
	@Override
	public Constraints clone() {
		Constraints result = new Constraints();
		
		for(FieldName field : requiredFields.values()) {
			result.addField(field);
		}
		
		for(MethodName method : requiredMethods.values()) {
			result.addMethod(method);
		}
		
		for(Interface interfaceType : requiredInterfaces.values()) {
			result.addInterface(interfaceType);
		}
		
		return result;
	}
	
	/**
	 * Returns a string that represents the object.
	 * @return a string that represents the object.
	 */
	public String toString() {
		return "CONSTRAINTS:<" + requiredFields + " ; " + requiredMethods + " ; " + requiredInterfaces + ">";
	}
}