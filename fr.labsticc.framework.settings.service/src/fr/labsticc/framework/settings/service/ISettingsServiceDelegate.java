package fr.labsticc.framework.settings.service;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;

public interface ISettingsServiceDelegate {

	Set<EClass> supportedTypes( SettingsSpecification p_settingsSpec,
								EReference p_reference,
								Object p_element )
	throws ConstraintException, SystemException;

	Set<String> supportedLanguagesFileTypes( SettingsSpecification p_settingsSpec );
	
	Set<EClass> supportedTypesInclContainers( 	SettingsSpecification p_settingsSpec,
												EReference p_reference,
												Object p_element )
	throws ConstraintException, SystemException;
	
	boolean hasDefinedSettings( SettingsSpecification p_settingsSpec,
								EStructuralFeature p_feature );
	
	Set<?> choiceOfValues(	SettingsSpecification p_settingsSpec,
							Collection<Resource> p_scope,
							EReference p_reference,
							Object p_object,
							Object p_editableValue )
	throws ConstraintException, SystemException;
}
