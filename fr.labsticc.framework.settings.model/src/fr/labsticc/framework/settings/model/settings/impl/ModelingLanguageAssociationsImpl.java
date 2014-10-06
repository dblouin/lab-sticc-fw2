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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.labsticc.framework.settings.model.settings.ModelingLanguage;
import fr.labsticc.framework.settings.model.settings.ModelingLanguageAssociations;
import fr.labsticc.framework.settings.model.settings.PropertyToTypesAssociation;
import fr.labsticc.framework.settings.model.settings.SettingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Language Associations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.ModelingLanguageAssociationsImpl#getTargetLanguage <em>Target Language</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.ModelingLanguageAssociationsImpl#getOwnedPropToTypesAssociations <em>Owned Prop To Types Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingLanguageAssociationsImpl extends IdentifiedElementImpl implements ModelingLanguageAssociations {
	/**
	 * The cached value of the '{@link #getTargetLanguage() <em>Target Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetLanguage()
	 * @generated
	 * @ordered
	 */
	protected ModelingLanguage targetLanguage;
	/**
	 * The cached value of the '{@link #getOwnedPropToTypesAssociations() <em>Owned Prop To Types Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropToTypesAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyToTypesAssociation> ownedPropToTypesAssociations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingLanguageAssociationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SettingsPackage.Literals.MODELING_LANGUAGE_ASSOCIATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingLanguage getTargetLanguage() {
		if (targetLanguage != null && targetLanguage.eIsProxy()) {
			InternalEObject oldTargetLanguage = (InternalEObject)targetLanguage;
			targetLanguage = (ModelingLanguage)eResolveProxy(oldTargetLanguage);
			if (targetLanguage != oldTargetLanguage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__TARGET_LANGUAGE, oldTargetLanguage, targetLanguage));
			}
		}
		return targetLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelingLanguage basicGetTargetLanguage() {
		return targetLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetLanguage(ModelingLanguage newTargetLanguage) {
		ModelingLanguage oldTargetLanguage = targetLanguage;
		targetLanguage = newTargetLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__TARGET_LANGUAGE, oldTargetLanguage, targetLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyToTypesAssociation> getOwnedPropToTypesAssociations() {
		if (ownedPropToTypesAssociations == null) {
			ownedPropToTypesAssociations = new EObjectContainmentWithInverseEList<PropertyToTypesAssociation>(PropertyToTypesAssociation.class, this, SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__OWNED_PROP_TO_TYPES_ASSOCIATIONS, SettingsPackage.PROPERTY_TO_TYPES_ASSOCIATION__PARENT);
		}
		return ownedPropToTypesAssociations;
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
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__OWNED_PROP_TO_TYPES_ASSOCIATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedPropToTypesAssociations()).basicAdd(otherEnd, msgs);
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
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__OWNED_PROP_TO_TYPES_ASSOCIATIONS:
				return ((InternalEList<?>)getOwnedPropToTypesAssociations()).basicRemove(otherEnd, msgs);
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
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__TARGET_LANGUAGE:
				if (resolve) return getTargetLanguage();
				return basicGetTargetLanguage();
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__OWNED_PROP_TO_TYPES_ASSOCIATIONS:
				return getOwnedPropToTypesAssociations();
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
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__TARGET_LANGUAGE:
				setTargetLanguage((ModelingLanguage)newValue);
				return;
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__OWNED_PROP_TO_TYPES_ASSOCIATIONS:
				getOwnedPropToTypesAssociations().clear();
				getOwnedPropToTypesAssociations().addAll((Collection<? extends PropertyToTypesAssociation>)newValue);
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
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__TARGET_LANGUAGE:
				setTargetLanguage((ModelingLanguage)null);
				return;
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__OWNED_PROP_TO_TYPES_ASSOCIATIONS:
				getOwnedPropToTypesAssociations().clear();
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
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__TARGET_LANGUAGE:
				return targetLanguage != null;
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS__OWNED_PROP_TO_TYPES_ASSOCIATIONS:
				return ownedPropToTypesAssociations != null && !ownedPropToTypesAssociations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelingLanguageAssociationsImpl
