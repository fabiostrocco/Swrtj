package org.xtext.example.typechecking;

import java.util.Collection;

import org.xtext.example.swrtj.*;

/**
 * Formally this class represent a couple: <method signature, constraints>
 * @see Constraints
 * @author Strocco Fabio
 */
public class MethodTypingJudgment extends ConstraintsBasedTypingJudgment implements Cloneable {
    private MethodName method;
    
    /**
	 * Creates a new instance of this class.
	 */
	public MethodTypingJudgment() {}

	/**
	 * Creates a new instance of this class.
	 * @param method the method referring to this judgment.
	 * @param constraints the constraints of this judgment.
	 */
	public MethodTypingJudgment(MethodName method, Constraints constraints) {
		super(constraints);
		this.method = method;
	}

	/**
	 * Returns the method referring to this judgment.
	 * @return the method referring to this judgment.
	 */
	public MethodName getMethod() {
		return method;
	}
	
	/**
	 * Returns the method name referring to this judgment.
	 * @return the method name referring to this judgment or
	 * <code>null</code> if method == null.
	 */
	public String getMethodName() {
		return(method == null ? null : method.getName());
	}
	
	
	/**
	 * Sets the method referring to this judgment.
	 * @param method the method referring to this judgment.
	 */
	public void setMethod(MethodName method) {
		this.method = method;
	}
	

	/**
	 * Returns the copy of this object.
	 * @return the copy of this object.
	 */
	@Override
	public MethodTypingJudgment clone() {
		MethodTypingJudgment result = new MethodTypingJudgment();
		result.setMethod(method);
		result.setConstraints(getConstraints().clone());
		return result;
	}
	
	public String toString() {
		return this.method.getName() + " | " + this.getConstraints();
	}
}