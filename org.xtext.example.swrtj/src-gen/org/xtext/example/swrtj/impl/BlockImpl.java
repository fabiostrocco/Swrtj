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

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.swrtj.Block;
import org.xtext.example.swrtj.Parameter;
import org.xtext.example.swrtj.Statement;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.BlockImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.BlockImpl#getStatementList <em>Statement List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends MinimalEObjectImpl.Container implements Block
{
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
   * The cached value of the '{@link #getStatementList() <em>Statement List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatementList()
   * @generated
   * @ordered
   */
  protected EList<Statement> statementList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BlockImpl()
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
    return SwrtjPackage.Literals.BLOCK;
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
      parameterList = new EObjectContainmentEList<Parameter>(Parameter.class, this, SwrtjPackage.BLOCK__PARAMETER_LIST);
    }
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatementList()
  {
    if (statementList == null)
    {
      statementList = new EObjectContainmentEList<Statement>(Statement.class, this, SwrtjPackage.BLOCK__STATEMENT_LIST);
    }
    return statementList;
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
      case SwrtjPackage.BLOCK__PARAMETER_LIST:
        return ((InternalEList<?>)getParameterList()).basicRemove(otherEnd, msgs);
      case SwrtjPackage.BLOCK__STATEMENT_LIST:
        return ((InternalEList<?>)getStatementList()).basicRemove(otherEnd, msgs);
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
      case SwrtjPackage.BLOCK__PARAMETER_LIST:
        return getParameterList();
      case SwrtjPackage.BLOCK__STATEMENT_LIST:
        return getStatementList();
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
      case SwrtjPackage.BLOCK__PARAMETER_LIST:
        getParameterList().clear();
        getParameterList().addAll((Collection<? extends Parameter>)newValue);
        return;
      case SwrtjPackage.BLOCK__STATEMENT_LIST:
        getStatementList().clear();
        getStatementList().addAll((Collection<? extends Statement>)newValue);
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
      case SwrtjPackage.BLOCK__PARAMETER_LIST:
        getParameterList().clear();
        return;
      case SwrtjPackage.BLOCK__STATEMENT_LIST:
        getStatementList().clear();
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
      case SwrtjPackage.BLOCK__PARAMETER_LIST:
        return parameterList != null && !parameterList.isEmpty();
      case SwrtjPackage.BLOCK__STATEMENT_LIST:
        return statementList != null && !statementList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //BlockImpl
