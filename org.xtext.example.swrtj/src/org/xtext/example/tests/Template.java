package org.xtext.example.tests;


/**
 * This class is a JUnit Test Case for the class ???.
 * @author Strocco Fabio
 */
public class Template extends TestWithLoader {
	@SuppressWarnings("unused")
	private Object fixture;

	/**
	 * Creates a new test.
	 * @param name the test name.
	 */
	public Template(String name) {
		super(name);
	}
	
	/**
	 * Init the test.
	 */
	@Override
	public void setUp() {
		super.setUp();
		this.fixture = new Object();
	}
	
	/**
	 * Terminate the test.
	 */
	@Override
	protected void tearDown() throws Exception {
		this.fixture = null;
	}
}
