/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>formal Parameter Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.formalParameterSection#getParameterGroup <em>Parameter Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getformalParameterSection()
 * @model
 * @generated
 */
public interface formalParameterSection extends EObject
{
  /**
   * Returns the value of the '<em><b>Parameter Group</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter Group</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter Group</em>' containment reference.
   * @see #setParameterGroup(parameterGroup)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getformalParameterSection_ParameterGroup()
   * @model containment="true"
   * @generated
   */
  parameterGroup getParameterGroup();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.formalParameterSection#getParameterGroup <em>Parameter Group</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter Group</em>' containment reference.
   * @see #getParameterGroup()
   * @generated
   */
  void setParameterGroup(parameterGroup value);

} // formalParameterSection