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
package fr.labsticc.framework.settings.model.settings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.ModelingLanguage#getPackages <em>Packages</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.ModelingLanguage#getOwnedLanguageAssociations <em>Owned Language Associations</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.ModelingLanguage#getOwnedCategoryAssociations <em>Owned Category Associations</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.ModelingLanguage#getOwnedModelInterface <em>Owned Model Interface</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.ModelingLanguage#getSpecification <em>Specification</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.ModelingLanguage#getFileExtensions <em>File Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguage()
 * @model
 * @generated
 */
public interface ModelingLanguage extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.labsticc.framework.settings.model.settings.SettingsSpecification#getOwnedLanguages <em>Owned Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' container reference.
	 * @see #setSpecification(SettingsSpecification)
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguage_Specification()
	 * @see fr.labsticc.framework.settings.model.settings.SettingsSpecification#getOwnedLanguages
	 * @model opposite="ownedLanguages" required="true" transient="false"
	 * @generated
	 */
	SettingsSpecification getSpecification();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.settings.model.settings.ModelingLanguage#getSpecification <em>Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' container reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(SettingsSpecification value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference list.
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguage_Packages()
	 * @model required="true"
	 * @generated
	 */
	EList<EPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Owned Language Associations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.labsticc.framework.settings.model.settings.ModelingLanguageAssociations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Language Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Language Associations</em>' containment reference list.
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguage_OwnedLanguageAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelingLanguageAssociations> getOwnedLanguageAssociations();

	/**
	 * Returns the value of the '<em><b>Owned Category Associations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.labsticc.framework.settings.model.settings.PropertyToCategoriesAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Category Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Category Associations</em>' containment reference list.
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguage_OwnedCategoryAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<PropertyToCategoriesAssociation> getOwnedCategoryAssociations();

	/**
	 * Returns the value of the '<em><b>Owned Model Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Model Interface</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Model Interface</em>' containment reference.
	 * @see #setOwnedModelInterface(ServiceDescriptor)
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguage_OwnedModelInterface()
	 * @model containment="true"
	 * @generated
	 */
	ServiceDescriptor getOwnedModelInterface();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.settings.model.settings.ModelingLanguage#getOwnedModelInterface <em>Owned Model Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Model Interface</em>' containment reference.
	 * @see #getOwnedModelInterface()
	 * @generated
	 */
	void setOwnedModelInterface(ServiceDescriptor value);

	/**
	 * Returns the value of the '<em><b>File Extensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Extensions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Extensions</em>' attribute list.
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguage_FileExtensions()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getFileExtensions();

} // ModelingLanguage
