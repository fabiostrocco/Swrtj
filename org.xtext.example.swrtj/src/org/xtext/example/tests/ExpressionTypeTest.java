package org.xtext.example.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.ExpressionStatement;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.typechecking.ExpressionType;
import org.xtext.example.typechecking.InterfaceMap;
import org.xtext.example.utils.Lookup;

/**
 * This class is a JUnit Test Case for the class ExpressionType.
 * @author Strocco Fabio
 */
public class ExpressionTypeTest extends TestWithLoader {
	private Lookup lookup = new Lookup();

	/**
	 * Creates a new test.
	 * @param name the test name.
	 */
	public ExpressionTypeTest(String name) {
		super(name);
	}
	
	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		super.setUp();
	}
	
	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testExpressionTypeFactory() throws IOException {
		File f = getProgramFromString("interface I {I m1i();int m2i();void m3();}" +
				                      "trait T is " + "{" +
				                      "I m1(){return this;}" +
		                              "void m2(){this.m1().m2i();}" + 
		                              "void m3(I a){a;}" +
		                              "void m4(I b){(b.m3());}" +
		                              "void m5(){(long)(long)(long)(long)this.m1().m1i().m1i().m2i();}" +
		                              "void m6(){new C().m1i();}" +
		                              "void m7(){((II)this.m1());}" +
		                              "}" +
		                              "class C implements I by {} and T {C(){}} interface II extends I {}");
		
		Trait t = (Trait)f.getElementList().get(1);
		Collection<MethodName> methodSet = lookup.getMethods(t).values();
		ExpressionType type = null;
		
		for(MethodName methodElement : methodSet) {
			ProvidedMethod method = (ProvidedMethod)(lookup.getOwnerMethod(methodElement));
			if(method.getMethodRef().getName().equals("m1")) {
				type = ExpressionType.createInstance(method.getReturnStatement().getExpression());
				assertTrue(type.isThis());
				assertTrue(type.isInvokable());
				assertNull(type.getPrimitiveType());
			} else if(method.getMethodRef().getName().equals("m2")) {
				type = ExpressionType.createInstance(((ExpressionStatement)method.getBlock().getStatementList().get(0)).getExpression());
				assertNotNull(type.getPrimitiveType());
				assertTrue(type.getPrimitiveType().equals("int"));
				assertFalse(type.isInvokable());
				assertFalse(type.isThis());
			} else if(method.getMethodRef().getName().equals("m3")) {
				type = ExpressionType.createInstance(((ExpressionStatement)method.getBlock().getStatementList().get(0)).getExpression());
				assertTrue(type.getCompatibleInterfaces() != null);
				assertTrue((type.getCompatibleInterfaces().containsKey("I")));
			} else if(method.getMethodRef().getName().equals("m4")) {
				type = ExpressionType.createInstance(((ExpressionStatement)method.getBlock().getStatementList().get(0)).getExpression());
				assertTrue(type.getPrimitiveType() != null);
				assertTrue(type.getPrimitiveType().equals("void"));
				assertFalse(type.isInvokable());
				assertFalse(type.isThis());
				assertFalse(type.isThis());
			} else if(method.getMethodRef().getName().equals("m5")) {
				type = ExpressionType.createInstance(((ExpressionStatement)method.getBlock().getStatementList().get(0)).getExpression());
				assertTrue(type.getPrimitiveType() != null);
				assertTrue(type.getPrimitiveType().equals("long"));
				assertFalse(type.isInvokable());
				assertFalse(type.isThis());
				assertFalse(type.isThis());
			} else if(method.getMethodRef().getName().equals("m6")) {
				type = ExpressionType.createInstance(((ExpressionStatement)method.getBlock().getStatementList().get(0)).getExpression());
				assertTrue(type.getPrimitiveType() == null);
				assertTrue(type.getCompatibleInterfaces().containsKey("I"));
				assertTrue(type.isInvokable());
				assertFalse(type.isThis());
				assertFalse(type.isThis());
			} else if(method.getMethodRef().getName().equals("m7")) {
				type = ExpressionType.createInstance(((Expression)((ExpressionStatement)method.getBlock().getStatementList().get(0)).getExpression()).getTermList().get(0), true);
				assertTrue(type.getPrimitiveType() == null);
				assertTrue(type.getCompatibleInterfaces().containsKey("I"));
				assertEquals("II", type.getName());
				assertTrue(type.isInvokable());
				assertFalse(type.isThis());
				assertFalse(type.isThis());
			} else fail();
		}								
	}
	
	public void testExpressionTypeProperties() throws IOException {
		File f = getProgramFromString("interface I {} interface R extends I {} interface K extends I, R {}" +
				                      "class C implements K, I, R by {} and {} {}");
		
		Interface k = (Interface)f.getElementList().get(2);
		InterfaceMap interfaceList = ExpressionType.createInstance(k).getCompatibleInterfaces();
		
		assertTrue(interfaceList.size() == 4);
		assertTrue(interfaceList.contains((Interface)f.getElementList().get(0)));
		assertTrue(interfaceList.contains((Interface)f.getElementList().get(1)));
		assertTrue(interfaceList.contains((Interface)f.getElementList().get(2)));
		
		Class c = (Class)f.getElementList().get(3);
		interfaceList = ExpressionType.createInstance(c).getCompatibleInterfaces();
		
		assertTrue(interfaceList.size() == 4);
		assertTrue(interfaceList.contains((Interface)f.getElementList().get(0)));
		assertTrue(interfaceList.contains((Interface)f.getElementList().get(1)));
		assertTrue(interfaceList.contains((Interface)f.getElementList().get(2)));
	}
	
	public void testInvokableMethodLookup() throws IOException {
		File f = getProgramFromString("interface A {void m1();} interface B {}" +
                                      "interface C extends A {}" +
                                      "interface D extends A, B {void m2(); void m3();}" +
                                      "interface E extends D {void m3(); void m4();}");
		
		Interface i = (Interface)f.getElementList().get(4);
		Collection<MethodName> methodList = ExpressionType.createInstance(i).getInvokableMethods();
		Set<String> methodTable = new HashSet<String>();
		
		for(MethodName method : methodList) {
			assertTrue(methodTable.add(method.getName()));
		}
		
		assertTrue(methodTable.contains("m1"));
		assertTrue(methodTable.contains("m2"));
		assertTrue(methodTable.contains("m3"));
		assertTrue(methodTable.contains("m4"));
		
		i = (Interface)f.getElementList().get(1);
		methodList = ExpressionType.createInstance(i).getInvokableMethods();
		
		assertNotNull(methodList);
		assertEquals(0, methodList.size());
	}
	
	public void testSubtyping() throws IOException {
		File f = getProgramFromString("interface I5 {} " +
                                      "interface I4 {}" +
                                      "interface I3 extends I5 {} " +
                                      "interface I1 extends I3, I4 {}" +
                                      "interface I2 {}" +
                                      "interface I extends I1, I2, I5 {}" +
                                      "class C1 implements I5 by {} and {} {}" +
                                      "class C2 implements I1, I2 by {} and {} {}" +
                                      "class C3 implements I, I5 by {} and {} {}");
		ExpressionType t1 = null;
		ExpressionType t2 = null;
		
		//I3
		t1 = ExpressionType.createInstance((Interface)f.getElementList().get(2));
		//I5
		t2 = ExpressionType.createInstance((Interface)f.getElementList().get(0));
		//I3 <= I5
		assertTrue(t1.isSubtype(t2));
		//! I5 <= I3
		assertFalse(t2.isSubtype(t1));
		//I3 <= I3
		assertTrue(t1.isSubtype(t1));
		
		//I3
		t1 = ExpressionType.createInstance((Interface)f.getElementList().get(2));
		//I
		t2 = ExpressionType.createInstance((Interface)f.getElementList().get(5));
		//! I3 <= I
		assertFalse(t1.isSubtype(t2));
		
		//I
		t1 = ExpressionType.createInstance((Interface)f.getElementList().get(5));
		//I1
		t2 = ExpressionType.createInstance((Interface)f.getElementList().get(3));
		//I <= I1
		assertTrue(t1.isSubtype(t2));
		
		//C1
		t1 = ExpressionType.createInstance((Class)f.getElementList().get(6));
		//I
		t2 = ExpressionType.createInstance((Interface)f.getElementList().get(5));
		//! C1 <= I
		assertFalse(t1.isSubtype(t2));
		
		//I3
		t1 = ExpressionType.createInstance((Interface)f.getElementList().get(2));
		//I4
		t2 = ExpressionType.createInstance((Interface)f.getElementList().get(1));
		//! I3 <= I4
		assertFalse(t1.isSubtype(t2));
		//! I4 <= I3
		assertFalse(t2.isSubtype(t1));
		
		t1 = ExpressionType.createInstance("int");
		//! int <= I4
		assertFalse(t1.isSubtype(t2));
		//! I4 <= int
		assertFalse(t2.isSubtype(t1));
		
		t2 = ExpressionType.createInstance("long");
		// int <= long
		assertTrue(t1.isSubtype(t2));
		
		/* Cast test */
		
		assertTrue(t1.canCastTo(t2));
		
		//C1
		t1 = ExpressionType.createInstance((Class)f.getElementList().get(6));
		//I5
		t2 = ExpressionType.createInstance((Interface)f.getElementList().get(5));
		assertTrue(t1.canCastTo(t2));
		//I4
		t2 = ExpressionType.createInstance((Interface)f.getElementList().get(1));
		assertFalse(t1.canCastTo(t2));
	}
}
