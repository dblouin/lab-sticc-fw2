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

import fr.labsticc.framework.settings.model.settings.Category;
import fr.labsticc.framework.settings.model.settings.PropertyToCategoriesAssociation;
import fr.labsticc.framework.settings.model.settings.SettingsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property To Categories Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.PropertyToCategoriesAssociationImpl#getOwnedCategories <em>Owned Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyToCategoriesAssociationImpl extends PropertyAssociationImpl implements PropertyToCategoriesAssociation {
	/**
	 * The cached value of the '{@link #getOwnedCategories() <em>Owned Categories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> ownedCategories;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyToCategoriesAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SettingsPackage.Literals.PROPERTY_TO_CATEGORIES_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getOwnedCategories() {
		if (ownedCategories == null) {
			ownedCategories = new EObjectContainmentEList<Category>(Category.class, this, SettingsPackage.PROPERTY_TO_CATEGORIES_ASSOCIATION__OWNED_CATEGORIES);
		}
		return ownedCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SettingsPackage.PROPERTY_TO_CATEGORIES_ASSOCIATION__OWNED_CATEGORIES:
				return ((InternalEList<?>)getOwnedCategories()).basicRemove(otherEnd, msgs);
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
			case SettingsPackage.PROPERTY_TO_CATEGORIES_ASSOCIATION__OWNED_CATEGORIES:
				return getOwnedCategories();
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
			case SettingsPackage.PROPERTY_TO_CATEGORIES_ASSOCIATION__OWNED_CATEGORIES:
				getOwnedCategories().clear();
				getOwnedCategories().addAll((Collection<? extends Category>)newValue);
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
			case SettingsPackage.PROPERTY_TO_CATEGORIES_ASSOCIATION__OWNED_CATEGORIES:
				getOwnedCategories().clear();
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
			case SettingsPackage.PROPERTY_TO_CATEGORIES_ASSOCIATION__OWNED_CATEGORIES:
				return ownedCategories != null && !ownedCategories.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PropertyToCategoriesAssociationImpl
