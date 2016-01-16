/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.swrtj.GenericExpression;
import org.xtext.example.swrtj.NestedBooleanExpression;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nested Boolean Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.NestedBooleanExpressionImpl#getNestedExpression <em>Nested Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedBooleanExpressionImpl extends AtomicBooleanExpressionImpl implements NestedBooleanExpression
{
  /**
   * The cached value of the '{@link #getNestedExpression() <em>Nested Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedExpression()
   * @generated
   * @ordered
   */
  protected GenericExpression nestedExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NestedBooleanExpressionImpl()
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
    return SwrtjPackage.Literals.NESTED_BOOLEAN_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getNestedExpression()
  {
    return nestedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNestedExpression(GenericExpression newNestedExpression, NotificationChain msgs)
  {
    GenericExpression oldNestedExpression = nestedExpression;
    nestedExpression = newNestedExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION, oldNestedExpression, newNestedExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNestedExpression(GenericExpression newNestedExpression)
  {
    if (newNestedExpression != nestedExpression)
    {
      NotificationChain msgs = null;
      if (nestedExpression != null)
        msgs = ((InternalEObject)nestedExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION, null, msgs);
      if (newNestedExpression != null)
        msgs = ((InternalEObject)newNestedExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION, null, msgs);
      msgs = basicSetNestedExpression(newNestedExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION, newNestedExpression, newNestedExpression));
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
      case SwrtjPackage.NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION:
        return basicSetNestedExpression(null, msgs);
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
      case SwrtjPackage.NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION:
        return getNestedExpression();
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
      case SwrtjPackage.NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION:
        setNestedExpression((GenericExpression)newValue);
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
      case SwrtjPackage.NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION:
        setNestedExpression((GenericExpression)null);
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
      case SwrtjPackage.NESTED_BOOLEAN_EXPRESSION__NESTED_EXPRESSION:
        return nestedExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //NestedBooleanExpressionImpl
