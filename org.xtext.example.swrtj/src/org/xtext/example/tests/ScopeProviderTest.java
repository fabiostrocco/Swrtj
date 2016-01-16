package org.xtext.example.tests;

import java.io.IOException;

import org.eclipse.xtext.scoping.IScope;
import org.xtext.example.scoping.SwrtjScopeProvider;
import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.DottedExpression;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.ExpressionStatement;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.IfThenElseStatement;
import org.xtext.example.swrtj.LocalParameter;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.Trait;

/**
 * This class is a JUnit Test Case for the class RtjScopeProvider.
 * 
 * @author Strocco Fabio
 */
public class ScopeProviderTest extends TestWithLoader {
	private SwrtjScopeProvider fixture;

	/**
	 * Creates a new test.
	 * 
	 * @param name
	 *            the test name.
	 */
	public ScopeProviderTest(String name) {
		super(name);
	}

	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		super.setUp();
		this.fixture = new SwrtjScopeProvider();
	}

	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		this.fixture = null;
	}

	public void testTraitOperationScoping() throws IOException {

		getProgramFromString("trait T is {void m(); void p() {this.m();}} trait TT is T + T[m renameTo m1, p renameTo p1] "
				+ "trait TTT is TT[m renameTo mmm]");
	}

	public void testTraitScopeInvocations() throws IOException {
		File f = getProgramFromString("interface I {void m1(); I m2();} trait T is {"
				+ "I f;" + "void m1() {this.f.m2().m1();}" + "}");

		AnonimousTrait t = (AnonimousTrait) ((Trait) f.getElementList().get(1))
				.getExpression().getTraitList().get(0);
		DottedExpression expression = ((Expression)((ExpressionStatement) ((ProvidedMethod) t
				.getDefinitionList().get(1)).getBlock().getStatementList()
				.get(0)).getExpression()).getTermList().get(0);

		// m2. scope

		IScope scope = fixture.scope_MethodInvocation_method(expression, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("m1"));
		assertNotNull(scope.getContentByName("m2"));
		assertEquals(2, sizeOfIterable(scope.getAllContents()));

		scope = fixture.scope_FieldAccess_field(expression, null);
		assertNotNull(scope);
		assertEquals(0, sizeOfIterable(scope.getAllContents()));

		// f. scope

		expression = expression.getReceiver();

		scope = fixture.scope_MethodInvocation_method(expression, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("m1"));
		assertNotNull(scope.getContentByName("m2"));
		assertEquals(2, sizeOfIterable(scope.getAllContents()));

		scope = fixture.scope_FieldAccess_field(expression, null);
		assertNotNull(scope);
		assertEquals(0, sizeOfIterable(scope.getAllContents()));

		// this. scope

		expression = expression.getReceiver();

		scope = fixture.scope_MethodInvocation_method(expression, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("m1"));
		assertEquals(1, sizeOfIterable(scope.getAllContents()));

		scope = fixture.scope_FieldAccess_field(expression, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("f"));
		assertEquals(1, sizeOfIterable(scope.getAllContents()));
	}

	public void testConstructorScopeInvocations() throws IOException {
		File f = getProgramFromString("interface I {void m1(); I m2();} trait T is {"
				+ "I f;"
				+ "void m1() {}"
				+ "}"
				+ "record R is {I f;}"
				+ "class C implements I by R and T {C(){this.f.m2().m1();}}");

		DottedExpression expression = ((DottedExpression) ((Expression)((ExpressionStatement) ((Class) f
				.getElementList().get(3)).getConstructorList().get(0)
				.getBlock().getStatementList().get(0)).getExpression())
				.getTermList().get(0));

		// m2. scope

		IScope scope = fixture.scope_MethodInvocation_method(expression, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("m1"));
		assertNotNull(scope.getContentByName("m2"));
		assertEquals(2, sizeOfIterable(scope.getAllContents()));

		scope = fixture.scope_FieldAccess_field(expression, null);
		assertNotNull(scope);
		assertEquals(0, sizeOfIterable(scope.getAllContents()));

		// f. scope

		expression = expression.getReceiver();

		scope = fixture.scope_MethodInvocation_method(expression, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("m1"));
		assertNotNull(scope.getContentByName("m2"));
		assertEquals(2, sizeOfIterable(scope.getAllContents()));

		scope = fixture.scope_FieldAccess_field(expression, null);
		assertNotNull(scope);
		assertEquals(0, sizeOfIterable(scope.getAllContents()));

		// this. scope

		expression = expression.getReceiver();

		scope = fixture.scope_MethodInvocation_method(expression, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("m1"));
		assertEquals(1, sizeOfIterable(scope.getAllContents()));

		scope = fixture.scope_FieldAccess_field(expression, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("f"));
		assertEquals(1, sizeOfIterable(scope.getAllContents()));
	}

	public void testScopeParameter() throws IOException {
		File f = getProgramFromString("interface I {void m1(); I m2();} trait T is {"
				+ "I f;"
				+ "I m1(I a, int b) {I c = null; I d = c; I e = a; return d;}"
				+ "void m2(I a) {I b = null; if(this == this) {I c = b; c.m1(); if(this == this){I d = null;}}}"
				+ "void m3() {this.f = this;}"
				+ "}"
				+ "record R is {I f;}"
				+ "class C implements I by R and T {C(int a, I b){(I)this.f.m2().m1(b, a);}}");

		ProvidedMethod method = (ProvidedMethod) ((AnonimousTrait) ((Trait) (f
				.getElementList().get(1))).getExpression().getTraitList()
				.get(0)).getDefinitionList().get(1);
		IScope scope = fixture.scope_Parameter((Expression)method.getReturnStatement()
				.getExpression(), null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("a"));
		assertNotNull(scope.getContentByName("b"));
		assertNotNull(scope.getContentByName("c"));
		assertNotNull(scope.getContentByName("d"));
		assertNotNull(scope.getContentByName("e"));
		assertEquals(5, sizeOfIterable(scope.getAllContents()));

		scope = fixture.scope_Parameter((Expression)(((LocalParameter) method.getBlock()
				.getParameterList().get(0)).getValue()), null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("a"));
		assertNotNull(scope.getContentByName("b"));
		assertEquals(2, sizeOfIterable(scope.getAllContents()));

		Expression exp = (Expression) ((ExpressionStatement) (((Class) f
				.getElementList().get(3)).getConstructorList().get(0))
				.getBlock().getStatementList().get(0)).getExpression();
		scope = fixture.scope_Parameter(exp, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("a"));
		assertNotNull(scope.getContentByName("b"));
		assertEquals(2, sizeOfIterable(scope.getAllContents()));

		method = (ProvidedMethod) ((AnonimousTrait) ((Trait) (f
				.getElementList().get(1))).getExpression().getTraitList()
				.get(0)).getDefinitionList().get(2);
		exp = (Expression) ((ExpressionStatement) ((IfThenElseStatement) method
				.getBlock().getStatementList().get(0)).getTrueBranch()
				.getStatementList().get(0)).getExpression();
		scope = fixture.scope_Parameter(exp, null);
		assertNotNull(scope);
		assertNotNull(scope.getContentByName("a"));
		assertNotNull(scope.getContentByName("c"));
		assertNotNull(scope.getContentByName("b"));
		assertEquals(3, sizeOfIterable(scope.getAllContents()));
	}

	public void testSystemElements() throws IOException {
		File f = getProgramFromString("interface I {}");
		IScope scope = fixture.scope_Interface(f, null);

		assertNotNull(scope);
		assertNotNull(scope.getContentByName("IObject"));
		assertNotNull(scope.getContentByName("IString"));
		assertNotNull(scope.getContentByName("IBigInteger"));
		assertNotNull(scope.getContentByName("IList"));
	}

	/* Service methods */

	private int sizeOfIterable(Iterable<? extends Object> iterable) {
		int size = 0;

		for (@SuppressWarnings("unused")
		Object obj : iterable) {
			size++;
		}

		return size;
	}
}
