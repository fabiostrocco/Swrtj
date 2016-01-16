package org.xtext.example.typechecking;

/**
 * Formally this class represents a generic constraints based expression
 * typing judgment.: <expression infered type, constaints>
 * @see ExpressionType, Constraints
 * @author Strocco Fabio
 */
public class ExpressionTypingJudgment extends ConstraintsBasedTypingJudgment {
    private ExpressionType expressionType;
    
    /**
	 * Creates a new instance of this class.
	 */
	public ExpressionTypingJudgment() {
		super();
	}

	/**
	 * Creates a new instance of this class.
	 * @param expressionType the type of the expression to be judged.
	 * @param constraints the constraints of this judgment.
	 */
	public ExpressionTypingJudgment(ExpressionType expressionType, Constraints constraints) {
		super(constraints);
		this.expressionType = expressionType;
	}

	/**
	 * Returns the expression type.
	 * @return the expression type.
	 */
	public ExpressionType getExpressionType() {
		return expressionType;
	}

	/**
	 * Sets the expression type.
	 * @param expressionType the expression type.
	 */
	public void setExpressionType(ExpressionType expressionType) {
		this.expressionType = expressionType;
	}
}