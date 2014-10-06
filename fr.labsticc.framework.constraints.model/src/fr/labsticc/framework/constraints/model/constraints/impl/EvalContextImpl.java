/**
 */
package fr.labsticc.framework.constraints.model.constraints.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.constraints.model.constraints.EvalContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eval Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.EvalContextImpl#getModelElement <em>Model Element</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.EvalContextImpl#isMetaModelElement <em>Meta Model Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvalContextImpl extends EObjectImpl implements EvalContext {
	/**
	 * The cached value of the '{@link #getModelElement() <em>Model Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelElement()
	 * @generated
	 * @ordered
	 */
	protected EObject modelElement;

	/**
	 * The default value of the '{@link #isMetaModelElement() <em>Meta Model Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetaModelElement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean META_MODEL_ELEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMetaModelElement() <em>Meta Model Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMetaModelElement()
	 * @generated
	 * @ordered
	 */
	protected boolean metaModelElement = META_MODEL_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvalContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.EVAL_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getModelElement() {
		if (modelElement != null && modelElement.eIsProxy()) {
			InternalEObject oldModelElement = (InternalEObject)modelElement;
			modelElement = eResolveProxy(oldModelElement);
			if (modelElement != oldModelElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConstraintsPackage.EVAL_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
			}
		}
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetModelElement() {
		return modelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelElement(EObject newModelElement) {
		EObject oldModelElement = modelElement;
		modelElement = newModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.EVAL_CONTEXT__MODEL_ELEMENT, oldModelElement, modelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetaModelElement() {
		return metaModelElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaModelElement(boolean newMetaModelElement) {
		boolean oldMetaModelElement = metaModelElement;
		metaModelElement = newMetaModelElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.EVAL_CONTEXT__META_MODEL_ELEMENT, oldMetaModelElement, metaModelElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.EVAL_CONTEXT__MODEL_ELEMENT:
				if (resolve) return getModelElement();
				return basicGetModelElement();
			case ConstraintsPackage.EVAL_CONTEXT__META_MODEL_ELEMENT:
				return isMetaModelElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConstraintsPackage.EVAL_CONTEXT__MODEL_ELEMENT:
				setModelElement((EObject)newValue);
				return;
			case ConstraintsPackage.EVAL_CONTEXT__META_MODEL_ELEMENT:
				setMetaModelElement((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConstraintsPackage.EVAL_CONTEXT__MODEL_ELEMENT:
				setModelElement((EObject)null);
				return;
			case ConstraintsPackage.EVAL_CONTEXT__META_MODEL_ELEMENT:
				setMetaModelElement(META_MODEL_ELEMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConstraintsPackage.EVAL_CONTEXT__MODEL_ELEMENT:
				return modelElement != null;
			case ConstraintsPackage.EVAL_CONTEXT__META_MODEL_ELEMENT:
				return metaModelElement != META_MODEL_ELEMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (metaModelElement: ");
		result.append(metaModelElement);
		result.append(')');
		return result.toString();
	}

} //EvalContextImpl
