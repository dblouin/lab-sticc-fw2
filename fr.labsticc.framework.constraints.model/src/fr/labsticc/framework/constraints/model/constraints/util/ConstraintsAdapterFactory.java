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
package fr.labsticc.framework.constraints.model.constraints.util;

import fr.labsticc.framework.constraints.model.constraints.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage
 * @generated
 */
public class ConstraintsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConstraintsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConstraintsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintsSwitch<Adapter> modelSwitch =
		new ConstraintsSwitch<Adapter>() {
			@Override
			public Adapter caseIdentifiedElement(IdentifiedElement object) {
				return createIdentifiedElementAdapter();
			}
			@Override
			public Adapter caseConstraintLanguagesSpec(ConstraintLanguagesSpec object) {
				return createConstraintLanguagesSpecAdapter();
			}
			@Override
			public Adapter caseConstraintLanguage(ConstraintLanguage object) {
				return createConstraintLanguageAdapter();
			}
			@Override
			public Adapter caseNaturalConstraintLanguage(NaturalConstraintLanguage object) {
				return createNaturalConstraintLanguageAdapter();
			}
			@Override
			public Adapter caseFormalConstraintLanguage(FormalConstraintLanguage object) {
				return createFormalConstraintLanguageAdapter();
			}
			@Override
			public Adapter caseServiceDescriptor(ServiceDescriptor object) {
				return createServiceDescriptorAdapter();
			}
			@Override
			public Adapter caseFormalLanguageLibrary(FormalLanguageLibrary object) {
				return createFormalLanguageLibraryAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseNaturalLanguageExpression(NaturalLanguageExpression object) {
				return createNaturalLanguageExpressionAdapter();
			}
			@Override
			public Adapter caseFormalLanguageExpression(FormalLanguageExpression object) {
				return createFormalLanguageExpressionAdapter();
			}
			@Override
			public Adapter caseConstraint(Constraint object) {
				return createConstraintAdapter();
			}
			@Override
			public Adapter caseTarget(Target object) {
				return createTargetAdapter();
			}
			@Override
			public Adapter caseCardinalityConstraint(CardinalityConstraint object) {
				return createCardinalityConstraintAdapter();
			}
			@Override
			public Adapter caseCardinality(Cardinality object) {
				return createCardinalityAdapter();
			}
			@Override
			public Adapter caseFormalLanguageConstraint(FormalLanguageConstraint object) {
				return createFormalLanguageConstraintAdapter();
			}
			@Override
			public Adapter caseTypeConstraint(TypeConstraint object) {
				return createTypeConstraintAdapter();
			}
			@Override
			public Adapter caseAbstractModelElementsSet(AbstractModelElementsSet object) {
				return createAbstractModelElementsSetAdapter();
			}
			@Override
			public Adapter caseConstrainedModelElementsSubset(ConstrainedModelElementsSubset object) {
				return createConstrainedModelElementsSubsetAdapter();
			}
			@Override
			public Adapter caseEnumeratedModelElementsSet(EnumeratedModelElementsSet object) {
				return createEnumeratedModelElementsSetAdapter();
			}
			@Override
			public Adapter caseFeatureValueConstraint(FeatureValueConstraint object) {
				return createFeatureValueConstraintAdapter();
			}
			@Override
			public Adapter caseEvalContext(EvalContext object) {
				return createEvalContextAdapter();
			}
			@Override
			public Adapter caseDiagnostic(Diagnostic object) {
				return createDiagnosticAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage <em>Constraint Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage
	 * @generated
	 */
	public Adapter createConstraintLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage <em>Formal Constraint Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage
	 * @generated
	 */
	public Adapter createFormalConstraintLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.NaturalConstraintLanguage <em>Natural Constraint Language</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.NaturalConstraintLanguage
	 * @generated
	 */
	public Adapter createNaturalConstraintLanguageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary <em>Formal Language Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary
	 * @generated
	 */
	public Adapter createFormalLanguageLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression <em>Formal Language Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression
	 * @generated
	 */
	public Adapter createFormalLanguageExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.Constraint
	 * @generated
	 */
	public Adapter createConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint <em>Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint
	 * @generated
	 */
	public Adapter createCardinalityConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.Cardinality
	 * @generated
	 */
	public Adapter createCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint <em>Formal Language Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint
	 * @generated
	 */
	public Adapter createFormalLanguageConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.TypeConstraint <em>Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.TypeConstraint
	 * @generated
	 */
	public Adapter createTypeConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.AbstractModelElementsSet <em>Abstract Model Elements Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.AbstractModelElementsSet
	 * @generated
	 */
	public Adapter createAbstractModelElementsSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset <em>Constrained Model Elements Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset
	 * @generated
	 */
	public Adapter createConstrainedModelElementsSubsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.EnumeratedModelElementsSet <em>Enumerated Model Elements Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.EnumeratedModelElementsSet
	 * @generated
	 */
	public Adapter createEnumeratedModelElementsSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint <em>Feature Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint
	 * @generated
	 */
	public Adapter createFeatureValueConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.EvalContext <em>Eval Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.EvalContext
	 * @generated
	 */
	public Adapter createEvalContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.Diagnostic <em>Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.Diagnostic
	 * @generated
	 */
	public Adapter createDiagnosticAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.Target
	 * @generated
	 */
	public Adapter createTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.NaturalLanguageExpression <em>Natural Language Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.NaturalLanguageExpression
	 * @generated
	 */
	public Adapter createNaturalLanguageExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor <em>Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor
	 * @generated
	 */
	public Adapter createServiceDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.IdentifiedElement
	 * @generated
	 */
	public Adapter createIdentifiedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec <em>Constraint Languages Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec
	 * @generated
	 */
	public Adapter createConstraintLanguagesSpecAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConstraintsAdapterFactory
