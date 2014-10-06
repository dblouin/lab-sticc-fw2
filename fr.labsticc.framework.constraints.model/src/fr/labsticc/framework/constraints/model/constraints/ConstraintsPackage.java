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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintsFactory
 * @model kind="package"
 * @generated
 */
public interface ConstraintsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constraints";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lab-sticc.fr/framework/constraints";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cst";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstraintsPackage eINSTANCE = fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.IdentifiedElementImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ConstraintLanguagesSpecImpl <em>Constraint Languages Spec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintLanguagesSpecImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstraintLanguagesSpec()
	 * @generated
	 */
	int CONSTRAINT_LANGUAGES_SPEC = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGES_SPEC__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGES_SPEC__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGES_SPEC__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned Languages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint Languages Spec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGES_SPEC_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ConstraintLanguageImpl <em>Constraint Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintLanguageImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstraintLanguage()
	 * @generated
	 */
	int CONSTRAINT_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGE__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGE__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGE__SPECIFICATION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_LANGUAGE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalConstraintLanguageImpl <em>Formal Constraint Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.FormalConstraintLanguageImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFormalConstraintLanguage()
	 * @generated
	 */
	int FORMAL_CONSTRAINT_LANGUAGE = 4;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.NaturalConstraintLanguageImpl <em>Natural Constraint Language</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.NaturalConstraintLanguageImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getNaturalConstraintLanguage()
	 * @generated
	 */
	int NATURAL_CONSTRAINT_LANGUAGE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_CONSTRAINT_LANGUAGE__ID = CONSTRAINT_LANGUAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_CONSTRAINT_LANGUAGE__NAME = CONSTRAINT_LANGUAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_CONSTRAINT_LANGUAGE__DESCRIPTION = CONSTRAINT_LANGUAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_CONSTRAINT_LANGUAGE__SPECIFICATION = CONSTRAINT_LANGUAGE__SPECIFICATION;

	/**
	 * The number of structural features of the '<em>Natural Constraint Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_CONSTRAINT_LANGUAGE_FEATURE_COUNT = CONSTRAINT_LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE__ID = CONSTRAINT_LANGUAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE__NAME = CONSTRAINT_LANGUAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE__DESCRIPTION = CONSTRAINT_LANGUAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE__SPECIFICATION = CONSTRAINT_LANGUAGE__SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Owned Libraries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES = CONSTRAINT_LANGUAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Interpreter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER = CONSTRAINT_LANGUAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Owned Persister</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER = CONSTRAINT_LANGUAGE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owned Viewer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER = CONSTRAINT_LANGUAGE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Library Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE__LIBRARY_LOCATION = CONSTRAINT_LANGUAGE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Formal Constraint Language</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_CONSTRAINT_LANGUAGE_FEATURE_COUNT = CONSTRAINT_LANGUAGE_FEATURE_COUNT + 5;


	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageLibraryImpl <em>Formal Language Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageLibraryImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFormalLanguageLibrary()
	 * @generated
	 */
	int FORMAL_LANGUAGE_LIBRARY = 6;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ExpressionImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageExpressionImpl <em>Formal Language Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageExpressionImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFormalLanguageExpression()
	 * @generated
	 */
	int FORMAL_LANGUAGE_EXPRESSION = 9;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.NaturalLanguageExpressionImpl <em>Natural Language Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.NaturalLanguageExpressionImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getNaturalLanguageExpression()
	 * @generated
	 */
	int NATURAL_LANGUAGE_EXPRESSION = 8;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ServiceDescriptorImpl <em>Service Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ServiceDescriptorImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getServiceDescriptor()
	 * @generated
	 */
	int SERVICE_DESCRIPTOR = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Service Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__SERVICE_CLASS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provider Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR__PROVIDER_ID = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_DESCRIPTOR_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_LIBRARY__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_LIBRARY__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_LIBRARY__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_LIBRARY__OWNED_EXPRESSION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_LIBRARY__DEFAULT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_LIBRARY__LANGUAGE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Formal Language Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_LIBRARY_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__LANGUAGE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__TEXT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_EXPRESSION__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_EXPRESSION__TEXT = EXPRESSION__TEXT;

	/**
	 * The number of structural features of the '<em>Natural Language Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURAL_LANGUAGE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_EXPRESSION__NAME = EXPRESSION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_EXPRESSION__DESCRIPTION = EXPRESSION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Language</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_EXPRESSION__LANGUAGE = EXPRESSION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_EXPRESSION__TEXT = EXPRESSION__TEXT;

	/**
	 * The feature id for the '<em><b>Used Libraries</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARIES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Used Library Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_NAMES = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Used Library Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_IDS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Formal Language Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__TARGET = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.CardinalityConstraintImpl <em>Cardinality Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.CardinalityConstraintImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getCardinalityConstraint()
	 * @generated
	 */
	int CARDINALITY_CONSTRAINT = 12;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.CardinalityImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 13;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageConstraintImpl <em>Formal Language Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageConstraintImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFormalLanguageConstraint()
	 * @generated
	 */
	int FORMAL_LANGUAGE_CONSTRAINT = 14;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.TypeConstraintImpl <em>Type Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.TypeConstraintImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getTypeConstraint()
	 * @generated
	 */
	int TYPE_CONSTRAINT = 15;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.AbstractModelElementsSetImpl <em>Abstract Model Elements Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.AbstractModelElementsSetImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getAbstractModelElementsSet()
	 * @generated
	 */
	int ABSTRACT_MODEL_ELEMENTS_SET = 16;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ConstrainedModelElementsSubsetImpl <em>Constrained Model Elements Subset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstrainedModelElementsSubsetImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstrainedModelElementsSubset()
	 * @generated
	 */
	int CONSTRAINED_MODEL_ELEMENTS_SUBSET = 17;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.EnumeratedModelElementsSetImpl <em>Enumerated Model Elements Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.EnumeratedModelElementsSetImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getEnumeratedModelElementsSet()
	 * @generated
	 */
	int ENUMERATED_MODEL_ELEMENTS_SET = 18;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FeatureValueConstraintImpl <em>Feature Value Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.FeatureValueConstraintImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFeatureValueConstraint()
	 * @generated
	 */
	int FEATURE_VALUE_CONSTRAINT = 19;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.EvalContextImpl <em>Eval Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.EvalContextImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getEvalContext()
	 * @generated
	 */
	int EVAL_CONTEXT = 20;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.DiagnosticImpl <em>Diagnostic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.DiagnosticImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getDiagnostic()
	 * @generated
	 */
	int DIAGNOSTIC = 21;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.TargetImpl
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CLASSIFIER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__FEATURES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

	/**
	 * The feature id for the '<em><b>Owned Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT__OWNED_CARDINALITY = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Owned Model Elements Subset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cardinality Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__LOWER_BOUND = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__UPPER_BOUND = 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_CONSTRAINT__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_CONSTRAINT__EXPRESSION = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Formal Language Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_LANGUAGE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTRAINT__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

	/**
	 * The feature id for the '<em><b>Allowed Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTRAINT__ALLOWED_TYPES = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_ELEMENTS_SET__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_ELEMENTS_SET__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_ELEMENTS_SET__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Abstract Model Elements Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MODEL_ELEMENTS_SET_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_MODEL_ELEMENTS_SUBSET__ID = ABSTRACT_MODEL_ELEMENTS_SET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_MODEL_ELEMENTS_SUBSET__NAME = ABSTRACT_MODEL_ELEMENTS_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_MODEL_ELEMENTS_SUBSET__DESCRIPTION = ABSTRACT_MODEL_ELEMENTS_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Owned Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_MODEL_ELEMENTS_SUBSET__OWNED_CONSTRAINTS = ABSTRACT_MODEL_ELEMENTS_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_MODEL_ELEMENTS_SUBSET__SCOPE = ABSTRACT_MODEL_ELEMENTS_SET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constrained Model Elements Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_MODEL_ELEMENTS_SUBSET_FEATURE_COUNT = ABSTRACT_MODEL_ELEMENTS_SET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_MODEL_ELEMENTS_SET__ID = ABSTRACT_MODEL_ELEMENTS_SET__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_MODEL_ELEMENTS_SET__NAME = ABSTRACT_MODEL_ELEMENTS_SET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_MODEL_ELEMENTS_SET__DESCRIPTION = ABSTRACT_MODEL_ELEMENTS_SET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_MODEL_ELEMENTS_SET__MODEL_ELEMENTS = ABSTRACT_MODEL_ELEMENTS_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumerated Model Elements Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATED_MODEL_ELEMENTS_SET_FEATURE_COUNT = ABSTRACT_MODEL_ELEMENTS_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CONSTRAINT__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CONSTRAINT__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CONSTRAINT__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CONSTRAINT__TARGET = CONSTRAINT__TARGET;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CONSTRAINT__FEATURE = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CONSTRAINT__VALUE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Value Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_VALUE_CONSTRAINT_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Model Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_CONTEXT__MODEL_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Meta Model Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_CONTEXT__META_MODEL_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Eval Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVAL_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__NAME = IDENTIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__DESCRIPTION = IDENTIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Validation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__VALIDATION_STATUS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Model Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__RELATED_MODEL_ELEMENTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Valid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC__VALID = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagnostic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGNOSTIC_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.ScopeType <em>Scope Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.ScopeType
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getScopeType()
	 * @generated
	 */
	int SCOPE_TYPE = 22;

	/**
	 * The meta object id for the '{@link fr.labsticc.framework.constraints.model.constraints.ValidationStatus <em>Validation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.labsticc.framework.constraints.model.constraints.ValidationStatus
	 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getValidationStatus()
	 * @generated
	 */
	int VALIDATION_STATUS = 23;

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage <em>Constraint Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Language</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage
	 * @generated
	 */
	EClass getConstraintLanguage();

	/**
	 * Returns the meta object for the container reference '{@link fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Specification</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage#getSpecification()
	 * @see #getConstraintLanguage()
	 * @generated
	 */
	EReference getConstraintLanguage_Specification();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage <em>Formal Constraint Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Constraint Language</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage
	 * @generated
	 */
	EClass getFormalConstraintLanguage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedLibraries <em>Owned Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Libraries</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedLibraries()
	 * @see #getFormalConstraintLanguage()
	 * @generated
	 */
	EReference getFormalConstraintLanguage_OwnedLibraries();

	/**
	 * Returns the meta object for the containment reference '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedInterpreter <em>Owned Interpreter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Interpreter</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedInterpreter()
	 * @see #getFormalConstraintLanguage()
	 * @generated
	 */
	EReference getFormalConstraintLanguage_OwnedInterpreter();

	/**
	 * Returns the meta object for the containment reference '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedPersister <em>Owned Persister</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Persister</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedPersister()
	 * @see #getFormalConstraintLanguage()
	 * @generated
	 */
	EReference getFormalConstraintLanguage_OwnedPersister();

	/**
	 * Returns the meta object for the containment reference '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedViewer <em>Owned Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Viewer</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getOwnedViewer()
	 * @see #getFormalConstraintLanguage()
	 * @generated
	 */
	EReference getFormalConstraintLanguage_OwnedViewer();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getLibraryLocation <em>Library Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library Location</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage#getLibraryLocation()
	 * @see #getFormalConstraintLanguage()
	 * @generated
	 */
	EAttribute getFormalConstraintLanguage_LibraryLocation();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.NaturalConstraintLanguage <em>Natural Constraint Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Constraint Language</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.NaturalConstraintLanguage
	 * @generated
	 */
	EClass getNaturalConstraintLanguage();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary <em>Formal Language Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Language Library</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary
	 * @generated
	 */
	EClass getFormalLanguageLibrary();

	/**
	 * Returns the meta object for the containment reference '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary#getOwnedExpression <em>Owned Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Expression</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary#getOwnedExpression()
	 * @see #getFormalLanguageLibrary()
	 * @generated
	 */
	EReference getFormalLanguageLibrary_OwnedExpression();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary#isDefault()
	 * @see #getFormalLanguageLibrary()
	 * @generated
	 */
	EAttribute getFormalLanguageLibrary_Default();

	/**
	 * Returns the meta object for the container reference '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Language</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary#getLanguage()
	 * @see #getFormalLanguageLibrary()
	 * @generated
	 */
	EReference getFormalLanguageLibrary_Language();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the reference '{@link fr.labsticc.framework.constraints.model.constraints.Expression#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Language</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Expression#getLanguage()
	 * @see #getExpression()
	 * @generated
	 */
	EReference getExpression_Language();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.Expression#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Expression#getText()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_Text();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression <em>Formal Language Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Language Expression</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression
	 * @generated
	 */
	EClass getFormalLanguageExpression();

	/**
	 * Returns the meta object for the reference list '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression#getUsedLibraries <em>Used Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Used Libraries</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression#getUsedLibraries()
	 * @see #getFormalLanguageExpression()
	 * @generated
	 */
	EReference getFormalLanguageExpression_UsedLibraries();

	/**
	 * Returns the meta object for the attribute list '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression#getUsedLibraryNames <em>Used Library Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Used Library Names</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression#getUsedLibraryNames()
	 * @see #getFormalLanguageExpression()
	 * @generated
	 */
	EAttribute getFormalLanguageExpression_UsedLibraryNames();

	/**
	 * Returns the meta object for the attribute list '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression#getUsedLibraryIds <em>Used Library Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Used Library Ids</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression#getUsedLibraryIds()
	 * @see #getFormalLanguageExpression()
	 * @generated
	 */
	EAttribute getFormalLanguageExpression_UsedLibraryIds();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the reference '{@link fr.labsticc.framework.constraints.model.constraints.Constraint#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Constraint#getTarget()
	 * @see #getConstraint()
	 * @generated
	 */
	EReference getConstraint_Target();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint <em>Cardinality Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality Constraint</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint
	 * @generated
	 */
	EClass getCardinalityConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint#getOwnedCardinality <em>Owned Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Cardinality</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint#getOwnedCardinality()
	 * @see #getCardinalityConstraint()
	 * @generated
	 */
	EReference getCardinalityConstraint_OwnedCardinality();

	/**
	 * Returns the meta object for the containment reference '{@link fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint#getOwnedModelElementsSubset <em>Owned Model Elements Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Owned Model Elements Subset</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint#getOwnedModelElementsSubset()
	 * @see #getCardinalityConstraint()
	 * @generated
	 */
	EReference getCardinalityConstraint_OwnedModelElementsSubset();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.Cardinality#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Cardinality#getLowerBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.Cardinality#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Cardinality#getUpperBound()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_UpperBound();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint <em>Formal Language Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Language Constraint</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint
	 * @generated
	 */
	EClass getFormalLanguageConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint#getExpression()
	 * @see #getFormalLanguageConstraint()
	 * @generated
	 */
	EReference getFormalLanguageConstraint_Expression();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.TypeConstraint <em>Type Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Constraint</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.TypeConstraint
	 * @generated
	 */
	EClass getTypeConstraint();

	/**
	 * Returns the meta object for the reference list '{@link fr.labsticc.framework.constraints.model.constraints.TypeConstraint#getAllowedTypes <em>Allowed Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Allowed Types</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.TypeConstraint#getAllowedTypes()
	 * @see #getTypeConstraint()
	 * @generated
	 */
	EReference getTypeConstraint_AllowedTypes();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.AbstractModelElementsSet <em>Abstract Model Elements Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Model Elements Set</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.AbstractModelElementsSet
	 * @generated
	 */
	EClass getAbstractModelElementsSet();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset <em>Constrained Model Elements Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrained Model Elements Subset</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset
	 * @generated
	 */
	EClass getConstrainedModelElementsSubset();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset#getOwnedConstraints <em>Owned Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Constraints</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset#getOwnedConstraints()
	 * @see #getConstrainedModelElementsSubset()
	 * @generated
	 */
	EReference getConstrainedModelElementsSubset_OwnedConstraints();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset#getScope()
	 * @see #getConstrainedModelElementsSubset()
	 * @generated
	 */
	EAttribute getConstrainedModelElementsSubset_Scope();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.EnumeratedModelElementsSet <em>Enumerated Model Elements Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumerated Model Elements Set</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.EnumeratedModelElementsSet
	 * @generated
	 */
	EClass getEnumeratedModelElementsSet();

	/**
	 * Returns the meta object for the reference list '{@link fr.labsticc.framework.constraints.model.constraints.EnumeratedModelElementsSet#getModelElements <em>Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Model Elements</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.EnumeratedModelElementsSet#getModelElements()
	 * @see #getEnumeratedModelElementsSet()
	 * @generated
	 */
	EReference getEnumeratedModelElementsSet_ModelElements();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint <em>Feature Value Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Value Constraint</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint
	 * @generated
	 */
	EClass getFeatureValueConstraint();

	/**
	 * Returns the meta object for the reference '{@link fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint#getFeature()
	 * @see #getFeatureValueConstraint()
	 * @generated
	 */
	EReference getFeatureValueConstraint_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint#getValue()
	 * @see #getFeatureValueConstraint()
	 * @generated
	 */
	EReference getFeatureValueConstraint_Value();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.EvalContext <em>Eval Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eval Context</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.EvalContext
	 * @generated
	 */
	EClass getEvalContext();

	/**
	 * Returns the meta object for the reference '{@link fr.labsticc.framework.constraints.model.constraints.EvalContext#getModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Element</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.EvalContext#getModelElement()
	 * @see #getEvalContext()
	 * @generated
	 */
	EReference getEvalContext_ModelElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.EvalContext#isMetaModelElement <em>Meta Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta Model Element</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.EvalContext#isMetaModelElement()
	 * @see #getEvalContext()
	 * @generated
	 */
	EAttribute getEvalContext_MetaModelElement();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.Diagnostic <em>Diagnostic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagnostic</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Diagnostic
	 * @generated
	 */
	EClass getDiagnostic();

	/**
	 * Returns the meta object for the reference list '{@link fr.labsticc.framework.constraints.model.constraints.Diagnostic#getRelatedModelElements <em>Related Model Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Model Elements</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Diagnostic#getRelatedModelElements()
	 * @see #getDiagnostic()
	 * @generated
	 */
	EReference getDiagnostic_RelatedModelElements();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.Diagnostic#isValid <em>Valid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Diagnostic#isValid()
	 * @see #getDiagnostic()
	 * @generated
	 */
	EAttribute getDiagnostic_Valid();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the reference '{@link fr.labsticc.framework.constraints.model.constraints.Target#getClassifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Classifier</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Target#getClassifier()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Classifier();

	/**
	 * Returns the meta object for the reference list '{@link fr.labsticc.framework.constraints.model.constraints.Target#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Features</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Target#getFeatures()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Features();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.Diagnostic#getValidationStatus <em>Validation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validation Status</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.Diagnostic#getValidationStatus()
	 * @see #getDiagnostic()
	 * @generated
	 */
	EAttribute getDiagnostic_ValidationStatus();

	/**
	 * Returns the meta object for enum '{@link fr.labsticc.framework.constraints.model.constraints.ScopeType <em>Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Type</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ScopeType
	 * @generated
	 */
	EEnum getScopeType();

	/**
	 * Returns the meta object for enum '{@link fr.labsticc.framework.constraints.model.constraints.ValidationStatus <em>Validation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Validation Status</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ValidationStatus
	 * @generated
	 */
	EEnum getValidationStatus();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.NaturalLanguageExpression <em>Natural Language Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natural Language Expression</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.NaturalLanguageExpression
	 * @generated
	 */
	EClass getNaturalLanguageExpression();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor <em>Service Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Descriptor</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor
	 * @generated
	 */
	EClass getServiceDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor#getServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Class</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor#getServiceClass()
	 * @see #getServiceDescriptor()
	 * @generated
	 */
	EAttribute getServiceDescriptor_ServiceClass();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor#getProviderId <em>Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider Id</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ServiceDescriptor#getProviderId()
	 * @see #getServiceDescriptor()
	 * @generated
	 */
	EAttribute getServiceDescriptor_ProviderId();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.IdentifiedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.IdentifiedElement#getName()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.labsticc.framework.constraints.model.constraints.IdentifiedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.IdentifiedElement#getDescription()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Description();

	/**
	 * Returns the meta object for class '{@link fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec <em>Constraint Languages Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Languages Spec</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec
	 * @generated
	 */
	EClass getConstraintLanguagesSpec();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec#getOwnedLanguages <em>Owned Languages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Languages</em>'.
	 * @see fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec#getOwnedLanguages()
	 * @see #getConstraintLanguagesSpec()
	 * @generated
	 */
	EReference getConstraintLanguagesSpec_OwnedLanguages();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstraintsFactory getConstraintsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ConstraintLanguageImpl <em>Constraint Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintLanguageImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstraintLanguage()
		 * @generated
		 */
		EClass CONSTRAINT_LANGUAGE = eINSTANCE.getConstraintLanguage();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_LANGUAGE__SPECIFICATION = eINSTANCE.getConstraintLanguage_Specification();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalConstraintLanguageImpl <em>Formal Constraint Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.FormalConstraintLanguageImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFormalConstraintLanguage()
		 * @generated
		 */
		EClass FORMAL_CONSTRAINT_LANGUAGE = eINSTANCE.getFormalConstraintLanguage();

		/**
		 * The meta object literal for the '<em><b>Owned Libraries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_CONSTRAINT_LANGUAGE__OWNED_LIBRARIES = eINSTANCE.getFormalConstraintLanguage_OwnedLibraries();

		/**
		 * The meta object literal for the '<em><b>Owned Interpreter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_CONSTRAINT_LANGUAGE__OWNED_INTERPRETER = eINSTANCE.getFormalConstraintLanguage_OwnedInterpreter();

		/**
		 * The meta object literal for the '<em><b>Owned Persister</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_CONSTRAINT_LANGUAGE__OWNED_PERSISTER = eINSTANCE.getFormalConstraintLanguage_OwnedPersister();

		/**
		 * The meta object literal for the '<em><b>Owned Viewer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_CONSTRAINT_LANGUAGE__OWNED_VIEWER = eINSTANCE.getFormalConstraintLanguage_OwnedViewer();

		/**
		 * The meta object literal for the '<em><b>Library Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_CONSTRAINT_LANGUAGE__LIBRARY_LOCATION = eINSTANCE.getFormalConstraintLanguage_LibraryLocation();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.NaturalConstraintLanguageImpl <em>Natural Constraint Language</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.NaturalConstraintLanguageImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getNaturalConstraintLanguage()
		 * @generated
		 */
		EClass NATURAL_CONSTRAINT_LANGUAGE = eINSTANCE.getNaturalConstraintLanguage();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageLibraryImpl <em>Formal Language Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageLibraryImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFormalLanguageLibrary()
		 * @generated
		 */
		EClass FORMAL_LANGUAGE_LIBRARY = eINSTANCE.getFormalLanguageLibrary();

		/**
		 * The meta object literal for the '<em><b>Owned Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_LANGUAGE_LIBRARY__OWNED_EXPRESSION = eINSTANCE.getFormalLanguageLibrary_OwnedExpression();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_LANGUAGE_LIBRARY__DEFAULT = eINSTANCE.getFormalLanguageLibrary_Default();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_LANGUAGE_LIBRARY__LANGUAGE = eINSTANCE.getFormalLanguageLibrary_Language();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ExpressionImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION__LANGUAGE = eINSTANCE.getExpression_Language();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__TEXT = eINSTANCE.getExpression_Text();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageExpressionImpl <em>Formal Language Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageExpressionImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFormalLanguageExpression()
		 * @generated
		 */
		EClass FORMAL_LANGUAGE_EXPRESSION = eINSTANCE.getFormalLanguageExpression();

		/**
		 * The meta object literal for the '<em><b>Used Libraries</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARIES = eINSTANCE.getFormalLanguageExpression_UsedLibraries();

		/**
		 * The meta object literal for the '<em><b>Used Library Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_NAMES = eINSTANCE.getFormalLanguageExpression_UsedLibraryNames();

		/**
		 * The meta object literal for the '<em><b>Used Library Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_LANGUAGE_EXPRESSION__USED_LIBRARY_IDS = eINSTANCE.getFormalLanguageExpression_UsedLibraryIds();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT__TARGET = eINSTANCE.getConstraint_Target();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.CardinalityConstraintImpl <em>Cardinality Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.CardinalityConstraintImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getCardinalityConstraint()
		 * @generated
		 */
		EClass CARDINALITY_CONSTRAINT = eINSTANCE.getCardinalityConstraint();

		/**
		 * The meta object literal for the '<em><b>Owned Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY_CONSTRAINT__OWNED_CARDINALITY = eINSTANCE.getCardinalityConstraint_OwnedCardinality();

		/**
		 * The meta object literal for the '<em><b>Owned Model Elements Subset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDINALITY_CONSTRAINT__OWNED_MODEL_ELEMENTS_SUBSET = eINSTANCE.getCardinalityConstraint_OwnedModelElementsSubset();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.CardinalityImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__LOWER_BOUND = eINSTANCE.getCardinality_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__UPPER_BOUND = eINSTANCE.getCardinality_UpperBound();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageConstraintImpl <em>Formal Language Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.FormalLanguageConstraintImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFormalLanguageConstraint()
		 * @generated
		 */
		EClass FORMAL_LANGUAGE_CONSTRAINT = eINSTANCE.getFormalLanguageConstraint();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_LANGUAGE_CONSTRAINT__EXPRESSION = eINSTANCE.getFormalLanguageConstraint_Expression();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.TypeConstraintImpl <em>Type Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.TypeConstraintImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getTypeConstraint()
		 * @generated
		 */
		EClass TYPE_CONSTRAINT = eINSTANCE.getTypeConstraint();

		/**
		 * The meta object literal for the '<em><b>Allowed Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_CONSTRAINT__ALLOWED_TYPES = eINSTANCE.getTypeConstraint_AllowedTypes();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.AbstractModelElementsSetImpl <em>Abstract Model Elements Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.AbstractModelElementsSetImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getAbstractModelElementsSet()
		 * @generated
		 */
		EClass ABSTRACT_MODEL_ELEMENTS_SET = eINSTANCE.getAbstractModelElementsSet();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ConstrainedModelElementsSubsetImpl <em>Constrained Model Elements Subset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstrainedModelElementsSubsetImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstrainedModelElementsSubset()
		 * @generated
		 */
		EClass CONSTRAINED_MODEL_ELEMENTS_SUBSET = eINSTANCE.getConstrainedModelElementsSubset();

		/**
		 * The meta object literal for the '<em><b>Owned Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_MODEL_ELEMENTS_SUBSET__OWNED_CONSTRAINTS = eINSTANCE.getConstrainedModelElementsSubset_OwnedConstraints();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINED_MODEL_ELEMENTS_SUBSET__SCOPE = eINSTANCE.getConstrainedModelElementsSubset_Scope();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.EnumeratedModelElementsSetImpl <em>Enumerated Model Elements Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.EnumeratedModelElementsSetImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getEnumeratedModelElementsSet()
		 * @generated
		 */
		EClass ENUMERATED_MODEL_ELEMENTS_SET = eINSTANCE.getEnumeratedModelElementsSet();

		/**
		 * The meta object literal for the '<em><b>Model Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATED_MODEL_ELEMENTS_SET__MODEL_ELEMENTS = eINSTANCE.getEnumeratedModelElementsSet_ModelElements();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.FeatureValueConstraintImpl <em>Feature Value Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.FeatureValueConstraintImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getFeatureValueConstraint()
		 * @generated
		 */
		EClass FEATURE_VALUE_CONSTRAINT = eINSTANCE.getFeatureValueConstraint();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_CONSTRAINT__FEATURE = eINSTANCE.getFeatureValueConstraint_Feature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_VALUE_CONSTRAINT__VALUE = eINSTANCE.getFeatureValueConstraint_Value();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.EvalContextImpl <em>Eval Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.EvalContextImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getEvalContext()
		 * @generated
		 */
		EClass EVAL_CONTEXT = eINSTANCE.getEvalContext();

		/**
		 * The meta object literal for the '<em><b>Model Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVAL_CONTEXT__MODEL_ELEMENT = eINSTANCE.getEvalContext_ModelElement();

		/**
		 * The meta object literal for the '<em><b>Meta Model Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVAL_CONTEXT__META_MODEL_ELEMENT = eINSTANCE.getEvalContext_MetaModelElement();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.DiagnosticImpl <em>Diagnostic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.DiagnosticImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getDiagnostic()
		 * @generated
		 */
		EClass DIAGNOSTIC = eINSTANCE.getDiagnostic();

		/**
		 * The meta object literal for the '<em><b>Related Model Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGNOSTIC__RELATED_MODEL_ELEMENTS = eINSTANCE.getDiagnostic_RelatedModelElements();

		/**
		 * The meta object literal for the '<em><b>Valid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC__VALID = eINSTANCE.getDiagnostic_Valid();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.TargetImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__CLASSIFIER = eINSTANCE.getTarget_Classifier();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__FEATURES = eINSTANCE.getTarget_Features();

		/**
		 * The meta object literal for the '<em><b>Validation Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGNOSTIC__VALIDATION_STATUS = eINSTANCE.getDiagnostic_ValidationStatus();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.ScopeType <em>Scope Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.ScopeType
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getScopeType()
		 * @generated
		 */
		EEnum SCOPE_TYPE = eINSTANCE.getScopeType();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.ValidationStatus <em>Validation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.ValidationStatus
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getValidationStatus()
		 * @generated
		 */
		EEnum VALIDATION_STATUS = eINSTANCE.getValidationStatus();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.NaturalLanguageExpressionImpl <em>Natural Language Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.NaturalLanguageExpressionImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getNaturalLanguageExpression()
		 * @generated
		 */
		EClass NATURAL_LANGUAGE_EXPRESSION = eINSTANCE.getNaturalLanguageExpression();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ServiceDescriptorImpl <em>Service Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ServiceDescriptorImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getServiceDescriptor()
		 * @generated
		 */
		EClass SERVICE_DESCRIPTOR = eINSTANCE.getServiceDescriptor();

		/**
		 * The meta object literal for the '<em><b>Service Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTOR__SERVICE_CLASS = eINSTANCE.getServiceDescriptor_ServiceClass();

		/**
		 * The meta object literal for the '<em><b>Provider Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_DESCRIPTOR__PROVIDER_ID = eINSTANCE.getServiceDescriptor_ProviderId();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.IdentifiedElementImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__NAME = eINSTANCE.getIdentifiedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__DESCRIPTION = eINSTANCE.getIdentifiedElement_Description();

		/**
		 * The meta object literal for the '{@link fr.labsticc.framework.constraints.model.constraints.impl.ConstraintLanguagesSpecImpl <em>Constraint Languages Spec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintLanguagesSpecImpl
		 * @see fr.labsticc.framework.constraints.model.constraints.impl.ConstraintsPackageImpl#getConstraintLanguagesSpec()
		 * @generated
		 */
		EClass CONSTRAINT_LANGUAGES_SPEC = eINSTANCE.getConstraintLanguagesSpec();

		/**
		 * The meta object literal for the '<em><b>Owned Languages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_LANGUAGES_SPEC__OWNED_LANGUAGES = eINSTANCE.getConstraintLanguagesSpec_OwnedLanguages();

	}

} //ConstraintsPackage
