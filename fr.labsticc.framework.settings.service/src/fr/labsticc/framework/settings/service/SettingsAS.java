package fr.labsticc.framework.settings.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.constraints.core.exception.ConstraintInvalidReturnTypeException;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.service.IConstraintExpressionServicesFacade;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.emf.core.util.EMFUtil;
import fr.labsticc.framework.settings.model.settings.Category;
import fr.labsticc.framework.settings.model.settings.ModelingLanguage;
import fr.labsticc.framework.settings.model.settings.ModelingLanguageAssociations;
import fr.labsticc.framework.settings.model.settings.PropertyToCategoriesAssociation;
import fr.labsticc.framework.settings.model.settings.PropertyToTypesAssociation;
import fr.labsticc.framework.settings.model.settings.SettingsPackage;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;

public class SettingsAS {
	
	private final IConstraintExpressionServicesFacade expressionFacade;
	
	public SettingsAS( final IConstraintExpressionServicesFacade p_exprFacade ) {
		expressionFacade = p_exprFacade;
	}

	Set<EClass> supportedTypes(	final SettingsSpecification p_settingsSpec,
								final EReference p_reference,
								final Object p_context ) 
	throws ConstraintException, SystemException {
		final Set<EClass> types = new HashSet<EClass>();
		
		for ( final ModelingLanguage language : p_settingsSpec.getOwnedLanguages() ) {
			for ( final ModelingLanguageAssociations lanAss : language.getOwnedLanguageAssociations() ) {
				for ( final PropertyToTypesAssociation propAss : lanAss.getOwnedPropToTypesAssociations() ) {
					if ( !propAss.isContainers() && p_reference.equals( propAss.getProperty() ) ) {
						types.addAll( supportedTypes( propAss, p_context ) );
					}
				}
			}
		}
		
		return types;
	}
	
	private Set<EClass> supportedTypes( final PropertyToTypesAssociation p_propAss,
										final Object p_context ) 
	throws ConstraintException, SystemException {
		final Set<EClass> types = new HashSet<EClass>();
		final FormalLanguageExpression condition = p_propAss.getOwnedCondition();
		final boolean shouldAddTypes;
		
		// When the context is null, this means the client wants all the allowed types whatever the condition may be.
		if ( condition == null || p_context == null ) {
			shouldAddTypes = true;
		}
		else {
			final Object result = expressionFacade.evaluateExpression( condition, p_context );
			
			if ( !( result instanceof Boolean ) ) {
				throw new ConstraintInvalidReturnTypeException( "Condition " + condition.getText() + " evaluates to " + result + ", which is not evaluate ot a boolean value." );
			}
			
			shouldAddTypes = (boolean) result;
		}
		
		if ( shouldAddTypes ) {
			types.addAll( p_propAss.getAssociatedTypes() );
		}

		return types;
	}
	
	Set<String> supportedLanguagesFileTypes( final SettingsSpecification p_settingsSpec ) {
		final Set<String> types = new HashSet<String>();
		
		for ( final ModelingLanguage language : p_settingsSpec.getOwnedLanguages() ) {
			types.addAll( language.getFileExtensions() );
		}
		
		return types;
	}

	Set<EClass> supportedTypesInclContainers( 	final SettingsSpecification p_settingsSpec,
												final EReference p_reference,
												final Object p_context ) 
	throws ConstraintException, SystemException {
		final Set<EClass> types = new HashSet<EClass>();
		
		for ( final ModelingLanguage language : p_settingsSpec.getOwnedLanguages() ) {
			for ( final ModelingLanguageAssociations lanAss : language.getOwnedLanguageAssociations() ) {
				for ( final PropertyToTypesAssociation propAss : lanAss.getOwnedPropToTypesAssociations() ) {
					if ( p_reference.equals( propAss.getProperty() ) ) {
						types.addAll( supportedTypes( propAss, p_context ) );
					}
				}
			}
		}
		
		return types;
	}

	private Set<Category> definedCategories( 	final SettingsSpecification p_settingsSpec,
												final EReference p_reference,
												final EObject p_context ) {
		final Set<Category> categories = new HashSet<>();
		final EClass subclass = p_context == null ? null : p_context.eClass();
		
		for ( final ModelingLanguage language : p_settingsSpec.getOwnedLanguages() ) {
			for ( final PropertyToCategoriesAssociation catAss : language.getOwnedCategoryAssociations() ) {
				if ( p_reference.equals( catAss.getProperty() ) && ( subclass == null || subclass.equals( catAss.getSubclass() ) ) ) {
					categories.addAll( catAss.getOwnedCategories() );
				}
			}
		}
		
		return categories;
	}
	
	boolean hasDefinedSettings( final SettingsSpecification p_settingsSpec,
								final EStructuralFeature p_feature ) {
		final EClassifier type = p_feature.getEType();
		
		if ( EcorePackage.Literals.EOBJECT.equals( type ) ) {
			return hasDefinedSupportedTypes( p_settingsSpec, p_feature );
		}
		
		if ( SettingsPackage.Literals.CATEGORY.equals( type ) ) {
			return hasDefinedCategories( p_settingsSpec, p_feature );
		}
		
		return false;
	}
	
	private boolean hasDefinedSupportedTypes( 	final SettingsSpecification p_settingsSpec,
												final EStructuralFeature p_feature ) {
		for ( final ModelingLanguage language : p_settingsSpec.getOwnedLanguages() ) {
			for ( final ModelingLanguageAssociations lanAss : language.getOwnedLanguageAssociations() ) {
				for ( final PropertyToTypesAssociation propAss : lanAss.getOwnedPropToTypesAssociations() ) {
					if ( !propAss.isContainers() && p_feature.equals( propAss.getProperty() ) ) {
						return true;
					}
				}
			}
		}
		
		return false;
	}
	
	private boolean hasDefinedCategories( 	final SettingsSpecification p_settingsSpec,
											final EStructuralFeature p_feature ) {
		for ( final ModelingLanguage language : p_settingsSpec.getOwnedLanguages() ) {
			for ( final PropertyToCategoriesAssociation catAss : language.getOwnedCategoryAssociations() ) {
				if ( p_feature.equals( catAss.getProperty() ) ) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	Set<?> choiceOfValues( 	final SettingsSpecification p_settingsSpec,
							final Collection<Resource> p_scope,
							final EReference p_reference,
							final Object p_object,
							final Object p_editableValue ) 
	throws SystemException, ConstraintException {
		final Set<EObject> elementsChoice = new LinkedHashSet<EObject>();
		final Set<Object> currentElements = new LinkedHashSet<Object>();
		
		// Test so that it works also for single cardinality features
		if ( p_editableValue instanceof Collection<?> )  {
			currentElements.addAll( (Collection<?>) p_editableValue );
		}
		
		final EClassifier type = p_reference.getEType();
	
		if ( SettingsPackage.Literals.CATEGORY.equals( type ) ) {
			final Set<Category> definedCategories = definedCategories( p_settingsSpec, p_reference, (EObject) p_object );

			if ( definedCategories != null ) {
				elementsChoice.addAll( definedCategories );
			}
		}
		else {
			final Set<EClass> supportedTypes = supportedTypes( p_settingsSpec, p_reference,	p_object );
			
			if ( supportedTypes != null && !supportedTypes.isEmpty() ) {
				for ( final Resource res : p_scope ) {
					EMFUtil.fillContentOfTypes( res, supportedTypes, elementsChoice );
				}
			}
		}
		
		elementsChoice.removeAll( currentElements );
		
		return elementsChoice;
	}
}
