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

import org.xtext.example.swrtj.Block;
import org.xtext.example.swrtj.GenericExpression;
import org.xtext.example.swrtj.IfThenElseStatement;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If Then Else Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.IfThenElseStatementImpl#getCondiction <em>Condiction</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.IfThenElseStatementImpl#getTrueBranch <em>True Branch</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.IfThenElseStatementImpl#getFalseBranch <em>False Branch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfThenElseStatementImpl extends StatementImpl implements IfThenElseStatement
{
  /**
   * The cached value of the '{@link #getCondiction() <em>Condiction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondiction()
   * @generated
   * @ordered
   */
  protected GenericExpression condiction;

  /**
   * The cached value of the '{@link #getTrueBranch() <em>True Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrueBranch()
   * @generated
   * @ordered
   */
  protected Block trueBranch;

  /**
   * The cached value of the '{@link #getFalseBranch() <em>False Branch</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFalseBranch()
   * @generated
   * @ordered
   */
  protected Block falseBranch;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IfThenElseStatementImpl()
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
    return SwrtjPackage.Literals.IF_THEN_ELSE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenericExpression getCondiction()
  {
    return condiction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondiction(GenericExpression newCondiction, NotificationChain msgs)
  {
    GenericExpression oldCondiction = condiction;
    condiction = newCondiction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.IF_THEN_ELSE_STATEMENT__CONDICTION, oldCondiction, newCondiction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondiction(GenericExpression newCondiction)
  {
    if (newCondiction != condiction)
    {
      NotificationChain msgs = null;
      if (condiction != null)
        msgs = ((InternalEObject)condiction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.IF_THEN_ELSE_STATEMENT__CONDICTION, null, msgs);
      if (newCondiction != null)
        msgs = ((InternalEObject)newCondiction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.IF_THEN_ELSE_STATEMENT__CONDICTION, null, msgs);
      msgs = basicSetCondiction(newCondiction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.IF_THEN_ELSE_STATEMENT__CONDICTION, newCondiction, newCondiction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getTrueBranch()
  {
    return trueBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTrueBranch(Block newTrueBranch, NotificationChain msgs)
  {
    Block oldTrueBranch = trueBranch;
    trueBranch = newTrueBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.IF_THEN_ELSE_STATEMENT__TRUE_BRANCH, oldTrueBranch, newTrueBranch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrueBranch(Block newTrueBranch)
  {
    if (newTrueBranch != trueBranch)
    {
      NotificationChain msgs = null;
      if (trueBranch != null)
        msgs = ((InternalEObject)trueBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.IF_THEN_ELSE_STATEMENT__TRUE_BRANCH, null, msgs);
      if (newTrueBranch != null)
        msgs = ((InternalEObject)newTrueBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.IF_THEN_ELSE_STATEMENT__TRUE_BRANCH, null, msgs);
      msgs = basicSetTrueBranch(newTrueBranch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.IF_THEN_ELSE_STATEMENT__TRUE_BRANCH, newTrueBranch, newTrueBranch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block getFalseBranch()
  {
    return falseBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFalseBranch(Block newFalseBranch, NotificationChain msgs)
  {
    Block oldFalseBranch = falseBranch;
    falseBranch = newFalseBranch;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SwrtjPackage.IF_THEN_ELSE_STATEMENT__FALSE_BRANCH, oldFalseBranch, newFalseBranch);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFalseBranch(Block newFalseBranch)
  {
    if (newFalseBranch != falseBranch)
    {
      NotificationChain msgs = null;
      if (falseBranch != null)
        msgs = ((InternalEObject)falseBranch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.IF_THEN_ELSE_STATEMENT__FALSE_BRANCH, null, msgs);
      if (newFalseBranch != null)
        msgs = ((InternalEObject)newFalseBranch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SwrtjPackage.IF_THEN_ELSE_STATEMENT__FALSE_BRANCH, null, msgs);
      msgs = basicSetFalseBranch(newFalseBranch, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwrtjPackage.IF_THEN_ELSE_STATEMENT__FALSE_BRANCH, newFalseBranch, newFalseBranch));
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
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__CONDICTION:
        return basicSetCondiction(null, msgs);
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__TRUE_BRANCH:
        return basicSetTrueBranch(null, msgs);
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__FALSE_BRANCH:
        return basicSetFalseBranch(null, msgs);
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
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__CONDICTION:
        return getCondiction();
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__TRUE_BRANCH:
        return getTrueBranch();
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__FALSE_BRANCH:
        return getFalseBranch();
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
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__CONDICTION:
        setCondiction((GenericExpression)newValue);
        return;
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__TRUE_BRANCH:
        setTrueBranch((Block)newValue);
        return;
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__FALSE_BRANCH:
        setFalseBranch((Block)newValue);
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
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__CONDICTION:
        setCondiction((GenericExpression)null);
        return;
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__TRUE_BRANCH:
        setTrueBranch((Block)null);
        return;
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__FALSE_BRANCH:
        setFalseBranch((Block)null);
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
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__CONDICTION:
        return condiction != null;
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__TRUE_BRANCH:
        return trueBranch != null;
      case SwrtjPackage.IF_THEN_ELSE_STATEMENT__FALSE_BRANCH:
        return falseBranch != null;
    }
    return super.eIsSet(featureID);
  }

} //IfThenElseStatementImpl
