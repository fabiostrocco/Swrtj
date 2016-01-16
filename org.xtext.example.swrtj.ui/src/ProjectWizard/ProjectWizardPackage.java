/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ProjectWizard;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ProjectWizard.ProjectWizardFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectWizardPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ProjectWizard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ProjectWizard";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ProjectWizard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectWizardPackage eINSTANCE = ProjectWizard.impl.ProjectWizardPackageImpl.init();

	/**
	 * The meta object id for the '{@link ProjectWizard.impl.ProjectInfoImpl <em>Project Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjectWizard.impl.ProjectInfoImpl
	 * @see ProjectWizard.impl.ProjectWizardPackageImpl#getProjectInfo()
	 * @generated
	 */
	int PROJECT_INFO = 0;

	/**
	 * The feature id for the '<em><b>Example Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_INFO__EXAMPLE_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Project Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_INFO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link ProjectWizard.ProjectType <em>Project Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ProjectWizard.ProjectType
	 * @see ProjectWizard.impl.ProjectWizardPackageImpl#getProjectType()
	 * @generated
	 */
	int PROJECT_TYPE = 1;


	/**
	 * Returns the meta object for class '{@link ProjectWizard.ProjectInfo <em>Project Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Info</em>'.
	 * @see ProjectWizard.ProjectInfo
	 * @generated
	 */
	EClass getProjectInfo();

	/**
	 * Returns the meta object for the attribute '{@link ProjectWizard.ProjectInfo#getExampleType <em>Example Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example Type</em>'.
	 * @see ProjectWizard.ProjectInfo#getExampleType()
	 * @see #getProjectInfo()
	 * @generated
	 */
	EAttribute getProjectInfo_ExampleType();

	/**
	 * Returns the meta object for enum '{@link ProjectWizard.ProjectType <em>Project Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Project Type</em>'.
	 * @see ProjectWizard.ProjectType
	 * @generated
	 */
	EEnum getProjectType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectWizardFactory getProjectWizardFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ProjectWizard.impl.ProjectInfoImpl <em>Project Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjectWizard.impl.ProjectInfoImpl
		 * @see ProjectWizard.impl.ProjectWizardPackageImpl#getProjectInfo()
		 * @generated
		 */
		EClass PROJECT_INFO = eINSTANCE.getProjectInfo();

		/**
		 * The meta object literal for the '<em><b>Example Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_INFO__EXAMPLE_TYPE = eINSTANCE.getProjectInfo_ExampleType();

		/**
		 * The meta object literal for the '{@link ProjectWizard.ProjectType <em>Project Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ProjectWizard.ProjectType
		 * @see ProjectWizard.impl.ProjectWizardPackageImpl#getProjectType()
		 * @generated
		 */
		EEnum PROJECT_TYPE = eINSTANCE.getProjectType();

	}

} //ProjectWizardPackage
