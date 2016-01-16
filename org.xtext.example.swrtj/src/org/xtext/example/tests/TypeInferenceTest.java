package org.xtext.example.tests;

import java.io.IOException;

import org.xtext.example.swrtj.AnonimousTrait;
import org.xtext.example.swrtj.Expression;
import org.xtext.example.swrtj.ExpressionStatement;
import org.xtext.example.swrtj.Field;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.ProvidedMethod;
import org.xtext.example.swrtj.Trait;
import org.xtext.example.typechecking.ExpressionTypingJudgment;
import org.xtext.example.typechecking.MethodTypingJudgment;
import org.xtext.example.typechecking.TypingJudgmentInference;

/**
 * This class is a JUnit Test Case for the class TypeInference.
 * @author Strocco Fabio
 */
public class TypeInferenceTest extends TestWithLoader {
	private TypingJudgmentInference fixture;

	/**
	 * Creates a new test.
	 * @param name the test name.
	 */
	public TypeInferenceTest(String name) {
		super(name);
	}
	
	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		super.setUp();
		this.fixture = new TypingJudgmentInference();
	}
	
	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		this.fixture = null;
	}
	
	public void testExpressionJudgment() throws IOException {
		File f = getProgramFromString("interface I1 {} " +
				                      "interface I2 extends I1{I3 m1();}" +
				                      "interface I3 extends I2{I3 m2();}" +
				                      "trait T is {" +
				                      "I3 f;" +
				                      "I3 call(I1 a, I2 b, I3 c);" +
				                      "I1 m1() {return this;}" +
				                      "I2 m2() {return (I2)this.f.m2();}" +
				                      "void m3() {this.call(this, (this), this.call((this.f).m1(), (I3)this.f, " +
				                      "this.call(((((this.f)).m1())), (I1)this.m1(), this.f))).m1();}" +
				                      "}");
		AnonimousTrait trait = (AnonimousTrait)((Trait)f.getElementList().get(3)).getExpression().getTraitList().get(0);
		
		Expression expression = (Expression)((ProvidedMethod)(trait.getDefinitionList().get(2))).getReturnStatement().getExpression();
		Field field = (Field)(trait.getDefinitionList().get(0));
		
		ExpressionTypingJudgment judgment = fixture.inferExpressionTypingJudgment(expression);
		System.out.println(judgment.getConstraints());
		
		assertNotNull(judgment);
		assertTrue(judgment.getExpressionType().isThis());
		assertEquals(0, judgment.getConstraints().getRequiredFields().size());
		assertEquals(0, judgment.getConstraints().getRequiredMethods().size());
		assertEquals(0, judgment.getConstraints().getRequiredInterfaces().size());

		
		expression = (Expression)((ProvidedMethod)(trait.getDefinitionList().get(3))).getReturnStatement().getExpression();
		judgment = fixture.inferExpressionTypingJudgment(expression);
		System.out.println(judgment.getConstraints());
		
		assertNotNull(judgment);
		assertTrue(judgment.getExpressionType().getCompatibleInterfaces().containsKey("I2"));
		assertFalse(judgment.getExpressionType().getCompatibleInterfaces().containsKey("I3"));
		assertEquals(1, judgment.getConstraints().getRequiredFields().size());
		assertEquals(0, judgment.getConstraints().getRequiredMethods().size());
		assertEquals(0, judgment.getConstraints().getRequiredInterfaces().size());
		assertTrue(judgment.getConstraints().contains(field.getFieldRef()));
		
		expression = (Expression)((ExpressionStatement)((ProvidedMethod)(trait.getDefinitionList().get(4))).getBlock().getStatementList().get(0)).getExpression();
		judgment = fixture.inferExpressionTypingJudgment(expression);
		System.out.println(judgment.getConstraints());
		
		Interface i1 = (Interface)f.getElementList().get(0);
		Interface i2 = (Interface)f.getElementList().get(1);
		
		Method call = (Method)trait.getDefinitionList().get(1);
		Method m1 = (Method)trait.getDefinitionList().get(2);
		
		assertNotNull(judgment);
		assertEquals(1, judgment.getConstraints().getRequiredFields().size());
		assertEquals(2, judgment.getConstraints().getRequiredMethods().size());
		assertEquals(2, judgment.getConstraints().getRequiredInterfaces().size());
		assertTrue(judgment.getConstraints().contains(field.getFieldRef()));
		assertTrue(judgment.getConstraints().contains(call.getMethodRef()));
		assertTrue(judgment.getConstraints().contains(m1.getMethodRef()));
		assertTrue(judgment.getConstraints().contains(i1));
		assertTrue(judgment.getConstraints().contains(i2));
	}
	
	public void testMethodJudgment() throws IOException {
		File f = getProgramFromString("interface I1 {} " +
				                      "interface I2 extends I1{I3 m1();}" +
				                      "interface I3 extends I2{I3 m2();}" +
				                      "trait T is {" +
				                      "I3 f;" +
				                      "I3 call(I1 a, I2 b, I3 c);" +
				                      "I1 m1() {return this;}" +
				                      "I2 m2() {return (I2)this.f.m2();}" +
				                      "void m3() {this.call(this, (this), this.call((this.f).m1(), (I3)this.f, " +
				                      "this.call(((((this.f)).m1())), (I1)this.m1(), this.f))).m1();}" +
				                      "void m4() {I1 x = this.f = this;}" +
				                      "void m5() {I2 x = this; if(this.f == null) {I1 a = this.f; int b = this; this.m1();} if(this == null) {}}" +
				                      "void m6() {I1 x = null; if(this != x) {} if(this == 10) {} if(null == null) {} if(this == this) {} if(this == new CArrayList()){}}" +
				                      "}");
		AnonimousTrait trait = (AnonimousTrait)((Trait)f.getElementList().get(3)).getExpression().getTraitList().get(0);
		
		ProvidedMethod method = ((ProvidedMethod)(trait.getDefinitionList().get(2)));
		Field field = (Field)(trait.getDefinitionList().get(0));
		
		MethodTypingJudgment judgment = fixture.inferMethodTypingJudgment(method);
		System.out.println(judgment.getConstraints());
		
		assertNotNull(judgment);
		assertEquals(0, judgment.getConstraints().getRequiredFields().size());
		assertEquals(0, judgment.getConstraints().getRequiredMethods().size());
		assertEquals(1, judgment.getConstraints().getRequiredInterfaces().size());

		
		method = ((ProvidedMethod)(trait.getDefinitionList().get(3)));
		judgment = fixture.inferMethodTypingJudgment(method);
		System.out.println(judgment.getConstraints());
		
		assertNotNull(judgment);
		assertEquals(1, judgment.getConstraints().getRequiredFields().size());
		assertEquals(0, judgment.getConstraints().getRequiredMethods().size());
		assertEquals(0, judgment.getConstraints().getRequiredInterfaces().size());
		assertTrue(judgment.getConstraints().contains(field.getFieldRef()));
		
		method = ((ProvidedMethod)(trait.getDefinitionList().get(4)));
		judgment = fixture.inferMethodTypingJudgment(method);
		System.out.println(judgment.getConstraints());
		
		Interface i1 = (Interface)f.getElementList().get(0);
		Interface i2 = (Interface)f.getElementList().get(1);
		Interface i3 = (Interface)f.getElementList().get(2);
		
		Method call = (Method)trait.getDefinitionList().get(1);
		Method m1 = (Method)trait.getDefinitionList().get(2);
		
		assertNotNull(judgment);
		assertEquals(1, judgment.getConstraints().getRequiredFields().size());
		assertEquals(2, judgment.getConstraints().getRequiredMethods().size());
		assertEquals(2, judgment.getConstraints().getRequiredInterfaces().size());
		assertTrue(judgment.getConstraints().contains(field.getFieldRef()));
		assertTrue(judgment.getConstraints().contains(call.getMethodRef()));
		assertTrue(judgment.getConstraints().contains(m1.getMethodRef()));
		assertTrue(judgment.getConstraints().contains(i1));
		assertTrue(judgment.getConstraints().contains(i2));
		
		method = ((ProvidedMethod)(trait.getDefinitionList().get(5)));
		judgment = fixture.inferMethodTypingJudgment(method);
		System.out.println(judgment.getConstraints());
		
		assertNotNull(judgment);
		assertEquals(1, judgment.getConstraints().getRequiredFields().size());
		assertEquals(0, judgment.getConstraints().getRequiredMethods().size());
		assertEquals(1, judgment.getConstraints().getRequiredInterfaces().size());
		assertTrue(judgment.getConstraints().contains(field.getFieldRef()));
		assertTrue(judgment.getConstraints().contains(i3));
		
		method = ((ProvidedMethod)(trait.getDefinitionList().get(6)));
		judgment = fixture.inferMethodTypingJudgment(method);
		System.out.println(judgment.getConstraints());
		
		assertNotNull(judgment);
		assertEquals(1, judgment.getConstraints().getRequiredFields().size());
		assertEquals(1, judgment.getConstraints().getRequiredMethods().size());
		assertEquals(1, judgment.getConstraints().getRequiredInterfaces().size());
		assertTrue(judgment.getConstraints().contains(field.getFieldRef()));
		assertTrue(judgment.getConstraints().contains(m1.getMethodRef()));
		assertTrue(judgment.getConstraints().contains(i2));
		
		method = ((ProvidedMethod)(trait.getDefinitionList().get(7)));
		judgment = fixture.inferMethodTypingJudgment(method);
		System.err.println(judgment.getConstraints());
		
		assertNotNull(judgment);
		assertEquals(0, judgment.getConstraints().getRequiredFields().size());
		assertEquals(0, judgment.getConstraints().getRequiredMethods().size());
		assertEquals(3, judgment.getConstraints().getRequiredInterfaces().size());
		assertTrue(judgment.getConstraints().contains(i1));
	}
}
