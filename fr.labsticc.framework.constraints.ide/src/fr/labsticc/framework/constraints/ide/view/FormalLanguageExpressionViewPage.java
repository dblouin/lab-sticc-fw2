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
package fr.labsticc.framework.constraints.ide.view;

import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;

import fr.labsticc.framework.constraints.ide.ConstraintsIDEPlugin;
import fr.labsticc.framework.constraints.ide.IDEConstraintExpressionServicesDelegate;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.service.IConstraintExpressionServicesFacade;
import fr.labsticc.framework.constraints.view.IConstraintViewersConfiguration;
import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.ide.viewpart.AbstractCompositeEditorViewPage;

public class FormalLanguageExpressionViewPage extends AbstractCompositeEditorViewPage<FormalLanguageExpression> {
	
	private static final String BASE_IMG_DIR = "icons/";

	private final Image externalImage;

	private ConstraintExpressionPanel pnlConstraint;
	private final IConstraintExpressionPanelActionHandler actionHandler;
	private final IConstraintExpressionServicesFacade cstDelegate;
	
	public FormalLanguageExpressionViewPage( 	final Composite p_parent,
												final IConstraintViewersConfiguration p_constraintViewsConfig,
												final IExceptionHandler p_execeptionHandler ) 
	throws ResourceAccessException {
		super( p_parent, SWT.NULL, p_execeptionHandler );
		

		pnlConstraint = null;
		externalImage = createImage( "expressionsView.gif" );
		
		try {
			cstDelegate = new IDEConstraintExpressionServicesDelegate();
			actionHandler = new TransactionalCstPanelActionHandler( null, cstDelegate, p_execeptionHandler );
			createControls( p_constraintViewsConfig );
		}
		catch ( final CoreException p_ex ) {
			throw new ResourceAccessException( p_ex );
		}
	}
	
	protected Image createImage( final String p_imagePath ) {
		return new Image( 	getDisplay(), 
							Thread.currentThread().getContextClassLoader().getResourceAsStream( BASE_IMG_DIR + p_imagePath ) );
	}
	
	@Override
	public String getExternalTitle() {
		return "Expression";
	}
	
	@Override
	public Image getExternalImage() {
		return externalImage;
	}
	
	@Override
	public void dispose() {
		super.dispose();

		if ( !externalImage.isDisposed() ) {
			externalImage.dispose();
		}
	}

	private void createControls( final IConstraintViewersConfiguration p_constraintViewsConfig ) {
		setLayout( new FillLayout() );
		pnlConstraint = new ConstraintExpressionPanel( 	this,
														SWT.NULL,
														actionHandler,
														getExceptionHandler(),
														actionHandler.getExpression() );
	}
	
	@Override
	public void displayData( final FormalLanguageExpression p_expression ) {
		// Parent class sets the selected object
		super.displayData( p_expression );
		
		actionHandler.setExpression( p_expression );

		final Set<String> definedLanguageIds = new TreeSet<String>();
		
		for ( final ConstraintLanguage language : ConstraintsIDEPlugin.getDefault().getDefinedConstraintLanguages() ) {
			if ( language instanceof FormalConstraintLanguage ) {
				definedLanguageIds.add( language.getId() );
			}
		}

		if ( pnlConstraint != null ) {
			final String languageId;
			
			if ( p_expression.getLanguage() == null ) {
				languageId = null;
			}
			else {
				languageId = p_expression.getLanguage().getId();
			}
			
			pnlConstraint.configure( definedLanguageIds, languageId );
			pnlConstraint.displayData( p_expression );
		}
	}
	
	public void setContext( final EObject p_context ) {
		actionHandler.setContext( p_context );
	}
}
