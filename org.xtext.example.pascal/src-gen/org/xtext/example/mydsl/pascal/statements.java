/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.statements#getStatement1 <em>Statement1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.statements#getSemiTerminal1 <em>Semi Terminal1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.statements#getStatement2 <em>Statement2</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.statements#getSemiTerminal2 <em>Semi Terminal2</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getstatements()
 * @model
 * @generated
 */
public interface statements extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement1</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement1</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement1</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getstatements_Statement1()
   * @model containment="true"
   * @generated
   */
  EList<statement> getStatement1();

  /**
   * Returns the value of the '<em><b>Semi Terminal1</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semi Terminal1</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semi Terminal1</em>' attribute list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getstatements_SemiTerminal1()
   * @model unique="false"
   * @generated
   */
  EList<String> getSemiTerminal1();

  /**
   * Returns the value of the '<em><b>Statement2</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement2</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement2</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getstatements_Statement2()
   * @model containment="true"
   * @generated
   */
  EList<statement> getStatement2();

  /**
   * Returns the value of the '<em><b>Semi Terminal2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semi Terminal2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semi Terminal2</em>' attribute.
   * @see #setSemiTerminal2(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getstatements_SemiTerminal2()
   * @model
   * @generated
   */
  String getSemiTerminal2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.statements#getSemiTerminal2 <em>Semi Terminal2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semi Terminal2</em>' attribute.
   * @see #getSemiTerminal2()
   * @generated
   */
  void setSemiTerminal2(String value);

} // statements