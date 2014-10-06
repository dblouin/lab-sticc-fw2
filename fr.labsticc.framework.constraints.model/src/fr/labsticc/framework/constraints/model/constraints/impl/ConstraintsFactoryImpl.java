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

import fr.labsticc.framework.constraints.model.constraints.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsFactoryImpl extends EFactoryImpl implements ConstraintsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstraintsFactory init() {
		try {
			ConstraintsFactory theConstraintsFactory = (ConstraintsFactory)EPackage.Registry.INSTANCE.getEFactory(ConstraintsPackage.eNS_URI);
			if (theConstraintsFactory != null) {
				return theConstraintsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstraintsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ConstraintsPackage.CONSTRAINT_LANGUAGES_SPEC: return createConstraintLanguagesSpec();
			case ConstraintsPackage.NATURAL_CONSTRAINT_LANGUAGE: return createNaturalConstraintLanguage();
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE: return createFormalConstraintLanguage();
			case ConstraintsPackage.SERVICE_DESCRIPTOR: return createServiceDescriptor();
			case ConstraintsPackage.FORMAL_LANGUAGE_LIBRARY: return createFormalLanguageLibrary();
			case ConstraintsPackage.NATURAL_LANGUAGE_EXPRESSION: return createNaturalLanguageExpression();
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION: return createFormalLanguageExpression();
			case ConstraintsPackage.TARGET: return createTarget();
			case ConstraintsPackage.CARDINALITY_CONSTRAINT: return createCardinalityConstraint();
			case ConstraintsPackage.CARDINALITY: return createCardinality();
			case ConstraintsPackage.FORMAL_LANGUAGE_CONSTRAINT: return createFormalLanguageConstraint();
			case ConstraintsPackage.TYPE_CONSTRAINT: return createTypeConstraint();
			case ConstraintsPackage.CONSTRAINED_MODEL_ELEMENTS_SUBSET: return createConstrainedModelElementsSubset();
			case ConstraintsPackage.ENUMERATED_MODEL_ELEMENTS_SET: return createEnumeratedModelElementsSet();
			case ConstraintsPackage.FEATURE_VALUE_CONSTRAINT: return createFeatureValueConstraint();
			case ConstraintsPackage.EVAL_CONTEXT: return createEvalContext();
			case ConstraintsPackage.DIAGNOSTIC: return createDiagnostic();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ConstraintsPackage.SCOPE_TYPE:
				return createScopeTypeFromString(eDataType, initialValue);
			case ConstraintsPackage.VALIDATION_STATUS:
				return createValidationStatusFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ConstraintsPackage.SCOPE_TYPE:
				return convertScopeTypeToString(eDataType, instanceValue);
			case ConstraintsPackage.VALIDATION_STATUS:
				return convertValidationStatusToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintLanguagesSpec createConstraintLanguagesSpec() {
		ConstraintLanguagesSpecImpl constraintLanguagesSpec = new ConstraintLanguagesSpecImpl();
		return constraintLanguagesSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalConstraintLanguage createFormalConstraintLanguage() {
		FormalConstraintLanguageImpl formalConstraintLanguage = new FormalConstraintLanguageImpl();
		return formalConstraintLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalConstraintLanguage createNaturalConstraintLanguage() {
		NaturalConstraintLanguageImpl naturalConstraintLanguage = new NaturalConstraintLanguageImpl();
		return naturalConstraintLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalLanguageLibrary createFormalLanguageLibrary() {
		FormalLanguageLibraryImpl formalLanguageLibrary = new FormalLanguageLibraryImpl();
		return formalLanguageLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalLanguageExpression createFormalLanguageExpression() {
		FormalLanguageExpressionImpl formalLanguageExpression = new FormalLanguageExpressionImpl();
		return formalLanguageExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityConstraint createCardinalityConstraint() {
		CardinalityConstraintImpl cardinalityConstraint = new CardinalityConstraintImpl();
		return cardinalityConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalLanguageConstraint createFormalLanguageConstraint() {
		FormalLanguageConstraintImpl formalLanguageConstraint = new FormalLanguageConstraintImpl();
		return formalLanguageConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeConstraint createTypeConstraint() {
		TypeConstraintImpl typeConstraint = new TypeConstraintImpl();
		return typeConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainedModelElementsSubset createConstrainedModelElementsSubset() {
		ConstrainedModelElementsSubsetImpl constrainedModelElementsSubset = new ConstrainedModelElementsSubsetImpl();
		return constrainedModelElementsSubset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedModelElementsSet createEnumeratedModelElementsSet() {
		EnumeratedModelElementsSetImpl enumeratedModelElementsSet = new EnumeratedModelElementsSetImpl();
		return enumeratedModelElementsSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValueConstraint createFeatureValueConstraint() {
		FeatureValueConstraintImpl featureValueConstraint = new FeatureValueConstraintImpl();
		return featureValueConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvalContext createEvalContext() {
		EvalContextImpl evalContext = new EvalContextImpl();
		return evalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diagnostic createDiagnostic() {
		DiagnosticImpl diagnostic = new DiagnosticImpl();
		return diagnostic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
		ScopeType result = ScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationStatus createValidationStatusFromString(EDataType eDataType, String initialValue) {
		ValidationStatus result = ValidationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaturalLanguageExpression createNaturalLanguageExpression() {
		NaturalLanguageExpressionImpl naturalLanguageExpression = new NaturalLanguageExpressionImpl();
		return naturalLanguageExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceDescriptor createServiceDescriptor() {
		ServiceDescriptorImpl serviceDescriptor = new ServiceDescriptorImpl();
		return serviceDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsPackage getConstraintsPackage() {
		return (ConstraintsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstraintsPackage getPackage() {
		return ConstraintsPackage.eINSTANCE;
	}

} //ConstraintsFactoryImpl
