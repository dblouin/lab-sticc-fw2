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
/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.labsticc.framework.settings.model.settings.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import fr.labsticc.framework.settings.model.settings.Category;
import fr.labsticc.framework.settings.model.settings.PropertyToCategoriesAssociation;
import fr.labsticc.framework.settings.model.settings.SettingsPackage;

/**
 * This is the item provider adapter for a {@link fr.labsticc.framework.settings.model.settings.Category} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CategoryItemProvider
	extends IdentifiedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSubCategoriesPropertyDescriptor(object);
			addParentCategoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Sub Categories feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected void addSubCategoriesPropertyDescriptor( final Object object ) {
		itemPropertyDescriptors.add(	new ItemPropertyDescriptor(	((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
																	getResourceLocator(),
																	getString("_UI_Category_subCategories_feature"),
																	getString("_UI_PropertyDescriptor_description", "_UI_Category_subCategories_feature", "_UI_Category_type"),
																	SettingsPackage.Literals.CATEGORY__SUB_CATEGORIES,
																	true,
																	false,
																	true,
																	null,
																	null,
																	null ) {

											// TODO: Still need to manage the problem that the method is not always called
											// because the editor is cached.
											@SuppressWarnings("unchecked")
											@Override
											public Collection<?> getChoiceOfValues( final Object p_object ) {
												final Collection<EObject> elementsChoice = new ArrayList<EObject>();
												final Collection<EObject> currentElements = new ArrayList<EObject>();
												final PropertyValueWrapper wrapper = (PropertyValueWrapper) getPropertyValue( p_object );
												final Object value = wrapper.getEditableValue( p_object );
												
												// Test so that it works also for single cardinality features
												if ( value instanceof Collection<?> )  {
													currentElements.addAll( (Collection<EObject>) value );
												}

												final Category category = (Category) object;
												final PropertyToCategoriesAssociation catAss = (PropertyToCategoriesAssociation) category.eContainer();
												elementsChoice.addAll( catAss.getOwnedCategories() );
												elementsChoice.removeAll( currentElements );
												elementsChoice.remove( category );
											
												return elementsChoice;
											}
		} );
//			(createItemPropertyDescriptor
//				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
//				 getResourceLocator(),
//				 getString("_UI_Category_subCategories_feature"),
//				 getString("_UI_PropertyDescriptor_description", "_UI_Category_subCategories_feature", "_UI_Category_type"),
//				 SettingsPackage.Literals.CATEGORY__SUB_CATEGORIES,
//				 true,
//				 false,
//				 true,
//				 null,
//				 null,
//				 null));
	}

	/**
	 * This adds a property descriptor for the Parent Category feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentCategoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Category_parentCategory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Category_parentCategory_feature", "_UI_Category_type"),
				 SettingsPackage.Literals.CATEGORY__PARENT_CATEGORY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Category.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Category"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Category)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Category_type") :
			getString("_UI_Category_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
