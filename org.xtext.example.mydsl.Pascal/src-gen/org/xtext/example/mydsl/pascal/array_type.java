/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>array type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.array_type#getIndex_type <em>Index type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.array_type#getElement_type <em>Element type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getarray_type()
 * @model
 * @generated
 */
public interface array_type extends EObject
{
  /**
   * Returns the value of the '<em><b>Index type</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.index_type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index type</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getarray_type_Index_type()
   * @model containment="true"
   * @generated
   */
  EList<index_type> getIndex_type();

  /**
   * Returns the value of the '<em><b>Element type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element type</em>' containment reference.
   * @see #setElement_type(element_type)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getarray_type_Element_type()
   * @model containment="true"
   * @generated
   */
  element_type getElement_type();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.array_type#getElement_type <em>Element type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element type</em>' containment reference.
   * @see #getElement_type()
   * @generated
   */
  void setElement_type(element_type value);

} // array_type
