/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.variable#getIdentifier1 <em>Identifier1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.variable#getIdentifier2 <em>Identifier2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.variable#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.variable#getIdentifier3 <em>Identifier3</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariable()
 * @model
 * @generated
 */
public interface variable extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier1</em>' containment reference.
   * @see #setIdentifier1(identifier)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariable_Identifier1()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifier1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variable#getIdentifier1 <em>Identifier1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier1</em>' containment reference.
   * @see #getIdentifier1()
   * @generated
   */
  void setIdentifier1(identifier value);

  /**
   * Returns the value of the '<em><b>Identifier2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier2</em>' containment reference.
   * @see #setIdentifier2(identifier)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariable_Identifier2()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifier2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variable#getIdentifier2 <em>Identifier2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier2</em>' containment reference.
   * @see #getIdentifier2()
   * @generated
   */
  void setIdentifier2(identifier value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariable_Expression()
   * @model containment="true"
   * @generated
   */
  EList<expression> getExpression();

  /**
   * Returns the value of the '<em><b>Identifier3</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.identifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier3</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier3</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariable_Identifier3()
   * @model containment="true"
   * @generated
   */
  EList<identifier> getIdentifier3();

} // variable