/*
 * generated by Xtext
 */
package org.xtext.example;

import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.xtext.example.linker.SwrtjLinkingResource;
import org.xtext.example.linker.SwrtjResourceFactory;

/**
 * Use this class to register components to be used within the IDE.
 */
public class SwrtjRuntimeModule extends org.xtext.example.AbstractSwrtjRuntimeModule {
	/*@Override
	public Class<? extends ILinkingService> bindILinkingService() {
		return RtjLinkingService.class;
	}*/
	
	@Override
	public Class<? extends XtextResource> bindXtextResource() {
		return SwrtjLinkingResource.class;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.xtext.service.DefaultRuntimeModule#bindIResourceFactory()
	 */
	public Class<? extends XtextResourceFactory> bindXtextResourceFactory() {
		  return SwrtjResourceFactory.class;
	}
}
