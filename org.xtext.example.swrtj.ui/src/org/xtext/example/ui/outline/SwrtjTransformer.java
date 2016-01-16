/*
* generated by Xtext
*/
package org.xtext.example.ui.outline;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.outline.transformer.AbstractDeclarativeSemanticModelTransformer;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.Program;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.Record;
import org.xtext.example.swrtj.RequiredMethod;
import org.xtext.example.swrtj.SwrtjFactory;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.swrtj.Type;
import org.xtext.example.utils.Lookup;

/**
 * customization of the default outline structure
 * 
 */
public class SwrtjTransformer extends AbstractDeclarativeSemanticModelTransformer {
	private Lookup lookup = new Lookup();
	
	protected List<EObject> getChildren(Interface i) {
		List<EObject> children = new LinkedList<EObject>();
		children.addAll(lookup.getAllRequiredMethods(i));
		return children;
	}
	
	protected List<EObject> getChildren(Program program) {
		return NO_CHILDREN;
	}
	
	protected List<EObject> getChildren(Record record) {
		List<EObject> children = new LinkedList<EObject>();
		children.addAll(lookup.getProvidedFields(record).values());
		
		return children;
	}
	
	protected List<EObject> getChildren(Trait trait) {
		List<EObject> children = new LinkedList<EObject>();
		//Adds required fields
		children.addAll(lookup.getRequiredFields(trait).values());
		
		Map<String, MethodName> requiredMethods = lookup.getRequiredMethods(trait);
		Map<String, MethodName> providedMethods = lookup.getProvidedMethods(trait);
		Collection<MethodName> requiredMethodList = requiredMethods.values();
		
		//Adds required methods in all the constraints, that are not provided
		for(MethodName requiredMethod : requiredMethodList) {
			if(!providedMethods.containsKey(requiredMethod.getName())) {
				Method reqMethod = lookup.getOwnerMethod(requiredMethod);
				if(reqMethod instanceof ProvidedMethod) {
					RequiredMethod method = SwrtjFactory.eINSTANCE.createRequiredMethod();
					MethodName methodRef = SwrtjFactory.eINSTANCE.createMethodName();
					
					methodRef.setName(requiredMethod.getName());
					method.setMethodRef(methodRef);
					method.setReturnType((Type)EcoreUtil2.copy(reqMethod.getReturnType()));
					method.getParameterList().addAll(reqMethod.getParameterList());
					children.add(method);
				} else {
					children.add(requiredMethod);
				}
			}
		}
		
		//Adds provided methods
		children.addAll(providedMethods.values());
		
		return children;
	}
	
	protected List<EObject> getChildren(Class c) {
		List<EObject> children = new LinkedList<EObject>();
		
		children.addAll(lookup.getProvidedFields(c.getRecordExpression()).values());
		children.addAll(lookup.getProvidedMethods(c.getTraitExpression()).values());
		children.addAll(c.getConstructorList());
		
		return children;
	}
	
	protected List<EObject> getChildren(Constructor constructor) {
		return NO_CHILDREN;
	}
	
	protected List<EObject> getChildren(Method method) {
		return NO_CHILDREN;
	}
}
