/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant#getConstList <em>Const List</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant#getFieldList <em>Field List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant()
 * @model
 * @generated
 */
public interface variant extends EObject
{
  /**
   * Returns the value of the '<em><b>Const List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const List</em>' containment reference.
   * @see #setConstList(constList)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_ConstList()
   * @model containment="true"
   * @generated
   */
  constList getConstList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variant#getConstList <em>Const List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const List</em>' containment reference.
   * @see #getConstList()
   * @generated
   */
  void setConstList(constList value);

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
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_FieldList()
   * @model containment="true"
   * @generated
   */
  fieldList getFieldList();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variant#getFieldList <em>Field List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field List</em>' containment reference.
   * @see #getFieldList()
   * @generated
   */
  void setFieldList(fieldList value);
  
  caseLabelList getCaseLabelList();

  void setCase_label_list(caseLabelList value);

  fieldList getField_list();

  void setField_list(fieldList value);

} // variant
