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
package fr.labsticc.framework.settings.model.settings.provider;

import java.util.Collections;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.settings.ide.SettingsPlugin;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;
import fr.labsticc.framework.settings.service.ISettingsServiceDelegate;

public abstract class AbstractSettingsPropertyDescriptor extends ItemPropertyDescriptor {
	
	private final IExceptionHandler exceptionHandler;
	private final ISettingsServiceDelegate settingsDelegate;

    protected AbstractSettingsPropertyDescriptor( 	final ISettingsServiceDelegate p_settingsDelegate,
    												final AdapterFactory p_adapterFactory,
		    	      								final ResourceLocator p_resourceLocator,
		    	      								final IExceptionHandler p_exceptionHandler,
			      									final String p_displayName,
			      									final String p_description,
			      									final EStructuralFeature p_feature,
			      									final boolean pb_isSettable,
													final boolean pb_multiLine,
													final boolean pb_sortChoices,
													final Object p_staticImage,
													final String p_category,
													final String[] p_filterFlags ) {
    	super( 	p_adapterFactory, 
    			p_resourceLocator, 
    			p_displayName, 
    			p_description,
    			p_feature,
    			pb_isSettable,
				pb_multiLine,
				pb_sortChoices,
				p_staticImage,
				p_category,
				p_filterFlags );
    	
    	settingsDelegate = p_settingsDelegate;
    	exceptionHandler = p_exceptionHandler;
    }

	@Override
	public Set<?> getChoiceOfValues( final Object p_object ) {
		final PropertyValueWrapper wrapper = (PropertyValueWrapper) getPropertyValue( p_object );
		final Object value = wrapper.getEditableValue( p_object );
		
		final SettingsSpecification settingsSpec = getSettingsSpecification();
		
		try {
			return settingsDelegate.choiceOfValues( settingsSpec, getScope( (EObject) p_object ), (EReference) getFeature( null ), p_object, value );
		}
		catch( final Throwable p_th ) {
			exceptionHandler.handleException( p_th,  p_object );
			
			return Collections.emptySet();
		}
	}
	
	protected ISettingsServiceDelegate getSettingsDelegate() {
		return settingsDelegate;
	}
	
	protected SettingsSpecification getSettingsSpecification() {
		return SettingsPlugin.getDefault().getSpecification();
	}

	protected IExceptionHandler getExceptionHandler() {
		return exceptionHandler;
	}

	protected abstract Set<Resource> getScope( final EObject p_object )
	throws CoreException, ResourceAccessException;
}
