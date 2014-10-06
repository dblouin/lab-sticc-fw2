/*******************************************************************************
 * Copyright (c) 2011 Lab-STICC Universite de Bretagne Sud, Lorient.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-B license available
 * at :
 * en : http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html
 * fr : http://www.cecill.info/licences/Licence_CeCILL-B_V1-fr.html
 * 
 * Contributors:
 * Dominique BLOUIN (Lab-STICC UBS), dominique.blouin@univ-ubs.fr
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.labsticc.framework.settings.model.settings.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.labsticc.framework.settings.model.settings.ModelingLanguage;
import fr.labsticc.framework.settings.model.settings.SettingsPackage;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.SettingsSpecificationImpl#getOwnedLanguages <em>Owned Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SettingsSpecificationImpl extends IdentifiedElementImpl implements SettingsSpecification {
	/**
	 * The cached value of the '{@link #getOwnedLanguages() <em>Owned Languages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLanguages()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingLanguage> ownedLanguages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingsSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SettingsPackage.Literals.SETTINGS_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelingLanguage> getOwnedLanguages() {
		if (ownedLanguages == null) {
			ownedLanguages = new EObjectContainmentWithInverseEList<ModelingLanguage>(ModelingLanguage.class, this, SettingsPackage.SETTINGS_SPECIFICATION__OWNED_LANGUAGES, SettingsPackage.MODELING_LANGUAGE__SPECIFICATION);
		}
		return ownedLanguages;
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
			case SettingsPackage.SETTINGS_SPECIFICATION__OWNED_LANGUAGES:
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
			case SettingsPackage.SETTINGS_SPECIFICATION__OWNED_LANGUAGES:
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
			case SettingsPackage.SETTINGS_SPECIFICATION__OWNED_LANGUAGES:
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
			case SettingsPackage.SETTINGS_SPECIFICATION__OWNED_LANGUAGES:
				getOwnedLanguages().clear();
				getOwnedLanguages().addAll((Collection<? extends ModelingLanguage>)newValue);
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
			case SettingsPackage.SETTINGS_SPECIFICATION__OWNED_LANGUAGES:
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
			case SettingsPackage.SETTINGS_SPECIFICATION__OWNED_LANGUAGES:
				return ownedLanguages != null && !ownedLanguages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SettingsSpecificationImpl
