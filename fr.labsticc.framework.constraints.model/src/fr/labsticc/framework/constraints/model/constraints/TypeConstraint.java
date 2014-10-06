/**
 */
package fr.labsticc.framework.constraints.model.constraints;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EModelElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.TypeConstraint#getAllowedTypes <em>Allowed Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getTypeConstraint()
 * @model
 * @generated
 */
public interface TypeConstraint extends Constraint {
	/**
	 * Returns the value of the '<em><b>Allowed Types</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EModelElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Types</em>' reference list.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getTypeConstraint_AllowedTypes()
	 * @model
	 * @generated
	 */
	EList<EModelElement> getAllowedTypes();

} // TypeConstraint
