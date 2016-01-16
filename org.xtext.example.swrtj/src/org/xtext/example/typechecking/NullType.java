/**
 * 
 */
package org.xtext.example.typechecking;

import java.util.Collection;
import java.util.LinkedList;

import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.MethodName;

/**
 * This class represent a null type.
 * @author Strocco Fabio
 */
public class NullType extends ExpressionType {
	
	/**
	 * Creates a new Expression type.
	 * @param name the name of the infered type.
	 */
	protected NullType() {
		super("null type");
	}

	/**
	 * @return an empty list since the null constant is not invokable.
	 */
	@Override
	public Collection<FieldName> getInvokableFields() {
		return new LinkedList<FieldName>();
	}

	/**
	 * @return an empty list since the null constant is not invokable.
	 */
	@Override
	public Collection<MethodName> getInvokableMethods() {
		return new LinkedList<MethodName>();
	}

	/**
	 * @return null since the null constant is not invokable.
	 */
	@Override
	public String getPrimitiveType() {
		return null;
	}

	/**
	 * Checks whether the null type is subtype of the given prameter.
	 * @param type the expression type to check.
	 * @return <code>true</code> if the type parameter is invokable,
	 * <code>false</code> otherwise.
	 */
	@Override
	public boolean isSubtype(ExpressionType type) {
		return (type instanceof NullType || type.isInvokable());
	}
	
	/**
	 * Checks if a variable of this type allows method invocations or field access(for instance null type doesn't allow this).
	 * @return <code>false</code> since null doesn't have a reference.
	 */
	@Override
	public boolean isInvokable() {
		return false;
	}
}
