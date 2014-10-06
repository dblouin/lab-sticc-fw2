/**
 */
package fr.labsticc.framework.constraints.model.constraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Language Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFormalLanguageConstraint()
 * @model
 * @generated
 */
public interface FormalLanguageConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(FormalLanguageExpression)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFormalLanguageConstraint_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormalLanguageExpression getExpression();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(FormalLanguageExpression value);

} // FormalLanguageConstraint
