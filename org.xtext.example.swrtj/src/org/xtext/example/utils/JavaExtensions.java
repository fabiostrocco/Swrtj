package org.xtext.example.utils;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xtext.example.linker.ElementFactory;
import org.xtext.example.navigation.TraitConstraintInference;
import org.xtext.example.swrtj.DottedExpression;
import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.FieldAccess;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.Import;
import org.xtext.example.swrtj.Message;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.MethodInvocation;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.RecordExpression;
import org.xtext.example.swrtj.TraitExpression;
import org.xtext.example.swrtj.Type;
import org.xtext.example.typechecking.Constraints;
import org.xtext.example.typechecking.ExpressionType;
import org.xtext.example.typechecking.MethodTypingJudgment;
import org.xtext.example.typechecking.TraitTypingJudgment;

/**
 * This class is a support to XTend method. Therefore it can be called by java extension methods.
 * @author Strocco Fabio
 */
public class JavaExtensions {
	
	/**
	 * Returns all the files imported imported by the given file, including it.
	 * @param file the file in which lookup the other files.
	 * @return the list of imported files.
	 */
	public static List<File> getAllFiles(File file) {
		Lookup lookup = new Lookup();
		return lookup.getAllFiles(file);
	}
	
	/**
	 * Returns all the fields provided by the record expression given as parameter.
	 * @param record the record in which lookup the parameters.
	 * @return the list of fields.
	 */
	public static Collection<FieldName> getRecordFields(RecordExpression expression) {
		Lookup lookup = new Lookup();
		return lookup.getProvidedFields(expression).values();
	}
	
	/**
	 * Returns the type of the given field name.
	 * @param field the field in which lookup the type.
	 * @return the type of the given field name.
	 */
	public static Type getType(FieldName field) {
		Lookup lookup = new Lookup();
		return lookup.getType(field);
	}
	
	/**
	 * Returns the owner field of the given field name.
	 * @param field the field name in which lookup the owner.
	 * @return the owner field of the given field name.
	 */
	public static Field getField(FieldName field) {
		Lookup lookup = new Lookup();
		return lookup.getOwnerField(field);
	}
	
	/**
	 * Returns the type of the given method name.
	 * @param method the method in which lookup the type.
	 * @return the type of the given method name.
	 */
	public static Type getReturnType(MethodName method) {
		Lookup lookup = new Lookup();
		return lookup.getReturnType(method);
	}
	
	/**
	 * Returns the parameter list of the given method name.
	 * @param method the method in which lookup the parameters.
	 * @return the parameter list of the given method name.
	 */
	public static Collection<Parameter> getParameterList(MethodName method) {
		Lookup lookup = new Lookup();
		return lookup.getParameterList(method);
	}
	
	/**
	 * Returns the owner method of the given method name.
	 * @param method the method name in which lookup the owner.
	 * @return the owner method of the given method name.
	 */
	public static Method getMethod(MethodName method) {
		Lookup lookup = new Lookup();
		return lookup.getOwnerMethod(method);
	}
	
	/**
	 * Build a list containing informations for the method generating, i.e. elements and 
	 * mappings <original element name, to translate method name>.
	 * This is needed due to the renaming where a method in the model contains elements(fields and/or methods)
	 * that should have been renamed in the current trait expression so that the translation need to
	 * get the renamed method.
	 * The list, in order to be compatible with extend and xpand, is made of
	 * list of 2 elements for each provided method: provided method name(MethodName) and mappins
	 * <original name, to translate name> i.e. a Map<String, String>.
	 * @param expression
	 * @return the list containins the informations for the methods.
	 */
	public static List<List<Object>> getTraitMappings(TraitExpression expression) {
		List<List<Object>> mappings = new LinkedList<List<Object>>();
		TraitTypingJudgment judgment = new TraitConstraintInference().navigate(expression);		
		Collection<String> providedMethodNames = judgment.getAllMethodNames();
		Lookup lookup = new Lookup();

		for(String methodName : providedMethodNames) {
			MethodTypingJudgment methodJudgment = judgment.getMethodTypingJudgment(methodName);
			Constraints constraints = methodJudgment.getConstraints();
			//EMap<String, String> mapping = new BasicEMap<String, String>();
			List<String> originalNames = new LinkedList<String>();
			List<String> realNames = new LinkedList<String>();
			
			//Field mappings
			Collection<FieldName> fieldList = constraints.getRequiredFields();
			for(FieldName field : fieldList) {
				originalNames.add(lookup.getOwnerField(field).getFieldRef().getName());
				realNames.add(field.getName());
			}
			
			//Method mappings
			Collection<MethodName> methodList = constraints.getRequiredMethods();
			for(MethodName method : methodList) {
				originalNames.add(lookup.getOwnerMethod(method).getMethodRef().getName());
				realNames.add(method.getName());
			}
			
			mappings.add(buildMethodElement(methodJudgment.getMethod(), originalNames, realNames));
		}
		
		return mappings;
	}
	
	/**
	 * Returns the java element name.
	 * @param element the element in which lookup the java name.
	 * @return the java name of this element.
	 */
	public static String toJavaName(Element element) {
		String javaName = ElementFactory.getFactory().toJavaName(element.getName());
		//If the element refers to a java system element
		if(javaName != null) return javaName;
		//Otherwise
		javaName = element.getName();
		
		return javaName;
	}
	
	/**
	 * Returns the element package name.
	 * @param element the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without file extension
	 * and all to lower case.
	 */
	public static String uriToPackage(Element element) {
		return uriToPackage((EObject)element);
	}
	
	/**
	 * Returns the element package name.
	 * @param element the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without file extension
	 * and all to lower case.
	 */
	public static String uriToName(Element element) {
		return uriToName((EObject)element);
	}
	
	/**
	 * Returns the element import package names.
	 * @param element the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without file extension
	 * and all to lower case.
	 */
	public static List<String> urisToPackages(File element) {
		List<Import> uris = element.getImportList();
		List<String> imports = new LinkedList<String>();
		
		for(Import uri : uris) {
			imports.add(uriToPackage(uri.getImportURI()));
		}
		
		return imports;
	}
	
	/**
	 * Returns the element import package names.
	 * @param element the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without file extension
	 * and all to lower case.
	 */
	public static List<String> urisToPackages(Element element) {
		List<Import> uris = ((File)element.eContainer()).getImportList();
		List<String> imports = new LinkedList<String>();
		
		for(Import uri : uris) {
			imports.add(uriToPackage(uri.getImportURI()));
		}
		
		return imports;
	}

	
	/**
	 * Returns the element import package names.
	 * @param element the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without file extension
	 * and all to lower case.
	 */
	public static List<String> urisToNames(Element element) {
		List<Import> uris = ((File)element.eContainer()).getImportList();
		List<String> imports = new LinkedList<String>();
		
		for(Import uri : uris) {
			imports.add(uriToName(uri.getImportURI()));
		}
		
		return imports;
	}
	
	/**
	 * Returns the element package name.
	 * @param element the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without file extension
	 * and all to lower case.
	 */
	public static String uriToPackage(EObject element) {
		return uriToPackage(element.eResource().getURI().lastSegment());
	}
	
	/**
	 * Returns the element package name.
	 * @param element the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without file extension
	 * and all to lower case.
	 */
	public static String uriToName(EObject element) {
		return uriToName(element.eResource().getURI().lastSegment());
	}
	
	/**
	 * Returns the element package name.
	 * @param element the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without file extension
	 * and all to lower case.
	 */
	public static String uriToPackage(String element) {
		int dotIndex = element.lastIndexOf('.');
		return "packages/" + element.substring(0, dotIndex).toLowerCase();
	}
	
	/**
	 * Returns the element package name.
	 * @param element the element in which lookup the package name name.
	 * @return the package name of this element, that is the element URI without file extension
	 * and all to lower case.
	 */
	public static String uriToName(String element) {
		int dotIndex = element.lastIndexOf('.');
		return "packages." + element.substring(0, dotIndex).toLowerCase();
	}
	
	/**
	 * Returns the element name to write in java files.
	 * @param message the message to translate(field or method invocation)
	 * @param originalNames the original names of the current method
	 * @param realNames the name translation in the current method
	 * @return the element name to write in java files.
	 */
	public static String getElementName(Message message, List<Object> originalNames, List<Object> realNames) {
		ExpressionType type = ExpressionType.createInstance(((DottedExpression)message.eContainer()).getReceiver(), true);
		String originalName = "";
		if(message instanceof FieldAccess)
			originalName = ((FieldAccess)message).getField().getName();
		else if(message instanceof MethodInvocation)
			originalName = ((MethodInvocation)message).getMethod().getName();
		
		if(type.isThis()) {
			if(originalNames == null && realNames == null) return originalName;
			
			Iterator<Object> originalIterator = originalNames.iterator();
			Iterator<Object> realIterator = realNames.iterator();
			
			while(originalIterator.hasNext()) {
				String original = originalIterator.next().toString();
				String real = realIterator.next().toString();
				
				if(original.equals(originalName))
					return real;
			}
			return originalName;
		}
		else return originalName;
	}
	
	/* SERVICE METHODS */
	
	private static List<Object> buildMethodElement(MethodName method, List<String> originalNames, List<String> realNames) {
		List<Object> result = new LinkedList<Object>();
		result.add(0, method);
		result.add(1, originalNames);
		result.add(2, realNames);
		return result;
	}
}
