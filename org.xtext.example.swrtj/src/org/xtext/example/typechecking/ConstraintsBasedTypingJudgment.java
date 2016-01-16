package org.xtext.example.typechecking;

/**
 * This class represent a generic constranints based typing judgment.
 * @see Constraints
 * @author Strocco Fabio
 */
public abstract class ConstraintsBasedTypingJudgment {
    private Constraints constraints;
    
    /**
	 * Creates a new instance of this class.
	 */
	public ConstraintsBasedTypingJudgment() {}

	/**
	 * Creates a new instance of this class.
	 * @param constraints the constraints of this judgment.
	 */
	public ConstraintsBasedTypingJudgment(Constraints constraints) {
		this.constraints = constraints;
	}

	/**
	 * Returns the constraints.
	 * @return the constraints.
	 */
	public Constraints getConstraints() {
		return constraints;
	}
	
	
	/**
	 * Sets the constraints.
	 * @param constraints the constraints.
	 */
	public void setConstraints(Constraints constraints) {
		this.constraints = constraints;
	}
}