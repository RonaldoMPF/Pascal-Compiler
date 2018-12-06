/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.pascal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>repeat Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.pascal.repeatStatement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.pascal.repeatStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.pascal.PascalPackage#getrepeatStatement()
 * @model
 * @generated
 */
public interface repeatStatement extends repetetiveStatement
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(statements)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getrepeatStatement_Statement()
   * @model containment="true"
   * @generated
   */
  statements getStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.repeatStatement#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(statements value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see org.xtext.example.mydsl.pascal.PascalPackage#getrepeatStatement_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.pascal.repeatStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

} // repeatStatement