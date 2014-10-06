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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Language Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageExpressionImpl#getUsedLibraries <em>Used Libraries</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageExpressionImpl#getUsedLibraryNames <em>Used Library Names</em>}</li>
 *   <li>{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageExpressionImpl#getUsedLibraryIds <em>Used Library Ids</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalLanguageExpressionImpl extends ExpressionImpl implements FormalLanguageExpression {
	/**
	 * The cached value of the '{@link #getUsedLibraries() <em>Used Libraries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedLibraries()
	 * @generated
	 * @ordered
	 */
	protected EList<FormalLanguageLibrary> usedLibraries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormalLanguageExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConstraintsPackage.Literals.FORMAL_LANGUAGE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormalLanguageLibrary> getUsedLibraries() {
		if (usedLibraries == null) {
			usedLibraries = new EObjectResolvingEList<FormalLanguageLibrary>(FormalLanguageLibrary.class, this, ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARIES);
		}
		return usedLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getUsedLibraryNames() {
		final EList<String> usedLibNames = new BasicEList<String>( getUsedLibraries().size() );

		for ( final FormalLanguageLibrary library : getUsedLibraries() ) {
			usedLibNames.add( library.getName() );
		}

		return usedLibNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getUsedLibraryIds() {
		final EList<String> usedLibIds = new BasicEList<String>( getUsedLibraries().size() );
		
		for ( final FormalLanguageLibrary library : getUsedLibraries() ) {
			usedLibIds.add( library.getId() );
		}
		
		return usedLibIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARIES:
				return getUsedLibraries();
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_NAMES:
				return getUsedLibraryNames();
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_IDS:
				return getUsedLibraryIds();
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
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARIES:
				getUsedLibraries().clear();
				getUsedLibraries().addAll((Collection<? extends FormalLanguageLibrary>)newValue);
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
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARIES:
				getUsedLibraries().clear();
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
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARIES:
				return usedLibraries != null && !usedLibraries.isEmpty();
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_NAMES:
				return !getUsedLibraryNames().isEmpty();
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_IDS:
				return !getUsedLibraryIds().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FormalLanguageExpressionImpl
