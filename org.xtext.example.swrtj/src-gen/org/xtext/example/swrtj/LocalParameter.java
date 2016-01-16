/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.example.swrtj;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Local Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.swrtj.LocalParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.swrtj.SwrtjPackage#getLocalParameter()
 * @model
 * @generated
 */
public interface LocalParameter extends Parameter
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(GenericExpression)
   * @see org.xtext.example.swrtj.SwrtjPackage#getLocalParameter_Value()
   * @model containment="true"
   * @generated
   */
  GenericExpression getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.swrtj.LocalParameter#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(GenericExpression value);

} // LocalParameter
