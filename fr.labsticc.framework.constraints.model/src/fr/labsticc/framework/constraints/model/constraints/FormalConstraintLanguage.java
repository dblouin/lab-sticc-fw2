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
package fr.labsticc.framework.constraints.model.constraints;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Constraint Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedLibraries <em>Owned Libraries</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedInterpreter <em>Owned Interpreter</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedPersister <em>Owned Persister</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedViewer <em>Owned Viewer</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getLibraryLocation <em>Library Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFormalConstraintLanguage()
 * @model
 * @generated
 */
public interface FormalConstraintLanguage extends ConstraintLanguage {

	/**
	 * Returns the value of the '<em><b>Owned Libraries</b></em>' containment reference list.
	 * The list contents are of type {@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary}.
	 * It is bidirectional and its opposite is '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Libraries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Libraries</em>' containment reference list.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFormalConstraintLanguage_OwnedLibraries()
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary#getLanguage
	 * @model opposite="language" containment="true"
	 * @generated
	 */
	EList<FormalLanguageLibrary> getOwnedLibraries();

	/**
	 * Returns the value of the '<em><b>Owned Interpreter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Interpreter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Interpreter</em>' containment reference.
	 * @see #setOwnedInterpreter(ServiceDescriptor)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFormalConstraintLanguage_OwnedInterpreter()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServiceDescriptor getOwnedInterpreter();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedInterpreter <em>Owned Interpreter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Interpreter</em>' containment reference.
	 * @see #getOwnedInterpreter()
	 * @generated
	 */
	void setOwnedInterpreter(ServiceDescriptor value);

	/**
	 * Returns the value of the '<em><b>Owned Persister</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Persister</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Persister</em>' containment reference.
	 * @see #setOwnedPersister(ServiceDescriptor)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFormalConstraintLanguage_OwnedPersister()
	 * @model containment="true"
	 * @generated
	 */
	ServiceDescriptor getOwnedPersister();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedPersister <em>Owned Persister</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Persister</em>' containment reference.
	 * @see #getOwnedPersister()
	 * @generated
	 */
	void setOwnedPersister(ServiceDescriptor value);

	/**
	 * Returns the value of the '<em><b>Owned Viewer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Viewer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Viewer</em>' containment reference.
	 * @see #setOwnedViewer(ServiceDescriptor)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFormalConstraintLanguage_OwnedViewer()
	 * @model containment="true"
	 * @generated
	 */
	ServiceDescriptor getOwnedViewer();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedViewer <em>Owned Viewer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Viewer</em>' containment reference.
	 * @see #getOwnedViewer()
	 * @generated
	 */
	void setOwnedViewer(ServiceDescriptor value);

	/**
	 * Returns the value of the '<em><b>Library Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library Location</em>' attribute.
	 * @see #setLibraryLocation(String)
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#getFormalConstraintLanguage_LibraryLocation()
	 * @model
	 * @generated
	 */
	String getLibraryLocation();

	/**
	 * Sets the value of the '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getLibraryLocation <em>Library Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library Location</em>' attribute.
	 * @see #getLibraryLocation()
	 * @generated
	 */
	void setLibraryLocation(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model nameRequired="true"
	 * @generated
	 */
	FormalLanguageLibrary libraryByName(String name);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idRequired="true"
	 * @generated
	 */
	FormalLanguageLibrary libraryById(String id);
} // FormalConstraintLanguage
