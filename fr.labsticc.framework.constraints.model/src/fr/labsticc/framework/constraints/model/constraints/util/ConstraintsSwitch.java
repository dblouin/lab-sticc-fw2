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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec;
import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.constraints.model.constraints.Expression;
import fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.model.constraints.IdentifiedElement;
import fr.labsticc.framework.constraints.model.constraints.NaturalConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.NaturalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage
 * @generated
 */
public class ConstraintsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConstraintsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsSwitch() {
		if (modelPackage == null) {
			modelPackage = ConstraintsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ConstraintsPackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.CONSTRAINT_LANGUAGES_SPEC: {
				ConstraintLanguagesSpec constraintLanguagesSpec = (ConstraintLanguagesSpec)theEObject;
				T result = caseConstraintLanguagesSpec(constraintLanguagesSpec);
				if (result == null) result = caseIdentifiedElement(constraintLanguagesSpec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.CONSTRAINT_LANGUAGE: {
				ConstraintLanguage constraintLanguage = (ConstraintLanguage)theEObject;
				T result = caseConstraintLanguage(constraintLanguage);
				if (result == null) result = caseIdentifiedElement(constraintLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.NATURAL_CONSTRAINT_LANGUAGE: {
				NaturalConstraintLanguage naturalConstraintLanguage = (NaturalConstraintLanguage)theEObject;
				T result = caseNaturalConstraintLanguage(naturalConstraintLanguage);
				if (result == null) result = caseConstraintLanguage(naturalConstraintLanguage);
				if (result == null) result = caseIdentifiedElement(naturalConstraintLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.FORMAL_CONSTRAINT_LANGUAGE: {
				FormalConstraintLanguage formalConstraintLanguage = (FormalConstraintLanguage)theEObject;
				T result = caseFormalConstraintLanguage(formalConstraintLanguage);
				if (result == null) result = caseConstraintLanguage(formalConstraintLanguage);
				if (result == null) result = caseIdentifiedElement(formalConstraintLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.SERVICE_DESCRIPTOR: {
				ServiceDescriptor serviceDescriptor = (ServiceDescriptor)theEObject;
				T result = caseServiceDescriptor(serviceDescriptor);
				if (result == null) result = caseIdentifiedElement(serviceDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.FORMAL_LANGUAGE_LIBRARY: {
				FormalLanguageLibrary formalLanguageLibrary = (FormalLanguageLibrary)theEObject;
				T result = caseFormalLanguageLibrary(formalLanguageLibrary);
				if (result == null) result = caseIdentifiedElement(formalLanguageLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseIdentifiedElement(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.NATURAL_LANGUAGE_EXPRESSION: {
				NaturalLanguageExpression naturalLanguageExpression = (NaturalLanguageExpression)theEObject;
				T result = caseNaturalLanguageExpression(naturalLanguageExpression);
				if (result == null) result = caseExpression(naturalLanguageExpression);
				if (result == null) result = caseIdentifiedElement(naturalLanguageExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.FORMAL_LANGUAGE_EXPRESSION: {
				FormalLanguageExpression formalLanguageExpression = (FormalLanguageExpression)theEObject;
				T result = caseFormalLanguageExpression(formalLanguageExpression);
				if (result == null) result = caseExpression(formalLanguageExpression);
				if (result == null) result = caseIdentifiedElement(formalLanguageExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.CONSTRAINT: {
				Constraint constraint = (Constraint)theEObject;
				T result = caseConstraint(constraint);
				if (result == null) result = caseIdentifiedElement(constraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.TARGET: {
				Target target = (Target)theEObject;
				T result = caseTarget(target);
				if (result == null) result = caseIdentifiedElement(target);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.CARDINALITY_CONSTRAINT: {
				CardinalityConstraint cardinalityConstraint = (CardinalityConstraint)theEObject;
				T result = caseCardinalityConstraint(cardinalityConstraint);
				if (result == null) result = caseConstraint(cardinalityConstraint);
				if (result == null) result = caseIdentifiedElement(cardinalityConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.CARDINALITY: {
				Cardinality cardinality = (Cardinality)theEObject;
				T result = caseCardinality(cardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.FORMAL_LANGUAGE_CONSTRAINT: {
				FormalLanguageConstraint formalLanguageConstraint = (FormalLanguageConstraint)theEObject;
				T result = caseFormalLanguageConstraint(formalLanguageConstraint);
				if (result == null) result = caseConstraint(formalLanguageConstraint);
				if (result == null) result = caseIdentifiedElement(formalLanguageConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.TYPE_CONSTRAINT: {
				TypeConstraint typeConstraint = (TypeConstraint)theEObject;
				T result = caseTypeConstraint(typeConstraint);
				if (result == null) result = caseConstraint(typeConstraint);
				if (result == null) result = caseIdentifiedElement(typeConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.ABSTRACT_MODEL_ELEMENTS_SET: {
				AbstractModelElementsSet abstractModelElementsSet = (AbstractModelElementsSet)theEObject;
				T result = caseAbstractModelElementsSet(abstractModelElementsSet);
				if (result == null) result = caseIdentifiedElement(abstractModelElementsSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.CONSTRAINED_MODEL_ELEMENTS_SUBSET: {
				ConstrainedModelElementsSubset constrainedModelElementsSubset = (ConstrainedModelElementsSubset)theEObject;
				T result = caseConstrainedModelElementsSubset(constrainedModelElementsSubset);
				if (result == null) result = caseAbstractModelElementsSet(constrainedModelElementsSubset);
				if (result == null) result = caseIdentifiedElement(constrainedModelElementsSubset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.ENUMERATED_MODEL_ELEMENTS_SET: {
				EnumeratedModelElementsSet enumeratedModelElementsSet = (EnumeratedModelElementsSet)theEObject;
				T result = caseEnumeratedModelElementsSet(enumeratedModelElementsSet);
				if (result == null) result = caseAbstractModelElementsSet(enumeratedModelElementsSet);
				if (result == null) result = caseIdentifiedElement(enumeratedModelElementsSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.FEATURE_VALUE_CONSTRAINT: {
				FeatureValueConstraint featureValueConstraint = (FeatureValueConstraint)theEObject;
				T result = caseFeatureValueConstraint(featureValueConstraint);
				if (result == null) result = caseConstraint(featureValueConstraint);
				if (result == null) result = caseIdentifiedElement(featureValueConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.EVAL_CONTEXT: {
				EvalContext evalContext = (EvalContext)theEObject;
				T result = caseEvalContext(evalContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstraintsPackage.DIAGNOSTIC: {
				Diagnostic diagnostic = (Diagnostic)theEObject;
				T result = caseDiagnostic(diagnostic);
				if (result == null) result = caseIdentifiedElement(diagnostic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintLanguage(ConstraintLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Constraint Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Constraint Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalConstraintLanguage(FormalConstraintLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Constraint Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Constraint Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalConstraintLanguage(NaturalConstraintLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Language Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Language Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalLanguageLibrary(FormalLanguageLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Language Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Language Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalLanguageExpression(FormalLanguageExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinalityConstraint(CardinalityConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinality(Cardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Language Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Language Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalLanguageConstraint(FormalLanguageConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeConstraint(TypeConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Model Elements Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Model Elements Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractModelElementsSet(AbstractModelElementsSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constrained Model Elements Subset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrained Model Elements Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainedModelElementsSubset(ConstrainedModelElementsSubset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumerated Model Elements Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumerated Model Elements Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeratedModelElementsSet(EnumeratedModelElementsSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Value Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Value Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureValueConstraint(FeatureValueConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eval Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eval Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvalContext(EvalContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diagnostic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diagnostic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiagnostic(Diagnostic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTarget(Target object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natural Language Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natural Language Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNaturalLanguageExpression(NaturalLanguageExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDescriptor(ServiceDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint Languages Spec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint Languages Spec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraintLanguagesSpec(ConstraintLanguagesSpec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ConstraintsSwitch
