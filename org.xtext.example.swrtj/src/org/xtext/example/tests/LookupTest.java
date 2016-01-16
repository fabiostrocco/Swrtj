package org.xtext.example.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.FieldName;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.Record;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.utils.Lookup;

/**
 * This class is a JUnit Test Case for the class Lookup.
 * @author Strocco Fabio
 */
public class LookupTest extends TestWithLoader {
	private Lookup fixture;

	/**
	 * Creates a new test.
	 * @param name the test name.
	 */
	public LookupTest(String name) {
		super(name);
	}
	
	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		super.setUp();
		this.fixture = new Lookup();
	}
	
	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		this.fixture = null;
	}
	
	public void testInterfacesLookup() throws IOException {
		File f = getProgramFromString("interface A {} interface B {} interface C {}" +
				                      "interface D extends A {} interface E extends D, B {}" +
				                      "interface F extends C, E {}");
		
		List<Element> elementList = f.getElementList();
		
		Collection<Interface> extendsList = fixture.getExtendedInterfaces((Interface)elementList.get(4)).values();
		Set<String> interfaceTable = new HashSet<String>();
		for(Interface i : extendsList)
			interfaceTable.add(i.getName());
		
		assertTrue(interfaceTable.contains("B"));
		assertTrue(interfaceTable.contains("D"));
		
		extendsList = fixture.getAllExtendedInterfaces((Interface)elementList.get(5)).values();
		interfaceTable = new HashSet<String>();
		for(Interface i : extendsList)
			interfaceTable.add(i.getName());
		
		assertTrue(interfaceTable.contains("A"));
		assertTrue(interfaceTable.contains("B"));
		assertTrue(interfaceTable.contains("C"));
		assertTrue(interfaceTable.contains("D"));
		assertTrue(interfaceTable.contains("E"));
		assertTrue(interfaceTable.contains("IObject"));
		assertTrue(fixture.getAllExtendedInterfaces((Interface)elementList.get(5)).size() == 6);
		assertTrue(fixture.getExtendedInterfaces((Interface)elementList.get(0)).size() == 0);
	}
	
	public void testRequiredFieldLookup() throws IOException {
		File f = getProgramFromString("trait T is TA trait TA is {int a; short b; A c;void m(){this.a = 0;this.c = null;}} interface A {}");
		
		Trait trait = (Trait)f.getElementList().iterator().next();
		Collection<FieldName> fieldSet = fixture.getRequiredFields(trait).values();

		for(FieldName field : fieldSet) {
			if(field.getName().equals("a"))
				assertTrue(fixture.getType(field).getPrimitiveType().equals("int"));
			else if(field.getName().equals("c"))
				assertTrue(fixture.getType(field).getInterfaceType().getName().equals("A"));
		}
		
		assertEquals(2, fieldSet.size());
	}
	
	public void testMethodLookup() throws IOException {
		File f = getProgramFromString("trait T is TA trait TA is {A m1();" +
				                      "short m2(int a); void m3(){this.m1(); this.m2();}} interface A {}");
		
		Trait trait = (Trait)f.getElementList().iterator().next();
		Collection<MethodName> methodSet = fixture.getMethods(trait).values();
		
		for(MethodName  method : methodSet) {
			if(method.getName().equals("m1"))
				assertTrue(fixture.getReturnType(method).getInterfaceType().getName().equals("A"));
			else if(method.getName().equals("m2"))
				assertTrue(fixture.getReturnType(method).getPrimitiveType().equals("short"));
			else if(method.getName().equals("m3"))
				assertTrue(fixture.getReturnType(method).getPrimitiveType().equals("void"));
			else fail();
		}
		
		assertEquals(3, methodSet.size());
		
		methodSet = fixture.getProvidedMethods(trait.getExpression()).values();
		
		MethodName method = methodSet.iterator().next();
		assertTrue(method.getName().equals("m3"));
		assertTrue(fixture.getReturnType(method).getPrimitiveType().equals("void"));
		
		assertTrue(methodSet.size() == 1);
	}
	
	public void testRecordLookup() throws IOException {
		File f = getProgramFromString("record R1 is {int a; int b; int c;}" +
				                      "record R2 is R1 + {int c;} " +
				                      "record R3 is R1[exclude a] + R2[b renameTo d] " +
				                      "record R4 is {int r; int a;} + R3[exclude b, d renameTo newField]+" +
				                      "R1[a renameTo newA, b renameTo newB] " +
				                      "record R5 is (R1[c renameTo d] + R2)[exclude b]");
		
		Map<String, FieldName> fields = fixture.getProvidedFields((Record)f.getElementList().get(0));
		assertNotNull(fields);
		assertTrue(fields.containsKey("a"));
		assertTrue(fields.containsKey("b"));
		assertTrue(fields.containsKey("c"));
		assertEquals(3, fields.size());
		
		fields = fixture.getProvidedFields((Record)f.getElementList().get(1));
		assertNotNull(fields);
		assertTrue(fields.containsKey("a"));
		assertTrue(fields.containsKey("b"));
		assertTrue(fields.containsKey("c"));
		assertEquals(3, fields.size());
		
		fields = fixture.getProvidedFields((Record)f.getElementList().get(2));
		assertNotNull(fields);
		assertTrue(fields.containsKey("a"));
		assertTrue(fields.containsKey("b"));
		assertTrue(fields.containsKey("c"));
		assertTrue(fields.containsKey("d"));
		assertEquals(4, fields.size());
		
		fields = fixture.getProvidedFields((Record)f.getElementList().get(3));
		assertNotNull(fields);
		assertTrue(fields.containsKey("r"));
		assertTrue(fields.containsKey("a"));
		assertTrue(fields.containsKey("c"));
		assertTrue(fields.containsKey("newField"));
		assertTrue(fields.containsKey("newA"));
		assertTrue(fields.containsKey("newB"));
		assertEquals(6, fields.size());		
		
		fields = fixture.getProvidedFields((Record)f.getElementList().get(4));
		assertNotNull(fields);
		assertTrue(fields.containsKey("a"));
		assertTrue(fields.containsKey("c"));
		assertTrue(fields.containsKey("d"));
		assertEquals(3, fields.size());		
	}
	
	public void testTraitLookup() throws IOException {
		File f = getProgramFromString("trait T1 is {int a; int b(); void c(){this.a = 0; this.b();}}" +
				                      "trait T2 is T1 + {int b(){return this.b();}} " +
				                      "trait T3 is T1[exclude c] + T2[exclude c, b renameTo d] " +
				                      "trait T4 is (T3 + T3[exclude d])[d aliasAs d1] " +
				                      "trait T5 is (T4[exclude d, d1 renameTo dx] + {int a; void m(){this.a = 0;}})[exclude m]" +
				                      "trait T6 is (T1[a renameFieldTo ax])[ax renameFieldTo axx, b renameTo bx] + {int b(){return 0;}}");
		
		//T1
		Trait t = (Trait)f.getElementList().get(0);
		Map<String, FieldName> fields = fixture.getRequiredFields(t);
		assertNotNull(fields);
		assertTrue(fields.containsKey("a"));
		assertEquals(1, fields.size());
		Map<String, MethodName> requiredMethods = fixture.getRequiredMethods(t);
		assertNotNull(requiredMethods);
		assertTrue(requiredMethods.containsKey("b"));
		assertEquals(1, requiredMethods.size());
		Map<String, MethodName> providedMethods = fixture.getProvidedMethods(t);
		assertNotNull(providedMethods);
		assertTrue(providedMethods.containsKey("c"));
		assertEquals(1, providedMethods.size());
		
		//T2
		t = (Trait)f.getElementList().get(1);
		fields = fixture.getRequiredFields(t);
		assertNotNull(fields);
		assertTrue(fields.containsKey("a"));
		assertEquals(1, fields.size());
		requiredMethods = fixture.getRequiredMethods(t);
		assertNotNull(requiredMethods);
		assertTrue(requiredMethods.containsKey("b"));
		assertEquals(1, requiredMethods.size());
		providedMethods = fixture.getProvidedMethods(t);
		assertNotNull(providedMethods);
		assertTrue(providedMethods.containsKey("b"));
		assertTrue(providedMethods.containsKey("c"));
		assertEquals(2, providedMethods.size());
		
		//T3
		t = (Trait)f.getElementList().get(2);
		fields = fixture.getRequiredFields(t);
		assertNotNull(fields);
		assertEquals(0, fields.size());
		requiredMethods = fixture.getRequiredMethods(t);
		assertNotNull(requiredMethods);
		assertTrue(requiredMethods.containsKey("d"));
		assertEquals(1, requiredMethods.size());
		providedMethods = fixture.getProvidedMethods(t);
		assertNotNull(providedMethods);
		assertTrue(providedMethods.containsKey("d"));
		assertEquals(1, providedMethods.size());
		
		//T4
		t = (Trait)f.getElementList().get(3);
		fields = fixture.getRequiredFields(t);
		assertNotNull(fields);
		assertEquals(0, fields.size());
		requiredMethods = fixture.getRequiredMethods(t);
		assertNotNull(requiredMethods);
		assertTrue(requiredMethods.containsKey("d"));
		assertEquals(1, requiredMethods.size());
		providedMethods = fixture.getProvidedMethods(t);
		assertNotNull(providedMethods);
		assertTrue(providedMethods.containsKey("d"));
		assertTrue(providedMethods.containsKey("d1"));
		assertEquals(2, providedMethods.size());
		
		//T5
		t = (Trait)f.getElementList().get(4);
		fields = fixture.getRequiredFields(t);
		assertNotNull(fields);
		assertEquals(0, fields.size());
		requiredMethods = fixture.getRequiredMethods(t);
		assertNotNull(requiredMethods);
		assertTrue(requiredMethods.containsKey("d"));
		assertEquals(1, requiredMethods.size());
		providedMethods = fixture.getProvidedMethods(t);
		assertNotNull(providedMethods);
		assertTrue(providedMethods.containsKey("dx"));
		assertEquals(1, providedMethods.size());
		
		//T6
		t = (Trait)f.getElementList().get(5);
		fields = fixture.getRequiredFields(t);
		assertNotNull(fields);
		assertTrue(fields.containsKey("axx"));
		assertEquals(1, fields.size());
		requiredMethods = fixture.getRequiredMethods(t);
		assertNotNull(requiredMethods);
		assertTrue(requiredMethods.containsKey("bx"));
		assertEquals(1, requiredMethods.size());
		providedMethods = fixture.getProvidedMethods(t);
		assertNotNull(providedMethods);
		assertTrue(providedMethods.containsKey("b"));
		assertTrue(providedMethods.containsKey("c"));
		assertEquals(2, providedMethods.size());
	}
}