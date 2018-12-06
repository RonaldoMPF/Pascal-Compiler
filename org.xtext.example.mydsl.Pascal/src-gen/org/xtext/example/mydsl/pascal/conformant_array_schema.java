/**
 * generated by Xtext 2.11.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>conformant array schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.conformant_array_schema#getPacked_conformant_array_schema <em>Packed conformant array schema</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.conformant_array_schema#getUnpacked_conformant_array_schema <em>Unpacked conformant array schema</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getconformant_array_schema()
 * @model
 * @generated
 */
public interface conformant_array_schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Packed conformant array schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Packed conformant array schema</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Packed conformant array schema</em>' containment reference.
   * @see #setPacked_conformant_array_schema(packed_conformant_array_schema)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getconformant_array_schema_Packed_conformant_array_schema()
   * @model containment="true"
   * @generated
   */
  packed_conformant_array_schema getPacked_conformant_array_schema();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.conformant_array_schema#getPacked_conformant_array_schema <em>Packed conformant array schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Packed conformant array schema</em>' containment reference.
   * @see #getPacked_conformant_array_schema()
   * @generated
   */
  void setPacked_conformant_array_schema(packed_conformant_array_schema value);

  /**
   * Returns the value of the '<em><b>Unpacked conformant array schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unpacked conformant array schema</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unpacked conformant array schema</em>' containment reference.
   * @see #setUnpacked_conformant_array_schema(unpacked_conformant_array_schema)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getconformant_array_schema_Unpacked_conformant_array_schema()
   * @model containment="true"
   * @generated
   */
  unpacked_conformant_array_schema getUnpacked_conformant_array_schema();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.conformant_array_schema#getUnpacked_conformant_array_schema <em>Unpacked conformant array schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unpacked conformant array schema</em>' containment reference.
   * @see #getUnpacked_conformant_array_schema()
   * @generated
   */
  void setUnpacked_conformant_array_schema(unpacked_conformant_array_schema value);

} // conformant_array_schema
