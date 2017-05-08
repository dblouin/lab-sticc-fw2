package fr.labsticc.framework.settings.model.settings.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;

public class EcoreModelInterface extends AbstractEcoreModelInterface {

	public EcoreModelInterface() {
		super( EcorePackage.Literals.EMODEL_ELEMENT );
		
		addLanguage( EcorePackage.eINSTANCE, EcorePackage.eNS_PREFIX );
	}

	@Override
	public Object getPropertyValue(Object p_component, Object p_property) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getPropertyValue(Object p_component, Object p_property, Object p_unit) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getDefaultPropertyValue(Object p_property) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setPropertyValue(Object p_component, Object p_property, Object p_value, Object p_unit) {
	}

	@Override
	public boolean isComponent( Object p_object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isPropertyValue(Object p_object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getPropertyFromValue(Object p_propValue) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EList<Object> componentTypes( final Object p_component ) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getLanguageName() {
		return EcorePackage.eNS_PREFIX;
	}

	@Override
	public ResourceSet getCustomResourcet() {
		return null;
	}
}
