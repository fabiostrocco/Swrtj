package org.xtext.example.tests;

import java.io.IOException;
import java.util.Collection;

import org.xtext.example.linker.ElementFactory;
import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.typechecking.TypeChecker;

/**
 * This class is a JUnit Test Case for the class ElementFactory.
 * @author Strocco Fabio
 */
public class ElementFactoryTest extends TestWithLoader {
	private ElementFactory fixture;

	/**
	 * Creates a new test.
	 * @param name the test name.
	 */
	public ElementFactoryTest(String name) {
		super(name);
	}
	
	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		super.setUp();
		this.fixture = ElementFactory.getFactory();
	}
	
	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		this.fixture = null;
	}
	
	public void testFactorySize() throws IOException {
		assertNotNull(fixture);
		assertEquals(30, fixture.getElementList().size());
	}
	
	public void testInterfaces() throws IOException {
		//Interface Existence
		assertTrue(fixture.exists("IObject"));
		assertTrue(fixture.exists("IString"));
		assertTrue(fixture.exists("IByte"));
		assertTrue(fixture.exists("IShort"));
		assertTrue(fixture.exists("IInteger"));
		assertTrue(fixture.exists("ILong"));
		assertTrue(fixture.exists("IFloat"));
		assertTrue(fixture.exists("IDouble"));
		assertTrue(fixture.exists("IBigInteger"));
		assertTrue(fixture.exists("IBigDecimal"));
		assertTrue(fixture.exists("IList"));
		assertTrue(fixture.exists("IPrintStream"));
		assertTrue(fixture.exists("IScanner"));
		assertTrue(fixture.exists("IThread"));
		assertTrue(fixture.exists("IRunnable"));
		assertTrue(fixture.exists("ILock"));
	}
	
	public void testClasses() throws IOException {
		//Class Existence
		assertTrue(fixture.exists("CObject"));
		assertTrue(fixture.exists("CString"));
		assertTrue(fixture.exists("CByte"));
		assertTrue(fixture.exists("CShort"));
		assertTrue(fixture.exists("CInteger"));
		assertTrue(fixture.exists("CLong"));
		assertTrue(fixture.exists("CFloat"));
		assertTrue(fixture.exists("CDouble"));
		assertTrue(fixture.exists("CBigInteger"));
		assertTrue(fixture.exists("CBigDecimal"));
		assertTrue(fixture.exists("CLinkedList"));
		assertTrue(fixture.exists("CArrayList"));
		assertTrue(fixture.exists("CThread"));
		assertTrue(fixture.exists("CReentrantLock"));
	}
	
	public void testJavaMappings() throws IOException {
		assertEquals("java.lang.Object", fixture.toJavaName("IObject"));
		assertEquals("java.lang.String", fixture.toJavaName("IString"));
		assertEquals("java.math.BigInteger", fixture.toJavaName("IBigInteger"));
		assertEquals("java.util.List<java.lang.Object>", fixture.toJavaName("IList"));
		assertEquals("java.io.PrintStream", fixture.toJavaName("IPrintStream"));
		
		assertEquals("java.lang.Object", fixture.toJavaName("CObject"));
		assertEquals("java.lang.String", fixture.toJavaName("CString"));
		assertEquals("java.math.BigInteger", fixture.toJavaName("CBigInteger"));
		assertEquals("java.util.ArrayList<java.lang.Object>", fixture.toJavaName("CArrayList"));
		assertEquals("java.util.LinkedList<java.lang.Object>", fixture.toJavaName("CLinkedList"));
	}
	
	public void testInterfacesTypeChecking() throws IOException {
		TypeChecker checker = new TypeChecker();
		Collection<Element> elementList = fixture.getElementList();
		
		for(Element element : elementList) {
			if(element instanceof Interface) {
				assertEquals(0, checker.doSwitch(element).size());
			}
		}
	}
}