/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>const List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.constList#getConstant1 <em>Constant1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.constList#getCommaTerminal <em>Comma Terminal</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.constList#getConstant2 <em>Constant2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getconstList()
 * @model
 * @generated
 */
public interface constList extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant1</em>' containment reference.
   * @see #setConstant1(constant)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getconstList_Constant1()
   * @model containment="true"
   * @generated
   */
  constant getConstant1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.constList#getConstant1 <em>Constant1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant1</em>' containment reference.
   * @see #getConstant1()
   * @generated
   */
  void setConstant1(constant value);

  /**
   * Returns the value of the '<em><b>Comma Terminal</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comma Terminal</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comma Terminal</em>' attribute list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getconstList_CommaTerminal()
   * @model unique="false"
   * @generated
   */
  EList<String> getCommaTerminal();

  /**
   * Returns the value of the '<em><b>Constant2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.constant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant2</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getconstList_Constant2()
   * @model containment="true"
   * @generated
   */
  EList<constant> getConstant2();

} // constList
