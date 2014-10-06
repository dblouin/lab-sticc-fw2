/**
 */
package fr.labsticc.framework.constraints.model.constraints.impl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.constraints.model.constraints.TypeConstraint;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EModelElement;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.TypeConstraintImpl#getAllowedTypes <em>Allowed Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeConstraintImpl extends ConstraintImpl implements TypeConstraint {
	/**
	 * The cached value of the '{@link #getAllowedTypes() <em>Allowed Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EModelElement> allowedTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.TYPE_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EModelElement> getAllowedTypes() {
		if (allowedTypes == null) {
			allowedTypes = new EObjectResolvingEList<EModelElement>(EModelElement.class, this, ConstraintsPackage.TYPE_CONSTRAINT__ALLOWED_TYPES);
		}
		return allowedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.TYPE_CONSTRAINT__ALLOWED_TYPES:
				return getAllowedTypes();
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
			case ConstraintsPackage.TYPE_CONSTRAINT__ALLOWED_TYPES:
				getAllowedTypes().clear();
				getAllowedTypes().addAll((Collection<? extends EModelElement>)newValue);
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
			case ConstraintsPackage.TYPE_CONSTRAINT__ALLOWED_TYPES:
				getAllowedTypes().clear();
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
			case ConstraintsPackage.TYPE_CONSTRAINT__ALLOWED_TYPES:
				return allowedTypes != null && !allowedTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeConstraintImpl
