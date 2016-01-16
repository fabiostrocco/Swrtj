/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.InterfaceImpl#getExtendsList <em>Extends List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.InterfaceImpl#getRequiredMethodList <em>Required Method List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceImpl extends ElementImpl implements Interface
{
  /**
   * The cached value of the '{@link #getExtendsList() <em>Extends List</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtendsList()
   * @generated
   * @ordered
   */
  protected EList<Interface> extendsList;

  /**
   * The cached value of the '{@link #getRequiredMethodList() <em>Required Method List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequiredMethodList()
   * @generated
   * @ordered
   */
  protected EList<Method> requiredMethodList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceImpl()
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
    return SwrtjPackage.Literals.INTERFACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Interface> getExtendsList()
  {
    if (extendsList == null)
    {
      extendsList = new EObjectResolvingEList<Interface>(Interface.class, this, SwrtjPackage.INTERFACE__EXTENDS_LIST);
    }
    return extendsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Method> getRequiredMethodList()
  {
    if (requiredMethodList == null)
    {
      requiredMethodList = new EObjectContainmentEList<Method>(Method.class, this, SwrtjPackage.INTERFACE__REQUIRED_METHOD_LIST);
    }
    return requiredMethodList;
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
      case SwrtjPackage.INTERFACE__REQUIRED_METHOD_LIST:
        return ((InternalEList<?>)getRequiredMethodList()).basicRemove(otherEnd, msgs);
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
      case SwrtjPackage.INTERFACE__EXTENDS_LIST:
        return getExtendsList();
      case SwrtjPackage.INTERFACE__REQUIRED_METHOD_LIST:
        return getRequiredMethodList();
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
      case SwrtjPackage.INTERFACE__EXTENDS_LIST:
        getExtendsList().clear();
        getExtendsList().addAll((Collection<? extends Interface>)newValue);
        return;
      case SwrtjPackage.INTERFACE__REQUIRED_METHOD_LIST:
        getRequiredMethodList().clear();
        getRequiredMethodList().addAll((Collection<? extends Method>)newValue);
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
      case SwrtjPackage.INTERFACE__EXTENDS_LIST:
        getExtendsList().clear();
        return;
      case SwrtjPackage.INTERFACE__REQUIRED_METHOD_LIST:
        getRequiredMethodList().clear();
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
      case SwrtjPackage.INTERFACE__EXTENDS_LIST:
        return extendsList != null && !extendsList.isEmpty();
      case SwrtjPackage.INTERFACE__REQUIRED_METHOD_LIST:
        return requiredMethodList != null && !requiredMethodList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceImpl
