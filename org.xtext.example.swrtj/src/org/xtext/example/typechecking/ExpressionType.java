package org.xtext.example.typechecking;

import java.util.Collection;
import java.util.Map;

import org.xtext.example.swrtj.BooleanExpression;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.DottedExpression;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.GenericExpression;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Message;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.Start;
import org.xtext.example.swrtj.Type;

/**
 * Represents an expression infered type.
 * @author Strocco Fabio
 */
public abstract class ExpressionType {
	private String name;
	
	/**
	 * Creates a new Expression type.
	 * @param name the name of the infered type.
	 */
	protected ExpressionType(String name) {
		this.name = name;
	}
	
	/**
	 * Checks if <code>this</code> is subtype of the given infered type. If the types are not comparable
	 * they will not be considered in subtype relation.
	 * @return <code>true</code> if <code>this</code> is subtype of <param>type</param>, <code>false</code> otherwise. 
	 */
	public abstract boolean isSubtype(ExpressionType type);
	
	/**
	 * Checks if <code>this</code> can be converted to the type given as parameter.
	 * @param type the type to cast this type.
	 * @return <code>true</code> if this expression type is convertible to the type given as
	 * parameter, <code>false</code> otherwise.
	 */
	public boolean canCastTo(ExpressionType type) {
		return (this.isSubtype(type) || type.isSubtype(this));
	}

	/**
	 * Checks if a variable of this type allows method invocations or field access(for instance null type doesn't allow this).
	 * @return <code>true</code> by default.
	 */
	public boolean isInvokable() {
		return true;
	}
	
	/**
	 * Returns the interfaces compatible with this type.
	 * @return the list of interfaces compatible with this type or an empty list if no such interfaces exists.
	 */
	public InterfaceMap getCompatibleInterfaces() {
		return new InterfaceMap();
	}
	
	/**
	 * Returns all the fields invokable by the specified type.
	 * @return a list containing all the fields provided by the specified interface.
	 */
	public abstract Collection<FieldName> getInvokableFields();
	
	/**
	 * Returns all the methods invokable by the specified type.
	 * @return a list containing all the methods provided by the specified interface.
	 */
	public abstract Collection<MethodName> getInvokableMethods();

	/**
	 * Returns the primitive type name if this is a primitive type.
	 * @return the primitive type name if this is a primitive type, <code>null</code> otherwise.
	 */
	public abstract String getPrimitiveType();
	
	/**
	 * Checks if this expression type represent this.
	 * @return <code>false</code> by default.
	 */
	public boolean isThis() {
		return false;
	}
	
	/**
	 * Checks whether this expression type represent void.
	 * @return <code>false</code> by default.
	 */
	public boolean isVoid() {
		return false;
	}
	
	/**
	 * Returns the type name.
	 * @return the type name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Creates an instance of the expression type representing the expression inferred type.
	 * @param start the start rule of the expression (for instance this or a parameter).
	 * @return the instance.
	 */
	public static ExpressionType createInstance(Start start) {
		return new AusiliaryFactory().navigate(start);
	}
	
	/**
	 * Creates an instance of the expression type representing the expression inferred type.
	 * @param expression the expression rule of the expression.
	 * @return the instance.
	 */
	public static ExpressionType createInstance(GenericExpression expression) {
		return new AusiliaryFactory().navigate(expression);
	}
	
	/**
	 * Creates an instance of the expression type representing the expression inferred type.
	 * @param start the start rule of the expression(for instance this or a parameter).
	 * @return the instance.
	 */
	public static ExpressionType createInstance(Message message) {
		return new AusiliaryFactory().navigate(message);
	}
	
	/**
	 * Creates an instance of the expression type representing the expression inferred type.
	 * @param start the start rule of the expression(for instance this or a parameter).
	 * @param withoutCast specifies if the expression type to return is the real type or the expression
	 * type without cast.
	 * @return the instance.
	 */
	public static ExpressionType createInstance(DottedExpression expression, boolean withoutCast) {
		return new AusiliaryFactory(withoutCast).navigate(expression);
	}
	
	/**
	 * Creates an instance of the expression type representing the expression inferred type.
	 * @param start the start rule of the expression(for instance this or a parameter).
	 * @return the instance.
	 */
	public static ExpressionType createInstance(DottedExpression expression) {
		return createInstance(expression, false);
	}
	
	/**
	 * Creates an instance of the expression type representing the expression inferred type.
	 * @param start the start rule of the expression(for instance this or a parameter).
	 * @return the instance.
	 */
	public static ExpressionType createInstance(Expression expression) {
		return new AusiliaryFactory().navigate(expression);
	}
	
	/**
	 * Creates an instance of the expression type representing the expression inferred type.
	 * @param start the start rule of the expression(for instance this or a parameter).
	 * @return the instance.
	 */
	public static ExpressionType createInstance(BooleanExpression expression) {
		return new AusiliaryFactory().navigate(expression);
	}
	
	/**
	 * Creates an instance of the expression type matching with the specified type.
	 * @param type the type representing the inferred expression type.
	 * @return the instance.
	 */
	public static ExpressionType createInstance(Type type) {
		return typeToExpressionType(type);
	}
	
	/**
	 * Creates an instance of the expression type matching with the specified type.
	 * @param type the type representing the inferred expression type.
	 * @return the instance.
	 */
	public static ExpressionType createInstance(Interface type) {
		return new InterfaceType(type);
	}
	
	/**
	 * Creates an instance of the expression type matching with the specified primitive type.
	 * @param primitiveType the type to represent.
	 * @return the instance.
	 */
	public static ExpressionType createInstance(String primitiveType) {
		return new PrimitiveType(primitiveType);
	}
	
	/**
	 * Creates an instance of the expression type matching with the specified class.
	 * Class is not a type, but can be represented as a ClassType(i.e. collection of implemented interfaces)
	 * @param classType the class to represent.
	 * @return the instance.
	 */
	public static ExpressionType createInstance(Class classType) {
		return new ClassType(classType);
	}
	
	/**
	 * Converts a type to an expression type.
	 * @param type the type to convert.
	 * @return the converted type.
	 */
	public static ExpressionType typeToExpressionType(Type type) {	
		if(type == null) return null;
		
		ExpressionType result = null;
		
		if(type.getPrimitiveType() != null)
			result = createInstance(type.getPrimitiveType());
		else
			result = createInstance(type.getInterfaceType());
		
		return result;
	}

	/* Subclasses service methods */
	
	protected void addAllMethods(Map<String, MethodName> methodList, Collection<MethodName> toAddMethods) {
		for(MethodName m : toAddMethods) {
			methodList.put(m.getName(), m);
		}
	}
}