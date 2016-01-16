
package org.xtext.example.ui.quickfix;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.xtext.example.swrtj.AnonimousRecord;
import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.Block;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.FormalParameter;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.RequiredMethod;
import org.xtext.example.swrtj.SwrtjFactory;
import org.xtext.example.swrtj.Type;
import org.xtext.example.utils.Lookup;
import org.xtext.example.validation.SwrtjJavaValidator;

public class SwrtjQuickfixProvider extends DefaultQuickfixProvider {
	private Lookup lookup = new Lookup();

	@Fix(SwrtjJavaValidator.WRONG_CONSTRUCTOR_NAME)
	public void changeConstructorName(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Change constructor name", "The constructor name become the same of the class name", "class_obj.gif", new ISemanticModification() {
			public void apply(EObject element, IModificationContext context) throws BadLocationException {
				Constructor constructor = (Constructor)element;
				constructor.setName(((Class)lookup.getOwner(constructor)).getName());
			}
		});
	}
	
	@Fix(SwrtjJavaValidator.UNUSED_REQUIRED_FIELD)
	public void removeUnusedRequiredField(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove unused required field", "The field is removed by the trair", "field_required_obj.png", new ISemanticModification() {
			public void apply(EObject element, IModificationContext context) throws BadLocationException {
				FieldName field = (FieldName)element;
				AnonimousTrait t = (AnonimousTrait)lookup.getOwner(field);
				t.getDefinitionList().remove(lookup.getOwnerField(field));
			}
		});
	}
	
	@Fix(SwrtjJavaValidator.UNUSED_REQUIRED_METHOD)
	public void removeUnusedRequiredMethod(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Remove unused required method", "The method is removed by the trair", "methodrequest_obj.png", new ISemanticModification() {
			public void apply(EObject element, IModificationContext context) throws BadLocationException {
				MethodName method = (MethodName)element;
				AnonimousTrait t = (AnonimousTrait)lookup.getOwner(method);
				t.getDefinitionList().remove(lookup.getOwnerMethod(method));
			}
		});
	}
	
	@Fix(SwrtjJavaValidator.UNPROVIDED_FIELDS)
	public void addUnprovidedFields(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add unprovided fields", "All the unprovided fields are added", "record_obj.gif", new ISemanticModification() {
			public void apply(EObject element, IModificationContext context) throws BadLocationException {
				Class targetClass = (Class)element;
				Collection<FieldName> requestList = lookup.getRequiredFields(targetClass.getTraitExpression()).values();
				Map<String, FieldName> provideMap = lookup.getProvidedFields(targetClass.getRecordExpression());
				Collection<FieldName> unprovidedFields = new LinkedList<FieldName>();
				
				for(FieldName request : requestList) {
					if(!provideMap.containsKey(request.getName())) {
						unprovidedFields.add(request);
					}
				}
				
				AnonimousRecord newRecord = SwrtjFactory.eINSTANCE.createAnonimousRecord();
				
				for(FieldName field : unprovidedFields) {
					Field oldField = lookup.getOwnerField(field);
					
					Field newField = SwrtjFactory.eINSTANCE.createFieldDeclaration();
					FieldName newName = SwrtjFactory.eINSTANCE.createFieldName();
					Type newType = SwrtjFactory.eINSTANCE.createType();
					
					newType.setInterfaceType(oldField.getType().getInterfaceType());
					newType.setPrimitiveType(oldField.getType().getPrimitiveType());
					newName.setName(field.getName());
					newField.setFieldRef(newName);
					newField.setType(newType);
					newRecord.getDeclarationList().add(newField);
				}
				targetClass.getRecordExpression().getRecordList().add(newRecord);
			}
		});
	}
	
	@Fix(SwrtjJavaValidator.TRAIT_UNPROVIDED_METHODS)
	public void addTraitUnprovidedMethods(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add unprovided methods required in traits", "All the unprovided methods required by the traits are added", "trait_obj.gif", new ISemanticModification() {
			public void apply(EObject element, IModificationContext context) throws BadLocationException {
				Class targetClass = (Class)element;
				Collection<MethodName> requestList = lookup.getRequiredMethods(targetClass.getTraitExpression()).values();
				Map<String, MethodName> provideMap = lookup.getProvidedMethods(targetClass.getTraitExpression());
				Collection<MethodName> unprovidedMethods = new LinkedList<MethodName>();
				
				for(MethodName request : requestList) {
					if(!provideMap.containsKey(request.getName())) {
						unprovidedMethods.add(request);
					}
				}
				
				AnonimousTrait newTrait = SwrtjFactory.eINSTANCE.createAnonimousTrait();
				
				for(MethodName method : unprovidedMethods) {
					Method oldMethod = lookup.getOwnerMethod(method);
					
					ProvidedMethod newMethod = SwrtjFactory.eINSTANCE.createProvidedMethod();
					MethodName newName = SwrtjFactory.eINSTANCE.createMethodName();
					Type newReturnType = SwrtjFactory.eINSTANCE.createType();
					
					newReturnType.setInterfaceType(oldMethod.getReturnType().getInterfaceType());
					newReturnType.setPrimitiveType(oldMethod.getReturnType().getPrimitiveType());
					newName.setName(method.getName());
					newMethod.setMethodRef(newName);
					newMethod.setReturnType(newReturnType);
					
					
					for(Parameter oldParameter : oldMethod.getParameterList()) {
						FormalParameter newParameter = SwrtjFactory.eINSTANCE.createFormalParameter();
						Type newType = SwrtjFactory.eINSTANCE.createType();
						newType.setInterfaceType(oldParameter.getType().getInterfaceType());
						newType.setPrimitiveType(oldParameter.getType().getPrimitiveType());
						newParameter.setName(oldParameter.getName());
						newParameter.setType(newType);
						newMethod.getParameterList().add(newParameter);
					}
					Block newBlock = SwrtjFactory.eINSTANCE.createBlock();
					newMethod.setBlock(newBlock);
					newTrait.getDefinitionList().add(newMethod);
				}
				
				targetClass.getTraitExpression().getTraitList().add(newTrait);
			}
		});
	}
	
	@Fix(SwrtjJavaValidator.INTERFACE_UNPROVIDED_METHODS)
	public void addInterfaceUnprovidedMethods(final Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, "Add unprovided methods required in the interfaces", "All the unprovided methods required by the interfaces are added", "interface_obj.gif", new ISemanticModification() {
			public void apply(EObject element, IModificationContext context) throws BadLocationException {
				Class targetClass = (Class)element;
				Collection<Method> requestList = lookup.getAllInterfaceRequiredMethods(targetClass);
				Map<String, MethodName> provideMap = lookup.getProvidedMethods(targetClass.getTraitExpression());
				Collection<Method> unprovidedMethods = new LinkedList<Method>();
				
				for(Method request : requestList) {
					if(!provideMap.containsKey(request.getMethodRef().getName())) {
						unprovidedMethods.add(request);
					}
				}
				
				AnonimousTrait newTrait = SwrtjFactory.eINSTANCE.createAnonimousTrait();
				
				for(Method method : unprovidedMethods) {					
					ProvidedMethod newMethod = SwrtjFactory.eINSTANCE.createProvidedMethod();
					MethodName newName = SwrtjFactory.eINSTANCE.createMethodName();
					Type newReturnType = SwrtjFactory.eINSTANCE.createType();
					
					newReturnType.setInterfaceType(method.getReturnType().getInterfaceType());
					newReturnType.setPrimitiveType(method.getReturnType().getPrimitiveType());
					newName.setName(method.getMethodRef().getName());
					newMethod.setMethodRef(newName);
					newMethod.setReturnType(newReturnType);
					
					for(Parameter oldParameter : method.getParameterList()) {
						FormalParameter newParameter = SwrtjFactory.eINSTANCE.createFormalParameter();
						Type newType = SwrtjFactory.eINSTANCE.createType();
						newType.setInterfaceType(oldParameter.getType().getInterfaceType());
						newType.setPrimitiveType(oldParameter.getType().getPrimitiveType());
						newParameter.setName(oldParameter.getName());
						newParameter.setType(newType);
						newMethod.getParameterList().add(newParameter);
					}
					Block newBlock = SwrtjFactory.eINSTANCE.createBlock();
					newMethod.setBlock(newBlock);
					newTrait.getDefinitionList().add(newMethod);
				}
				
				targetClass.getTraitExpression().getTraitList().add(newTrait);
			}
		});
	}
}
