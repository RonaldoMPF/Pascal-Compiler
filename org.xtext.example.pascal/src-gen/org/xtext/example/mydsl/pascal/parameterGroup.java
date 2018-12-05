/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>parameter Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.parameterGroup#getIdentifierList <em>Identifier List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.parameterGroup#getTypeIdentifier <em>Type Identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getparameterGroup()
 * @model
 * @generated
 */
public interface parameterGroup extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier List</em>' containment reference.
   * @see #setIdentifierList(identifierList)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getparameterGroup_IdentifierList()
   * @model containment="true"
   * @generated
   */
  identifierList getIdentifierList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.parameterGroup#getIdentifierList <em>Identifier List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier List</em>' containment reference.
   * @see #getIdentifierList()
   * @generated
   */
  void setIdentifierList(identifierList value);

  /**
   * Returns the value of the '<em><b>Type Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Identifier</em>' containment reference.
   * @see #setTypeIdentifier(typeIdentifier)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getparameterGroup_TypeIdentifier()
   * @model containment="true"
   * @generated
   */
  typeIdentifier getTypeIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.parameterGroup#getTypeIdentifier <em>Type Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Identifier</em>' containment reference.
   * @see #getTypeIdentifier()
   * @generated
   */
  void setTypeIdentifier(typeIdentifier value);

} // parameterGroup
