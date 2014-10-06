/**
 */
package fr.labsticc.framework.constraints.model.constraints;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumerated Model Elements Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.EnumeratedModelElementsSet#getModelElements <em>Model Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getEnumeratedModelElementsSet()
 * @model
 * @generated
 */
public interface EnumeratedModelElementsSet extends AbstractModelElementsSet {
	/**
	 * Returns the value of the '<em><b>Model Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Elements</em>' reference list.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getEnumeratedModelElementsSet_ModelElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getModelElements();

} // EnumeratedModelElementsSet
