package org.xtext.example.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SwrtjTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.xtext.example.tests");
		//$JUnit-BEGIN$
		suite.addTestSuite(ExpressionTypeTest.class);
		suite.addTestSuite(DuplicateCheckerTest.class);
		suite.addTestSuite(LookupTest.class);
		suite.addTestSuite(TypeInferenceTest.class);
		suite.addTestSuite(ScopeProviderTest.class);
		suite.addTestSuite(TypeCheckerTest.class);
		suite.addTestSuite(ElementFactoryTest.class);
		//$JUnit-END$
		return suite;
	}

}
