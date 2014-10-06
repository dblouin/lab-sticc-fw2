/**
 */
package fr.labsticc.framework.constraints.model.constraints;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eval Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.EvalContext#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.EvalContext#isMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getEvalContext()
 * @model
 * @generated
 */
public interface EvalContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Element</em>' reference.
	 * @see #setModelElement(EObject)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getEvalContext_ModelElement()
	 * @model required="true"
	 * @generated
	 */
	EObject getModelElement();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.EvalContext#getModelElement <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Element</em>' reference.
	 * @see #getModelElement()
	 * @generated
	 */
	void setModelElement(EObject value);

	/**
	 * Returns the value of the '<em><b>Meta Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Model Element</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Model Element</em>' attribute.
	 * @see #setMetaModelElement(boolean)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getEvalContext_MetaModelElement()
	 * @model required="true"
	 * @generated
	 */
	boolean isMetaModelElement();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.EvalContext#isMetaModelElement <em>Meta Model Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Model Element</em>' attribute.
	 * @see #isMetaModelElement()
	 * @generated
	 */
	void setMetaModelElement(boolean value);

} // EvalContext
