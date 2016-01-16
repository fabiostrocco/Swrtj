package org.xtext.example.utils;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.xtext.example.linker.ElementFactory;
import org.xtext.example.linker.SwrtjResourceFactory;
import org.xtext.example.navigation.ParameterLookup;
import org.xtext.example.navigation.RecordElementLookup;
import org.xtext.example.navigation.TraitConstraintInference;
import org.xtext.example.swrtj.AnonimousRecord;
import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.BaseRecord;
import org.xtext.example.swrtj.BaseTrait;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.Import;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.Record;
import org.xtext.example.swrtj.RecordExpression;
import org.xtext.example.swrtj.RecordRename;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.swrtj.TraitAlias;
import org.xtext.example.swrtj.TraitElement;
import org.xtext.example.swrtj.TraitExpression;
import org.xtext.example.swrtj.TraitFieldRename;
import org.xtext.example.swrtj.TraitMethodRename;
import org.xtext.example.swrtj.Type;
import org.xtext.example.swrtj.util.SwrtjSwitch;
import org.xtext.example.typechecking.InterfaceMap;
import org.xtext.example.typechecking.TraitTypingJudgment;

/**
 * This is an utility class that executes lookups.
 * @author Strocco Fabio
 */
public class Lookup extends SwrtjSwitch<EObject> {

	/**
	 * Returns all the imported files from the specified one(included).
	 * @param file the file in witch lookup all the imported files
	 * @return a collection containing the specified file(the first element of the collection) and all
	 * the referenced files.
	 */
	public List<File> getAllFiles(File file) {	
		List<File> fileList = new LinkedList<File>();
		fileList.add(file);
		Resource res = SwrtjResourceFactory.getSystemResource();
		fileList.add((File)res.getContents().get(0));
		
		List<Import> imports = file.getImportList();
		List<Import> importList = (imports == null ? new LinkedList<Import>() : imports);
		for(Import imp : importList) {
			if(imp == null || imp.getImportURI() == null) {continue;}
			Resource resource = EcoreUtil2.getResource(file.eResource(), imp.getImportURI());
			if(resource != null && resource.getContents().size() >= 1) 
				fileList.add((File)resource.getContents().get(0));
			
		}
		
		return fileList;
	}
	
	/**
	 * Returns all the interfaces implemented by a class, but not every interface extended by them.
	 * @param class the class in witch lookup the interfaces.
	 * @return a set containing all the interfaces implemented the given class, but not every interface extended by them.
	 */
	public InterfaceMap getImplementedInterfaces(Class classType) {
		return (classType != null ? new InterfaceMap(classType.getImplementsList()) : new InterfaceMap());
	}
	
	/**
	 * Returns all the interfaces implemented by a class.
	 * @param class the class in witch lookup the interfaces.
	 * @return a set containing all the interfaces implemented the given class.
	 */
	public InterfaceMap getAllImplementedInterfaces(Class classType) {
		return getAllInterfaces(getImplementedInterfaces(classType).values());
	}
	
	/**
	 * Returns all the interfaces extended by the given list and the interfaces in the list.
	 * @param interfaceList the interface list in witch lookup the interfaces.
	 * @return a set containing all the interfaces compatible with the list.
	 */
	public InterfaceMap getAllInterfaces(Collection<Interface> interfaceList) {
		InterfaceMap allInterfaces = new InterfaceMap();
		
		for(Interface i : interfaceList) {
			allInterfaces.add(i);
			allInterfaces.putAll(getAllExtendedInterfaces(i));
		}
		//Adds the implicit IObject interface
		allInterfaces.add((Interface)ElementFactory.getFactory().forName("IObject"));
		
		return allInterfaces;
	}

	/** 
	 * Returns all the interfaces that extends the given interface, but not every interface extended by them.
	 * @param interface the interface in witch lookup the interfaces.
	 * @return a set containing all the interfaces extended by the given interface, 
	 * but not every interface extended by them.
	 */
	public InterfaceMap getExtendedInterfaces(Interface interfaceType) {
		return new InterfaceMap(interfaceType.getExtendsList());
	}
	
	/** 
	 * Returns all the interfaces that extends the given interface.
	 * @param interface the interface in witch lookup the interfaces.
	 * @return a set containing all the interfaces extended by the given interface.
	 */
	public InterfaceMap getAllExtendedInterfaces(Interface interfaceType) {
		InterfaceMap extendsList = new InterfaceMap();
		//Adds the implicit IObject interface
		extendsList.add((Interface)ElementFactory.getFactory().forName("IObject"));
		getAllExtendedInterfaces(interfaceType, extendsList);
		
		return extendsList;
	}
	
	/**
	 * Returns all the field request in the specified trait.
	 * @param trait the trait in witch lookup the fields.
	 * @return the set of required fields of the trait.
	 */
	public  Map<String, FieldName> getRequiredFields(Trait trait) {
		return new TraitConstraintInference().navigate(trait).getAllConstraints().getRequiredFieldsMap();
	}
	
	/**
	 * Returns all the field request in the specified trait.
	 * @param trait the trait in witch lookup the fields.
	 * @return the set of required fields of the trait.
	 */
	public  Map<String, FieldName> getRequiredFields(BaseTrait trait) {
		return new TraitConstraintInference().navigate(trait).getAllConstraints().getRequiredFieldsMap();
	}
	
	/**
	 * Returns all the field request in the specified trait.
	 * @param trait the trait in witch lookup the fields.
	 * @return the set of required fields of the trait.
	 */
	public  Map<String, FieldName> getRequiredFields(TraitExpression trait) {
		return new TraitConstraintInference().navigate(trait).getAllConstraints().getRequiredFieldsMap();
	}
	
	/**
	 * Returns all the field request in the specified trait.
	 * @param trait the trait in witch lookup the fields.
	 * @return the set of required fields of the trait.
	 */
	public  Map<String, FieldName> getRequiredFields(AnonimousTrait trait) {
		return new TraitConstraintInference().navigate(trait).getAllConstraints().getRequiredFieldsMap();
	}
	
	/**
	 * Returns all the method declaration in the specified trait.
	 * @param trait the trait in witch lookup the fields.
	 * @return the set of method declaration(required or provided) of the trait.
	 */
	public  Map<String, MethodName> getMethods(Trait trait) {
		TraitTypingJudgment judgment = new TraitConstraintInference().navigate(trait);
		Map<String, MethodName> methods = judgment.getProvidedMethodsMap();
		methods.putAll(judgment.getAllConstraints().getRequiredMethodsMap());
		return methods;
	}
	
	/**
	 * Returns all the method declaration in the specified trait.
	 * @param trait the trait in witch lookup the fields.
	 * @return the set of method declaration(required or provided) of the trait.
	 */
	public  Map<String, MethodName> getMethods(BaseTrait trait) {
		TraitTypingJudgment judgment = new TraitConstraintInference().navigate(trait);
		Map<String, MethodName> methods = judgment.getProvidedMethodsMap();
		methods.putAll(judgment.getAllConstraints().getRequiredMethodsMap());
		
		return methods;
	}
	
	
	/**
	 * Returns all the method declaration in the specified trait.
	 * @param expression the trait expression in witch lookup the fields.
	 * @return the set of method declaration(required or provided) of the trait.
	 */
	public  Map<String, MethodName> getMethods(TraitExpression expression) {
		TraitTypingJudgment judgment = new TraitConstraintInference().navigate(expression);
		Map<String, MethodName> methods = judgment.getProvidedMethodsMap();
		methods.putAll(judgment.getAllConstraints().getRequiredMethodsMap());
		
		return methods;
	}
	
	/**
	 * Returns all the method declaration in the specified trait.
	 * @param trait the trait in witch lookup the fields.
	 * @return the set of method declaration(required or provided) of the trait.
	 */
	public  Map<String, MethodName> getMethods(AnonimousTrait trait) {
		TraitTypingJudgment judgment = new TraitConstraintInference().navigate(trait);
		Map<String, MethodName> methods = judgment.getProvidedMethodsMap();
		methods.putAll(judgment.getAllConstraints().getRequiredMethodsMap());
		
		return methods;
	}
	
	/**
	 * Returns all the provided method in the specified trait.
	 * @param expression the trait expression in witch lookup the methods.
	 * @return the set of provided method of the trait.
	 */
	public  Map<String, MethodName> getProvidedMethods(TraitExpression expression) {
		return new TraitConstraintInference().navigate(expression).getProvidedMethodsMap();
	}
	
	/**
	 * Returns all the provided method in the specified trait.
	 * @param trait the trait in witch lookup the methods.
	 * @return the set of provided method of the trait.
	 */
	public  Map<String, MethodName> getProvidedMethods(AnonimousTrait trait) {		
		return new TraitConstraintInference().navigate(trait).getProvidedMethodsMap();
	}
	
	/**
	 * Returns all the provided method in the specified trait.
	 * @param expression the trait expression in witch lookup the methods.
	 * @return the set of provided method of the trait.
	 */
	public Map<String, MethodName> getProvidedMethods(Trait trait) {		
		return new TraitConstraintInference().navigate(trait).getProvidedMethodsMap();
	}
	
	/**
	 * Returns all the provided method in the specified trait.
	 * @param expression the trait expression in witch lookup the methods.
	 * @return the set of provided method of the trait.
	 */
	public Map<String, MethodName> getRequiredMethods(AnonimousTrait trait) {		
		return new TraitConstraintInference().navigate(trait).getAllConstraints().getRequiredMethodsMap();
	}
	
	/**
	 * Returns all the provided method in the specified trait.
	 * @param expression the trait expression in witch lookup the methods.
	 * @return the set of provided method of the trait.
	 */
	public Map<String, MethodName> getRequiredMethods(Trait trait) {		
		return new TraitConstraintInference().navigate(trait).getAllConstraints().getRequiredMethodsMap();
	}
	
	/**
	 * Returns all the provided method in the specified trait.
	 * @param expression the trait expression in witch lookup the methods.
	 * @return the set of provided method of the trait.
	 */
	public Map<String, MethodName> getRequiredMethods(TraitExpression trait) {		
		return new TraitConstraintInference().navigate(trait).getAllConstraints().getRequiredMethodsMap();
	}
	
	/**
	 * Returns all the field declaration in the specified record.
	 * @param record the record in witch lookup the fields.
	 * @return the set of field declaration of the record.
	 */
	public Map<String, FieldName> getProvidedFields(Record record) {
		return new RecordElementLookup().navigate(record);
	}
	
	/**
	 * Returns all the field declaration in the specified record.
	 * @param record the record in witch lookup the fields.
	 * @return the set of field declaration of the record.
	 */
	public Map<String, FieldName> getProvidedFields(BaseRecord record) {
		return new RecordElementLookup().navigate(record);
	}
	
	/**
	 * Returns all the field declaration in the specified record expression.
	 * @param record expression the record expression in witch lookup the fields.
	 * @return the set of field declaration of the record.
	 */
	public Map<String, FieldName> getProvidedFields(RecordExpression expression) {
		return new RecordElementLookup().navigate(expression);
	}
	
	/**
	 * Returns all the field declaration in the specified record.
	 * @param record the record in witch lookup the fields.
	 * @return the set of field declaration of the record.
	 */
	public Map<String, FieldName> getProvidedFields(AnonimousRecord record) {
		return new RecordElementLookup().navigate(record);
	}

	/**
	 * Finds all the visible parameters within the expression.
	 * @param expression the expression in which lookup the parameters.
	 * @return all the parameters in the current scope.
	 */
	public Collection<Parameter> getParameters(Expression expression) {
		return new ParameterLookup().getParameters(expression);
	}
	
	/**
	 * Returns all the required method of the given interface(included the super-interfaces requests).
	 * @param interfaceType the interface in which lookup the methods.
	 * @return all the methods, an empty set if no such element exists.
	 */
	public Set<Method> getAllRequiredMethods(Interface interfaceType) {
		Collection<Interface> interfaceList = getAllExtendedInterfaces(interfaceType).values();
		Set<Method> methodSet = new HashSet<Method>();
		methodSet.addAll(interfaceType.getRequiredMethodList());
		
		for(Interface i : interfaceList) {
			methodSet.addAll(i.getRequiredMethodList());
		}
		
		return methodSet;
	}
	
	/**
	 * Returns all the required method of the given interface list(included the super-interfaces requests).
	 * @param interfaceType the interface in which lookup the methods.
	 * @return all the methods, an empty set if no such element exists.
	 */
	public Set<Method> getAllRequiredMethods(Collection<Interface> interfaceList) {
		Set<Method> methodSet = new HashSet<Method>();
		Collection<Interface> interfaces = this.getAllInterfaces(interfaceList).values();
		
		for(Interface i : interfaces) {
			methodSet.addAll(i.getRequiredMethodList());
		}
		
		return methodSet;
	}
	
	/**
	 * Returns the owner field of the given field name.
	 * @param field the field name in which lookup the owner.
	 * @return the owner field of the given field name.
	 */
	public Field getOwnerField(FieldName field) {
		return new FieldLookup().getField(field);
	}
	
	/**
	 * Returns the type of the given field.
	 * @param field the field in which lookup the type.
	 * @return the type of the given field.
	 */
	public Type getType(FieldName field) {
		Field ownerField = getOwnerField(field);
		return (ownerField != null ? ownerField.getType() : null);
	}
	
	/**
	 * Returns the field name list of this field list.
	 * @param fieldList the field list in which lookup the field names.
	 * @return the field name list of this field list.
	 */
	public Collection<FieldName> getRecordFieldNames(Collection<Field> fieldList) {
		Collection<FieldName> nameList = new LinkedList<FieldName>();
		
		for(Field field : fieldList) {
			nameList.add(field.getFieldRef());
		}
		
		return nameList;
	}
	
	/**
	 * Returns the field name list of this field list.
	 * @param elementList the element list in which lookup the field names.
	 * @return the field name list of this field list.
	 */
	public Collection<FieldName> getTraitFieldNames(Collection<TraitElement> elementList) {
		Collection<FieldName> nameList = new LinkedList<FieldName>();
		
		for(TraitElement element : elementList) {
			if(element instanceof Field)
				nameList.add(((Field)element).getFieldRef());
		}
		
		return nameList;
	}
	
	/**
	 * Returns the method name list of this method list.
	 * @param elementList the element list in which lookup the method names.
	 * @return the field name list of this method list.
	 */
	public Collection<MethodName> getTraitMethodNames(Collection<TraitElement> elementList) {
		Collection<MethodName> nameList = new LinkedList<MethodName>();
		
		for(TraitElement element : elementList) {
			if(element instanceof Method)
				nameList.add(((Method)element).getMethodRef());
		}
		
		return nameList;
	}
	
	/**
	 * Returns the owner method of the given method name.
	 * @param method the method name in which lookup the owner.
	 * @return the owner method of the given method name.
	 */
	public Method getOwnerMethod(MethodName method) {
		return new MethodLookup().getMethod(method);
	}
	
	/**
	 * Returns the return type of the given method.
	 * @param method the method in which lookup the type.
	 * @return the type of the given method.
	 */
	public Type getReturnType(MethodName method) {
		Method ownerMethod = getOwnerMethod(method);
		return (ownerMethod != null ? ownerMethod.getReturnType() : null);
	}
	
	/**
	 * Returns the parameters of the given method.
	 * @param method the method in which lookup the type.
	 * @return the parameter list.
	 */
	public Collection<Parameter> getParameterList(MethodName method) {
		Method ownerMethod = getOwnerMethod(method);
		return (ownerMethod != null ? ownerMethod.getParameterList() : null);
	}
	
	/**
	 * Returns the field name list of this method list.
	 * @param method the method list in which lookup the method names.
	 * @return the method name list of this method list.
	 */
	public Collection<MethodName> getMethodNames(Collection<Method> methodList) {
		Collection<MethodName> nameList = new LinkedList<MethodName>();
		
		for(Method method : methodList) {
			nameList.add(method.getMethodRef());
		}
		
		return nameList;
	}
	
	/**
	 * Returns all the required method of the given class due to his implemented interfaces,
	 * (included the super-interfaces requests).
	 * @param interfaceType the interface in which lookup the methods.
	 * @return all the methods, an empty set if no such element exists.
	 */
	public Set<Method> getAllInterfaceRequiredMethods(Class classType) {
		return getAllRequiredMethods(classType.getImplementsList());
	}
	
	/**
	 * Returns the owner of the given child.
	 * @param child the child of the owner, for instance a Method.
	 * @return the owner of the child, for instance the class in which the method is located, or
	 * <code>null</code> if the child is above an element on the tree.
	 */
	public EObject getOwner(EObject child) {
		EObject current = child;
		
		while(current != null && !(current instanceof Element) && !(current instanceof AnonimousTrait)) {
			current = current.eContainer();
		}

		return current;
	}

	/* Service methods */
	
	private void getAllExtendedInterfaces(Interface interfaceType, InterfaceMap extendsList) {
		Collection<Interface> directExtendsList = getExtendedInterfaces(interfaceType).values();
		
		for(Interface i : directExtendsList) {
			if(!extendsList.contains(i)) {
				extendsList.add(i);
				getAllExtendedInterfaces(i, extendsList);
			}
		}
	}
	
	/* Service classes */
	
	private class FieldLookup extends SwrtjSwitch<Field> {
		private Field getField(FieldName reference) {
			if(reference == null) return null;
			EObject owner = reference.eContainer();
			if(owner != null)
				return doSwitch(owner);
			else return null;
		}
		
		public Field caseField(Field field) {
			return field;
		}
		
		@Override
		public Field caseRecordRename(RecordRename operation) {
			return getField(operation.getOriginalField());
		}
		
		@Override
		public Field caseTraitFieldRename(TraitFieldRename operation) {
			return getField(operation.getOriginalField());
		}
	}
	
	private class MethodLookup extends SwrtjSwitch<Method> {
		private Method getMethod(MethodName reference) {
			if(reference == null) return null;
			EObject owner = reference.eContainer();
			if(owner != null)
				return doSwitch(owner);
			else return null;
		}
		
		@Override
		public Method caseMethod(Method method) {
			return method;
		}
		
		@Override
		public Method caseTraitMethodRename(TraitMethodRename operation) {
			return getMethod(operation.getOriginalMethod());
		}
		
		@Override
		public Method caseTraitAlias(TraitAlias operation) {
			return getMethod(operation.getOriginalMethod());
		}
	}
}