/**
 */
package fr.labsticc.framework.constraints.model.constraints;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.Diagnostic#getValidationStatus <em>Validation Status</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.Diagnostic#getRelatedModelElements <em>Related Model Elements</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.Diagnostic#isValid <em>Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getDiagnostic()
 * @model
 * @generated
 */
public interface Diagnostic extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Related Model Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Model Elements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Model Elements</em>' reference list.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getDiagnostic_RelatedModelElements()
	 * @model
	 * @generated
	 */
	EList<EObject> getRelatedModelElements();

	/**
	 * Returns the value of the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valid</em>' attribute.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getDiagnostic_Valid()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isValid();

	/**
	 * Returns the value of the '<em><b>Validation Status</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.labsticc.framework.constraints.model.constraints.ValidationStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Status</em>' attribute.
	 * @see fr.labsticc.framework.constraints.model.constraints.ValidationStatus
	 * @see #setValidationStatus(ValidationStatus)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getDiagnostic_ValidationStatus()
	 * @model required="true"
	 * @generated
	 */
	ValidationStatus getValidationStatus();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.Diagnostic#getValidationStatus <em>Validation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Status</em>' attribute.
	 * @see fr.labsticc.framework.constraints.model.constraints.ValidationStatus
	 * @see #getValidationStatus()
	 * @generated
	 */
	void setValidationStatus(ValidationStatus value);

} // Diagnostic
