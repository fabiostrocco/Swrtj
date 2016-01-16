/**
 * 
 */
package org.xtext.example.linker;

import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.SwrtjFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Customized ResourceFactory which can return a resource with the implicit
 * Object.
 * 
 * @author Strocco Fabio
 * 
 */
public class SwrtjResourceFactory extends XtextResourceFactory {
	private static Resource systemResource;

	@Inject
	public SwrtjResourceFactory(Provider<XtextResource> resourceProvider) {
		super(resourceProvider);
	}

	/**
	 * If asked for the implicit Object URI, it synthesizes such a resource
	 * 
	 * @see
	 * org.eclipse.xtext.resource.XtextResourceFactory#createResource(org.eclipse
	 * .emf.common.util.URI)
	 */
	@Override
	public Resource createResource(URI uri) {
		if (uri.equals(SwrtjLinkingResource.implicitSystemUri)) {
			SwrtjLinkingResource resource = new SwrtjLinkingResource();
			resource.getContents().add(createSystemFile());
			resource.setURI(uri);
			systemResource = resource;
			return resource;
		}

		return super.createResource(uri);
	}
	
	/**
	 * Returns the system resource.
	 * @return the system resource.
	 */
	public static Resource getSystemResource() {
		return systemResource;
	}

	/**
	 * Creates a program consisting of the single implicit interface IObject
	 * @return program consisting of the single implicit class Object
	 */
	File createSystemFile() {
		File file = SwrtjFactory.eINSTANCE.createFile();
		ElementFactory factory = ElementFactory.getFactory();
		Collection<Element> elementList = factory.getElementList();

		for(Element element : elementList) {
			file.getElementList().add(element);
		}
		
		return file;
	}
}
