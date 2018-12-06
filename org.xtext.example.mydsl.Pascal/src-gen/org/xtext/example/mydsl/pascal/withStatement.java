/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>with Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.withStatement#getRecordVariableList <em>Record Variable List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.withStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getwithStatement()
 * @model
 * @generated
 */
public interface withStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Record Variable List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Record Variable List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Record Variable List</em>' containment reference.
   * @see #setRecordVariableList(recordVariableList)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getwithStatement_RecordVariableList()
   * @model containment="true"
   * @generated
   */
  recordVariableList getRecordVariableList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.withStatement#getRecordVariableList <em>Record Variable List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Record Variable List</em>' containment reference.
   * @see #getRecordVariableList()
   * @generated
   */
  void setRecordVariableList(recordVariableList value);

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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getwithStatement_Statement()
   * @model containment="true"
   * @generated
   */
  statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.withStatement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(statement value);

} // withStatement