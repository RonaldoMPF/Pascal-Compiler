/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>set type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.set_type#getBase_type <em>Base type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getset_type()
 * @model
 * @generated
 */
public interface set_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Base type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Base type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Base type</em>' containment reference.
   * @see #setBase_type(base_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getset_type_Base_type()
   * @model containment="true"
   * @generated
   */
  base_type getBase_type();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.set_type#getBase_type <em>Base type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Base type</em>' containment reference.
   * @see #getBase_type()
   * @generated
   */
  void setBase_type(base_type value);

} // set_type
