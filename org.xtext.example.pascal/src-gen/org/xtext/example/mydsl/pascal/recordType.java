/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>record Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.recordType#getFieldList <em>Field List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.recordType#getSemiTerminal <em>Semi Terminal</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getrecordType()
 * @model
 * @generated
 */
public interface recordType extends EObject
{
  /**
   * Returns the value of the '<em><b>Field List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field List</em>' containment reference.
   * @see #setFieldList(fieldList)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getrecordType_FieldList()
   * @model containment="true"
   * @generated
   */
  fieldList getFieldList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.recordType#getFieldList <em>Field List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field List</em>' containment reference.
   * @see #getFieldList()
   * @generated
   */
  void setFieldList(fieldList value);

  /**
   * Returns the value of the '<em><b>Semi Terminal</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Semi Terminal</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Semi Terminal</em>' attribute.
   * @see #setSemiTerminal(String)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getrecordType_SemiTerminal()
   * @model
   * @generated
   */
  String getSemiTerminal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.recordType#getSemiTerminal <em>Semi Terminal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Semi Terminal</em>' attribute.
   * @see #getSemiTerminal()
   * @generated
   */
  void setSemiTerminal(String value);

} // recordType
