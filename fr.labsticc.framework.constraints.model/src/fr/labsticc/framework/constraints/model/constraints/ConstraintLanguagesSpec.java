/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.labsticc.framework.constraints.model.constraints;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Languages Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec#getOwnedLanguages <em>Owned Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getConstraintLanguagesSpec()
 * @model
 * @generated
 */
public interface ConstraintLanguagesSpec extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Owned Languages</b></em>' containment reference list.
	 * The list contents are of type {@link fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage}.
	 * It is bidirectional and its opposite is '{@link fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Languages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Languages</em>' containment reference list.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getConstraintLanguagesSpec_OwnedLanguages()
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage#getSpecification
	 * @model opposite="specification" containment="true" required="true"
	 * @generated
	 */
	EList<ConstraintLanguage> getOwnedLanguages();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true"
	 * @generated
	 */
	ConstraintLanguage languageById(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	ConstraintLanguage languageByName(String name);

} // ConstraintLanguagesSpec
