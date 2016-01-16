package org.xtext.example.typechecking;

import java.util.*;

import org.xtext.example.swrtj.*;

/**
 * Represents an infered type everywhere a primitive type appears in an expression.
 * @author Strocco Fabio
 */
public class PrimitiveType extends ExpressionType {
	private String primitiveType;
	
	/**
	 * Checks if this expression type represent void.
	 * @return <code>true</code> if this type is 'void', <code>false</code>
	 * otherwise.
	 */
	public boolean isVoid() {
		return primitiveType.equals("void");
	}
	
	/**
	 * Creates a new instance of this class.
	 * @param primitiveType the type represented by this class.
	 */
	protected PrimitiveType(String primitiveType) {
		super(primitiveType);
		this.primitiveType = primitiveType;
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
		return new LinkedList<MethodName>();
	}
	
	/**
	 * Checks if <code>this</code> is subtype of the given infered type. If the types are not comparable
	 * they will not be considered in subtype relation.
	 * @return <code>true</code> if <code>this</code> is subtype of <param>type</param>, <code>false</code> otherwise. 
	 */
	@Override
	public boolean isSubtype(ExpressionType type) {
		if(type.getPrimitiveType() == null) return false;
		String leftType = this.getPrimitiveType();
		String rightType = type.getPrimitiveType();
		
		Set<String> compatibleTypes = getPossibleSupertypes(leftType);
		
		return (compatibleTypes.contains(rightType));
	}

	/**
	 * Returns the primitive type name.
	 * @return the primitive type name.
	 */
	@Override
	public String getPrimitiveType() {
		return this.primitiveType;
	}

	/**
	 * Checks if this a value of this type allows method invocation or field invocations.
	 * @return <code>true</code> if this type is invocable, <code>false</code> otherwise.
	 */
	@Override
	public boolean isInvokable() {
		return false;
	}
	
	/* Service methods */
	
	private Set<String> getPossibleSupertypes(String type) {
		Set<String> typeSet = new HashSet<String>();
		
		if(type.equals("byte")) {
			typeSet.add("char");
			typeSet.add("byte");
			typeSet.add("short");
			typeSet.add("int");
			typeSet.add("long");
			typeSet.add("float");
			typeSet.add("double");
		} else if(type.equals("short") || type.equals("char")) {
			typeSet.add("char");
			typeSet.add("short");
			typeSet.add("int");
			typeSet.add("long");
			typeSet.add("float");
			typeSet.add("double");
		} else if(type.equals("int")) {
			typeSet.add("int");
			typeSet.add("long");
			typeSet.add("float");
			typeSet.add("double");
		} else if(type.equals("long")) {
			typeSet.add("long");
			typeSet.add("float");
			typeSet.add("double");
		} else if(type.equals("float")) {
			typeSet.add("float");
			typeSet.add("double");
		} else if(type.equals("double")) {
			typeSet.add("double");
		} else if(type.equals("boolean")) {
			typeSet.add("boolean");
		} else if(type.equals("void")) {
		}
			
		return typeSet;
	}
}