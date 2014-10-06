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
package fr.labsticc.framework.constraints.model.constraints.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Constraint Language</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalConstraintLanguageImpl#getOwnedLibraries <em>Owned Libraries</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalConstraintLanguageImpl#getOwnedInterpreter <em>Owned Interpreter</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalConstraintLanguageImpl#getOwnedPersister <em>Owned Persister</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalConstraintLanguageImpl#getOwnedViewer <em>Owned Viewer</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalConstraintLanguageImpl#getLibraryLocation <em>Library Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalConstraintLanguageImpl extends ConstraintLanguageImpl implements FormalConstraintLanguage {
	/**
	 * The cached value of the '{@link #getOwnedLibraries() <em>Owned Libraries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalLanguageLibrary> ownedLibraries;

	/**
	 * The cached value of the '{@link #getOwnedInterpreter() <em>Owned Interpreter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedInterpreter()
	 * @generated
	 * @ordered
	 */
	protected ServiceDescriptor ownedInterpreter;

	/**
	 * The cached value of the '{@link #getOwnedPersister() <em>Owned Persister</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPersister()
	 * @generated
	 * @ordered
	 */
	protected ServiceDescriptor ownedPersister;

	/**
	 * The cached value of the '{@link #getOwnedViewer() <em>Owned Viewer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedViewer()
	 * @generated
	 * @ordered
	 */
	protected ServiceDescriptor ownedViewer;

	/**
	 * The default value of the '{@link #getLibraryLocation() <em>Library Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LIBRARY_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLibraryLocation() <em>Library Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibraryLocation()
	 * @generated
	 * @ordered
	 */
	protected String libraryLocation = LIBRARY_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalConstraintLanguageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.FORMAL_CONSTRAINT_LANGUAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalLanguageLibrary> getOwnedLibraries() {
		if (ownedLibraries == null) {
			ownedLibraries = new EObjectContainmentWithInverseEList<FormalLanguageLibrary>(FormalLanguageLibrary.class, this, ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES, ConstraintsPackage.FORMAL_LANGUAGE_LIBRARY__LANGUAGE);
		}
		return ownedLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptor getOwnedInterpreter() {
		return ownedInterpreter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedInterpreter(ServiceDescriptor newOwnedInterpreter, NotificationChain msgs) {
		ServiceDescriptor oldOwnedInterpreter = ownedInterpreter;
		ownedInterpreter = newOwnedInterpreter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER, oldOwnedInterpreter, newOwnedInterpreter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedInterpreter(ServiceDescriptor newOwnedInterpreter) {
		if (newOwnedInterpreter != ownedInterpreter) {
			NotificationChain msgs = null;
			if (ownedInterpreter != null)
				msgs = ((InternalEObject)ownedInterpreter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER, null, msgs);
			if (newOwnedInterpreter != null)
				msgs = ((InternalEObject)newOwnedInterpreter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER, null, msgs);
			msgs = basicSetOwnedInterpreter(newOwnedInterpreter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER, newOwnedInterpreter, newOwnedInterpreter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptor getOwnedPersister() {
		return ownedPersister;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPersister(ServiceDescriptor newOwnedPersister, NotificationChain msgs) {
		ServiceDescriptor oldOwnedPersister = ownedPersister;
		ownedPersister = newOwnedPersister;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER, oldOwnedPersister, newOwnedPersister);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedPersister(ServiceDescriptor newOwnedPersister) {
		if (newOwnedPersister != ownedPersister) {
			NotificationChain msgs = null;
			if (ownedPersister != null)
				msgs = ((InternalEObject)ownedPersister).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER, null, msgs);
			if (newOwnedPersister != null)
				msgs = ((InternalEObject)newOwnedPersister).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER, null, msgs);
			msgs = basicSetOwnedPersister(newOwnedPersister, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER, newOwnedPersister, newOwnedPersister));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptor getOwnedViewer() {
		return ownedViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedViewer(ServiceDescriptor newOwnedViewer, NotificationChain msgs) {
		ServiceDescriptor oldOwnedViewer = ownedViewer;
		ownedViewer = newOwnedViewer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER, oldOwnedViewer, newOwnedViewer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedViewer(ServiceDescriptor newOwnedViewer) {
		if (newOwnedViewer != ownedViewer) {
			NotificationChain msgs = null;
			if (ownedViewer != null)
				msgs = ((InternalEObject)ownedViewer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER, null, msgs);
			if (newOwnedViewer != null)
				msgs = ((InternalEObject)newOwnedViewer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER, null, msgs);
			msgs = basicSetOwnedViewer(newOwnedViewer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER, newOwnedViewer, newOwnedViewer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLibraryLocation() {
		return libraryLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibraryLocation(String newLibraryLocation) {
		String oldLibraryLocation = libraryLocation;
		libraryLocation = newLibraryLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__LIBRARY_LOCATION, oldLibraryLocation, libraryLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FormalLanguageLibrary libraryByName( final String p_name ) {
		for ( final FormalLanguageLibrary library : getOwnedLibraries() ) {
			if ( p_name.equals( library.getName() ) ) {
				return library;
			}
		}
		
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FormalLanguageLibrary libraryById( final String p_id ) {
		for ( final FormalLanguageLibrary library : getOwnedLibraries() ) {
			if ( p_id.equals( library.getId() ) ) {
				return library;
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
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedLibraries()).basicAdd(otherEnd, msgs);
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
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES:
				return ((InternalEList<?>)getOwnedLibraries()).basicRemove(otherEnd, msgs);
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER:
				return basicSetOwnedInterpreter(null, msgs);
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER:
				return basicSetOwnedPersister(null, msgs);
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER:
				return basicSetOwnedViewer(null, msgs);
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
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES:
				return getOwnedLibraries();
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER:
				return getOwnedInterpreter();
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER:
				return getOwnedPersister();
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER:
				return getOwnedViewer();
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__LIBRARY_LOCATION:
				return getLibraryLocation();
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
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES:
				getOwnedLibraries().clear();
				getOwnedLibraries().addAll((Collection<? extends FormalLanguageLibrary>)newValue);
				return;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER:
				setOwnedInterpreter((ServiceDescriptor)newValue);
				return;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER:
				setOwnedPersister((ServiceDescriptor)newValue);
				return;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER:
				setOwnedViewer((ServiceDescriptor)newValue);
				return;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__LIBRARY_LOCATION:
				setLibraryLocation((String)newValue);
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
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES:
				getOwnedLibraries().clear();
				return;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER:
				setOwnedInterpreter((ServiceDescriptor)null);
				return;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER:
				setOwnedPersister((ServiceDescriptor)null);
				return;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER:
				setOwnedViewer((ServiceDescriptor)null);
				return;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__LIBRARY_LOCATION:
				setLibraryLocation(LIBRARY_LOCATION_EDEFAULT);
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
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES:
				return ownedLibraries != null && !ownedLibraries.isEmpty();
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER:
				return ownedInterpreter != null;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER:
				return ownedPersister != null;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER:
				return ownedViewer != null;
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE__LIBRARY_LOCATION:
				return LIBRARY_LOCATION_EDEFAULT == null ? libraryLocation != null : !LIBRARY_LOCATION_EDEFAULT.equals(libraryLocation);
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
		result.append(" (libraryLocation: ");
		result.append(libraryLocation);
		result.append(')');
		return result.toString();
	}

} //FormalConstraintLanguageImpl
