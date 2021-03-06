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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage
 * @generated
 */
public interface ConstraintsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintsFactory eINSTANCE = fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constraint Languages Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Languages Spec</em>'.
	 * @generated
	 */
	ConstraintLanguagesSpec createConstraintLanguagesSpec();

	/**
	 * Returns a new object of class '<em>Formal Constraint Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Constraint Language</em>'.
	 * @generated
	 */
	FormalConstraintLanguage createFormalConstraintLanguage();

	/**
	 * Returns a new object of class '<em>Natural Constraint Language</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Constraint Language</em>'.
	 * @generated
	 */
	NaturalConstraintLanguage createNaturalConstraintLanguage();

	/**
	 * Returns a new object of class '<em>Formal Language Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Language Library</em>'.
	 * @generated
	 */
	FormalLanguageLibrary createFormalLanguageLibrary();

	/**
	 * Returns a new object of class '<em>Formal Language Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Language Expression</em>'.
	 * @generated
	 */
	FormalLanguageExpression createFormalLanguageExpression();

	/**
	 * Returns a new object of class '<em>Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality Constraint</em>'.
	 * @generated
	 */
	CardinalityConstraint createCardinalityConstraint();

	/**
	 * Returns a new object of class '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cardinality</em>'.
	 * @generated
	 */
	Cardinality createCardinality();

	/**
	 * Returns a new object of class '<em>Formal Language Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Language Constraint</em>'.
	 * @generated
	 */
	FormalLanguageConstraint createFormalLanguageConstraint();

	/**
	 * Returns a new object of class '<em>Type Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Constraint</em>'.
	 * @generated
	 */
	TypeConstraint createTypeConstraint();

	/**
	 * Returns a new object of class '<em>Constrained Model Elements Subset</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constrained Model Elements Subset</em>'.
	 * @generated
	 */
	ConstrainedModelElementsSubset createConstrainedModelElementsSubset();

	/**
	 * Returns a new object of class '<em>Enumerated Model Elements Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumerated Model Elements Set</em>'.
	 * @generated
	 */
	EnumeratedModelElementsSet createEnumeratedModelElementsSet();

	/**
	 * Returns a new object of class '<em>Feature Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Value Constraint</em>'.
	 * @generated
	 */
	FeatureValueConstraint createFeatureValueConstraint();

	/**
	 * Returns a new object of class '<em>Eval Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Eval Context</em>'.
	 * @generated
	 */
	EvalContext createEvalContext();

	/**
	 * Returns a new object of class '<em>Diagnostic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagnostic</em>'.
	 * @generated
	 */
	Diagnostic createDiagnostic();

	/**
	 * Returns a new object of class '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target</em>'.
	 * @generated
	 */
	Target createTarget();

	/**
	 * Returns a new object of class '<em>Natural Language Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Natural Language Expression</em>'.
	 * @generated
	 */
	NaturalLanguageExpression createNaturalLanguageExpression();

	/**
	 * Returns a new object of class '<em>Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Descriptor</em>'.
	 * @generated
	 */
	ServiceDescriptor createServiceDescriptor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ConstraintsPackage getConstraintsPackage();

} //ConstraintsFactory
