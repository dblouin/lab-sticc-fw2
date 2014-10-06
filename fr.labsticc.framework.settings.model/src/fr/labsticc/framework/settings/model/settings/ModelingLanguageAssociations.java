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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Modeling Language Associations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.ModelingLanguageAssociations#getTargetLanguage <em>Target Language</em>}</li>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.ModelingLanguageAssociations#getOwnedPropToTypesAssociations <em>Owned Prop To Types Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguageAssociations()
 * @model
 * @generated
 */
public interface ModelingLanguageAssociations extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Target Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Language</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Language</em>' reference.
	 * @see #setTargetLanguage(ModelingLanguage)
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguageAssociations_TargetLanguage()
	 * @model required="true"
	 * @generated
	 */
	ModelingLanguage getTargetLanguage();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.settings.model.settings.ModelingLanguageAssociations#getTargetLanguage <em>Target Language</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Language</em>' reference.
	 * @see #getTargetLanguage()
	 * @generated
	 */
	void setTargetLanguage(ModelingLanguage value);

	/**
	 * Returns the value of the '<em><b>Owned Prop To Types Associations</b></em>' containment reference list.
	 * The list contents are of type {@link fr.labsticc.framework.settings.model.settings.PropertyToTypesAssociation}.
	 * It is bidirectional and its opposite is '{@link fr.labsticc.framework.settings.model.settings.PropertyToTypesAssociation#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Prop To Types Associations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Prop To Types Associations</em>' containment reference list.
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getModelingLanguageAssociations_OwnedPropToTypesAssociations()
	 * @see fr.labsticc.framework.settings.model.settings.PropertyToTypesAssociation#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<PropertyToTypesAssociation> getOwnedPropToTypesAssociations();

} // ModelingLanguageAssociations
