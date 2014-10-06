/**
 */
package fr.labsticc.framework.constraints.model.constraints;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint#getOwnedCardinality <em>Owned Cardinality</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint#getOwnedModelElementsSubset <em>Owned Model Elements Subset</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getCardinalityConstraint()
 * @model
 * @generated
 */
public interface CardinalityConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Owned Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Cardinality</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Cardinality</em>' containment reference.
	 * @see #setOwnedCardinality(Cardinality)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getCardinalityConstraint_OwnedCardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getOwnedCardinality();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint#getOwnedCardinality <em>Owned Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Cardinality</em>' containment reference.
	 * @see #getOwnedCardinality()
	 * @generated
	 */
	void setOwnedCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Owned Model Elements Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Model Elements Subset</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Model Elements Subset</em>' containment reference.
	 * @see #setOwnedModelElementsSubset(AbstractModelElementsSet)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getCardinalityConstraint_OwnedModelElementsSubset()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AbstractModelElementsSet getOwnedModelElementsSubset();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint#getOwnedModelElementsSubset <em>Owned Model Elements Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Model Elements Subset</em>' containment reference.
	 * @see #getOwnedModelElementsSubset()
	 * @generated
	 */
	void setOwnedModelElementsSubset(AbstractModelElementsSet value);

} // CardinalityConstraint
