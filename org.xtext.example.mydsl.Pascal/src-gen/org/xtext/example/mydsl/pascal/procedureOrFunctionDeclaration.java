/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>procedure Or Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedureOrFunctionDeclaration#getProcedureDeclaration <em>Procedure Declaration</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.procedureOrFunctionDeclaration#getFunctionDeclaration <em>Function Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedureOrFunctionDeclaration()
 * @model
 * @generated
 */
public interface procedureOrFunctionDeclaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Procedure Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Procedure Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Procedure Declaration</em>' containment reference.
   * @see #setProcedureDeclaration(procedureDeclaration)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedureOrFunctionDeclaration_ProcedureDeclaration()
   * @model containment="true"
   * @generated
   */
  procedureDeclaration getProcedureDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.procedureOrFunctionDeclaration#getProcedureDeclaration <em>Procedure Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Procedure Declaration</em>' containment reference.
   * @see #getProcedureDeclaration()
   * @generated
   */
  void setProcedureDeclaration(procedureDeclaration value);

  /**
   * Returns the value of the '<em><b>Function Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Declaration</em>' containment reference.
   * @see #setFunctionDeclaration(functionDeclaration)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getprocedureOrFunctionDeclaration_FunctionDeclaration()
   * @model containment="true"
   * @generated
   */
  functionDeclaration getFunctionDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.procedureOrFunctionDeclaration#getFunctionDeclaration <em>Function Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Declaration</em>' containment reference.
   * @see #getFunctionDeclaration()
   * @generated
   */
  void setFunctionDeclaration(functionDeclaration value);

} // procedureOrFunctionDeclaration
