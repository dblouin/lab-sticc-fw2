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
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.labsticc.framework.settings.model.settings.ModelingLanguage;
import fr.labsticc.framework.settings.model.settings.ModelingLanguageAssociations;
import fr.labsticc.framework.settings.model.settings.PropertyToCategoriesAssociation;
import fr.labsticc.framework.settings.model.settings.ServiceDescriptor;
import fr.labsticc.framework.settings.model.settings.SettingsPackage;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Modeling Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.ModelingLanguageImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.ModelingLanguageImpl#getOwnedLanguageAssociations <em>Owned Language Associations</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.ModelingLanguageImpl#getOwnedCategoryAssociations <em>Owned Category Associations</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.ModelingLanguageImpl#getOwnedModelInterface <em>Owned Model Interface</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.ModelingLanguageImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.impl.ModelingLanguageImpl#getFileExtensions <em>File Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelingLanguageImpl extends IdentifiedElementImpl implements ModelingLanguage {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<EPackage> packages;

	/**
	 * The cached value of the '{@link #getOwnedLanguageAssociations() <em>Owned Language Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLanguageAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelingLanguageAssociations> ownedLanguageAssociations;

	/**
	 * The cached value of the '{@link #getOwnedCategoryAssociations() <em>Owned Category Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCategoryAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyToCategoriesAssociation> ownedCategoryAssociations;

	/**
	 * The cached value of the '{@link #getOwnedModelInterface() <em>Owned Model Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedModelInterface()
	 * @generated
	 * @ordered
	 */
	protected ServiceDescriptor ownedModelInterface;

	/**
	 * The cached value of the '{@link #getFileExtensions() <em>File Extensions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fileExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelingLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SettingsPackage.Literals.MODELING_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsSpecification getSpecification() {
		if (eContainerFeatureID() != SettingsPackage.MODELING_LANGUAGE__SPECIFICATION) return null;
		return (SettingsSpecification)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(SettingsSpecification newSpecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecification, SettingsPackage.MODELING_LANGUAGE__SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(SettingsSpecification newSpecification) {
		if (newSpecification != eInternalContainer() || (eContainerFeatureID() != SettingsPackage.MODELING_LANGUAGE__SPECIFICATION && newSpecification != null)) {
			if (EcoreUtil.isAncestor(this, newSpecification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, SettingsPackage.SETTINGS_SPECIFICATION__OWNED_LANGUAGES, SettingsSpecification.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.MODELING_LANGUAGE__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EPackage> getPackages() {
		if (packages == null) {
			packages = new EObjectResolvingEList<EPackage>(EPackage.class, this, SettingsPackage.MODELING_LANGUAGE__PACKAGES);
		}
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelingLanguageAssociations> getOwnedLanguageAssociations() {
		if (ownedLanguageAssociations == null) {
			ownedLanguageAssociations = new EObjectContainmentEList<ModelingLanguageAssociations>(ModelingLanguageAssociations.class, this, SettingsPackage.MODELING_LANGUAGE__OWNED_LANGUAGE_ASSOCIATIONS);
		}
		return ownedLanguageAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyToCategoriesAssociation> getOwnedCategoryAssociations() {
		if (ownedCategoryAssociations == null) {
			ownedCategoryAssociations = new EObjectContainmentEList<PropertyToCategoriesAssociation>(PropertyToCategoriesAssociation.class, this, SettingsPackage.MODELING_LANGUAGE__OWNED_CATEGORY_ASSOCIATIONS);
		}
		return ownedCategoryAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptor getOwnedModelInterface() {
		return ownedModelInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedModelInterface(ServiceDescriptor newOwnedModelInterface, NotificationChain msgs) {
		ServiceDescriptor oldOwnedModelInterface = ownedModelInterface;
		ownedModelInterface = newOwnedModelInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SettingsPackage.MODELING_LANGUAGE__OWNED_MODEL_INTERFACE, oldOwnedModelInterface, newOwnedModelInterface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedModelInterface(ServiceDescriptor newOwnedModelInterface) {
		if (newOwnedModelInterface != ownedModelInterface) {
			NotificationChain msgs = null;
			if (ownedModelInterface != null)
				msgs = ((InternalEObject)ownedModelInterface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SettingsPackage.MODELING_LANGUAGE__OWNED_MODEL_INTERFACE, null, msgs);
			if (newOwnedModelInterface != null)
				msgs = ((InternalEObject)newOwnedModelInterface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SettingsPackage.MODELING_LANGUAGE__OWNED_MODEL_INTERFACE, null, msgs);
			msgs = basicSetOwnedModelInterface(newOwnedModelInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SettingsPackage.MODELING_LANGUAGE__OWNED_MODEL_INTERFACE, newOwnedModelInterface, newOwnedModelInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFileExtensions() {
		if (fileExtensions == null) {
			fileExtensions = new EDataTypeUniqueEList<String>(String.class, this, SettingsPackage.MODELING_LANGUAGE__FILE_EXTENSIONS);
		}
		return fileExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SettingsPackage.MODELING_LANGUAGE__SPECIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecification((SettingsSpecification)otherEnd, msgs);
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
			case SettingsPackage.MODELING_LANGUAGE__OWNED_LANGUAGE_ASSOCIATIONS:
				return ((InternalEList<?>)getOwnedLanguageAssociations()).basicRemove(otherEnd, msgs);
			case SettingsPackage.MODELING_LANGUAGE__OWNED_CATEGORY_ASSOCIATIONS:
				return ((InternalEList<?>)getOwnedCategoryAssociations()).basicRemove(otherEnd, msgs);
			case SettingsPackage.MODELING_LANGUAGE__OWNED_MODEL_INTERFACE:
				return basicSetOwnedModelInterface(null, msgs);
			case SettingsPackage.MODELING_LANGUAGE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SettingsPackage.MODELING_LANGUAGE__SPECIFICATION:
				return eInternalContainer().eInverseRemove(this, SettingsPackage.SETTINGS_SPECIFICATION__OWNED_LANGUAGES, SettingsSpecification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SettingsPackage.MODELING_LANGUAGE__PACKAGES:
				return getPackages();
			case SettingsPackage.MODELING_LANGUAGE__OWNED_LANGUAGE_ASSOCIATIONS:
				return getOwnedLanguageAssociations();
			case SettingsPackage.MODELING_LANGUAGE__OWNED_CATEGORY_ASSOCIATIONS:
				return getOwnedCategoryAssociations();
			case SettingsPackage.MODELING_LANGUAGE__OWNED_MODEL_INTERFACE:
				return getOwnedModelInterface();
			case SettingsPackage.MODELING_LANGUAGE__SPECIFICATION:
				return getSpecification();
			case SettingsPackage.MODELING_LANGUAGE__FILE_EXTENSIONS:
				return getFileExtensions();
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
			case SettingsPackage.MODELING_LANGUAGE__PACKAGES:
				getPackages().clear();
				getPackages().addAll((Collection<? extends EPackage>)newValue);
				return;
			case SettingsPackage.MODELING_LANGUAGE__OWNED_LANGUAGE_ASSOCIATIONS:
				getOwnedLanguageAssociations().clear();
				getOwnedLanguageAssociations().addAll((Collection<? extends ModelingLanguageAssociations>)newValue);
				return;
			case SettingsPackage.MODELING_LANGUAGE__OWNED_CATEGORY_ASSOCIATIONS:
				getOwnedCategoryAssociations().clear();
				getOwnedCategoryAssociations().addAll((Collection<? extends PropertyToCategoriesAssociation>)newValue);
				return;
			case SettingsPackage.MODELING_LANGUAGE__OWNED_MODEL_INTERFACE:
				setOwnedModelInterface((ServiceDescriptor)newValue);
				return;
			case SettingsPackage.MODELING_LANGUAGE__SPECIFICATION:
				setSpecification((SettingsSpecification)newValue);
				return;
			case SettingsPackage.MODELING_LANGUAGE__FILE_EXTENSIONS:
				getFileExtensions().clear();
				getFileExtensions().addAll((Collection<? extends String>)newValue);
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
			case SettingsPackage.MODELING_LANGUAGE__PACKAGES:
				getPackages().clear();
				return;
			case SettingsPackage.MODELING_LANGUAGE__OWNED_LANGUAGE_ASSOCIATIONS:
				getOwnedLanguageAssociations().clear();
				return;
			case SettingsPackage.MODELING_LANGUAGE__OWNED_CATEGORY_ASSOCIATIONS:
				getOwnedCategoryAssociations().clear();
				return;
			case SettingsPackage.MODELING_LANGUAGE__OWNED_MODEL_INTERFACE:
				setOwnedModelInterface((ServiceDescriptor)null);
				return;
			case SettingsPackage.MODELING_LANGUAGE__SPECIFICATION:
				setSpecification((SettingsSpecification)null);
				return;
			case SettingsPackage.MODELING_LANGUAGE__FILE_EXTENSIONS:
				getFileExtensions().clear();
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
			case SettingsPackage.MODELING_LANGUAGE__PACKAGES:
				return packages != null && !packages.isEmpty();
			case SettingsPackage.MODELING_LANGUAGE__OWNED_LANGUAGE_ASSOCIATIONS:
				return ownedLanguageAssociations != null && !ownedLanguageAssociations.isEmpty();
			case SettingsPackage.MODELING_LANGUAGE__OWNED_CATEGORY_ASSOCIATIONS:
				return ownedCategoryAssociations != null && !ownedCategoryAssociations.isEmpty();
			case SettingsPackage.MODELING_LANGUAGE__OWNED_MODEL_INTERFACE:
				return ownedModelInterface != null;
			case SettingsPackage.MODELING_LANGUAGE__SPECIFICATION:
				return getSpecification() != null;
			case SettingsPackage.MODELING_LANGUAGE__FILE_EXTENSIONS:
				return fileExtensions != null && !fileExtensions.isEmpty();
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
		result.append(" (fileExtensions: ");
		result.append(fileExtensions);
		result.append(')');
		return result.toString();
	}

} //ModelingLanguageImpl
