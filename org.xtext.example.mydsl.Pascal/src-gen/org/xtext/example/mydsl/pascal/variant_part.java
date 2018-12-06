/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>variant part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant_part#getTag_field <em>Tag field</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant_part#getType_identifier <em>Type identifier</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.variant_part#getVariant <em>Variant</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_part()
 * @model
 * @generated
 */
public interface variant_part extends EObject
{
  /**
   * Returns the value of the '<em><b>Tag field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tag field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tag field</em>' containment reference.
   * @see #setTag_field(tag_field)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_part_Tag_field()
   * @model containment="true"
   * @generated
   */
  tag_field getTag_field();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variant_part#getTag_field <em>Tag field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tag field</em>' containment reference.
   * @see #getTag_field()
   * @generated
   */
  void setTag_field(tag_field value);

  /**
   * Returns the value of the '<em><b>Type identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type identifier</em>' containment reference.
   * @see #setType_identifier(type_identifier)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_part_Type_identifier()
   * @model containment="true"
   * @generated
   */
  type_identifier getType_identifier();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.variant_part#getType_identifier <em>Type identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type identifier</em>' containment reference.
   * @see #getType_identifier()
   * @generated
   */
  void setType_identifier(type_identifier value);

  /**
   * Returns the value of the '<em><b>Variant</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.pascal.variant}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variant</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variant</em>' containment reference list.
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getvariant_part_Variant()
   * @model containment="true"
   * @generated
   */
  EList<variant> getVariant();

} // variant_part
