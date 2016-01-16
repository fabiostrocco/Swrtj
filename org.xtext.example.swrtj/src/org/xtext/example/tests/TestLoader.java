/**
 * 
 */
package org.xtext.example.tests;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.example.SwrtjStandaloneSetup;
import org.xtext.example.swrtj.File;

import com.google.inject.Injector;

/**
 * Loads (and parses) a local test mrtj file.
 * @author Strocco Fabio
 */
public class TestLoader {
	private Injector injector = new SwrtjStandaloneSetup()
			.createInjectorAndDoEMFRegistration();

	private XtextResourceSet resourceSet;

	/**
	 * Creates a new instance of TestLoader.
	 */
	public TestLoader() {
		new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");

		resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
				Boolean.TRUE);
	}

	/**
	 * Create a resource.
	 * @return a resource.
	 */
	public Resource createResource() {
		return resourceSet.createResource(URI.createURI("http:///My.swrtj"));
	}

	/**
	 * Loads a resource from file.
	 * @param fileName the file to load.
	 * @return the resource matching with the given file name.
	 */
	public Resource loadResource(String fileName) {
		return resourceSet.getResource(URI
				.createURI("platform:/resource/org.xtext.example.tests/"
						+ fileName), true);
	}

	/**
	 * Loads a resource from a string.
	 * @param program an mrtj program.
	 * @param name program logical name. Using the name, it's possible to create more resources
	 * from string and use the import statement. For instance if LogicalName1 --> interface I {}
	 * it's possible to create a correct mrtj program like this: 
	 * import 'LogicalName1.mrtj' interface I1 extends I {}
	 * @return the resource matching with the given program.
	 * @throws IOException if an access error occurs.
	 */
	public Resource loadFromString(String program, String name) throws IOException {
		Resource resource = resourceSet.createResource(URI
				.createURI("dummy:/" + name + ".swrtj"));
		InputStream in = new ByteArrayInputStream(program.getBytes());
		resource.load(in, resourceSet.getLoadOptions());
		return resource;
	}

	/**
	 * Loads a program from a string.
	 * @param program an mrtj program.
	 * @param name program logical name. Using the name, it's possible to create more resources
	 * from string and use the import statement. For instance if LogicalName1 --> interface I {}
	 * it's possible to create a correct mrtj program like this: 
	 * import 'LogicalName1.mrtj' interface I1 extends I {}
	 * @return the root of the parse tree.
	 * @throws IOException if an access error occurs.
	 */
	public File loadProgramFromString(String program, String name) throws IOException {
		return (File)loadFromString(program, name).getContents().get(0);
	}
	
	/**
	 * Loads a program from a string.
	 * @param program an mrtj program.
	 * @return the root of the parse tree.
	 * @throws IOException if an access error occurs.
	 */
	public File loadProgramFromString(String program) throws IOException {
		return loadProgramFromString(program, "example");
	}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		TestLoader loader = new TestLoader();
		
		File program = loader.loadProgramFromString("interface I{}");
		System.out.println(program.getElementList().get(0).getName());
	}
}
