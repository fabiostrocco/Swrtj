package org.xtext.example.tests;

import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.ExpressionStatement;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.Record;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.typechecking.TypeChecker;
import org.xtext.example.utils.ErrorMessage;
import org.xtext.example.utils.Lookup;


/**
 * This class is a JUnit Test Case for the class TypeChecker.
 * @author Strocco Fabio
 */
public class TypeCheckerTest extends TestWithLoader {
	private TypeChecker fixture;
	private Lookup lookup = new Lookup();

	/**
	 * Creates a new test.
	 * @param name the test name.
	 */
	public TypeCheckerTest(String name) {
		super(name);
	}
	
	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		super.setUp();
		this.fixture = new TypeChecker();
	}
	
	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		this.fixture = null;
	}
	
	public void testExpressionChecking() throws IOException {
		File f = getProgramFromString(
				 					  "interface I {}" +
									  "trait T is {" +
				                      "int k;" +
				                      "int mI();" +
				                      "int m1(int a) {byte b = (byte)0 + (byte)0; return a + (a) - " +
				                      "(10 + 30 % (b + 2 * (this.k = this.mI() + this.k * ((this.k - " +
				                      "this.m1(b + this.m2((this).mI() / b)))))));}" +
				                      "int m2(float f) {return 2 * (this.k + this.m2(this.m2(f) * this.mI()) + (this.mI() * (this.k + (f)))) + 0;}\n" +
				                      "void m3() {int x = 2 + (2); I r = 0; double d = 0; int f = this.k * (r * 2) + d;}" +
				                      "void m4() {int x = ((int)(float)(3 + (float)2 - ((byte)((this).k) + (this.k) - (this.k))));}" +
		                              "}");
		
		AnonimousTrait trait = (AnonimousTrait)((Trait)f.getElementList().get(1)).getExpression().getTraitList().get(0);
		ProvidedMethod m = (ProvidedMethod)trait.getDefinitionList().get(2);
		
		//m1
		
		Collection<ErrorMessage> errorList = fixture.caseProvidedMethod(m);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(0, errorList.size());
		
		//m2
		
		m = (ProvidedMethod)trait.getDefinitionList().get(3);
		errorList = fixture.caseProvidedMethod(m);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		//m3
		
		m = (ProvidedMethod)trait.getDefinitionList().get(4);
		errorList = fixture.caseProvidedMethod(m);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(3, errorList.size());
		
		//m4
		
		m = (ProvidedMethod)trait.getDefinitionList().get(5);
		errorList = fixture.caseProvidedMethod(m);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(0, errorList.size());
	}
	
	public void testDottedExpressionChecking() throws IOException {
		File f = getProgramFromString("interface I1 {void m1(I1 a, int b);}" +
				                      "trait T is {" +
				                      "I1 f;" +
				                      "int k;" +
				                      "I1 rm();" +
				                      "void m1(int a, I1 b) {(I1)this.m1(this.m1());}" +
				                      "void m2() {this.f.m1(this.rm().m1(this, this.k), this);}" +
				                      "void m3() {this.f.m1((I1)(I1)(I1)this.rm(), this.k);}" +
				                      "I1 m4(I1 a) {return (I1)a;}" +
		                              "}" +
		                              "class C implements I2 by {} and {void m1(I1 a, int b){}} " +
		                              "{C(int b){this.m1(this, b);}} interface I2{}");
		
		AnonimousTrait trait = (AnonimousTrait)((Trait)f.getElementList().get(1)).getExpression().getTraitList().get(0);
		Expression expression = (Expression)((ExpressionStatement)(((ProvidedMethod)trait.getDefinitionList().get(3)).getBlock().
			getStatementList().get(0))).getExpression();
		
		//Expression 1
		
		Collection<ErrorMessage> errorList = fixture.caseExpression(expression);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(4, errorList.size());
		
		//Expression 2
		
		expression = (Expression)((ExpressionStatement)((ProvidedMethod)trait.getDefinitionList().get(4)).getBlock().getStatementList().get(0)).getExpression();

		errorList = fixture.caseExpression(expression);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(2, errorList.size());

		//Expression 3
		
		expression = (Expression)((ExpressionStatement)(((ProvidedMethod)trait.getDefinitionList().get(5)).
				getBlock().getStatementList().get(0))).getExpression();

		errorList = fixture.caseExpression(expression);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(0, errorList.size());
		
		//Expression 4(Constructor)
		
		expression = ((Expression)((ExpressionStatement)((Class)f.getElementList().get(2)).getConstructorList().get(0).getBlock().getStatementList().get(0)).getExpression());

		errorList = fixture.caseExpression(expression);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		//Expression 5
		
		expression = (Expression)((ProvidedMethod)trait.getDefinitionList().get(6)).getReturnStatement().getExpression();

		errorList = fixture.caseExpression(expression);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(0, errorList.size());
	}
	
	public void testMethodChecking() throws IOException {
		File f = getProgramFromString("interface I1 {void m1(I1 a, int b);}" +
				                      "trait T is {" +
				                      "I1 f;" +
				                      "int k;" +
				                      "I1 rm();" +
				                      "void m1(){return this;}" +
				                      "void m2(int a, I1 b) {return ((I1)this.f);}" +
				                      "void m3() {this.f.m1((I1)(I1)(I1)this.rm(), this.k);}" +
				                      "void m4() {return ((I2)((this).rm()));}" +
				                      "void m5(int a) {this.f = a;}" +
				                      "void m6(int a) {if(this.f == null) {this.m1();} else {int k = null; this.f = this.m1();}}" +
		                              "void m7(int a) {if(a == null) {} if(null == null) {}}" +
		                              "void m8() {if(!(null < 0) & true <= false ^ (!(!((!(null == null || this.f != null && 10 < this)))))) {}}" +
		                              "void m9() {while(true) {if(true & false || (((true | false && !true))) || new CLinkedList().equals(null) && 10){}}}" +
									  "}interface I2 {}");
		System.err.println("\nMETHOD TYPECHECKING\n");System.out.flush();
		
		AnonimousTrait trait = (AnonimousTrait)((Trait)f.getElementList().get(1)).getExpression().getTraitList().get(0);
		ProvidedMethod method = ((ProvidedMethod)trait.getDefinitionList().get(3));
		
		//Method 1
		Collection<ErrorMessage> errorList = fixture.caseProvidedMethod(method);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		//Method 2
		
		method = ((ProvidedMethod)trait.getDefinitionList().get(4));

		errorList = fixture.caseProvidedMethod(method);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		//Method 3
		
		method = ((ProvidedMethod)trait.getDefinitionList().get(5));

		errorList = fixture.caseProvidedMethod(method);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(0, errorList.size());
		
		//Method 4
		
		method = ((ProvidedMethod)trait.getDefinitionList().get(6));

		errorList = fixture.caseProvidedMethod(method);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(2, errorList.size());
		
		//Method 5
		
		method = ((ProvidedMethod)trait.getDefinitionList().get(7));

		errorList = fixture.caseProvidedMethod(method);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		//Method 6
		
		method = ((ProvidedMethod)trait.getDefinitionList().get(8));

		errorList = fixture.caseProvidedMethod(method);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(2, errorList.size());
		
		//Method 7
		
		method = ((ProvidedMethod)trait.getDefinitionList().get(9));

		errorList = fixture.caseProvidedMethod(method);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		//Method 8
		
		method = ((ProvidedMethod)trait.getDefinitionList().get(10));

		errorList = fixture.caseProvidedMethod(method);
		assertNotNull(errorList);
		markErrors(errorList);
		assertEquals(4, errorList.size());
		
		//Method 9
		
		method = ((ProvidedMethod)trait.getDefinitionList().get(11));

		errorList = fixture.caseProvidedMethod(method);
		assertNotNull(errorList);
		markErrors(errorList);
		assertEquals(1, errorList.size());
	}
	
	public void testTraitTypeChecking() throws IOException {
		File f = getProgramFromString("interface I {void m1();}" +
				                      "trait T is T1 " +
				                      "trait T1 is {int a;int a;int b;I c; void m1(); void mm();" +
				                      "void m2(){this.b = 0;return this.m1();}" +
				                      "void m3(){return this.c.m1();} void m4(){return this;}}" +
				                      "trait TK is TK " +
				                      "trait T2 is T + {int c; int b; void m2(){this.c = 0;this.b = 0;}}" +
				                      "trait T3 is TK + T1[exclude m1, exclude m2, b renameFieldTo c]");
		Trait trait = (Trait)f.getElementList().get(2);
		Collection<ErrorMessage> errorList = fixture.caseTrait(trait);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(7, errorList.size());
		
		trait = (Trait)f.getElementList().get(3);
		errorList = fixture.caseTrait(trait);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		trait = (Trait)f.getElementList().get(4);
		errorList = fixture.caseTrait(trait);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(2, errorList.size());
		
		trait = (Trait)f.getElementList().get(5);
		errorList = fixture.caseTrait(trait);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(2, errorList.size());
	}
	
	public void testRecordTypeChecking() throws IOException {
		File f = getProgramFromString("record R is R1 " +
				                      "record R1 is {int a;int a;int b;int c;}" +
				                      "record TK is TK " +
				                      "record R2 is R1[exclude b, b renameTo c, exclude b] + {int d;}" +
				                      "record R3 is R + {float c;} + {int b;}" +
				                      "record R4 is ({int c;})[exclude c]");
		Record record = (Record)f.getElementList().get(1);
		Collection<ErrorMessage> errorList = fixture.caseRecord(record);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		record = (Record)f.getElementList().get(2);
		errorList = fixture.caseRecord(record);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		record = (Record)f.getElementList().get(3);
		errorList = fixture.caseRecord(record);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(3, errorList.size());
		
		record = (Record)f.getElementList().get(4);
		errorList = fixture.caseRecord(record);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(2, errorList.size());
		
		record = (Record)f.getElementList().get(5);
		errorList = fixture.caseRecord(record);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(0, errorList.size());
	}
	
	public void testInterfaceTypeChecking() throws IOException {
		File f = getProgramFromString("interface I1 {int m1(int i);}" +
				                      "interface I2 extends I1 {void m1();}" +
				                      "interface I3 extends I4 {}" +
				                      "interface I4 extends I3 {}" +
				                      "interface I extends I {}");
		// I1
		
		Interface i = (Interface)f.getElementList().get(0);
		Collection<ErrorMessage> errorList = fixture.caseInterface(i);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(0, errorList.size());
		
		// I2
		
		i = (Interface)f.getElementList().get(1);
		errorList = fixture.caseInterface(i);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		// I3
		
		i = (Interface)f.getElementList().get(2);
		errorList = fixture.caseInterface(i);
		assertNotNull(errorList);
		printErrors(errorList);
		//assertEquals(1, errorList.size());
		
		// I4
		
		i = (Interface)f.getElementList().get(3);
		errorList = fixture.caseInterface(i);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
		
		// I5
		
		i = (Interface)f.getElementList().get(4);
		errorList = fixture.caseInterface(i);
		assertNotNull(errorList);
		printErrors(errorList);
		assertEquals(1, errorList.size());
	}
	
	public void testClassTypeChecking() throws IOException {
		File f = getProgramFromString("interface I extends I2 {void m1();} interface I1 extends I {} interface I2 {}" +
				                      "record R1 is {int a;} record R2 is {int a; int b;}" +
				                      "trait T1 is {int a; I1 m1(){return this;}}" +
				                      "trait T2 is {int c; I2 m1(){this.c = 0; return this;} I m3(){return this.m2();} I m2();}" +
				                      "class C1 implements I by R1 and T1 {C(){} C(int a){} C(I a){}}" +
				                      "class C2 implements I by R2 and T2 {C2(){this.b = this.b = new CArrayList();}}");
		
		Class c = (Class)f.getElementList().get(7);
		
		Collection<ErrorMessage> errorList = fixture.caseClass(c);
		printErrors(errorList);
		assertEquals(3, errorList.size());
		
		c = (Class)f.getElementList().get(8);
		errorList = fixture.caseClass(c);
		printErrors(errorList);
		assertEquals(6, errorList.size());
	}
	
	public void testTypeChecking() throws IOException {
		File f = getProgramFromString("interface I extends I2 {} interface I1 extends I {} interface I2 {}" +
				                      "record R1 is {int a;} record R2 is {int a; int b;}" +
				                      "trait T1 is {int a; I1 m1(){return this;}}" +
				                      "trait T2 is {int a; I2 m1(){return this;} I m3(){return this.m2();} I m2();}" +
				                      "class C1 implements I2 by R1 and T1 {C(){} C(int a){} C(I a){}}" +
				                      "class C2 implements I by R2 and T2 {}" +
				                      "class C3 implements I by {} and {void m1(); void m2(){this.m1();} " +
				                                                       "void m3(){} void m4(){this.m3();}}{}");
				
		Collection<ErrorMessage> errorList = fixture.typeCheck(f);
		printErrors(errorList);
		assertEquals(8, errorList.size());
	}
	
	public void testCompleteTypeChecking() throws IOException {
		File f = getProgramFromString("interface I extends I2 {} interface I1 extends I {} interface I2 {}" +
				                      "record R1 is {int a;} record R2 is {int a; int b;}" +
				                      "trait T1 is {int a; I1 m1(){return this;} void k1(int a){} void k2(int a){}}" +
				                      "trait T2 is {int a; I2 m1(){return this;} I m3(){return this.m2();} I m2();}" +
				                      "class C1 implements I2 by R1 and T1 {C(){} C(int a){} C(int a){IObject o = new C3();this.a = (IObject)a;}}" +
				                      "class C2 implements I by R2 and T2 {}" +
				                      "class C3 implements I by {} and {void m1(); void m2(){this.m1();} " +
				                                                       "void m3(){} void m4(){IObject o = new C3();this.m3();}}{C3(){" +
				                                                       "if(this == this) {}}}");
				
		Collection<ErrorMessage> errorList = new LinkedList<ErrorMessage>();
		List<File> files = lookup.getAllFiles(f);
		
		for(File file : files) {
			errorList.addAll(fixture.typeCheck(file));
		}
		
		printErrors(errorList);
		assertEquals(10, errorList.size());
	}
}
