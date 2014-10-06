/**
 */
package fr.labsticc.framework.constraints.model.constraints.impl;

import fr.labsticc.framework.constraints.model.constraints.AbstractModelElementsSet;
import fr.labsticc.framework.constraints.model.constraints.Cardinality;
import fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint;
import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.CardinalityConstraintImpl#getOwnedCardinality <em>Owned Cardinality</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.CardinalityConstraintImpl#getOwnedModelElementsSubset <em>Owned Model Elements Subset</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardinalityConstraintImpl extends ConstraintImpl implements CardinalityConstraint {
	/**
	 * The cached value of the '{@link #getOwnedCardinality() <em>Owned Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCardinality()
	 * @generated
	 * @ordered
	 */
	protected Cardinality ownedCardinality;

	/**
	 * The cached value of the '{@link #getOwnedModelElementsSubset() <em>Owned Model Elements Subset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModelElementsSubset()
	 * @generated
	 * @ordered
	 */
	protected AbstractModelElementsSet ownedModelElementsSubset;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.CARDINALITY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality getOwnedCardinality() {
		return ownedCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedCardinality(Cardinality newOwnedCardinality, NotificationChain msgs) {
		Cardinality oldOwnedCardinality = ownedCardinality;
		ownedCardinality = newOwnedCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_CARDINALITY, oldOwnedCardinality, newOwnedCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedCardinality(Cardinality newOwnedCardinality) {
		if (newOwnedCardinality != ownedCardinality) {
			NotificationChain msgs = null;
			if (ownedCardinality != null)
				msgs = ((InternalEObject)ownedCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_CARDINALITY, null, msgs);
			if (newOwnedCardinality != null)
				msgs = ((InternalEObject)newOwnedCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_CARDINALITY, null, msgs);
			msgs = basicSetOwnedCardinality(newOwnedCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_CARDINALITY, newOwnedCardinality, newOwnedCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractModelElementsSet getOwnedModelElementsSubset() {
		return ownedModelElementsSubset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedModelElementsSubset(AbstractModelElementsSet newOwnedModelElementsSubset, NotificationChain msgs) {
		AbstractModelElementsSet oldOwnedModelElementsSubset = ownedModelElementsSubset;
		ownedModelElementsSubset = newOwnedModelElementsSubset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET, oldOwnedModelElementsSubset, newOwnedModelElementsSubset);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedModelElementsSubset(AbstractModelElementsSet newOwnedModelElementsSubset) {
		if (newOwnedModelElementsSubset != ownedModelElementsSubset) {
			NotificationChain msgs = null;
			if (ownedModelElementsSubset != null)
				msgs = ((InternalEObject)ownedModelElementsSubset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET, null, msgs);
			if (newOwnedModelElementsSubset != null)
				msgs = ((InternalEObject)newOwnedModelElementsSubset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET, null, msgs);
			msgs = basicSetOwnedModelElementsSubset(newOwnedModelElementsSubset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET, newOwnedModelElementsSubset, newOwnedModelElementsSubset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_CARDINALITY:
				return basicSetOwnedCardinality(null, msgs);
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET:
				return basicSetOwnedModelElementsSubset(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_CARDINALITY:
				return getOwnedCardinality();
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET:
				return getOwnedModelElementsSubset();
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
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_CARDINALITY:
				setOwnedCardinality((Cardinality)newValue);
				return;
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET:
				setOwnedModelElementsSubset((AbstractModelElementsSet)newValue);
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
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_CARDINALITY:
				setOwnedCardinality((Cardinality)null);
				return;
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET:
				setOwnedModelElementsSubset((AbstractModelElementsSet)null);
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
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_CARDINALITY:
				return ownedCardinality != null;
			case ConstraintsPackage.CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET:
				return ownedModelElementsSubset != null;
		}
		return super.eIsSet(featureID);
	}

} //CardinalityConstraintImpl
