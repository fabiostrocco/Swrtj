package org.xtext.example.typechecking;

import java.util.Collection;
import java.util.LinkedList;

import org.xtext.example.navigation.ExpressionConstraintsInference;
import org.xtext.example.swrtj.AtomicBooleanExpression;
import org.xtext.example.swrtj.Block;
import org.xtext.example.swrtj.BooleanExpression;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.ExpressionStatement;
import org.xtext.example.swrtj.GenericExpression;
import org.xtext.example.swrtj.IfThenElseStatement;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.LocalParameter;
import org.xtext.example.swrtj.NestedBooleanExpression;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.ReturnStatement;
import org.xtext.example.swrtj.SimpleComparation;
import org.xtext.example.swrtj.Statement;
import org.xtext.example.swrtj.WhileStatement;
import org.xtext.example.swrtj.util.SwrtjSwitch;
import org.xtext.example.utils.ErrorMessage;

/**
 * This class infer a type judgment for every construct.
 * @see ExpressionTypingJudgment
 * @author Strocco Fabio
 */
public class TypingJudgmentInference extends SwrtjSwitch<Constraints> {
	
	/**
	 * Infers a typing judgment by the given expression.
	 * @param e the given expression.
	 * @return the type judgement.
	 */
	public ExpressionTypingJudgment inferExpressionTypingJudgment(GenericExpression expression) {
		ExpressionType type = ExpressionType.createInstance(expression);
		Constraints constraints = new ExpressionConstraintsInference().navigate(expression);
		
		return new ExpressionTypingJudgment(type, constraints);
	}
	
	/**
	 * Infers the typing judgment for the given method.
	 * @param method the method in which infer the judgment.
	 * @return the method judgment.
	 */
	public MethodTypingJudgment inferMethodTypingJudgment(ProvidedMethod method) {
		//Block
		Constraints constraints = doSwitch(method.getBlock());
		
		//Return expression
		ReturnStatement returnStatement = method.getReturnStatement();
		Expression returnExpression = (returnStatement == null ? null :
			                           (Expression)returnStatement.getExpression());
		
		if(returnExpression == null) return new MethodTypingJudgment(method.getMethodRef(), constraints);
		
		ExpressionTypingJudgment expressionJudgment = (inferExpressionTypingJudgment(returnExpression));
		ExpressionType bodyReturnType = (expressionJudgment.getExpressionType());
		constraints.merge(expressionJudgment.getConstraints());
		
		if(bodyReturnType != null && bodyReturnType.isThis())
			constraints.addInterface(method.getReturnType().getInterfaceType());
		
		return new MethodTypingJudgment(method.getMethodRef(), constraints);
	}
	
	@Override
	public Constraints caseBlock(Block block) {
		if(block == null) return new Constraints();
		
		Collection<Parameter> parameterList = block.getParameterList();
		Collection<Statement> statementList = block.getStatementList();
		Constraints constraints = new Constraints();
		
		//Local parameters
		for(Parameter parameter : parameterList) {
			GenericExpression value = ((LocalParameter)parameter).getValue();
			
			if(value == null) continue;
			
			Constraints expressionConstraints = inferExpressionTypingJudgment(value)
				                                .getConstraints();
			Interface interfaceType = parameter.getType().getInterfaceType();
			ExpressionType valueType = ExpressionType.createInstance(value);
			
			if(interfaceType != null && valueType != null && valueType.isThis())
				expressionConstraints.addInterface(interfaceType);
			
			constraints.merge(expressionConstraints);
		}
		
		//Statements
		for(Statement statement : statementList) {
			constraints.merge(doSwitch(statement));
		}
		
		return constraints;
	}
	
	@Override
	public Constraints caseExpressionStatement(ExpressionStatement statement) {
		return inferExpressionTypingJudgment(statement.getExpression()).getConstraints();
	}
	
	@Override
	public Constraints caseIfThenElseStatement(IfThenElseStatement statement) {
		Constraints constraints = new Constraints();
		
		constraints.merge(caseBooleanExpression((BooleanExpression)statement.getCondiction()));
		constraints.merge(caseBlock(statement.getTrueBranch()));
		constraints.merge(caseBlock(statement.getFalseBranch()));
		
		return constraints;
	}
	
	@Override
	public Constraints caseWhileStatement(WhileStatement statement) {
		Constraints constraints = new Constraints();
		
		constraints.merge(caseBooleanExpression((BooleanExpression)statement.getCondiction()));
		constraints.merge(caseBlock(statement.getWhileBlock()));
		
		return constraints;
	}
	
	@Override
	public Constraints caseBooleanExpression(BooleanExpression expression) {
		if(expression == null) return new Constraints();
		Constraints constraints = new Constraints();
		Collection<AtomicBooleanExpression> atomicList = expression.getAtomicList();
		
		for(AtomicBooleanExpression atomic : atomicList) {
			constraints.merge(doSwitch(atomic));
		}
		
		return constraints;
	}
	
	@Override
	public Constraints caseSimpleComparation(SimpleComparation expression) {
		Constraints constraints = new Constraints();
		
		Expression left = (Expression)expression.getLeftExpression();
		Expression right = (Expression)expression.getRightExpression();
		ExpressionType leftType = null;
		ExpressionType rightType = null;
		
		if(left != null) {
			constraints.merge(inferExpressionTypingJudgment(left).getConstraints());
			leftType = ExpressionType.createInstance(left);
		}
		if(right != null) {
			constraints.merge(inferExpressionTypingJudgment(right).getConstraints());
			rightType = ExpressionType.createInstance(right);
		}
		
		String operator = (expression.getCompare() != null ? expression.getCompare().getOperator() : null);
		if(operator != null && (operator.equals("==") || operator.equals("!=")) && left != null && right != null) {
			if(leftType != null && leftType.isThis() && rightType != null && rightType.isInvokable()) {
				Collection<Interface> interfaces = rightType.getCompatibleInterfaces().values();
				
				for(Interface i : interfaces) {
					constraints.addInterface(i);
				}
			}
			
			if(rightType != null && rightType.isThis() && leftType != null && leftType.isInvokable()) {
				Collection<Interface> interfaces = leftType.getCompatibleInterfaces().values();
				
				for(Interface i : interfaces) {
					constraints.addInterface(i);
				}
			}
		}
		
		return constraints;
	}
	
	@Override
	public Constraints caseNestedBooleanExpression(NestedBooleanExpression expression) {
		return caseBooleanExpression((BooleanExpression)expression.getNestedExpression()); 
	}
	
	/*SERVICE METHODS*/
	
	//Infers constraints in the '==' condition related to 'this'
	/*private void inferConditionConstraints(BooleanExpression expression, Constraints constraints) {
		if(left == null || right == null)
			return;
		
		ExpressionType leftType = ExpressionType.createInstance(left);
		ExpressionType rightType = ExpressionType.createInstance(right);
		if(leftType == null || rightType == null)
			return;
		if(leftType.isThis() && rightType.isInvokable()) {
			Collection<Interface> interfaces = rightType.getCompatibleInterfaces().values();
			
			for(Interface i : interfaces) {
				constraints.addInterface(i);
			}
		}
		
		if(rightType.isThis() && leftType.isInvokable()) {
			Collection<Interface> interfaces = leftType.getCompatibleInterfaces().values();
			
			for(Interface i : interfaces) {
				constraints.addInterface(i);
			}
		}
	}*/
}