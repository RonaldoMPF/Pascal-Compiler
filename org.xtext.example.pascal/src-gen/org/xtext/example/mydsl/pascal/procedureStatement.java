/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedureStatement#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedureStatement#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedureStatement()
 * @model
 * @generated
 */
public interface procedureStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(identifier)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedureStatement_Identifier()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.procedureStatement#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(identifier value);

  /**
   * Returns the value of the '<em><b>Parameter List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter List</em>' containment reference.
   * @see #setParameterList(parameterList)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedureStatement_ParameterList()
   * @model containment="true"
   * @generated
   */
  parameterList getParameterList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.procedureStatement#getParameterList <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter List</em>' containment reference.
   * @see #getParameterList()
   * @generated
   */
  void setParameterList(parameterList value);

} // procedureStatement
