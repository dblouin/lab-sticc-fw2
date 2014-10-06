package fr.labsticc.framework.settings.service;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.model.service.IConstraintExpressionServicesFacade;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;

public class DefaultSettingsServiceDelegate implements ISettingsServiceDelegate {
	
	private final SettingsAS settingsAS;
	
	public DefaultSettingsServiceDelegate( final IConstraintExpressionServicesFacade p_expressionFacade ) {
		settingsAS = new SettingsAS( p_expressionFacade );
	}

	@Override
	public Set<EClass> supportedTypes(	final SettingsSpecification p_settingsSpec,
										final EReference p_reference, 
										final Object p_context ) 
	throws ConstraintException, SystemException {
		return settingsAS.supportedTypes( p_settingsSpec, p_reference, p_context );
	}
	
	@Override
	public Set<String> supportedLanguagesFileTypes( final SettingsSpecification p_settingsSpec ) {
		return settingsAS.supportedLanguagesFileTypes( p_settingsSpec );
	}
	
	@Override
	public Set<EClass> supportedTypesInclContainers( 	final SettingsSpecification p_settingsSpec,
														final EReference p_reference, 
														final Object p_context )
	throws ConstraintException, SystemException {
		return settingsAS.supportedTypesInclContainers( p_settingsSpec, p_reference, p_context );
		
	}
//	
//	@Override
//	public Set<Category> definedCategories( final SettingsSpecification p_settingsSpec,
//											final EReference p_reference,
//											final EObject p_context ) {
//		return settingsAS.definedCategories( p_settingsSpec, p_reference, p_context );
//	}

	@Override
	public boolean hasDefinedSettings( 	final SettingsSpecification p_settingsSpec,
										final EStructuralFeature p_feature ) {
		return settingsAS.hasDefinedSettings( p_settingsSpec, p_feature );
	}

	@Override
	public Set<?> choiceOfValues( 	final SettingsSpecification p_settingsSpec,
									final Collection<Resource> p_scope,
									final EReference p_reference,
									final Object p_object,
									final Object p_editableValue ) 
	throws ConstraintException, SystemException {
		return settingsAS.choiceOfValues( p_settingsSpec, p_scope, p_reference, p_object, p_editableValue );
	}
}
