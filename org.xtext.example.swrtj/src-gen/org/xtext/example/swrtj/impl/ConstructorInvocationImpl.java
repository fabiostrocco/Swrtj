/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.swrtj.ConstructorInvocation;
import org.xtext.example.swrtj.GenericExpression;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor Invocation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.ConstructorInvocationImpl#getClassRef <em>Class Ref</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.ConstructorInvocationImpl#getArgumentList <em>Argument List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstructorInvocationImpl extends StartImpl implements ConstructorInvocation
{
  /**
   * The cached value of the '{@link #getClassRef() <em>Class Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassRef()
   * @generated
   * @ordered
   */
  protected org.xtext.example.swrtj.Class classRef;

  /**
   * The cached value of the '{@link #getArgumentList() <em>Argument List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgumentList()
   * @generated
   * @ordered
   */
  protected EList<GenericExpression> argumentList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstructorInvocationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SwrtjPackage.Literals.CONSTRUCTOR_INVOCATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.swrtj.Class getClassRef()
  {
    if (classRef != null && classRef.eIsProxy())
    {
      InternalEObject oldClassRef = (InternalEObject)classRef;
      classRef = (org.xtext.example.swrtj.Class)eResolveProxy(oldClassRef);
      if (classRef != oldClassRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwrtjPackage.CONSTRUCTOR_INVOCATION__CLASS_REF, oldClassRef, classRef));
      }
    }
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public org.xtext.example.swrtj.Class basicGetClassRef()
  {
    return classRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassRef(org.xtext.example.swrtj.Class newClassRef)
  {
    org.xtext.example.swrtj.Class oldClassRef = classRef;
    classRef = newClassRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.CONSTRUCTOR_INVOCATION__CLASS_REF, oldClassRef, classRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GenericExpression> getArgumentList()
  {
    if (argumentList == null)
    {
      argumentList = new EObjectContainmentEList<GenericExpression>(GenericExpression.class, this, SwrtjPackage.CONSTRUCTOR_INVOCATION__ARGUMENT_LIST);
    }
    return argumentList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SwrtjPackage.CONSTRUCTOR_INVOCATION__ARGUMENT_LIST:
        return ((InternalEList<?>)getArgumentList()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SwrtjPackage.CONSTRUCTOR_INVOCATION__CLASS_REF:
        if (resolve) return getClassRef();
        return basicGetClassRef();
      case SwrtjPackage.CONSTRUCTOR_INVOCATION__ARGUMENT_LIST:
        return getArgumentList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SwrtjPackage.CONSTRUCTOR_INVOCATION__CLASS_REF:
        setClassRef((org.xtext.example.swrtj.Class)newValue);
        return;
      case SwrtjPackage.CONSTRUCTOR_INVOCATION__ARGUMENT_LIST:
        getArgumentList().clear();
        getArgumentList().addAll((Collection<? extends GenericExpression>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SwrtjPackage.CONSTRUCTOR_INVOCATION__CLASS_REF:
        setClassRef((org.xtext.example.swrtj.Class)null);
        return;
      case SwrtjPackage.CONSTRUCTOR_INVOCATION__ARGUMENT_LIST:
        getArgumentList().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SwrtjPackage.CONSTRUCTOR_INVOCATION__CLASS_REF:
        return classRef != null;
      case SwrtjPackage.CONSTRUCTOR_INVOCATION__ARGUMENT_LIST:
        return argumentList != null && !argumentList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ConstructorInvocationImpl
