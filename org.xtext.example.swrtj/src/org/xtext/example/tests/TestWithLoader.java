/**
 * 
 */
package org.xtext.example.tests;

import java.io.IOException;
import java.util.Collection;

import org.xtext.example.swrtj.*;
import org.xtext.example.utils.ErrorMessage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;

import junit.framework.TestCase;

/**
 * This class is a JUnit Test Case who allow to load programs from string or file.
 * @author Strocco Fabio
 */
public class TestWithLoader extends TestCase {
	private TestLoader loader;

	/**
	 * Creates a new test.
	 * @param name the test name.
	 */
	public TestWithLoader(String name) {
		super(name);
	}
	
	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		setLoader(new TestLoader());
	}
	
	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		setLoader(null);
	}
	
	/**
	 * Sets the loader for this Type test case. 
	 * @param fixture the loader to use.
	 */
	protected void setLoader(TestLoader fixture) {
		this.loader = fixture;
	}

	/**
	 * Returns the loader for this Type test case.
	 * @return the loader for this Type test case.
	 */
	protected TestLoader getLoader() {
		return loader;
	}

	/**
	 * Loads the specified string and returns the associated program. Fails if
	 * there were errors (e.g., syntax errors) when loading the resource.
	 * 
	 * @param prog the String program.
	 * @param name program logical name. Using the name, it's possible to create more resources
	 * from string and use the import statement. For instance if LogicalName1 --> interface I {}
	 * it's possible to create a correct mrtj program like this: 
	 * import 'LogicalName1.mrtj' interface I1 extends I {}
	 * @return the root of the parse tree.
	 * @throws IOException if an access error occurs.
	 */
	protected File getProgramFromString(String prog, String name) throws IOException {
		Resource resource = getLoader().loadFromString(prog, name);
		EList<Diagnostic> errors = resource.getErrors();
		if (errors.size() > 0) {
			System.err.println("unexpected errors: " + errors);
		}
		
		assertEquals(0, errors.size());
		
		EObject program = resource.getContents().get(0);
		return (File) program;
	}
	
	/**
	 * Loads the specified string and returns the associated program. Fails if
	 * there were errors (e.g., syntax errors) when loading the resource.
	 * 
	 * @param prog the String program.
	 * @return the root of the parse tree.
	 * @throws IOException if an access error occurs.
	 */
	protected File getProgramFromString(String prog) throws IOException {
		return getProgramFromString(prog, "example");
	}
	
	/**
	 * Prints all the errors messages
	 * @param errorList the error list
	 */
	protected static void printErrors(Collection<ErrorMessage> errorList) {
		printErrors(errorList, false);
	}
	
	/**
	 * Prints all the errors messages
	 * @param errorList the error list
	 */
	protected static void markErrors(Collection<ErrorMessage> errorList) {
		printErrors(errorList, true);
	}
	
	/* Service methods */
	
	private static void printErrors(Collection<ErrorMessage> errorList, boolean red) {
		print("ERRORS\n------------------", red);
		for(ErrorMessage m : errorList)
			print(m.getMessage(), red);
		print("------------------", red);
	}
	
	private static void print(String message, boolean red) {
		if(red) System.err.println(message);
		else System.out.println(message);
	}
}
