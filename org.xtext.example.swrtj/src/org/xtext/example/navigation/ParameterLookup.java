package org.xtext.example.navigation;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.swrtj.Block;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.LocalParameter;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.ReturnStatement;
import org.xtext.example.swrtj.util.SwrtjSwitch;

/**
 * This class finds all the visible parameters within the expression.
 * @author Strocco Fabio 
 */
public class ParameterLookup extends SwrtjSwitch<Collection<Parameter>> {
	private LocalParameter localContext = null;
	private boolean dumpLocalParameters = false;
	
	/**
	 * Finds all the visible parameters within the expression.
	 * @param expression the expression in which lookup the parameters.
	 * @return all the parameters in the current scope.
	 */
	public Collection<Parameter> getParameters(Expression expression) {
		EObject current = expression;
		Collection<Parameter> result = new LinkedList<Parameter>();
		
		while(current != null) {
			Collection<Parameter> temp = doSwitch(current);
			if(temp != null) result.addAll(temp);
			current = current.eContainer();
		}
		
		return result;
	}
	
	@Override
	public Collection<Parameter> caseLocalParameter(LocalParameter parameter) {
		localContext = parameter;
		return null;
	}
	
	@Override
	public Collection<Parameter> caseBlock(Block block) {
		Collection<Parameter> parameterList = block.getParameterList();
		Collection<Parameter> result = new LinkedList<Parameter>();
		
		for(Parameter parameter : parameterList) {
			if(parameter.equals(localContext)) break;
			result.add(parameter);
		}
		
		localContext = null;
		return result;
	}
	
	@Override
	public Collection<Parameter> caseReturnStatement(ReturnStatement statement) {
		dumpLocalParameters = true;
		return null;
	}
	
	@Override
	public Collection<Parameter> caseProvidedMethod(ProvidedMethod method) {
		Collection<Parameter> parameterList = new LinkedList<Parameter>();
		parameterList.addAll(method.getParameterList());
		if(dumpLocalParameters) parameterList.addAll(method.getBlock().getParameterList());
		return parameterList;
	}
	
	@Override
	public Collection<Parameter> caseConstructor(Constructor method) {
		Collection<Parameter> parameterList = new LinkedList<Parameter>();
		parameterList.addAll(method.getParameterList());
		if(dumpLocalParameters) parameterList.addAll(method.getBlock().getParameterList());
		return parameterList;
	}
}
