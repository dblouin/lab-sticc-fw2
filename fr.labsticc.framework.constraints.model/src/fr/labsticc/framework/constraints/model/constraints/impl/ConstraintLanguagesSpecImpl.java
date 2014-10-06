/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.labsticc.framework.constraints.model.constraints.impl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec;
import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Languages Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.ConstraintLanguagesSpecImpl#getOwnedLanguages <em>Owned Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintLanguagesSpecImpl extends IdentifiedElementImpl implements ConstraintLanguagesSpec {
	/**
	 * The cached value of the '{@link #getOwnedLanguages() <em>Owned Languages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<ConstraintLanguage> ownedLanguages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintLanguagesSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.CONSTRAINT_LANGUAGES_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConstraintLanguage> getOwnedLanguages() {
		if (ownedLanguages == null) {
			ownedLanguages = new EObjectContainmentWithInverseEList<ConstraintLanguage>(ConstraintLanguage.class, this, ConstraintsPackage.CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES, ConstraintsPackage.CONSTRAINT_LANGUAGE__SPECIFICATION);
		}
		return ownedLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConstraintLanguage languageById( final String p_id ) {
		for ( final ConstraintLanguage language : getOwnedLanguages() ) {
			if ( p_id.equals( language.getId() ) ) {
				return language;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConstraintLanguage languageByName( final String p_name ) {
		for ( final ConstraintLanguage language : getOwnedLanguages() ) {
			if ( p_name.equals( language.getName() ) ) {
				return language;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintsPackage.CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedLanguages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConstraintsPackage.CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES:
				return ((InternalEList<?>)getOwnedLanguages()).basicRemove(otherEnd, msgs);
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
			case ConstraintsPackage.CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES:
				return getOwnedLanguages();
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
			case ConstraintsPackage.CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES:
				getOwnedLanguages().clear();
				getOwnedLanguages().addAll((Collection<? extends ConstraintLanguage>)newValue);
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
			case ConstraintsPackage.CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES:
				getOwnedLanguages().clear();
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
			case ConstraintsPackage.CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES:
				return ownedLanguages != null && !ownedLanguages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConstraintLanguagesSpecImpl
