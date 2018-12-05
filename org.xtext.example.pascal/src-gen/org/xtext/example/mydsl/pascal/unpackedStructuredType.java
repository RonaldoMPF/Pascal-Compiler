/**
 * generated by Xtext 2.16.0-SNAPSHOT
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>unpacked Structured Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.unpackedStructuredType#getUnpackedStructuredType <em>Unpacked Structured Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpackedStructuredType()
 * @model
 * @generated
 */
public interface unpackedStructuredType extends EObject
{
  /**
   * Returns the value of the '<em><b>Unpacked Structured Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unpacked Structured Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unpacked Structured Type</em>' containment reference.
   * @see #setUnpackedStructuredType(recordType)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getunpackedStructuredType_UnpackedStructuredType()
   * @model containment="true"
   * @generated
   */
  recordType getUnpackedStructuredType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.unpackedStructuredType#getUnpackedStructuredType <em>Unpacked Structured Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unpacked Structured Type</em>' containment reference.
   * @see #getUnpackedStructuredType()
   * @generated
   */
  void setUnpackedStructuredType(recordType value);

} // unpackedStructuredType