package org.xtext.example.tests;

import java.io.IOException;
import java.util.Collection;

import org.xtext.example.swrtj.*;
import org.xtext.example.swrtj.Class;
import org.xtext.example.utils.*;

/**
 * This class is a JUnit Test Case for the class DuplicateChecker.
 * @author Strocco Fabio
 */
public class DuplicateCheckerTest extends TestWithLoader {
	private DuplicateChecker fixture;
	private Lookup lookup;

	/**
	 * Creates a new test.
	 * @param name the test name.
	 */
	public DuplicateCheckerTest(String name) {
		super(name);
	}
	
	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		super.setUp();
		this.fixture = new DuplicateChecker();
		this.lookup = new Lookup();
	}
	
	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		this.fixture = null;
		this.lookup = null;
	}
	
	public void testDuplicateElements() throws IOException {		
		File f1 = getProgramFromString("interface A {} class B implements A by {} and {} {} interface C extends A {}", "First");
		File f2 = getProgramFromString("import 'dummy:/First.swrtj' interface D extends A{} class E implements C by {} and {} {}");	
		File f3 = getProgramFromString("import 'dummy:/First.swrtj' interface A {}");
		File f4 = getProgramFromString("interface A {} class A implements A by {} and {} {}");

		assertEquals(0, fixture.checkDuplicateElements(lookup.getAllFiles(f1)).size());
		assertEquals(0, fixture.checkDuplicateElements(lookup.getAllFiles(f2)).size());
		assertEquals(1, fixture.checkDuplicateElements(lookup.getAllFiles(f3)).size());
		assertEquals(1,fixture.checkDuplicateElements(lookup.getAllFiles(f4)).size());
	}
	
	public void testDuplicateParameters() throws IOException {
		File f1 = getProgramFromString("interface A {void m1(int a, int b, char a);" +
				                       "int m2(char first, char first); void m3(int a);}" +
				                       "trait T is {int a; void m1(int a, int a) {int a = 0; int b = 0; this.a = 0;" + 
				                       "if(null == null) {int a = 0;if(null == null) {int b = 0;} else {int b = 0;}}}}" +
				                       "class C implements I by {} and {} {C(int a, int a, int b){int a = 0;}} interface I {}");
		
		Interface i = (Interface)f1.getElementList().get(0);
		assertEquals(1, fixture.checkDuplicatedParameters(i.getRequiredMethodList().get(0)).size());
		assertEquals(1, fixture.checkDuplicatedParameters(i.getRequiredMethodList().get(1)).size());
		assertEquals(0, fixture.checkDuplicatedParameters(i.getRequiredMethodList().get(2)).size());
		assertEquals(5, fixture.checkDuplicatedParameters((Method)((AnonimousTrait)((Trait)f1.getElementList().get(1)).getExpression().
				                                          getTraitList().get(0)).getDefinitionList().get(1)).size());
		assertEquals(2, fixture.checkDuplicatedParameters(((Class)f1.getElementList().get(2)).getConstructorList().get(0)).size());
	}
	
	public void testDuplicateTraitElements() throws IOException {
		File f1 = getProgramFromString("trait T is {" +
				                       "int a; int b; int c; int a; float b;" +
				                       "void m1();" +
				                       "void m2();" +
				                       "void m2();" +
				                       "int m3(){}" +
				                       "void m3();" +
				                       "}");

		Trait trait = (Trait)f1.getElementList().get(0);
		
		Collection<ErrorMessage> errorList = fixture.checkTraitElementConflicts((AnonimousTrait)trait.getExpression().getTraitList().get(0));
		
		assertNotNull(errorList);
		assertEquals(4, errorList.size());
	}
	
	public void testDuplicateRecordElements() throws IOException {
		File f1 = getProgramFromString("record R is {int a; int b; int a; float b; int c;}");

		Record record = (Record)f1.getElementList().get(0);
		
		Collection<ErrorMessage> errorList = fixture.checkRecordConflicts((AnonimousRecord)record.getExpression().getRecordList().get(0));
		assertNotNull(errorList);
		assertEquals(2, errorList.size());
	}
	
	public void testDuplicationInterfaces() throws IOException {
		File f1 = getProgramFromString("interface I1 extends I1 {void m1();}" +
				                       "interface I2 extends I1 {int m1(); void m2(); void mm(); void mm();}" +
				                       "interface I3 extends I2 {void m2(int a); void m3(int a);}" +
				                       "interface I4 extends I2, I3 {void m3(float a); void m1();}" +
				                       "interface I5 extends I4 {int m3(I1 a, int b);}");

		// I1
		
		Interface interfaceType = (Interface)f1.getElementList().get(0);
		
		Collection<ErrorMessage> errorList = fixture.checkMethodConflicts(interfaceType);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(0, errorList.size());
		
		// I2
		
		interfaceType = (Interface)f1.getElementList().get(1);
		
		errorList = fixture.checkMethodConflicts(interfaceType);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(2, errorList.size());
		
		// I3
		
		interfaceType = (Interface)f1.getElementList().get(2);
		
		errorList = fixture.checkMethodConflicts(interfaceType);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		// I4
		
		interfaceType = (Interface)f1.getElementList().get(3);
		
		errorList = fixture.checkMethodConflicts(interfaceType);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(2, errorList.size());
		
		// I5
		
		interfaceType = (Interface)f1.getElementList().get(4);
		
		errorList = fixture.checkMethodConflicts(interfaceType);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
	}
}
