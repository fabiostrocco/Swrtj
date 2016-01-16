package org.xtext.example.linker;

import java.io.IOException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.SwrtjFactory;
import org.xtext.example.swrtj.Type;

import antlr.collections.List;

public class ElementFactory {
	private Map<String, Interface> interfaces;
	private Map<String, Class> classes;
	
	private Map<String, String> swrtjJavaNames;
	
	private static final ElementFactory instance = new ElementFactory();
	
	/**
	 * Creates a new element factory.
	 */
	protected ElementFactory() {
		//Init tables
		initInterfaces();
		initClasses();
		//Forall element --> create
		try {
			swrtjJavaNames = new HashMap<String, String>();
			
			/*The interface IObject has no methods, otherwise a trait TObject
			  should be needed in order to implements the IObject methods.*/
			createInterface("IObject", "java.lang.Object", false);
			createInterface("IThread", "java.lang.Thread");
			createInterface("ILock", "java.util.concurrent.locks.Lock");
			createInterface("IRunnable", "java.lang.Runnable");
			createInterface("IString", "java.lang.String");
			createInterface("IByte", "java.lang.Byte");
			createInterface("IShort", "java.lang.Short");
			createInterface("IInteger", "java.lang.Integer");
			createInterface("ILong", "java.lang.Long");
			createInterface("IFloat", "java.lang.Float");
			createInterface("IDouble", "java.lang.Double");
			createInterface("IBigInteger", "java.math.BigInteger");
			createInterface("IBigDecimal", "java.math.BigDecimal");
			createInterface("IList", "java.util.List");
			createInterface("IScanner", "java.util.Scanner");
			createPrintStream();
			
			createClass("CObject", "java.lang.Object", "IObject");
			createClass("CThread", "java.lang.Thread", "IThread");
			createClass("CString", "java.lang.String", "IString");
			createClass("CByte", "java.lang.Byte", "IByte");
			createClass("CShort", "java.lang.Short", "IShort");
			createClass("CInteger", "java.lang.Integer", "IInteger");
			createClass("CLong", "java.lang.Long", "ILong");
			createClass("CFloat", "java.lang.Float", "IFloat");
			createClass("CDouble", "java.lang.Double", "IDouble");
			createClass("CBigInteger", "java.math.BigInteger", "IBigInteger");
			createClass("CBigDecimal", "java.math.BigDecimal", "IBigDecimal");
			createClass("CLinkedList", "java.util.LinkedList", "IList");
			createClass("CArrayList", "java.util.ArrayList", "IList");
			createClass("CThread", "java.lang.Thread", "IThread");
			createClass("CReentrantLock", "java.util.concurrent.locks.ReentrantLock", "ILock");
		} catch(ClassNotFoundException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * Returns the element with the given name.
	 * @param name the swrtj element name.
	 * @return the element with the given name.
	 */
	public Element forName(String name) {
		Element element = interfaces.get(name);
		if(element == null)
			element = classes.get(name);
		
		return element;
	}
	
	/**
	 * Convert the given swrtj element name into
	 * the corresponding java element name.
	 * for instance, toJavaName("IObject") = "Object"
	 * @param name the swrtj element name to convert
	 * @return the swrtj java name mapping or <code>null</code> if
	 * the name is not mapping a java class.
	 */
	public String toSimpleJavaName(String name) {
		return swrtjJavaNames.get(name);
	}
	
	/**
	 * Convert the given swrtj element name into
	 * the corresponding java element name.
	 * for instance, toJavaName("IObject") = "Object"
	 * @param name the swrtj element name to convert
	 * @return the swrtj java name mapping with optionally generic parameters
	 * as Object, or <code>null</code> if
	 * the name is not mapping a java class.
	 */
	public String toJavaName(String name) {
		String javaName = toSimpleJavaName(name);
		
		try{
			if(javaName != null && java.lang.Class.forName(javaName).getTypeParameters().length == 1) {
				javaName += "<java.lang.Object>";
			}
		} catch(ClassNotFoundException ex) {
			throw new RuntimeException(ex);
		}
		
		return javaName;
	}
	
	/**
	 * Returns all the elements mapped from java to swrtj.
	 * @return the element mapping swrtjName --> element.
	 */
	public Map<String, Element> getElements() {
		Map<String, Element> result = new HashMap<String, Element>();
		Collection<Interface> interfaceList = interfaces.values();
		Collection<Class> classList = classes.values();
		
		for(Interface i : interfaceList) {
			result.put(i.getName(), i);
		}
		
		for(Class c : classList){
			result.put(c.getName(), c);
		}
		
		return result;
	}
	
	/**
	 * Returns all the elements mapped from java to swrtj.
	 * @return the element list
	 */
	public Collection<Element> getElementList() {
		return getElements().values();
	}
	
	/**
	 * Checks whether the given element exists in the created element list.
	 * @param name the element name.
	 * @return <code>true</code> if the element exists, <code>false</code>
	 * otherwise.
	 */
	public boolean exists(String name) {
		return (forName(name) != null);
	}
	
	/**
	 * Returns the singleton factory instance.
	 * @return the factory instance.
	 */
	public static ElementFactory getFactory() {
		return instance;
	}
	
	/*Service methods*/
	
	private void createInterface(String swrtjName, String javaName) throws ClassNotFoundException {
		createInterface(swrtjName, javaName, true);
	}
	
	private void createInterface(String swrtjName, String javaName, boolean withMethods) throws ClassNotFoundException {
		map(swrtjName, javaName);
		
		java.lang.Class<?> c = java.lang.Class.forName(javaName);
		
		Interface i = interfaces.get(swrtjName);
		i.setConstruct("system interface");
		i.setName(swrtjName);
		
		if(!withMethods) return;
		
		java.lang.reflect.Method[] methods = c.getMethods();
		Set<String> names = new HashSet<String>();
		
		for(java.lang.reflect.Method method : methods) {
			Method m = methodConvert(method);
			
			// FIXME: ad-hoc solution
			if (javaName.equals("java.util.List") && method.getName().equals("add") &&
					method.getParameterTypes().length == 1) {
				continue;
			}
			
			// FIXME: ad-hoc solution
			if (javaName.equals("java.util.List") && method.getName().equals("remove") &&
					(method.getParameterTypes().length != 1 || !method.getParameterTypes()[0].getName().equals("java.lang.Object"))) {
				continue;
			}
			
			// FIXME: ad-hoc solution
			if (javaName.equals("java.lang.String") && method.getName().equals("toLowerCase") &&
					method.getParameterTypes().length != 0) {
				continue;
			}
			
			if (method.getName().equals("toString") &&
					method.getParameterTypes().length > 0) {
				continue;
			}
			
			if(m != null && names.add(m.getMethodRef().getName()))
				i.getRequiredMethodList().add(m);
		}		
	}
	
	private void createClass(String swrtjName, String javaName, String interfaceName) 
		                                                                 throws ClassNotFoundException {
		createClass(swrtjName, javaName, new String[]{interfaceName});
	}
	
	private void createClass(String swrtjName, String javaName, String[] interfaceNames) 
	                                                                     throws ClassNotFoundException {
		map(swrtjName, javaName);
		Class result = classes.get(swrtjName);
		java.lang.Class<?> c = java.lang.Class.forName(javaName);
		
		result.setConstruct("system class");
		result.setName(swrtjName);
		java.lang.reflect.Constructor<?>[] constructors = c.getConstructors();
		
		for(java.lang.reflect.Constructor<?> constructor : constructors) {
			Constructor constr = constructorConvert(swrtjName, constructor);
			
			if(constr != null)
				result.getConstructorList().add(constr);
		}
		
		for(String name : interfaceNames) {
			result.getImplementsList().add(interfaces.get(name));
		}		
	}
	
	private Constructor constructorConvert(String name, java.lang.reflect.Constructor<?> constructor) {
		Constructor result = SwrtjFactory.eINSTANCE.createConstructor();
		
		result.setName(name);
		java.lang.Class<?>[] javaParameters = constructor.getParameterTypes();
		int counter = 1;
				
		for(java.lang.Class<?> javaType : javaParameters) {
			Parameter parameter = SwrtjFactory.eINSTANCE.createFormalParameter();
			Type parameterType = typeConvert(javaType);
			if(parameterType == null) return null;
			
			parameter.setName("par" + counter);
			parameter.setType(parameterType);
			result.getParameterList().add(parameter);
			counter++;
		}
		
		return result;
	}
	
	private Method methodConvert(java.lang.reflect.Method method) {
		if(Modifier.isStatic(method.getModifiers())) return null;
		
		Method result = SwrtjFactory.eINSTANCE.createRequiredMethod();
	
		Type returnType = typeConvert(method.getReturnType());
		if(returnType == null) return null;
		result.setReturnType(returnType);
		
		MethodName methodRef = SwrtjFactory.eINSTANCE.createMethodName();
		methodRef.setName(method.getName());
		result.setMethodRef(methodRef);
		
		java.lang.Class<?>[] javaParameters = method.getParameterTypes();
		int counter = 1;
				
		for(java.lang.Class<?> javaType : javaParameters) {
			Parameter parameter = SwrtjFactory.eINSTANCE.createFormalParameter();
			Type parameterType = typeConvert(javaType);
			if(parameterType == null) return null;
			
			parameter.setName("par" + counter);
			parameter.setType(parameterType);
			result.getParameterList().add(parameter);
			counter++;
		}
		
		return result;
	}

	private Type typeConvert(java.lang.Class<?> type) {  
		String name = type.getName();
		Type result = SwrtjFactory.eINSTANCE.createType();
		
		if(name.equals("short") || name.equals("int") || name.equals("long") ||
		   name.equals("float") || name.equals("double") || name.equals("char") ||
		   name.equals("boolean") || name.equals("void")) {
			result.setPrimitiveType(name);
		} else if(name.equals("java.lang.Object")) {
			result.setInterfaceType(interfaces.get("IObject"));
		} else if(name.equals("java.lang.String")) {
			result.setInterfaceType(interfaces.get("IString"));
		} else if(name.equals("java.lang.Byte")) {
			result.setInterfaceType(interfaces.get("IByte"));
		} else if(name.equals("java.lang.Short")) {
			result.setInterfaceType(interfaces.get("IShort"));
		} else if(name.equals("java.lang.Integer")) {
			result.setInterfaceType(interfaces.get("IInteger"));
		} else if(name.equals("java.lang.Long")) {
			result.setInterfaceType(interfaces.get("ILong"));
		} else if(name.equals("java.lang.Float")) {
			result.setInterfaceType(interfaces.get("IFloat"));
		} else if(name.equals("java.lang.Double")) {
			result.setInterfaceType(interfaces.get("IDouble"));
		} else if(name.equals("java.math.BigInteger")) {
			result.setInterfaceType(interfaces.get("IBigInteger"));
		} else if(name.equals("java.math.BigDecimal")) {
			result.setInterfaceType(interfaces.get("IBigDecimal"));
		} else if(name.equals("java.util.List")) {
			result.setInterfaceType(interfaces.get("IList"));
		} else if(name.equals("java.util.Scanner")) {
			result.setInterfaceType(interfaces.get("IScanner"));
		} else if(name.equals("java.lang.Thread")) {
			result.setInterfaceType(interfaces.get("IThread"));
		} else if(name.equals("java.lang.Runnable")) {
			result.setInterfaceType(interfaces.get("IRunnable"));
		} else if(name.equals("java.util.concurrent.locks.Lock")) {
			result.setInterfaceType(interfaces.get("ILock"));
		} else { 
			result = null;
		}
		
		return result;
	}

	private void initInterfaces() {
		interfaces = new HashMap<String, Interface>();
		
		interfaces.put("IObject", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IByte", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IShort", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IInteger", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("ILong", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IFloat", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IDouble", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IThread", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IRunnable", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IString", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IBigInteger", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IBigDecimal", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IList", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IScanner", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("IPrintStream", SwrtjFactory.eINSTANCE.createInterface());
		interfaces.put("ILock", SwrtjFactory.eINSTANCE.createInterface());
	}
	
	private void initClasses() {
		classes = new HashMap<String, Class>();
		
		classes.put("CObject", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CByte", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CShort", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CInteger", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CLong", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CFloat", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CDouble", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CString", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CBigInteger", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CBigDecimal", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CLinkedList", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CArrayList", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CThread", SwrtjFactory.eINSTANCE.createClass());
		classes.put("CReentrantLock", SwrtjFactory.eINSTANCE.createClass());
	}
	
	private void map(String swrtjName, String javaName) {
		swrtjJavaNames.put(swrtjName, javaName);
	}
	
	private void createPrintStream() {
		map("IPrintStream", "java.io.PrintStream");
		Interface stream = interfaces.get("IPrintStream");
		
		stream.setConstruct("system interface");
		stream.setName("IPrintStream");
		EList<Method> methodList = stream.getRequiredMethodList();
		
		Method method = SwrtjFactory.eINSTANCE.createRequiredMethod();
		Parameter parameter = SwrtjFactory.eINSTANCE.createParameter();
		Type type = SwrtjFactory.eINSTANCE.createType();
		Type returnType = SwrtjFactory.eINSTANCE.createType();
		MethodName methodRef = SwrtjFactory.eINSTANCE.createMethodName();
		methodRef.setName("print");
		method.setMethodRef(methodRef);
		parameter.setName("output");
		type.setInterfaceType((Interface)forName("IObject"));
		returnType.setPrimitiveType("void");
		parameter.setType(type);
		method.getParameterList().add(parameter);
		method.setReturnType(returnType);
		methodList.add(method);
		
		method = SwrtjFactory.eINSTANCE.createRequiredMethod();
		parameter = SwrtjFactory.eINSTANCE.createParameter();
		type = SwrtjFactory.eINSTANCE.createType();
		returnType = SwrtjFactory.eINSTANCE.createType();
		methodRef = SwrtjFactory.eINSTANCE.createMethodName();
		methodRef.setName("println");
		method.setMethodRef(methodRef);
		parameter.setName("output");
		type.setInterfaceType((Interface)forName("IObject"));
		returnType.setPrimitiveType("void");
		parameter.setType(type);
		method.getParameterList().add(parameter);
		method.setReturnType(returnType);
		methodList.add(method);
	}
}