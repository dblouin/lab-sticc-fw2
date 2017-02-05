package fr.labsticc.framework.settings.model.settings.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;

import fr.labsticc.framework.emf.core.util.EMFUtil;

public abstract class AbstractEcoreModelInterface extends ModelInterfaceImpl {
	
	private final AdapterFactoryLabelProvider labelProvider;
	
	private final Map<EPackage, String> languagePackages;
	
	private final EClass topHierarchyClass;
	
	protected AbstractEcoreModelInterface( final EClass p_topHierarchyClass ) {
		languagePackages = new HashMap<EPackage, String>();
		topHierarchyClass = p_topHierarchyClass;
		
		labelProvider = new AdapterFactoryLabelProvider( new ComposedAdapterFactory( ComposedAdapterFactory.Descriptor.Registry.INSTANCE ) );
	}
	
	protected void addLanguage( 	final EPackage p_package,
									final String p_fileExtension ) {
		languagePackages.put( p_package, p_fileExtension );
	}

	@Override
	public Object selectedModelObject(	final Object p_editor,
										final Object p_selection ) {
		if ( p_selection instanceof ISelection ) {
			return EMFUtil.selectedObject( (ISelection) p_selection, topHierarchyClass.getInstanceClass() );
		}
		
		return null;
	}

	@Override
	public boolean isModelResource( Resource p_resource ) {
		 return languagePackages.values().contains( p_resource.getURI().fileExtension() );
 	}

	@Override
	public String getElementName(Object p_element) {
		return getElementText( p_element );
	}

	@Override
	public String getElementText(Object p_element) {
		return labelProvider.getText( p_element );
	}

	@Override
	public boolean isModelElement( final Object p_object ) {
		if ( p_object instanceof EObject ) {
			final EClass eClass =  ( (EObject) p_object ).eClass();
			
			for ( final EPackage ePackage : languagePackages.keySet() ) {
				if ( ePackage.getEClassifiers().contains( eClass ) ) {
					return true;
				}
			}
		}

		return false;
	}

	@Override
	public EList<Object> getScope( final Object p_context ) {
		if ( isModelElement( p_context ) ) {
			final EList<Object> roots = new BasicEList<Object>();
			roots.addAll(  ( (EObject) p_context ).eResource().getContents() );

			return roots;
		}
		
		// Indicates that the context does not belong to this modeling language.
		return null;
	}

	@Override
	public Object getElementFromScope( final Object p_element ) {
		if ( isModelElement( p_element ) ) {
			final EObject eObject = (EObject) p_element;
			
			ResourceSet resSet = getCustomResourcet();
			
			if ( resSet == null ) {
				final Resource res = eObject.eResource();
			
				if ( res != null ) {
					resSet = res.getResourceSet();
				}
			}
			
			if ( resSet != null ) {
				return resSet.getEObject( EcoreUtil.getURI( (EObject) p_element ), true );
			}
		}
		
		return null;
	}
}
