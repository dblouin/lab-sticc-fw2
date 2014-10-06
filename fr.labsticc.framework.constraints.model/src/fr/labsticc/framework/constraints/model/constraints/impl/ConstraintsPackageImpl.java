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

import fr.labsticc.framework.constraints.model.constraints.AbstractModelElementsSet;
import fr.labsticc.framework.constraints.model.constraints.Cardinality;
import fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint;
import fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset;
import fr.labsticc.framework.constraints.model.constraints.Constraint;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec;
import fr.labsticc.framework.constraints.model.constraints.ConstraintsFactory;
import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.constraints.model.constraints.Diagnostic;
import fr.labsticc.framework.constraints.model.constraints.EnumeratedModelElementsSet;
import fr.labsticc.framework.constraints.model.constraints.EvalContext;
import fr.labsticc.framework.constraints.model.constraints.Expression;
import fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint;
import fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.model.constraints.IdentifiedElement;
import fr.labsticc.framework.constraints.model.constraints.NaturalConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.NaturalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.ScopeType;
import fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor;
import fr.labsticc.framework.constraints.model.constraints.Target;
import fr.labsticc.framework.constraints.model.constraints.TypeConstraint;
import fr.labsticc.framework.constraints.model.constraints.ValidationStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstraintsPackageImpl extends EPackageImpl implements ConstraintsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalConstraintLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalConstraintLanguageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalLanguageLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalLanguageExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalLanguageConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractModelElementsSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainedModelElementsSubsetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedModelElementsSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureValueConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evalContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagnosticEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum validationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naturalLanguageExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintLanguagesSpecEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ConstraintsPackageImpl() {
		super(eNS_URI, ConstraintsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ConstraintsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ConstraintsPackage init() {
		if (isInited) return (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);

		// Obtain or create and register package
		ConstraintsPackageImpl theConstraintsPackage = (ConstraintsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ConstraintsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ConstraintsPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theConstraintsPackage.createPackageContents();

		// Initialize created meta-data
		theConstraintsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theConstraintsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ConstraintsPackage.eNS_URI, theConstraintsPackage);
		return theConstraintsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintLanguage() {
		return constraintLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintLanguage_Specification() {
		return (EReference)constraintLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalConstraintLanguage() {
		return formalConstraintLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalConstraintLanguage_OwnedLibraries() {
		return (EReference)formalConstraintLanguageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalConstraintLanguage_OwnedInterpreter() {
		return (EReference)formalConstraintLanguageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalConstraintLanguage_OwnedPersister() {
		return (EReference)formalConstraintLanguageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalConstraintLanguage_OwnedViewer() {
		return (EReference)formalConstraintLanguageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalConstraintLanguage_LibraryLocation() {
		return (EAttribute)formalConstraintLanguageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalConstraintLanguage() {
		return naturalConstraintLanguageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalLanguageLibrary() {
		return formalLanguageLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalLanguageLibrary_OwnedExpression() {
		return (EReference)formalLanguageLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalLanguageLibrary_Default() {
		return (EAttribute)formalLanguageLibraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalLanguageLibrary_Language() {
		return (EReference)formalLanguageLibraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Language() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Text() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalLanguageExpression() {
		return formalLanguageExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalLanguageExpression_UsedLibraries() {
		return (EReference)formalLanguageExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalLanguageExpression_UsedLibraryNames() {
		return (EAttribute)formalLanguageExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalLanguageExpression_UsedLibraryIds() {
		return (EAttribute)formalLanguageExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Target() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityConstraint() {
		return cardinalityConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalityConstraint_OwnedCardinality() {
		return (EReference)cardinalityConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardinalityConstraint_OwnedModelElementsSubset() {
		return (EReference)cardinalityConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinality() {
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_LowerBound() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinality_UpperBound() {
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalLanguageConstraint() {
		return formalLanguageConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalLanguageConstraint_Expression() {
		return (EReference)formalLanguageConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeConstraint() {
		return typeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeConstraint_AllowedTypes() {
		return (EReference)typeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractModelElementsSet() {
		return abstractModelElementsSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainedModelElementsSubset() {
		return constrainedModelElementsSubsetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrainedModelElementsSubset_OwnedConstraints() {
		return (EReference)constrainedModelElementsSubsetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstrainedModelElementsSubset_Scope() {
		return (EAttribute)constrainedModelElementsSubsetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedModelElementsSet() {
		return enumeratedModelElementsSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedModelElementsSet_ModelElements() {
		return (EReference)enumeratedModelElementsSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureValueConstraint() {
		return featureValueConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValueConstraint_Feature() {
		return (EReference)featureValueConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureValueConstraint_Value() {
		return (EReference)featureValueConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvalContext() {
		return evalContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvalContext_ModelElement() {
		return (EReference)evalContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvalContext_MetaModelElement() {
		return (EAttribute)evalContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiagnostic() {
		return diagnosticEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiagnostic_RelatedModelElements() {
		return (EReference)diagnosticEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnostic_Valid() {
		return (EAttribute)diagnosticEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarget() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Classifier() {
		return (EReference)targetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Features() {
		return (EReference)targetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiagnostic_ValidationStatus() {
		return (EAttribute)diagnosticEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScopeType() {
		return scopeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getValidationStatus() {
		return validationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaturalLanguageExpression() {
		return naturalLanguageExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceDescriptor() {
		return serviceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_ServiceClass() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceDescriptor_ProviderId() {
		return (EAttribute)serviceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Name() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Description() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraintLanguagesSpec() {
		return constraintLanguagesSpecEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraintLanguagesSpec_OwnedLanguages() {
		return (EReference)constraintLanguagesSpecEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintsFactory getConstraintsFactory() {
		return (ConstraintsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__NAME);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__DESCRIPTION);

		constraintLanguagesSpecEClass = createEClass(CONSTRAINT_LANGUAGES_SPEC);
		createEReference(constraintLanguagesSpecEClass, CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES);

		constraintLanguageEClass = createEClass(CONSTRAINT_LANGUAGE);
		createEReference(constraintLanguageEClass, CONSTRAINT_LANGUAGE__SPECIFICATION);

		naturalConstraintLanguageEClass = createEClass(NATURAL_CONSTRAINT_LANGUAGE);

		formalConstraintLanguageEClass = createEClass(FORMAL_CONSTRAINT_LANGUAGE);
		createEReference(formalConstraintLanguageEClass, FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES);
		createEReference(formalConstraintLanguageEClass, FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER);
		createEReference(formalConstraintLanguageEClass, FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER);
		createEReference(formalConstraintLanguageEClass, FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER);
		createEAttribute(formalConstraintLanguageEClass, FORMAL_CONSTRAINT_LANGUAGE__LIBRARY_LOCATION);

		serviceDescriptorEClass = createEClass(SERVICE_DESCRIPTOR);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__SERVICE_CLASS);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__PROVIDER_ID);

		formalLanguageLibraryEClass = createEClass(FORMAL_LANGUAGE_LIBRARY);
		createEReference(formalLanguageLibraryEClass, FORMAL_LANGUAGE_LIBRARY__OWNED_EXPRESSION);
		createEAttribute(formalLanguageLibraryEClass, FORMAL_LANGUAGE_LIBRARY__DEFAULT);
		createEReference(formalLanguageLibraryEClass, FORMAL_LANGUAGE_LIBRARY__LANGUAGE);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__LANGUAGE);
		createEAttribute(expressionEClass, EXPRESSION__TEXT);

		naturalLanguageExpressionEClass = createEClass(NATURAL_LANGUAGE_EXPRESSION);

		formalLanguageExpressionEClass = createEClass(FORMAL_LANGUAGE_EXPRESSION);
		createEReference(formalLanguageExpressionEClass, FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARIES);
		createEAttribute(formalLanguageExpressionEClass, FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_NAMES);
		createEAttribute(formalLanguageExpressionEClass, FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_IDS);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__TARGET);

		targetEClass = createEClass(TARGET);
		createEReference(targetEClass, TARGET__CLASSIFIER);
		createEReference(targetEClass, TARGET__FEATURES);

		cardinalityConstraintEClass = createEClass(CARDINALITY_CONSTRAINT);
		createEReference(cardinalityConstraintEClass, CARDINALITY_CONSTRAINT__OWNED_CARDINALITY);
		createEReference(cardinalityConstraintEClass, CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__LOWER_BOUND);
		createEAttribute(cardinalityEClass, CARDINALITY__UPPER_BOUND);

		formalLanguageConstraintEClass = createEClass(FORMAL_LANGUAGE_CONSTRAINT);
		createEReference(formalLanguageConstraintEClass, FORMAL_LANGUAGE_CONSTRAINT__EXPRESSION);

		typeConstraintEClass = createEClass(TYPE_CONSTRAINT);
		createEReference(typeConstraintEClass, TYPE_CONSTRAINT__ALLOWED_TYPES);

		abstractModelElementsSetEClass = createEClass(ABSTRACT_MODEL_ELEMENTS_SET);

		constrainedModelElementsSubsetEClass = createEClass(CONSTRAINED_MODEL_ELEMENTS_SUBSET);
		createEReference(constrainedModelElementsSubsetEClass, CONSTRAINED_MODEL_ELEMENTS_SUBSET__OWNED_CONSTRAINTS);
		createEAttribute(constrainedModelElementsSubsetEClass, CONSTRAINED_MODEL_ELEMENTS_SUBSET__SCOPE);

		enumeratedModelElementsSetEClass = createEClass(ENUMERATED_MODEL_ELEMENTS_SET);
		createEReference(enumeratedModelElementsSetEClass, ENUMERATED_MODEL_ELEMENTS_SET__MODEL_ELEMENTS);

		featureValueConstraintEClass = createEClass(FEATURE_VALUE_CONSTRAINT);
		createEReference(featureValueConstraintEClass, FEATURE_VALUE_CONSTRAINT__FEATURE);
		createEReference(featureValueConstraintEClass, FEATURE_VALUE_CONSTRAINT__VALUE);

		evalContextEClass = createEClass(EVAL_CONTEXT);
		createEReference(evalContextEClass, EVAL_CONTEXT__MODEL_ELEMENT);
		createEAttribute(evalContextEClass, EVAL_CONTEXT__META_MODEL_ELEMENT);

		diagnosticEClass = createEClass(DIAGNOSTIC);
		createEAttribute(diagnosticEClass, DIAGNOSTIC__VALIDATION_STATUS);
		createEReference(diagnosticEClass, DIAGNOSTIC__RELATED_MODEL_ELEMENTS);
		createEAttribute(diagnosticEClass, DIAGNOSTIC__VALID);

		// Create enums
		scopeTypeEEnum = createEEnum(SCOPE_TYPE);
		validationStatusEEnum = createEEnum(VALIDATION_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		constraintLanguagesSpecEClass.getESuperTypes().add(this.getIdentifiedElement());
		constraintLanguageEClass.getESuperTypes().add(this.getIdentifiedElement());
		naturalConstraintLanguageEClass.getESuperTypes().add(this.getConstraintLanguage());
		formalConstraintLanguageEClass.getESuperTypes().add(this.getConstraintLanguage());
		serviceDescriptorEClass.getESuperTypes().add(this.getIdentifiedElement());
		formalLanguageLibraryEClass.getESuperTypes().add(this.getIdentifiedElement());
		expressionEClass.getESuperTypes().add(this.getIdentifiedElement());
		naturalLanguageExpressionEClass.getESuperTypes().add(this.getExpression());
		formalLanguageExpressionEClass.getESuperTypes().add(this.getExpression());
		constraintEClass.getESuperTypes().add(this.getIdentifiedElement());
		targetEClass.getESuperTypes().add(this.getIdentifiedElement());
		cardinalityConstraintEClass.getESuperTypes().add(this.getConstraint());
		formalLanguageConstraintEClass.getESuperTypes().add(this.getConstraint());
		typeConstraintEClass.getESuperTypes().add(this.getConstraint());
		abstractModelElementsSetEClass.getESuperTypes().add(this.getIdentifiedElement());
		constrainedModelElementsSubsetEClass.getESuperTypes().add(this.getAbstractModelElementsSet());
		enumeratedModelElementsSetEClass.getESuperTypes().add(this.getAbstractModelElementsSet());
		featureValueConstraintEClass.getESuperTypes().add(this.getConstraint());
		diagnosticEClass.getESuperTypes().add(this.getIdentifiedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constraintLanguagesSpecEClass, ConstraintLanguagesSpec.class, "ConstraintLanguagesSpec", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintLanguagesSpec_OwnedLanguages(), this.getConstraintLanguage(), this.getConstraintLanguage_Specification(), "ownedLanguages", null, 1, -1, ConstraintLanguagesSpec.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(constraintLanguagesSpecEClass, this.getConstraintLanguage(), "languageById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(constraintLanguagesSpecEClass, this.getConstraintLanguage(), "languageByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(constraintLanguageEClass, ConstraintLanguage.class, "ConstraintLanguage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraintLanguage_Specification(), this.getConstraintLanguagesSpec(), this.getConstraintLanguagesSpec_OwnedLanguages(), "specification", null, 1, 1, ConstraintLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naturalConstraintLanguageEClass, NaturalConstraintLanguage.class, "NaturalConstraintLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formalConstraintLanguageEClass, FormalConstraintLanguage.class, "FormalConstraintLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalConstraintLanguage_OwnedLibraries(), this.getFormalLanguageLibrary(), this.getFormalLanguageLibrary_Language(), "ownedLibraries", null, 0, -1, FormalConstraintLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormalConstraintLanguage_OwnedInterpreter(), this.getServiceDescriptor(), null, "ownedInterpreter", null, 1, 1, FormalConstraintLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormalConstraintLanguage_OwnedPersister(), this.getServiceDescriptor(), null, "ownedPersister", null, 0, 1, FormalConstraintLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormalConstraintLanguage_OwnedViewer(), this.getServiceDescriptor(), null, "ownedViewer", null, 0, 1, FormalConstraintLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormalConstraintLanguage_LibraryLocation(), ecorePackage.getEString(), "libraryLocation", null, 0, 1, FormalConstraintLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(formalConstraintLanguageEClass, this.getFormalLanguageLibrary(), "libraryByName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(formalConstraintLanguageEClass, this.getFormalLanguageLibrary(), "libraryById", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "id", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(serviceDescriptorEClass, ServiceDescriptor.class, "ServiceDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getServiceDescriptor_ServiceClass(), g1, "serviceClass", null, 1, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_ProviderId(), ecorePackage.getEString(), "providerId", null, 1, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formalLanguageLibraryEClass, FormalLanguageLibrary.class, "FormalLanguageLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalLanguageLibrary_OwnedExpression(), this.getFormalLanguageExpression(), null, "ownedExpression", null, 1, 1, FormalLanguageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormalLanguageLibrary_Default(), ecorePackage.getEBoolean(), "default", null, 1, 1, FormalLanguageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormalLanguageLibrary_Language(), this.getFormalConstraintLanguage(), this.getFormalConstraintLanguage_OwnedLibraries(), "language", null, 1, 1, FormalLanguageLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Language(), this.getConstraintLanguage(), null, "language", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Text(), ecorePackage.getEString(), "text", null, 1, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naturalLanguageExpressionEClass, NaturalLanguageExpression.class, "NaturalLanguageExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(formalLanguageExpressionEClass, FormalLanguageExpression.class, "FormalLanguageExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalLanguageExpression_UsedLibraries(), this.getFormalLanguageLibrary(), null, "usedLibraries", null, 0, -1, FormalLanguageExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormalLanguageExpression_UsedLibraryNames(), ecorePackage.getEString(), "usedLibraryNames", "", 0, -1, FormalLanguageExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getFormalLanguageExpression_UsedLibraryIds(), ecorePackage.getEString(), "usedLibraryIds", "", 0, -1, FormalLanguageExpression.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_Target(), this.getTarget(), null, "target", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTarget_Classifier(), ecorePackage.getEClassifier(), null, "classifier", null, 1, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Features(), ecorePackage.getEStructuralFeature(), null, "features", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityConstraintEClass, CardinalityConstraint.class, "CardinalityConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardinalityConstraint_OwnedCardinality(), this.getCardinality(), null, "ownedCardinality", null, 1, 1, CardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardinalityConstraint_OwnedModelElementsSubset(), this.getAbstractModelElementsSet(), null, "ownedModelElementsSubset", null, 1, 1, CardinalityConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_LowerBound(), ecorePackage.getEInt(), "lowerBound", null, 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_UpperBound(), ecorePackage.getEInt(), "upperBound", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formalLanguageConstraintEClass, FormalLanguageConstraint.class, "FormalLanguageConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalLanguageConstraint_Expression(), this.getFormalLanguageExpression(), null, "expression", null, 1, 1, FormalLanguageConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeConstraintEClass, TypeConstraint.class, "TypeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeConstraint_AllowedTypes(), ecorePackage.getEModelElement(), null, "allowedTypes", null, 0, -1, TypeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractModelElementsSetEClass, AbstractModelElementsSet.class, "AbstractModelElementsSet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constrainedModelElementsSubsetEClass, ConstrainedModelElementsSubset.class, "ConstrainedModelElementsSubset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstrainedModelElementsSubset_OwnedConstraints(), this.getConstraint(), null, "ownedConstraints", null, 0, -1, ConstrainedModelElementsSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstrainedModelElementsSubset_Scope(), this.getScopeType(), "scope", null, 1, 1, ConstrainedModelElementsSubset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumeratedModelElementsSetEClass, EnumeratedModelElementsSet.class, "EnumeratedModelElementsSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeratedModelElementsSet_ModelElements(), ecorePackage.getEObject(), null, "modelElements", null, 0, -1, EnumeratedModelElementsSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureValueConstraintEClass, FeatureValueConstraint.class, "FeatureValueConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureValueConstraint_Feature(), ecorePackage.getEStructuralFeature(), null, "feature", null, 1, 1, FeatureValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureValueConstraint_Value(), this.getFormalLanguageExpression(), null, "value", null, 1, 1, FeatureValueConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evalContextEClass, EvalContext.class, "EvalContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvalContext_ModelElement(), ecorePackage.getEObject(), null, "modelElement", null, 1, 1, EvalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvalContext_MetaModelElement(), ecorePackage.getEBoolean(), "metaModelElement", null, 1, 1, EvalContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(diagnosticEClass, Diagnostic.class, "Diagnostic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiagnostic_ValidationStatus(), this.getValidationStatus(), "validationStatus", null, 1, 1, Diagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagnostic_RelatedModelElements(), ecorePackage.getEObject(), null, "relatedModelElements", null, 0, -1, Diagnostic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiagnostic_Valid(), ecorePackage.getEBoolean(), "valid", null, 1, 1, Diagnostic.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scopeTypeEEnum, ScopeType.class, "ScopeType");
		addEEnumLiteral(scopeTypeEEnum, ScopeType.RESOURCE);
		addEEnumLiteral(scopeTypeEEnum, ScopeType.RESOURCE_SET);
		addEEnumLiteral(scopeTypeEEnum, ScopeType.ALL_REFERENCES);

		initEEnum(validationStatusEEnum, ValidationStatus.class, "ValidationStatus");
		addEEnumLiteral(validationStatusEEnum, ValidationStatus.VALID);
		addEEnumLiteral(validationStatusEEnum, ValidationStatus.WARNING);
		addEEnumLiteral(validationStatusEEnum, ValidationStatus.ERROR);
		addEEnumLiteral(validationStatusEEnum, ValidationStatus.NOT_APPLICABLE);

		// Create resource
		createResource(eNS_URI);
	}

} //ConstraintsPackageImpl
