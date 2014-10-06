/**
 */
package fr.labsticc.framework.constraints.model.constraints;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constrained Model Elements Subset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset#getOwnedConstraints <em>Owned Constraints</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getConstrainedModelElementsSubset()
 * @model
 * @generated
 */
public interface ConstrainedModelElementsSubset extends AbstractModelElementsSet {
	/**
	 * Returns the value of the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link fr.labsticc.framework.constraints.model.constraints.Constraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Constraints</em>' containment reference list.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getConstrainedModelElementsSubset_OwnedConstraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Constraint> getOwnedConstraints();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.labsticc.framework.constraints.model.constraints.ScopeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see fr.labsticc.framework.constraints.model.constraints.ScopeType
	 * @see #setScope(ScopeType)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getConstrainedModelElementsSubset_Scope()
	 * @model required="true"
	 * @generated
	 */
	ScopeType getScope();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see fr.labsticc.framework.constraints.model.constraints.ScopeType
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ScopeType value);

} // ConstrainedModelElementsSubset
