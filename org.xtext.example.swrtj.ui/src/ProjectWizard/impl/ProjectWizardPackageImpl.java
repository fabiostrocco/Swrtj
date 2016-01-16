/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ProjectWizard.impl;

import ProjectWizard.ProjectInfo;
import ProjectWizard.ProjectType;
import ProjectWizard.ProjectWizardFactory;
import ProjectWizard.ProjectWizardPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectWizardPackageImpl extends EPackageImpl implements ProjectWizardPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum projectTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ProjectWizard.ProjectWizardPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProjectWizardPackageImpl() {
		super(eNS_URI, ProjectWizardFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ProjectWizardPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProjectWizardPackage init() {
		if (isInited) return (ProjectWizardPackage)EPackage.Registry.INSTANCE.getEPackage(ProjectWizardPackage.eNS_URI);

		// Obtain or create and register package
		ProjectWizardPackageImpl theProjectWizardPackage = (ProjectWizardPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ProjectWizardPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ProjectWizardPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theProjectWizardPackage.createPackageContents();

		// Initialize created meta-data
		theProjectWizardPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProjectWizardPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProjectWizardPackage.eNS_URI, theProjectWizardPackage);
		return theProjectWizardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectInfo() {
		return projectInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectInfo_ExampleType() {
		return (EAttribute)projectInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProjectType() {
		return projectTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectWizardFactory getProjectWizardFactory() {
		return (ProjectWizardFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		projectInfoEClass = createEClass(PROJECT_INFO);
		createEAttribute(projectInfoEClass, PROJECT_INFO__EXAMPLE_TYPE);

		// Create enums
		projectTypeEEnum = createEEnum(PROJECT_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(projectInfoEClass, ProjectInfo.class, "ProjectInfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectInfo_ExampleType(), this.getProjectType(), "exampleType", null, 0, 1, ProjectInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(projectTypeEEnum, ProjectType.class, "ProjectType");
		addEEnumLiteral(projectTypeEEnum, ProjectType.BANK_ACCOUNT);
		addEEnumLiteral(projectTypeEEnum, ProjectType.JAVA_STREAMS_REFACTORING);
		addEEnumLiteral(projectTypeEEnum, ProjectType.EXPRESSIONS);

		// Create resource
		createResource(eNS_URI);
	}

} //ProjectWizardPackageImpl
