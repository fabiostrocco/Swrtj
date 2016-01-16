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

import org.xtext.example.swrtj.Method;
import org.xtext.example.swrtj.MethodName;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.SwrtjPackage;
import org.xtext.example.swrtj.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.MethodImpl#getMethodRef <em>Method Ref</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.MethodImpl#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodImpl extends TraitElementImpl implements Method
{
  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected Type returnType;

  /**
   * The cached value of the '{@link #getMethodRef() <em>Method Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodRef()
   * @generated
   * @ordered
   */
  protected MethodName methodRef;

  /**
   * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterList()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameterList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodImpl()
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
    return SwrtjPackage.Literals.METHOD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs)
  {
    Type oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.METHOD__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(Type newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.METHOD__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.METHOD__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.METHOD__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodName getMethodRef()
  {
    return methodRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMethodRef(MethodName newMethodRef, NotificationChain msgs)
  {
    MethodName oldMethodRef = methodRef;
    methodRef = newMethodRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.METHOD__METHOD_REF, oldMethodRef, newMethodRef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethodRef(MethodName newMethodRef)
  {
    if (newMethodRef != methodRef)
    {
      NotificationChain msgs = null;
      if (methodRef != null)
        msgs = ((InternalEObject)methodRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.METHOD__METHOD_REF, null, msgs);
      if (newMethodRef != null)
        msgs = ((InternalEObject)newMethodRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.METHOD__METHOD_REF, null, msgs);
      msgs = basicSetMethodRef(newMethodRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.METHOD__METHOD_REF, newMethodRef, newMethodRef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameterList()
  {
    if (parameterList == null)
    {
      parameterList = new EObjectContainmentEList<Parameter>(Parameter.class, this, SwrtjPackage.METHOD__PARAMETER_LIST);
    }
    return parameterList;
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
      case SwrtjPackage.METHOD__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case SwrtjPackage.METHOD__METHOD_REF:
        return basicSetMethodRef(null, msgs);
      case SwrtjPackage.METHOD__PARAMETER_LIST:
        return ((InternalEList<?>)getParameterList()).basicRemove(otherEnd, msgs);
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
      case SwrtjPackage.METHOD__RETURN_TYPE:
        return getReturnType();
      case SwrtjPackage.METHOD__METHOD_REF:
        return getMethodRef();
      case SwrtjPackage.METHOD__PARAMETER_LIST:
        return getParameterList();
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
      case SwrtjPackage.METHOD__RETURN_TYPE:
        setReturnType((Type)newValue);
        return;
      case SwrtjPackage.METHOD__METHOD_REF:
        setMethodRef((MethodName)newValue);
        return;
      case SwrtjPackage.METHOD__PARAMETER_LIST:
        getParameterList().clear();
        getParameterList().addAll((Collection<? extends Parameter>)newValue);
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
      case SwrtjPackage.METHOD__RETURN_TYPE:
        setReturnType((Type)null);
        return;
      case SwrtjPackage.METHOD__METHOD_REF:
        setMethodRef((MethodName)null);
        return;
      case SwrtjPackage.METHOD__PARAMETER_LIST:
        getParameterList().clear();
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
      case SwrtjPackage.METHOD__RETURN_TYPE:
        return returnType != null;
      case SwrtjPackage.METHOD__METHOD_REF:
        return methodRef != null;
      case SwrtjPackage.METHOD__PARAMETER_LIST:
        return parameterList != null && !parameterList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MethodImpl
