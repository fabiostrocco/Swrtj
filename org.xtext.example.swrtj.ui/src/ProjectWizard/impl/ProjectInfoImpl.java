/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ProjectWizard.impl;

import ProjectWizard.ProjectInfo;
import ProjectWizard.ProjectType;
import ProjectWizard.ProjectWizardPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ProjectWizard.impl.ProjectInfoImpl#getExampleType <em>Example Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectInfoImpl extends EObjectImpl implements ProjectInfo {
	/**
	 * The default value of the '{@link #getExampleType() <em>Example Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleType()
	 * @generated
	 * @ordered
	 */
	protected static final ProjectType EXAMPLE_TYPE_EDEFAULT = ProjectType.BANK_ACCOUNT;

	/**
	 * The cached value of the '{@link #getExampleType() <em>Example Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleType()
	 * @generated
	 * @ordered
	 */
	protected ProjectType exampleType = EXAMPLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectWizardPackage.Literals.PROJECT_INFO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectType getExampleType() {
		return exampleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleType(ProjectType newExampleType) {
		ProjectType oldExampleType = exampleType;
		exampleType = newExampleType == null ? EXAMPLE_TYPE_EDEFAULT : newExampleType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectWizardPackage.PROJECT_INFO__EXAMPLE_TYPE, oldExampleType, exampleType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProjectWizardPackage.PROJECT_INFO__EXAMPLE_TYPE:
				return getExampleType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProjectWizardPackage.PROJECT_INFO__EXAMPLE_TYPE:
				setExampleType((ProjectType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProjectWizardPackage.PROJECT_INFO__EXAMPLE_TYPE:
				setExampleType(EXAMPLE_TYPE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProjectWizardPackage.PROJECT_INFO__EXAMPLE_TYPE:
				return exampleType != EXAMPLE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (exampleType: ");
		result.append(exampleType);
		result.append(')');
		return result.toString();
	}

} //ProjectInfoImpl
