/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.labsticc.framework.settings.model.settings;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scope Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides a scope of visible model elements from a specific model element. This is used in several contexts. For example, a query framework may uise this to compute elements from  constructs retrieving all instances in a given scope.
 * <!-- end-model-doc -->
 *
 *
 * @see fr.labsticc.framework.settings.model.settings.SettingsPackage#getScopeProvider()
 * @model abstract="true"
 * @generated
 */
public interface ScopeProvider extends IdentifiedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model contextRequired="true"
	 * @generated
	 */
	EList<Object> getScope(Object context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model elementRequired="true"
	 * @generated
	 */
	Object getElementFromScope(Object element);

} // ScopeProvider
