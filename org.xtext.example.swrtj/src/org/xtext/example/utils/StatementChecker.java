package org.xtext.example.utils;

import org.xtext.example.swrtj.ConstructorInvocation;
import org.xtext.example.swrtj.DottedExpression;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.ExpressionStatement;
import org.xtext.example.swrtj.FieldAccess;
import org.xtext.example.swrtj.Message;
import org.xtext.example.swrtj.MethodInvocation;
import org.xtext.example.swrtj.ParameterAssignment;
import org.xtext.example.swrtj.Start;
import org.xtext.example.swrtj.util.SwrtjSwitch;

/**
 * This class checks wether an expression is a valid statement.
 * @author Strocco Fabio
 */
public class StatementChecker extends SwrtjSwitch<Boolean> {
	public boolean isWellFormed(ExpressionStatement expression) {
		Boolean result = doSwitch(expression.getExpression());
		if(result == null) return false;
		return result;
	}
	
	@Override
	public Boolean caseExpression(Expression expression) {
		if(expression.getTermList().size() == 1 && expression.getSign() == null) {
			return caseDottedExpression(expression.getTermList().get(0));
		} else return false;
	}
	
	@Override
	public Boolean caseDottedExpression(DottedExpression expression) {
		Message message = expression.getMessage();
		Start start = expression.getStart();
		
		if(message != null)
			return doSwitch(message);
		else if(start != null)
			return doSwitch(start);
		
		return null;
	}
	
	@Override
	public Boolean caseMethodInvocation(MethodInvocation expression) {
		return true;
	}
	
	@Override
	public Boolean caseConstructorInvocation(ConstructorInvocation expression) {
		return true;
	}
	
	@Override
	public Boolean caseParameterAssignment(ParameterAssignment expression) {
		return true;
	}
	
	@Override
	public Boolean caseFieldAccess(FieldAccess expression) {
		return (((DottedExpression)expression.eContainer()).getValue() != null);
	}
}