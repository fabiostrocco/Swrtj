package org.xtext.example.typechecking;

import java.util.*;

import org.xtext.example.swrtj.*;
import org.xtext.example.utils.Lookup;

/**
 * Represents an infered type everywhere a type compatible with interfaces appears in an expression.
 * @author Strocco Fabio
 */
public abstract class InterfaceBasedType extends ExpressionType {
	private Lookup lookup = new Lookup();
	
	/**
	 * Creates a new instance of this type.
	 * @param name the type name.
	 */
	protected InterfaceBasedType(String name) {
		super(name);
	}

	/**
	 * @return <code>null</code> because every type compatible with an interface is not primitive.
	 */
	@Override
	public String getPrimitiveType() {
		return null;
	}
	
	/**
	 * Returns all the fields invokable by the specified type.
	 * @return a list containing all the fields provided by the specified interface.
	 */
	@Override
	public Collection<FieldName> getInvokableFields() {
		return new LinkedList<FieldName>();
	}
	
	/**
	 * Returns all the methods invokable by the specified type.
	 * @return a list containing all the methods provided by the specified interface.
	 */
	@Override
	public Collection<MethodName> getInvokableMethods() {
		Map<String, MethodName> methodList = new HashMap<String, MethodName>();
		Collection<Interface> compatibleInterfaces = getCompatibleInterfaces().values();
				
		for(Interface i : compatibleInterfaces) {
			addAllMethods(methodList, lookup.getMethodNames(i.getRequiredMethodList()));
		}
		
		return methodList.values();
	}
	
	/**
	 * Checks whether <code>this</code> is subtype of the given infered type. If the types are not comparable
	 * they will not be considered in subtype relation.
	 * @return <code>true</code> if <code>this</code> is subtype of <param>type</param>, <code>false</code> otherwise. 
	 */
	@Override
	public boolean isSubtype(ExpressionType type) {
		Collection<Interface> thisInterfaces = getCompatibleInterfaces().values();
		InterfaceMap typeInterfaces = type.getCompatibleInterfaces();
		
		if(typeInterfaces.isEmpty()) return false;
		
		for(Interface i : thisInterfaces) {
			typeInterfaces.remove(i);
		}
		
		return (typeInterfaces.isEmpty());
	}
}