/*
* generated by Xtext
*/
package org.xtext.example.ui.contentassist;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.DottedExpression;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.typechecking.ExpressionType;
import org.xtext.example.utils.Lookup;
/**
 * see http://www.eclipse.org/Xtext/documentation/latest/xtext.html#contentAssist on how to customize content assistant
 */
public class SwrtjProposalProvider extends AbstractSwrtjProposalProvider {
	Lookup lookup = new Lookup();
	
	@Override
	public String getDisplayString(EObject element, String qualifiedName, String shortName) {
		return getLabelProvider().getText(element);
	}	
	
	@Override
	public void complete_MethodInvocation(EObject model, RuleCall call, 
                                          ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		ExpressionType expressionType = ExpressionType.createInstance(((DottedExpression)model).getReceiver(), true);
		if(expressionType == null) return;
		Collection<MethodName> methodList = expressionType.getInvokableMethods();
		
		for(MethodName method : methodList) {
			acceptor.accept(createCompletionProposal(complete(method), 
					                                 getLabelProvider().getText(method), 
                                                     getLabelProvider().getImage(method), 
                                                     context));
		}
	}

	@Override
	public void completeConstructorInvocation_ClassRef(EObject model, 
			                                           Assignment assignment, 
                                                       ContentAssistContext context, 
                                                       ICompletionProposalAcceptor acceptor) {
		EObject current = model;
		while(!(current instanceof File)) {
			current = current.eContainer();
		}
		
		Collection<File> fileList = lookup.getAllFiles((File)current);
		
		for(File f : fileList) {
			Collection<Class> classList = EcoreUtil2.getAllContentsOfType(f, Class.class);
			
			for(Class c : classList) {
				Collection<Constructor> constructorList = c.getConstructorList();
				
				for(Constructor k : constructorList) {
					acceptor.accept(createCompletionProposal(complete(k),
							                                 getLabelProvider().getText(k), 
							                                 getLabelProvider().getImage(k), 
							                                 context));
				}
			}
		}
	}
	
	/*Service metods*/
	
	private String complete(Constructor constructor) {
		return complete(constructor.getName(), constructor.getParameterList());
	}
	
	private String complete(MethodName method) {
		return complete(method.getName(), lookup.getParameterList(method));
	}
	
	private String complete(String name, Collection<Parameter> parameterList) {
		String result = name;
		result += "(";
		int index = 0;
		int size = parameterList.size();
		
		for(Parameter parameter : parameterList) {
			result += parameter.getName() + (index < size - 1 ? ", " : "");
			index++;
		}
		
		result += ")";
		
		return result;
	}
}