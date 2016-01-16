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

import org.xtext.example.swrtj.Element;
import org.xtext.example.swrtj.File;
import org.xtext.example.swrtj.Import;
import org.xtext.example.swrtj.SwrtjPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.impl.FileImpl#getImportList <em>Import List</em>}</li>
 *   <li>{@link org.xtext.example.swrtj.impl.FileImpl#getElementList <em>Element List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileImpl extends MinimalEObjectImpl.Container implements File
{
  /**
   * The cached value of the '{@link #getImportList() <em>Import List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportList()
   * @generated
   * @ordered
   */
  protected EList<Import> importList;

  /**
   * The cached value of the '{@link #getElementList() <em>Element List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementList()
   * @generated
   * @ordered
   */
  protected EList<Element> elementList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FileImpl()
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
    return SwrtjPackage.Literals.FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImportList()
  {
    if (importList == null)
    {
      importList = new EObjectContainmentEList<Import>(Import.class, this, SwrtjPackage.FILE__IMPORT_LIST);
    }
    return importList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getElementList()
  {
    if (elementList == null)
    {
      elementList = new EObjectContainmentEList<Element>(Element.class, this, SwrtjPackage.FILE__ELEMENT_LIST);
    }
    return elementList;
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
      case SwrtjPackage.FILE__IMPORT_LIST:
        return ((InternalEList<?>)getImportList()).basicRemove(otherEnd, msgs);
      case SwrtjPackage.FILE__ELEMENT_LIST:
        return ((InternalEList<?>)getElementList()).basicRemove(otherEnd, msgs);
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
      case SwrtjPackage.FILE__IMPORT_LIST:
        return getImportList();
      case SwrtjPackage.FILE__ELEMENT_LIST:
        return getElementList();
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
      case SwrtjPackage.FILE__IMPORT_LIST:
        getImportList().clear();
        getImportList().addAll((Collection<? extends Import>)newValue);
        return;
      case SwrtjPackage.FILE__ELEMENT_LIST:
        getElementList().clear();
        getElementList().addAll((Collection<? extends Element>)newValue);
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
      case SwrtjPackage.FILE__IMPORT_LIST:
        getImportList().clear();
        return;
      case SwrtjPackage.FILE__ELEMENT_LIST:
        getElementList().clear();
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
      case SwrtjPackage.FILE__IMPORT_LIST:
        return importList != null && !importList.isEmpty();
      case SwrtjPackage.FILE__ELEMENT_LIST:
        return elementList != null && !elementList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FileImpl
