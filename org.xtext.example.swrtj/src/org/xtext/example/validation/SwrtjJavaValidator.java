package org.xtext.example.validation; 

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.linker.ElementFactory;
import org.xtext.example.swrtj.Args;
import org.xtext.example.swrtj.Class;
import org.xtext.example.swrtj.Constructor;
import org.xtext.example.swrtj.ExpressionStatement;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.Import;
import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.Program;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.This;
import org.xtext.example.typechecking.TypeChecker;
import org.xtext.example.utils.DuplicateChecker;
import org.xtext.example.utils.ErrorMessage;
import org.xtext.example.utils.Lookup;
import org.xtext.example.utils.StatementChecker;

public class SwrtjJavaValidator extends AbstractSwrtjJavaValidator {
	private DuplicateChecker duplicateChecker = new DuplicateChecker();
	private Lookup lookup = new Lookup();
	private TypeChecker typeChecker = new TypeChecker();
	
	public static final String WRONG_CONSTRUCTOR_NAME = "org.eclipse.xtext.swrtj.InvalidConstructorName";
	public static final String UNUSED_REQUIRED_FIELD = "org.eclipse.xtext.swrtj.UnusedRequiredField";
	public static final String UNUSED_REQUIRED_METHOD = "org.eclipse.xtext.swrtj.UnusedRequiredMethod";
	public static final String UNPROVIDED_FIELDS = "org.eclipse.xtext.swrtj.UnprovidedFields";
	public static final String INTERFACE_UNPROVIDED_METHODS = "org.eclipse.xtext.swrtj.InterfaceUnprovidedMethods";
	public static final String TRAIT_UNPROVIDED_METHODS = "org.eclipse.xtext.swrtj.TraitUnprovidedMethods";
	
	/**
	 * Checks for duplicated elements in the specified file.
	 * @param file the file to check.
	 */
	@Check
	public void checkDucplicateElements(File file) {
		List<File> fileList = lookup.getAllFiles(file);
		
		showError(duplicateChecker.checkDuplicateElements(fileList));
	}
	
	/**
	 * Execute the typechecking of all the referenced file.
	 * @param file the file to typecheck.
	 */
	@Check
	public void completeTypeChecking(File file) {
		for(File f : lookup.getAllFiles(file)) {
			typeChecking(f);
			/*try {
				typeChecking(f);
			} catch(Exception ex) {
				String st = "\n";
				StackTraceElement[] ste = ex.getStackTrace();
				for(StackTraceElement e : ste) {
					st += e + "\n";
				}
				
				warning(ex.getMessage() + st, f, SwrtjPackage.FILE);
			}*/
		}
	}
	
	/**
	 * Execute the typechecking of the file.
	 * @param file the file to typecheck.
	 */
	public void typeChecking(File file) {
		showError(typeChecker.typeCheck(file));
	}
	
	/**
	 * Checks that the import URI ends with '.swrtj'.
	 * @param importResource the import URI.
	 */
	@Check
	public void checkImportUri(Import importResource) {
		String uri = importResource.getImportURI();
		if(uri == null) return;
		
		if(!uri.endsWith(".swrtj"))
			showError(new ErrorMessage("Resuorce " + uri + " must have 'swrtj' extension", 
					                   importResource, 
					                   SwrtjPackage.IMPORT__IMPORT_URI));
	}
	
	/**
	 * Checks that there isn't any duplicate parameter declaration in the specified method.
	 * @param method the method to check.
	 */
	@Check
	public void checkDuplicatedParameters(Method method) {
		showError(duplicateChecker.checkDuplicatedParameters(method));
	}
	
	/**
	 * Checks that the constructor name is the same of the class.
	 * @param constructor the constructor to check.
	 */
	@Check
	public void checkConstructorName(Constructor constructor) {
		Class classRef = (Class)lookup.getOwner(constructor);
		if(!classRef.getName().equals(constructor.getName()))
				showError(new ErrorMessage("Constructor must have the same name of the class",
						                   WRONG_CONSTRUCTOR_NAME,
						                   constructor, SwrtjPackage.CONSTRUCTOR__NAME));
	}
	
	/**
	 * Checks that there are no duplicated extended interfaces.
	 * @param interfaceType the interface list to check.
	 * @return an error message if there are duplication, an empty list otherwise.
	 */
	@Check
	public void checkDuplicatedExtends(Interface interfaceType) {
		showError(duplicateChecker.checkDuplicateInterfaces(interfaceType));
	}
	
	/**
	 * Checks that there are no duplicated implemented interfaces.
	 * @param classType the class to check.
	 * @return an error message if there are duplication, an empty list otherwise.
	 */
	@Check
	public void checkDuplicatedImplements(Class classType) {
		showError(duplicateChecker.checkDuplicateInterfaces(classType));
	}
	
	/**
	 * Cheks whether the given expression statement is well formed, i.e. it is
	 * - Constructor invocation
	 * - Method invocation
	 * - Field Assignment
	 * @param statement the statement to check
	 */
	@Check
	public void statementCheck(ExpressionStatement statement) {
		if(!new StatementChecker().isWellFormed(statement))
			showError(new ErrorMessage("Invalid statement: a statement must be a " +
					                   "method/constructor invocation or a field/parameter assignment", statement));
	}
	
	/**
	 * Checks whether the 'this' variable is called within the correct environment(class or trait).
	 * @param thisRule the 'this' rule.
	 */
	@Check
	public void thisCheck(This thisRule) {
		if((lookup.getOwner(thisRule) instanceof Program)) {
			showError(new ErrorMessage("the 'this' variable is not allowed in program context", thisRule));
		}
	}
	
	/**
	 * Checks whether the 'args' variable is called within the correct environment(program).
	 * @param inRule the 'args' rule.
	 */
	@Check
	public void inCheck(Args argsRule) {
		if(!(lookup.getOwner(argsRule) instanceof Program)) {
			showError(new ErrorMessage("the 'args' variable is allowed only in program context", argsRule));
		}
	}
	
	/**
	 * Checks whether the implement list can implement the optional system interface
	 * @param c the class to check
	 * @throws ClassNotFoundException 
	 */
	@Check
	public void implementsCheck(Class c) {
		try {
			interfaceListCheck(c.getImplementsList(), "Cannot implement this system interface", c);
		} catch (ClassNotFoundException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/**
	 * Checks whether the extends list can implement the optional system interface
	 * @param i the interface to check
	 * @throws ClassNotFoundException 
	 */
	@Check
	public void extendsCheck(Interface i) {
		try {
			interfaceListCheck(i.getExtendsList(), "Cannot extend this system interface", i);
		} catch (ClassNotFoundException ex) {
			throw new RuntimeException(ex);
		}
	}
	
	/* Service methods */

	//Shows errors only if msg != null
	private void showError(ErrorMessage msg) {
		if(msg == null) return;
		
		if(msg.isWarning())
			warning(msg.getMessage(), msg.getSource(), msg.getFeature(), msg.getErrorType());
		else
			error(msg.getMessage(), msg.getSource(), msg.getFeature(), msg.getErrorType());
	}
	
	//Shows the error message list
	private void showError(Collection<ErrorMessage> msg) {
		if(msg == null) return;
		
		for(ErrorMessage m : msg) {
			showError(m);
		}
	}
	
	//Checks that the interface list contains no system interfaces
	private void interfaceListCheck(EList<Interface> interfaceList, String errorMessage, EObject owner) throws ClassNotFoundException {
		for(Interface i : interfaceList) {
			String javaName = ElementFactory.getFactory().toSimpleJavaName(i.getName());
			if(javaName != null && !(java.lang.Class.forName(javaName).isInterface())) {
				showError(new ErrorMessage(errorMessage + ": " + i.getName(), owner));
			}
		}
	}
}
