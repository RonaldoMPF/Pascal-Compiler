/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>label Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.labelStart#getUnsignedInteger <em>Unsigned Integer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getlabelStart()
 * @model
 * @generated
 */
public interface labelStart extends EObject
{
  /**
   * Returns the value of the '<em><b>Unsigned Integer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unsigned Integer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unsigned Integer</em>' containment reference.
   * @see #setUnsignedInteger(unsignedInteger)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getlabelStart_UnsignedInteger()
   * @model containment="true"
   * @generated
   */
  unsignedInteger getUnsignedInteger();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.labelStart#getUnsignedInteger <em>Unsigned Integer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unsigned Integer</em>' containment reference.
   * @see #getUnsignedInteger()
   * @generated
   */
  void setUnsignedInteger(unsignedInteger value);

} // labelStart
