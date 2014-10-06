/**
 */
package fr.labsticc.framework.constraints.model.constraints.impl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.constraints.model.constraints.Diagnostic;

import fr.labsticc.framework.constraints.model.constraints.ValidationStatus;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.DiagnosticImpl#getValidationStatus <em>Validation Status</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.DiagnosticImpl#getRelatedModelElements <em>Related Model Elements</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.DiagnosticImpl#isValid <em>Valid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticImpl extends IdentifiedElementImpl implements Diagnostic {
	/**
	 * The default value of the '{@link #getValidationStatus() <em>Validation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ValidationStatus VALIDATION_STATUS_EDEFAULT = ValidationStatus.VALID;
	/**
	 * The cached value of the '{@link #getValidationStatus() <em>Validation Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidationStatus()
	 * @generated
	 * @ordered
	 */
	protected ValidationStatus validationStatus = VALIDATION_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedModelElements() <em>Related Model Elements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedModelElements()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> relatedModelElements;

	/**
	 * The default value of the '{@link #isValid() <em>Valid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALID_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.DIAGNOSTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getRelatedModelElements() {
		if (relatedModelElements == null) {
			relatedModelElements = new EObjectResolvingEList<EObject>(EObject.class, this, ConstraintsPackage.DIAGNOSTIC__RELATED_MODEL_ELEMENTS);
		}
		return relatedModelElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isValid() {
		if ( getValidationStatus() == null ) {
			return false;
		}
		
		switch ( getValidationStatus() ) {
			case VALID:
			case NOT_APPLICABLE:
				return true;
	
			default:
				return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationStatus getValidationStatus() {
		return validationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidationStatus(ValidationStatus newValidationStatus) {
		ValidationStatus oldValidationStatus = validationStatus;
		validationStatus = newValidationStatus == null ? VALIDATION_STATUS_EDEFAULT : newValidationStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.DIAGNOSTIC__VALIDATION_STATUS, oldValidationStatus, validationStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.DIAGNOSTIC__VALIDATION_STATUS:
				return getValidationStatus();
			case ConstraintsPackage.DIAGNOSTIC__RELATED_MODEL_ELEMENTS:
				return getRelatedModelElements();
			case ConstraintsPackage.DIAGNOSTIC__VALID:
				return isValid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConstraintsPackage.DIAGNOSTIC__VALIDATION_STATUS:
				setValidationStatus((ValidationStatus)newValue);
				return;
			case ConstraintsPackage.DIAGNOSTIC__RELATED_MODEL_ELEMENTS:
				getRelatedModelElements().clear();
				getRelatedModelElements().addAll((Collection<? extends EObject>)newValue);
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
			case ConstraintsPackage.DIAGNOSTIC__VALIDATION_STATUS:
				setValidationStatus(VALIDATION_STATUS_EDEFAULT);
				return;
			case ConstraintsPackage.DIAGNOSTIC__RELATED_MODEL_ELEMENTS:
				getRelatedModelElements().clear();
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
			case ConstraintsPackage.DIAGNOSTIC__VALIDATION_STATUS:
				return validationStatus != VALIDATION_STATUS_EDEFAULT;
			case ConstraintsPackage.DIAGNOSTIC__RELATED_MODEL_ELEMENTS:
				return relatedModelElements != null && !relatedModelElements.isEmpty();
			case ConstraintsPackage.DIAGNOSTIC__VALID:
				return isValid() != VALID_EDEFAULT;
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
		result.append(" (validationStatus: ");
		result.append(validationStatus);
		result.append(')');
		return result.toString();
	}

} //DiagnosticImpl
