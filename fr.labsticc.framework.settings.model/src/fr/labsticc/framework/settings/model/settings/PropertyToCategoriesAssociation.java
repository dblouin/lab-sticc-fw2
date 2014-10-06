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
 * A representation of the model object '<em><b>Property To Categories Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.settings.model.settings.PropertyToCategoriesAssociation#getOwnedCategories <em>Owned Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getPropertyToCategoriesAssociation()
 * @model
 * @generated
 */
public interface PropertyToCategoriesAssociation extends PropertyAssociation {
	/**
	 * Returns the value of the '<em><b>Owned Categories</b></em>' containment reference list.
	 * The list contents are of type {@link fr.labsticc.framework.settings.model.settings.Category}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Categories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Categories</em>' containment reference list.
	 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getPropertyToCategoriesAssociation_OwnedCategories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Category> getOwnedCategories();

} // PropertyToCategoriesAssociation
