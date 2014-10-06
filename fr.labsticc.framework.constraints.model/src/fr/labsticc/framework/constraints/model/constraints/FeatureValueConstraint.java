/**
 */
package fr.labsticc.framework.constraints.model.constraints;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Value Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint#getFeature <em>Feature</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFeatureValueConstraint()
 * @model
 * @generated
 */
public interface FeatureValueConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFeatureValueConstraint_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(FormalLanguageExpression)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFeatureValueConstraint_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FormalLanguageExpression getValue();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(FormalLanguageExpression value);

} // FeatureValueConstraint
