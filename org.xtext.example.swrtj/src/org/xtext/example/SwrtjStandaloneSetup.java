
package org.xtext.example;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SwrtjStandaloneSetup extends SwrtjStandaloneSetupGenerated{

	public static void doSetup() {
		new SwrtjStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

