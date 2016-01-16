package org.xtext.example.tests;

import java.io.IOException;
import java.util.Collection;

import org.antlr.stringtemplate.language.Expr;
import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.ConstructorInvocation;
import org.xtext.example.swrtj.DottedExpression;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.MethodInvocation;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.typechecking.ParamArgumentChecker;
import org.xtext.example.utils.ErrorMessage;
import org.xtext.example.utils.Lookup;

/**
 * This class is a JUnit Test Case for the class ParamArgumentChecker.
 * @author Strocco Fabio
 */
public class ParamArgumentCheckerTest extends TestWithLoader {
	private ParamArgumentChecker fixture;
	private Lookup lookup = new Lookup();

	/**
	 * Creates a new test.
	 * @param name the test name.
	 */
	public ParamArgumentCheckerTest(String name) {
		super(name);
	}
	
	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		super.setUp();
		this.fixture = new ParamArgumentChecker();
	}
	
	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		this.fixture = null;
	}
	
	public void testCompareConstructorArgument() throws IOException {
		File f = getProgramFromString("interface I {}" +
				                      "class C implements I by {} and {} {C(int a, I b, I c){} C(){}}" +
				                      "trait T is {I m1(int a, int b, int c){return new C(a, b, c);}" +
				                                  "I m2(int a, int b) {return new C(a, b);}" +
				                                  "I m3(int a, I b, I c) {return new C(a, b, c);}" +
				                                  "I m3(int a, I b, I c) {return new C(a, this, c);}" +
		                              "}");
		
		AnonimousTrait trait = (AnonimousTrait)((Trait)f.getElementList().get(2)).getExpression().getTraitList().get(0);
		
		//m1
		
		ProvidedMethod method = (ProvidedMethod)trait.getDefinitionList().get(0);
		ConstructorInvocation expression = (ConstructorInvocation)((DottedExpression)(((Expression)method.getReturnStatement().getExpression()).getTermList().get(0))).getStart();
		
		Constructor constructor = fixture.matchConstructor(expression.getClassRef(), 
				                                           expression.getArgumentList());
		assertNotNull(constructor);
		Collection<ErrorMessage> errorList = fixture.compareConstructorParameters(constructor, expression);
		assertNotNull(errorList);
		assertEquals(2, errorList.size());
		
		//m2
		
		method = (ProvidedMethod)trait.getDefinitionList().get(1);
		expression = (ConstructorInvocation)((DottedExpression)(((Expression)method.getReturnStatement().getExpression()).getTermList().get(0))).getStart();
		
		constructor = fixture.matchConstructor(expression.getClassRef(), 
				                                           expression.getArgumentList());
		assertNull(constructor);
		
		//m3
		
		method = (ProvidedMethod)trait.getDefinitionList().get(2);
		expression = (ConstructorInvocation)((DottedExpression)(((Expression)method.getReturnStatement().getExpression()).getTermList().get(0))).getStart();
		
		constructor = fixture.matchConstructor(expression.getClassRef(), 
				                                           expression.getArgumentList());
		assertNotNull(constructor);
		errorList = fixture.compareConstructorParameters(constructor, expression);
		assertNotNull(errorList);
		assertEquals(0, errorList.size());
	}
	
	public void testCompareMethodArgument() throws IOException {
		File f = getProgramFromString("interface I {}" +
				                      "trait T is {I m1(int a, int b, int c){return this.m2(a, b, c);}" +
				                                  "I m2(int a, int b) {return this.m1(a, b);}" +
				                                  "I m3(int a, I b, I c) {return this.m1(a, b, c);}" +
				                                  "I m4(int a, I b) {return this.m4(this, b);}" +
				                                  "I m5(int a, I b) {return this.m4(a, b);}" +
		                              "}" +
		                              "class C implements I by {} and {} {C(I2 a){new C(this);}}" +
		                              "interface I2 {}");
		
		AnonimousTrait trait = (AnonimousTrait)((Trait)f.getElementList().get(1)).getExpression().getTraitList().get(0);
		
		//m1
		
		ProvidedMethod method = (ProvidedMethod)trait.getDefinitionList().get(0);
		MethodInvocation expression = ((MethodInvocation)((DottedExpression)((Expression)method.getReturnStatement().getExpression()).getTermList().get(0)).getMessage());
		MethodName refMethod = expression.getMethod();
		
		Collection<ErrorMessage> errorList = fixture.compareMethodParameter(lookup.getOwnerMethod(refMethod), expression);
		assertNotNull(errorList);
		assertEquals(1, errorList.size());
		
		//m2
		
		method = (ProvidedMethod)trait.getDefinitionList().get(1);
		expression = ((MethodInvocation)((DottedExpression)((Expression)method.getReturnStatement().getExpression()).getTermList().get(0)).getMessage());
		refMethod = expression.getMethod();
		
		errorList = fixture.compareMethodParameter(lookup.getOwnerMethod(refMethod), expression);
		assertNotNull(errorList);
		assertEquals(1, errorList.size());
		
		//m3
		
		method = (ProvidedMethod)trait.getDefinitionList().get(2);
		expression = ((MethodInvocation)((DottedExpression)((Expression)method.getReturnStatement().getExpression()).getTermList().get(0)).getMessage());
		refMethod = expression.getMethod();
		
		errorList = fixture.compareMethodParameter(lookup.getOwnerMethod(refMethod), expression);
		assertNotNull(errorList);
		assertEquals(2, errorList.size());
		
		//m4
		
		method = (ProvidedMethod)trait.getDefinitionList().get(3);
		expression = ((MethodInvocation)((DottedExpression)((Expression)method.getReturnStatement().getExpression()).getTermList().get(0)).getMessage());
		refMethod = expression.getMethod();
		
		errorList = fixture.compareMethodParameter(lookup.getOwnerMethod(refMethod), expression);
		assertNotNull(errorList);
		assertEquals(1, errorList.size());
		
		//m5
		
		method = (ProvidedMethod)trait.getDefinitionList().get(4);
		expression = ((MethodInvocation)((DottedExpression)((Expression)method.getReturnStatement().getExpression()).getTermList().get(0)).getMessage());
		refMethod = expression.getMethod();
		
		errorList = fixture.compareMethodParameter(lookup.getOwnerMethod(refMethod), expression);
		assertNotNull(errorList);
		assertEquals(0, errorList.size());
		
	}
}
