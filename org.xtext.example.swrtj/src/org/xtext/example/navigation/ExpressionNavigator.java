package org.xtext.example.navigation;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.swrtj.*;
import org.xtext.example.swrtj.Number;

/**
 * This class allows to navigate in an expression.
 * The navigation iterates over the dotted expressions members from left to right.
 * The dotted expression navigation starts from the last message(if it exists) and ends with the start rule.
 * If the start rule is a nested expression, the navigations starts in the same order for it.
 * If a field assignment expression is encountered, this class navigate his value before and the
 * assignment after.
 * 
 * Example: this.f = this.f1 = (I)(this.f.m1()).m2();
 * the method binding order is the following
 * bind(method m2())
 * bind(cast (I))
 * bind(nested expression (this.f.m())
 * bind(method m1())
 * bind(field f)
 * bind(this)
 * bind(field assignemt this.f1 = expression)
 * bind(field assignment this.f = expression)
 * 
 * Note that this class not navigates the parameter argument expressions.
 * @author Strocco Fabio
 * @param <E> the target return type
 */
public abstract class ExpressionNavigator<E> extends Navigator<E> {
	private E previousReturn;
	
	/**
	 * Navigate on the expression and collects the results.
	 * @param expression the expression to navigate.
	 * @return the target result.
	 */
	public E navigate(GenericExpression expression) {
		if(expression instanceof Expression) {
			return navigate((Expression)expression);
		} else {
			return navigate((BooleanExpression)expression);
		}
	}
	
	/**
	 * Navigate on the expression and collects the results.
	 * @param expression the expression to navigate.
	 * @return the target result.
	 */
	public E navigate(Expression expression) {
		previousReturn = null;
		if(expression == null) return defaultConstructor();
		return bind(expression, previousReturn);
	}
	
	/**
	 * Navigate on the expression and collects the results.
	 * @param expression the expression to navigate.
	 * @return the target result.
	 */
	public E navigate(BooleanExpression expression) {
		previousReturn = null;
		if(expression == null) return defaultConstructor();
		return bind(expression, previousReturn);
	}
	
	/**
	 * Navigate on the expression and collects the results.
	 * @param expression the expression to navigate.
	 * @return the target result.
	 */
	public E navigate(DottedExpression expression) {
		previousReturn = null;
		if(expression == null) return defaultConstructor();
		return bind(expression, previousReturn);
	}
	
	/**
	 * Navigate on the message and collects the results.
	 * @param message the expression to navigate.
	 * @return the target result.
	 */
	public E navigate(Message message) {
		previousReturn = null;
		if(message == null) return defaultConstructor();
		return doSwitch(message);
	}
	
	/**
	 * Navigate on the message and collects the results.
	 * @param start the expression to navigate.
	 * @return the target result.
	 */
	public E navigate(Start start) {
		previousReturn = null;
		if(start == null) return defaultConstructor();
		return doSwitch(start);
	}
	
	
	/**
	 * Expression binding.
	 * @param expression the current element.
	 * @param prevoiusReturn the previous call return type.
	 * @return the target result.
	 */
	protected E bind(DottedExpression expression, E previousReturn) {
		this.previousReturn = previousReturn;
		EObject value = expression.getValue();
		
		if(value != null) {
			if (value instanceof Expression) {
				this.previousReturn = bind((Expression)value, previousReturn);
			} else {
				this.previousReturn = bind((BooleanExpression)value, previousReturn);
			}
		}
			
		Message message = expression.getMessage();
		Start start = expression.getStart();
	
		if(message != null) {
			this.previousReturn = doSwitch(message);
			return bind(expression.getReceiver(), this.previousReturn);
		} else if(start != null) {
			this.previousReturn = doSwitch(start);		
			return this.previousReturn;
		} else return previousReturn;
	}
	
	@Override
	public E caseFieldAccess(FieldAccess message) {
		return bind(message, previousReturn);
	}
	
	@Override
	public E caseMethodInvocation(MethodInvocation message) {
		return bind(message, previousReturn);
	}
	
	@Override
	public E caseNull(Null start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseInput(Input start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseArgs(Args start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseOutput(Output start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseBooleanConstant(BooleanConstant start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseNumber(Number start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseStringConstant(StringConstant start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseThis(This start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseParameterReference(ParameterReference start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseConstructorInvocation(ConstructorInvocation start) {
		return bind(start, previousReturn);
	}
	
	@Override
	public E caseCast(Cast start) {
		previousReturn = bind(start, previousReturn);
		if(start.getStart() == null) return previousReturn;
		return doSwitch(start.getStart());
	}
	
	@Override
	public E caseNestedExpression(NestedExpression start) {
		previousReturn = bind(start, previousReturn);
		return bind((Expression)start.getExpression(), previousReturn);
	}
	
	@Override
	public E caseParameterAssignment(ParameterAssignment start) {
		return bind(start, previousReturn);
	}
	
	/**
	 * Expression binding.
	 * @param message the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(Expression expression, E previousReturn);

	
	/**
	 * Expression binding.
	 * @param message the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(FieldAccess message, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param message the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(MethodInvocation message, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(Null start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(Input start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(Args start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(Output start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(BooleanConstant start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(Number start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(StringConstant start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(This start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(ParameterReference start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(ConstructorInvocation start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(Cast start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(NestedExpression start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(BooleanExpression start, E previousReturn);
	
	/**
	 * Expression binding.
	 * @param start the current element.
	 * @param previousReturn the previous call return type.
	 * @return the target result.
	 */
	protected abstract E bind(ParameterAssignment start, E previousReturn);
	
	/**
	 * Creates a new default instance for the type E. For instance if E is a List the default constructor
	 * can be new LinkedList() or new ArrayList().
	 * This is used when the start expression is null, and to have null safe object creations.
	 * @return the default insance
	 */
	protected abstract E defaultConstructor();
}
