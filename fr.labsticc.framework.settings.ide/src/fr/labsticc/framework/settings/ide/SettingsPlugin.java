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
package fr.labsticc.framework.settings.ide;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.labsticc.framework.constraints.ide.IDEConstraintExpressionServicesDelegate;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.emf.core.resource.BundleEMFResourceHandler;
import fr.labsticc.framework.ide.util.PluginUtil;
import fr.labsticc.framework.settings.ide.view.ISettingsPreferenceConstants;
import fr.labsticc.framework.settings.model.settings.ModelInterface;
import fr.labsticc.framework.settings.model.settings.ModelingLanguage;
import fr.labsticc.framework.settings.model.settings.ServiceDescriptor;
import fr.labsticc.framework.settings.model.settings.SettingsFactory;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;
import fr.labsticc.framework.settings.service.DefaultSettingsServiceDelegate;
import fr.labsticc.framework.settings.service.ISettingsServiceDelegate;

public class SettingsPlugin extends AbstractUIPlugin implements IResourceChangeListener {

	private static final String SETTINGS_MODEL_DEF_LOC_EXT_ID = "settingsModelDefaultLocation";
	private static final String MODEL_LOC_ELEM = "modelLocation";
	private static final String MODEL_LOC_URI_ATT = "uri";

	private static final BundleEMFResourceHandler resourceHandler = new BundleEMFResourceHandler();

	// The shared instance
	private static SettingsPlugin plugin;

	private SettingsSpecification specification;

	private Logger logger;

	private final Map<String, ModelInterface> modelInterfaces;

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static SettingsPlugin getDefault() {
		return plugin;
	}

	/**
	 * The constructor
	 */
	public SettingsPlugin() {
		specification = null;
		modelInterfaces = new HashMap<String, ModelInterface>();

		try {
			logger = LoggerFactory.getLogger( getClass() );
		}
		catch( final Throwable p_th ) {
			p_th.printStackTrace();
		}
	}

	private void initSettings() 
	throws ResourceAccessException, IOException, IllegalAccessException, InstantiationException {
		final IPreferenceStore prefStore = getPreferenceStore();
		final String location = prefStore.getString( ISettingsPreferenceConstants.DEFAULT_SETTINGS_MODEL_LOCATION );
		
		if ( location == null || "".equals( location ) ) {
			throw new NullPointerException( "Default settings model location should not be null." );
		}
		
		final URI uri = URI.createURI( location, true );
		final ResourceSet resSet = new ResourceSetImpl();
		final URIConverter uriConverter = resSet.getURIConverter();
		
		// Ticket #231 
		if ( uriConverter.exists( uri, null ) && !isReadOnly( uri ) ) {
				//!Boolean.TRUE.equals( uriConverter.getAttributes( uri, null ).get( URIConverter.ATTRIBUTE_READ_ONLY ) )) {
			
			// Reuse the local model if it is not read only (has been modified by user).
			final Resource specificationResource = resSet.getResource( uri, true );
			specification = (SettingsSpecification) specificationResource.getContents().get( 0 );
		}
		else {
			// Otherwise re-copy the specification released by config plugin to make sure new elements are released.
			final Resource specificationResource = resSet.createResource( uri );
			
			// Replace the object transfer with a byte copy because otherwise EMF resolves the config and sets the
			// referenced resource path as absolute.
			//specificationResource.getContents().add( initDefaultSpecification() );
			final SettingsSpecification specif = initDefaultSpecification();
			final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
			
			if ( specif.eResource() == null ) {
				specification = specif;
			}
			else {
				specif.eResource().save( outStream, null );
				specificationResource.load( new ByteArrayInputStream( outStream.toByteArray() ), null );
				specification = (SettingsSpecification) specificationResource.getContents().get( 0 );
			}
			
			saveSpecification( uri );
		}

		modelInterfaces.clear();
		
		if ( specification != null ) {
			
			// Builds the model interfaces to be used by tools to interact with other models.
			for ( final ModelingLanguage language : getSpecification().getOwnedLanguages() ) {
				final ServiceDescriptor servDescr = language.getOwnedModelInterface();
				
				if ( servDescr != null && servDescr.getServiceClass() != null ) {
					final ModelInterface modInterface = servDescr.getServiceClass().newInstance();
					modelInterfaces.put( language.getId(), modInterface );
				}
			}
		}
	}
	
	public void reloadSpecification() 
	throws Exception {
		initSettings();
	}
	
	/**
	 * The read only test on eclipse resources does not seem to work Ticket #231.
	 * @param p_uri
	 * @return
	 * @throws ResourceAccessException
	 */
	private boolean isReadOnly( final URI p_uri ) 
	throws ResourceAccessException {
		final String resourcePath = resourceHandler.locateResource( p_uri.toString() );

		return !new File( resourcePath ).canWrite();
	}
	
	private void setReadOnly( 	final URI p_uri,
								final boolean pb_readOnly ) 
	throws  ResourceAccessException {
		final String resourcePath = resourceHandler.locateResource( p_uri.toString() );

		new File( resourcePath ).setWritable( !pb_readOnly );
	}
	
	private void saveSpecification( final URI p_destUri ) 
	throws ResourceAccessException, IOException {
		final ResourceSet resSet = new ResourceSetImpl();
		
		if ( p_destUri.isPlatformPlugin() ) {
			// Use absolute path because platform plugin protocol does not allow save operation.
			final String absPath = resourceHandler.locateResource( p_destUri.toString() );
			
			if ( absPath == null ) {
				throw new ResourceAccessException( "Cannot locate resource " + p_destUri + "!" );
			}

			final Resource fileRes = resSet.getResource( URI.createFileURI( absPath ), true );
			fileRes.getContents().clear();
			fileRes.getContents().add( specification );
			fileRes.save( null );
			
			// Reload the resource so that it has the proper protocol.
			specification = (SettingsSpecification) resSet.getResource( p_destUri, true ).getContents().get( 0 );
		}
		else {
			final Resource newResource;
			
			if ( resSet.getURIConverter().exists( p_destUri, null ) ) {
				newResource = resSet.getResource( p_destUri, true );
				newResource.getContents().clear();
			}
			else {
				newResource = resSet.createResource( p_destUri );
			}
			
			newResource.getContents().add( specification );
			setReadOnly( p_destUri, false );
			newResource.save( null );
		}
		
		setReadOnly( p_destUri, true );
//		final URI specUri = specification.eResource().getURI();
//		
//		if ( specUri.isPlatformPlugin() ) {
//			// Use absolute path because platform plugin protocol does not allow save operation.
//			final String absPath = resourceHandler.locateResource( specUri.toString() );
//			final ResourceSet resSet = new ResourceSetImpl();
//			final Resource fileRes = resSet.getResource( URI.createFileURI( absPath ), true );
//			fileRes.getContents().clear();
//			fileRes.getContents().add( specification );
//			fileRes.save( null );
//			
//			// Reload the resource so that it has the proper protocol.
//			specification = (SettingsSpecification) resSet.getResource( specUri, true ).getContents().get( 0 );
//		}
//		else {
//			specification.eResource().save( null );
//		}
	}
	
	private SettingsSpecification initDefaultSpecification() 
	throws ResourceAccessException {
		final Collection<String> bundleIdsDefaultModel = /*Arrays.asList( "fr.openpeople.ide.settings" );//*/getIdsOfBundlesDeclaringDefaultSettingsModelLocation();
		SettingsSpecification specification = null;
		final ResourceSet resSet = new ResourceSetImpl();
		
		for ( final String bundleIdDefaultModel : bundleIdsDefaultModel ) {
			final URI uri = URI.createPlatformPluginURI( bundleIdDefaultModel + "/resources/settings/default.settings", true );
			final URIConverter uriConverter = resSet.getURIConverter();
			
			// Only reuse the existing settings model if it has been changed by users (not read only anymore).
			if ( uriConverter.exists( uri, null ) ) {
				final Resource modelRes = resSet.getResource( uri, true );
				specification = mergeSettingsSpecifications( specification, (SettingsSpecification) modelRes.getContents().get( 0 ) );
			}
		}
		
		if ( specification == null ) {
			return createDefaultSettingsSpecification();
		}
		
		return specification;
	}
	
	private SettingsSpecification mergeSettingsSpecifications( 	final SettingsSpecification p_existingSpec,
																final SettingsSpecification p_newSpec ) {
		if ( p_existingSpec == null ) {
			return p_newSpec;
		}
		
		if ( p_newSpec == null ) {
			return p_existingSpec;
		}
		
		// TODO: See if we want this finally
		return p_newSpec;
		
		// Matching model elements
//		try {
//			final MatchModel match = MatchService.doContentMatch( p_existingSpec, p_newSpec, Collections.<String, Object> emptyMap() );
//			
//			// Computing differences
//			final DiffModel diff = DiffService.doDiff( match, false );
//			
//			// Merges all differences from model1 to model2
//			final List<DiffElement> differences = new ArrayList<DiffElement>( diff.getOwnedElements() );
//			MergeService.merge( differences, false );		
//			
//			return p_existingSpec;//EMFUtil.merge( p_existingSpec, p_newSpec );
//		}
//		catch ( final InterruptedException p_ex ) {
//			throw new IllegalStateException( p_ex );
//		}
	}
	
	private SettingsSpecification createDefaultSettingsSpecification() {
		final SettingsSpecification spec = SettingsFactory.eINSTANCE.createSettingsSpecification();
		spec.setName( "Default Settings Specification" );
		spec.setDescription( "This settings specification was automatically created because specified specification did not exists." );
		
		return spec;
	}
	
	private Collection<String> getIdsOfBundlesDeclaringDefaultSettingsModelLocation() {
		final Collection<String> bundleIds = new ArrayList<String>();
		
		for( final IExtension extension : PluginUtil.sortExtensionsByDependencies( PluginUtil.getExtensionPointExtensions( getBundle(), SETTINGS_MODEL_DEF_LOC_EXT_ID ) ) ) {
			for( final IConfigurationElement confElem : extension.getConfigurationElements() ) {
				if ( MODEL_LOC_ELEM.equals ( confElem.getName() ) ) {
					bundleIds.add( extension.getNamespaceIdentifier() );
				}
			}
		}

		return bundleIds;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start( final BundleContext p_context )
	throws Exception {
		super.start( p_context );
	
		plugin = this;
		
		try {
			initSettings();
			ResourcesPlugin.getWorkspace().addResourceChangeListener( this );
		}
		catch ( final Exception p_ex ) {
			logger.error( toString(), p_ex );
			
			throw p_ex;
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop( final BundleContext p_context )
	throws Exception {
		plugin = null;
		specification = null;
		ResourcesPlugin.getWorkspace().removeResourceChangeListener( this );
		
		super.stop( p_context );
	}
	
	public SettingsSpecification getSpecification() {
		return specification;
	}
	
	public Collection<ModelInterface> allModelInterfaces() {
		return modelInterfaces.values();
	}

	public ModelInterface modelInterface( final String p_languageId ) {
		return modelInterfaces.get( p_languageId );
	}
	
	public String getDefaultSettingsModelLocation() {
		String uri = null;

		for( final IExtension extension : PluginUtil.getExtensionPointExtensions( getBundle(), SETTINGS_MODEL_DEF_LOC_EXT_ID ) ) {
			for( final IConfigurationElement confElem : extension.getConfigurationElements() ) {
				if ( MODEL_LOC_ELEM.equals ( confElem.getName() ) ) {
					uri = confElem.getAttribute( MODEL_LOC_URI_ATT );
				}
			}
		}
		
		return uri;
	}
	
	@Override
	public void resourceChanged( final IResourceChangeEvent p_event ) {
		final IResourceDelta delta = p_event.getDelta();
		
		// DB: Somehow the delta is sometimes null...
		if ( delta != null ) {
			final IResourceDeltaVisitor visitor = new IResourceDeltaVisitor() {
				@Override
				public boolean visit( final IResourceDelta delta ) {
					if ( 	delta.getFlags() != IResourceDelta.MARKERS &&
							delta.getResource().getType() == IResource.FILE ) {
						if ( (delta.getKind() & (IResourceDelta.CHANGED | IResourceDelta.REMOVED)) != 0 ) {
							final String resPath = delta.getFullPath().toString();
							
							if ( resPath.equals( specification.eResource().getURI().toString() ) ) {
								settingsSpecificationChanged();
								
								return false;
							}
						}
					}
					
					return true;
				}
				
			};
	
			try {
				delta.accept( visitor );
			}
			catch ( final CoreException p_exception ) {
				throw new RuntimeException( p_exception );
			}
		}
	}

	public void settingsSpecificationChanged( final Collection<Resource> p_changedResources ) 
	throws ResourceAccessException {
		if ( specification != null ) {
			if ( p_changedResources == null ) {
				settingsSpecificationChanged();
			}
			else {
				final URI specUri = specification.eResource().getURI();
				final URI absSpecUri = URI.createFileURI( resourceHandler.locateResource( specUri.toString() ) );
				
				for ( final Resource resource : p_changedResources ) {
					final URI changedUri = resource.getURI();
					
					if ( specUri.equals( changedUri ) || absSpecUri.equals( changedUri ) ) {
						settingsSpecificationChanged();
						
						break;
					}
				}
			}
		}
	}
	
	private void settingsSpecificationChanged() {
		try {
			if ( specification != null ) {
				final Resource resource = specification.eResource();
				resource.unload();

				// Need to call init settings to update the specification object.
				initSettings();
			}
		}
		catch( final Throwable p_th ) {
			throw new RuntimeException( p_th );
		}
	}
	
	public ISettingsServiceDelegate getSettingsDelegate() 
	throws ResourceAccessException {
		try {
			return new DefaultSettingsServiceDelegate( new IDEConstraintExpressionServicesDelegate() );
		} 
		catch ( final CoreException p_ex ) {
			throw new ResourceAccessException( p_ex );
		}
	}
}
