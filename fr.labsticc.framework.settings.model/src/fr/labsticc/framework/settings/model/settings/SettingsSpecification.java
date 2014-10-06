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
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.SettingsSpecification#getOwnedLanguages <em>Owned Languages</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getSettingsSpecification()
 * @model
 * @generated
 */
public interface SettingsSpecification extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Owned Languages</b></em>' containment reference list.
	 * The list contents are of type {@link fr.labsticc.framework.settings.model.settings.ModelingLanguage}.
	 * It is bidirectional and its opposite is '{@link fr.labsticc.framework.settings.model.settings.ModelingLanguage#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Languages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Languages</em>' containment reference list.
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getSettingsSpecification_OwnedLanguages()
	 * @see fr.labsticc.framework.settings.model.settings.ModelingLanguage#getSpecification
	 * @model opposite="specification" containment="true" required="true"
	 * @generated
	 */
	EList<ModelingLanguage> getOwnedLanguages();

} // SettingsSpecification
