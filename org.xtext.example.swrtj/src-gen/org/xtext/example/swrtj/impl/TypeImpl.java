/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.swrtj.Interface;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.TypeImpl#getInterfaceType <em>Interface Type</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.TypeImpl#getPrimitiveType <em>Primitive Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The cached value of the '{@link #getInterfaceType() <em>Interface Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceType()
   * @generated
   * @ordered
   */
  protected Interface interfaceType;

  /**
   * The default value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveType()
   * @generated
   * @ordered
   */
  protected static final String PRIMITIVE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimitiveType() <em>Primitive Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimitiveType()
   * @generated
   * @ordered
   */
  protected String primitiveType = PRIMITIVE_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return SwrtjPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getInterfaceType()
  {
    if (interfaceType != null && interfaceType.eIsProxy())
    {
      InternalEObject oldInterfaceType = (InternalEObject)interfaceType;
      interfaceType = (Interface)eResolveProxy(oldInterfaceType);
      if (interfaceType != oldInterfaceType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SwrtjPackage.TYPE__INTERFACE_TYPE, oldInterfaceType, interfaceType));
      }
    }
    return interfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetInterfaceType()
  {
    return interfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceType(Interface newInterfaceType)
  {
    Interface oldInterfaceType = interfaceType;
    interfaceType = newInterfaceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.TYPE__INTERFACE_TYPE, oldInterfaceType, interfaceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimitiveType()
  {
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimitiveType(String newPrimitiveType)
  {
    String oldPrimitiveType = primitiveType;
    primitiveType = newPrimitiveType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.TYPE__PRIMITIVE_TYPE, oldPrimitiveType, primitiveType));
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
      case SwrtjPackage.TYPE__INTERFACE_TYPE:
        if (resolve) return getInterfaceType();
        return basicGetInterfaceType();
      case SwrtjPackage.TYPE__PRIMITIVE_TYPE:
        return getPrimitiveType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SwrtjPackage.TYPE__INTERFACE_TYPE:
        setInterfaceType((Interface)newValue);
        return;
      case SwrtjPackage.TYPE__PRIMITIVE_TYPE:
        setPrimitiveType((String)newValue);
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
      case SwrtjPackage.TYPE__INTERFACE_TYPE:
        setInterfaceType((Interface)null);
        return;
      case SwrtjPackage.TYPE__PRIMITIVE_TYPE:
        setPrimitiveType(PRIMITIVE_TYPE_EDEFAULT);
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
      case SwrtjPackage.TYPE__INTERFACE_TYPE:
        return interfaceType != null;
      case SwrtjPackage.TYPE__PRIMITIVE_TYPE:
        return PRIMITIVE_TYPE_EDEFAULT == null ? primitiveType != null : !PRIMITIVE_TYPE_EDEFAULT.equals(primitiveType);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (primitiveType: ");
    result.append(primitiveType);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
