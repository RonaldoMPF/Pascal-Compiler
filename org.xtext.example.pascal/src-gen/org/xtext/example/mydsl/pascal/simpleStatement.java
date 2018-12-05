/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>simple Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.simpleStatement#getAssignmentStatement <em>Assignment Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.simpleStatement#getProcedureStatement <em>Procedure Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.simpleStatement#getGotoStatement <em>Goto Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getsimpleStatement()
 * @model
 * @generated
 */
public interface simpleStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Assignment Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment Statement</em>' containment reference.
   * @see #setAssignmentStatement(assignmentStatement)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getsimpleStatement_AssignmentStatement()
   * @model containment="true"
   * @generated
   */
  assignmentStatement getAssignmentStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.simpleStatement#getAssignmentStatement <em>Assignment Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment Statement</em>' containment reference.
   * @see #getAssignmentStatement()
   * @generated
   */
  void setAssignmentStatement(assignmentStatement value);

  /**
   * Returns the value of the '<em><b>Procedure Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Statement</em>' containment reference.
   * @see #setProcedureStatement(procedureStatement)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getsimpleStatement_ProcedureStatement()
   * @model containment="true"
   * @generated
   */
  procedureStatement getProcedureStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.simpleStatement#getProcedureStatement <em>Procedure Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure Statement</em>' containment reference.
   * @see #getProcedureStatement()
   * @generated
   */
  void setProcedureStatement(procedureStatement value);

  /**
   * Returns the value of the '<em><b>Goto Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goto Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goto Statement</em>' containment reference.
   * @see #setGotoStatement(gotoStatement)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getsimpleStatement_GotoStatement()
   * @model containment="true"
   * @generated
   */
  gotoStatement getGotoStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.simpleStatement#getGotoStatement <em>Goto Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goto Statement</em>' containment reference.
   * @see #getGotoStatement()
   * @generated
   */
  void setGotoStatement(gotoStatement value);

} // simpleStatement
