/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>case limb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.case_limb#getCase_label_list <em>Case label list</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.case_limb#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getcase_limb()
 * @model
 * @generated
 */
public interface case_limb extends EObject
{
  /**
   * Returns the value of the '<em><b>Case label list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Case label list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case label list</em>' containment reference.
   * @see #setCase_label_list(case_label_list)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getcase_limb_Case_label_list()
   * @model containment="true"
   * @generated
   */
  case_label_list getCase_label_list();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.case_limb#getCase_label_list <em>Case label list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case label list</em>' containment reference.
   * @see #getCase_label_list()
   * @generated
   */
  void setCase_label_list(case_label_list value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(statement)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getcase_limb_Statement()
   * @model containment="true"
   * @generated
   */
  statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.case_limb#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(statement value);

} // case_limb