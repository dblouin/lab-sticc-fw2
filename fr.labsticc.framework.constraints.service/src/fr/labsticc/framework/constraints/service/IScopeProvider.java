/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.labsticc.framework.constraints.service;

import java.util.Collection;

public interface IScopeProvider {

	/**
	 * Returns a list of elements visible for the specified context. This scope is defined per modeling language.
	 */
	Collection<Object> getScope(Object context);

	Object getElementFromScope(Object element);

} // ScopeProvider
