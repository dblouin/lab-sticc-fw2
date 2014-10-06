/*******************************************************************************
 * Copyright (c) 2012 Lab-STICC Universite de Bretagne Sud, Lorient.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-B license available
 * at :
 * en : http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html
 * fr : http://www.cecill.info/licences/Licence_CeCILL-B_V1-fr.html
 * 
 * Contributors:
 * Dominique BLOUIN (Lab-STICC UBS), dominique.blouin@univ-ubs.fr
 ******************************************************************************/
package fr.labsticc.framework.constraints.model.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.model.constraints.AbstractModelElementsSet;
import fr.labsticc.framework.constraints.model.constraints.Cardinality;
import fr.labsticc.framework.constraints.model.constraints.CardinalityConstraint;
import fr.labsticc.framework.constraints.model.constraints.ConstrainedModelElementsSubset;
import fr.labsticc.framework.constraints.model.constraints.Constraint;
import fr.labsticc.framework.constraints.model.constraints.ConstraintsFactory;
import fr.labsticc.framework.constraints.model.constraints.Diagnostic;
import fr.labsticc.framework.constraints.model.constraints.EnumeratedModelElementsSet;
import fr.labsticc.framework.constraints.model.constraints.EvalContext;
import fr.labsticc.framework.constraints.model.constraints.FeatureValueConstraint;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageConstraint;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.model.constraints.ScopeType;
import fr.labsticc.framework.constraints.model.constraints.Target;
import fr.labsticc.framework.constraints.model.constraints.TypeConstraint;
import fr.labsticc.framework.constraints.model.constraints.ValidationStatus;
import fr.labsticc.framework.constraints.service.DefaultConstraintServicesFacade;
import fr.labsticc.framework.constraints.service.IConstraintInterpretationAS;
import fr.labsticc.framework.constraints.service.IConstraintPersistenceAS;
import fr.labsticc.framework.core.exception.SystemException;

public class DefaultConstraintExpressionServicesFacade extends DefaultConstraintServicesFacade implements IConstraintExpressionServicesFacade {
	
	private static final Diagnostic VALID_DIAGNOSTIC = ConstraintsFactory.eINSTANCE.createDiagnostic();
	
	private static final Diagnostic NOT_APPLICABLE_DIAGNOSTIC = ConstraintsFactory.eINSTANCE.createDiagnostic();
	
	static {
		VALID_DIAGNOSTIC.setValidationStatus( ValidationStatus.VALID );
		NOT_APPLICABLE_DIAGNOSTIC.setValidationStatus( ValidationStatus.NOT_APPLICABLE );
	}

	public DefaultConstraintExpressionServicesFacade( 	final Map<String, IConstraintInterpretationAS> p_interpreterServices,
														final Map<String, IConstraintPersistenceAS> p_persistenceServices ) {
		super( p_interpreterServices, p_persistenceServices );
	}

	@Override
	public Object evaluateExpression( 	final FormalLanguageExpression p_expression,
										final Object p_context ) 
	throws SystemException, ConstraintException {
		@SuppressWarnings("unchecked")
		final List<Object> result = ( List<Object>) evaluateExpression( p_expression, new Object[]{ p_context } );
		
		return result.isEmpty() ? null : result.get( 0 );
	}

	/**
	 * @param p_constraintExpr
	 * @return
	 */
	protected Map<String, String> libraries( final FormalLanguageExpression p_constraintExpr ) {
		final Map<String, String> libraries = new LinkedHashMap<String, String>();
		
		for ( final FormalLanguageLibrary library : p_constraintExpr.getUsedLibraries() ) {
			final FormalLanguageExpression expression = library.getOwnedExpression();
			
			if ( expression != null ) {
				libraries.put( library.getId(), expression.getText() );
			}
		}
		
		return libraries;
	}

	@Override
	public Object evaluateExpression( 	final FormalLanguageExpression p_expression,
										final Object[] p_context )
	throws SystemException,	ConstraintException {
		return evaluateConstraint( 	p_expression.getLanguage().getId(),
									p_expression.getText(),
									libraries( p_expression ),
									false,
									p_context );
	}
	
	public EvalContext createEvalContext( final EObject p_modelElement ) {
		final EvalContext context = ConstraintsFactory.eINSTANCE.createEvalContext();
		context.setModelElement( p_modelElement );
		context.setMetaModelElement( false );
		
		return context;
	}
	
	public EvalContext createEvalContext( final EModelElement p_metaModelElement ) {
		final EvalContext context = ConstraintsFactory.eINSTANCE.createEvalContext();
		context.setModelElement( p_metaModelElement );
		context.setMetaModelElement( true );
		
		return context;
	}
	
	private boolean isApplicable( 	final Constraint p_constraint,
									final EvalContext p_context ) {
		if ( p_context.isMetaModelElement() ) {
			return p_constraint instanceof CardinalityConstraint;
		}

		final Target target = p_constraint.getTarget();
		final EClassifier classifier = target.getClassifier();
		final EObject element = p_context.getModelElement();
		
		// FIXME: handle features
		return classifier == element || classifier.isInstance( element );
	}
	
	public Diagnostic evaluate( final Constraint p_constraint,
								final EvalContext p_context ) 
	throws ConstraintException, SystemException {
		if ( isApplicable( p_constraint, p_context ) ) {
			if ( p_constraint instanceof CardinalityConstraint ) {
				return evaluate( (CardinalityConstraint) p_constraint, p_context );
			}
			
			if ( p_constraint instanceof TypeConstraint ) {
				return evaluate( (TypeConstraint) p_constraint, p_context );
			}
			
			if ( p_constraint instanceof FeatureValueConstraint ) {
				return evaluate( (FeatureValueConstraint) p_constraint, p_context );
			}
			
			if ( p_constraint instanceof FormalLanguageConstraint ) {
				return evaluate( (FormalLanguageConstraint) p_constraint, p_context );
			}
			
			throw new UnsupportedOperationException( "Usupported constraint type; " + p_constraint + "." );
		}
		
		return NOT_APPLICABLE_DIAGNOSTIC;
	}
	
	private Diagnostic evaluate( 	final CardinalityConstraint p_constraint,
									final EvalContext p_context )
	throws ConstraintException, SystemException {
		final Cardinality cardinality = p_constraint.getOwnedCardinality();
		final AbstractModelElementsSet modelElementsSet = p_constraint.getOwnedModelElementsSubset();
		final EObject contextModelElem = p_context.getModelElement();
		
		if ( p_context.isMetaModelElement() ) {
			if ( 	contextModelElem instanceof EClass && modelElementsSet instanceof ConstrainedModelElementsSubset &&
					cardinality.getLowerBound() == 0 && cardinality.getUpperBound() == 0 ) {
				
				for ( final Constraint cst : ( (ConstrainedModelElementsSubset) modelElementsSet ).getOwnedConstraints() ) {
					if ( cst instanceof TypeConstraint ) {
						final Diagnostic diag = evaluate( (TypeConstraint) cst, (EClass) contextModelElem );
						
						if ( !diag.isValid() ) {
							return VALID_DIAGNOSTIC;
						}
					}
					else {
						return VALID_DIAGNOSTIC;
					}
				}
				
				return createInvalidDiagnostic( null );
			}
			
			return VALID_DIAGNOSTIC;
		}

		final Collection<EObject> elements = modelElements( modelElementsSet, contextModelElem );
		
		if ( 	elements.size() >= cardinality.getLowerBound() &&
				( cardinality.getUpperBound() < 0 || elements.size() <= cardinality.getUpperBound() ) ) {
			return VALID_DIAGNOSTIC;
		}

		return createInvalidDiagnostic( elements );
	}
	
	private Diagnostic createInvalidDiagnostic( final Collection<EObject> p_modelElements ) {
		final Diagnostic diag = ConstraintsFactory.eINSTANCE.createDiagnostic();
		diag.setValidationStatus( ValidationStatus.ERROR );
		
		if ( p_modelElements != null ) {
			diag.getRelatedModelElements().addAll( p_modelElements );
		}
		
		return diag;
	}
	
	private Diagnostic evaluate( 	final TypeConstraint p_constraint,
									final EvalContext p_context ) {
		final EObject modelElem = p_context.getModelElement();
		
		if ( p_context.isMetaModelElement() && modelElem instanceof EClass ) {
			return evaluate( p_constraint, (EClass) modelElem );
		}
		
		return evaluate( p_constraint, modelElem.eClass() );
	}
	
	private Diagnostic evaluate( 	final TypeConstraint p_constraint,
									final EClass p_contextClass ) {
		for ( final EModelElement elementType : p_constraint.getAllowedTypes() ) {
			if ( p_contextClass == elementType || p_contextClass.getEAllSuperTypes().contains( elementType ) ) {
				return VALID_DIAGNOSTIC;
			}
		}
		
		return createInvalidDiagnostic( null );
	}
	
	private Diagnostic evaluate( 	final FeatureValueConstraint p_constraint,
									final EvalContext p_context )
	throws ConstraintException, SystemException {
		if ( p_context.isMetaModelElement() ) {
			throw new IllegalArgumentException( p_constraint.eClass().getName() + " not applicable to meta-model level." );
		}
		
		final EStructuralFeature feature = p_constraint.getFeature();
		final EObject modelElem = p_context.getModelElement();
		final Object attValue = modelElem.eGet( feature );
		
		final Object expectedValue = evaluateExpression( p_constraint.getValue(), modelElem );
		
		if ( attValue == null ) {
			return expectedValue == null ? VALID_DIAGNOSTIC : createInvalidDiagnostic( null );
		}
		
		if ( attValue.equals( expectedValue ) ) {
			return VALID_DIAGNOSTIC;
		}
		
		return createInvalidDiagnostic( null );
	}
	
	private Diagnostic evaluate( 	final FormalLanguageConstraint p_constraint,
									final EvalContext p_context )
	throws ConstraintException, SystemException {
		if ( p_context.isMetaModelElement() ) {
			throw new IllegalArgumentException( p_constraint.eClass().getName() + " not applicable to meta-model level." );
		}
		
		final EObject modelElem = p_context.getModelElement();
		
		if ( (Boolean) evaluateExpression( p_constraint.getExpression(), modelElem ) ) {
			return VALID_DIAGNOSTIC;
		}
		
		return createInvalidDiagnostic( null );
	}
	
	private Collection<EObject> modelElements( 	final AbstractModelElementsSet p_set,
												final EObject p_context )
	throws ConstraintException, SystemException {
		if ( p_set instanceof EnumeratedModelElementsSet ) {
			return modelElements( (EnumeratedModelElementsSet) p_set );
		}

		if ( p_set instanceof ConstrainedModelElementsSubset ) {
			return modelElements( (ConstrainedModelElementsSubset) p_set, p_context );
		}
		
		throw new UnsupportedOperationException( "Usupported model elements set type; " + p_set + "." );
	}
	
	private Collection<EObject> modelElements( final EnumeratedModelElementsSet p_set ) {
		return p_set.getModelElements();
	}
	
	private Collection<EObject> modelElements( 	final ConstrainedModelElementsSubset p_set,
												final EObject p_context )
	throws ConstraintException, SystemException {
		final Collection<EObject> elements = new HashSet<EObject>();
		final Iterator<EObject> scopeIt = scope( p_set.getScope(), p_context );
		
		while( scopeIt.hasNext() ) {
			final EObject element = scopeIt.next();
			boolean valid = true;
			
			for ( final Constraint constraint : p_set.getOwnedConstraints() ) {
				final Diagnostic diag = evaluate( constraint, createEvalContext( element ) );
				
				if ( !diag.isValid() ) {
					valid = false;
					
					break;
				}
			}
			
			if ( valid ) {
				elements.add( element );
			}
		}
		
		return elements;
	}
	
	private Iterator<EObject> scope( 	final ScopeType p_scopeType,
										final EObject p_context ) {
		return p_context.eAllContents();
		// FIXME: Remove scope attribute
//		switch ( p_scopeType ) {
//			case ALL_REFERENCES:
//				return EMFUtil.getAllRootReferredObjects( p_context ).iterator();
//
//			case RESOURCE:
//				return p_context.eResource().getAllContents();
//
//			case RESOURCE_SET:
//				return EcoreUtil.getAllContents( p_context.eResource().getResourceSet(), false );
//	
//			default:
//				throw new UnsupportedOperationException( "Usupported scope type; " + p_scopeType + "." );
//		}
	}
}
