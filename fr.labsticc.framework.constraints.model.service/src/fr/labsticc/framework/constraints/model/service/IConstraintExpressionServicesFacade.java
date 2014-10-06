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
package fr.labsticc.framework.constraints.model.service;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.model.constraints.Constraint;
import fr.labsticc.framework.constraints.model.constraints.Diagnostic;
import fr.labsticc.framework.constraints.model.constraints.EvalContext;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.service.IConstraintServicesFacade;
import fr.labsticc.framework.core.exception.SystemException;

public interface IConstraintExpressionServicesFacade extends IConstraintServicesFacade {

	Object evaluateExpression( 	FormalLanguageExpression p_expression,
								Object p_context ) 
	throws SystemException, ConstraintException;

	Object evaluateExpression( 	FormalLanguageExpression p_expression,
								Object[] p_context ) 
	throws SystemException, ConstraintException;

	EvalContext createEvalContext( EModelElement p_metaModelElement );
	
	EvalContext createEvalContext( EObject p_modelElement );
	
	Diagnostic evaluate( 	Constraint p_constraint,
							EvalContext p_context ) 
	throws ConstraintException, SystemException;
//
//	Diagnostic evaluate( 	CardinalityConstraint p_constraint,
//							EvalContext p_context )
//	throws ConstraintException, SystemException;
//	
//	Diagnostic evaluate( 	TypeConstraint p_constraint,
//							EvalContext p_context );
//	
//	Diagnostic evaluate( 	TypeConstraint p_constraint,
//							EClass p_contextClass );
//	
//	Diagnostic evaluate( 	FeatureValueConstraint p_constraint,
//							EvalContext p_context )
//	throws ConstraintException, SystemException;
//	
//	Diagnostic evaluate( 	FormalLanguageConstraint p_constraint,
//							EvalContext p_context )
//	throws ConstraintException, SystemException;
}
