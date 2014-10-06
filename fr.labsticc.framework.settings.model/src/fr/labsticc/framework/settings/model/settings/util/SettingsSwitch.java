/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.labsticc.framework.settings.model.settings.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.labsticc.framework.settings.model.settings.Category;
import fr.labsticc.framework.settings.model.settings.IdentifiedElement;
import fr.labsticc.framework.settings.model.settings.ModelInterface;
import fr.labsticc.framework.settings.model.settings.ModelingLanguage;
import fr.labsticc.framework.settings.model.settings.ModelingLanguageAssociations;
import fr.labsticc.framework.settings.model.settings.PropertyAssociation;
import fr.labsticc.framework.settings.model.settings.PropertyToCategoriesAssociation;
import fr.labsticc.framework.settings.model.settings.PropertyToTypesAssociation;
import fr.labsticc.framework.settings.model.settings.ScopeProvider;
import fr.labsticc.framework.settings.model.settings.ServiceDescriptor;
import fr.labsticc.framework.settings.model.settings.SettingsPackage;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage
 * @generated
 */
public class SettingsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SettingsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingsSwitch() {
		if (modelPackage == null) {
			modelPackage = SettingsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SettingsPackage.IDENTIFIED_ELEMENT: {
				IdentifiedElement identifiedElement = (IdentifiedElement)theEObject;
				T result = caseIdentifiedElement(identifiedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.SETTINGS_SPECIFICATION: {
				SettingsSpecification settingsSpecification = (SettingsSpecification)theEObject;
				T result = caseSettingsSpecification(settingsSpecification);
				if (result == null) result = caseIdentifiedElement(settingsSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.MODELING_LANGUAGE: {
				ModelingLanguage modelingLanguage = (ModelingLanguage)theEObject;
				T result = caseModelingLanguage(modelingLanguage);
				if (result == null) result = caseIdentifiedElement(modelingLanguage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.MODELING_LANGUAGE_ASSOCIATIONS: {
				ModelingLanguageAssociations modelingLanguageAssociations = (ModelingLanguageAssociations)theEObject;
				T result = caseModelingLanguageAssociations(modelingLanguageAssociations);
				if (result == null) result = caseIdentifiedElement(modelingLanguageAssociations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.PROPERTY_ASSOCIATION: {
				PropertyAssociation propertyAssociation = (PropertyAssociation)theEObject;
				T result = casePropertyAssociation(propertyAssociation);
				if (result == null) result = caseIdentifiedElement(propertyAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.PROPERTY_TO_TYPES_ASSOCIATION: {
				PropertyToTypesAssociation propertyToTypesAssociation = (PropertyToTypesAssociation)theEObject;
				T result = casePropertyToTypesAssociation(propertyToTypesAssociation);
				if (result == null) result = casePropertyAssociation(propertyToTypesAssociation);
				if (result == null) result = caseIdentifiedElement(propertyToTypesAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.PROPERTY_TO_CATEGORIES_ASSOCIATION: {
				PropertyToCategoriesAssociation propertyToCategoriesAssociation = (PropertyToCategoriesAssociation)theEObject;
				T result = casePropertyToCategoriesAssociation(propertyToCategoriesAssociation);
				if (result == null) result = casePropertyAssociation(propertyToCategoriesAssociation);
				if (result == null) result = caseIdentifiedElement(propertyToCategoriesAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseIdentifiedElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.SERVICE_DESCRIPTOR: {
				ServiceDescriptor serviceDescriptor = (ServiceDescriptor)theEObject;
				T result = caseServiceDescriptor(serviceDescriptor);
				if (result == null) result = caseIdentifiedElement(serviceDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.MODEL_INTERFACE: {
				ModelInterface modelInterface = (ModelInterface)theEObject;
				T result = caseModelInterface(modelInterface);
				if (result == null) result = caseScopeProvider(modelInterface);
				if (result == null) result = caseIdentifiedElement(modelInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SettingsPackage.SCOPE_PROVIDER: {
				ScopeProvider scopeProvider = (ScopeProvider)theEObject;
				T result = caseScopeProvider(scopeProvider);
				if (result == null) result = caseIdentifiedElement(scopeProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeling Language Associations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeling Language Associations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingLanguageAssociations(ModelingLanguageAssociations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingsSpecification(SettingsSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property To Types Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property To Types Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyToTypesAssociation(PropertyToTypesAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modeling Language</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modeling Language</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelingLanguage(ModelingLanguage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property To Categories Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property To Categories Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyToCategoriesAssociation(PropertyToCategoriesAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyAssociation(PropertyAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceDescriptor(ServiceDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelInterface(ModelInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScopeProvider(ScopeProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SettingsSwitch
