package org.eclipse.ui.views.tasklist;

/*
 * Copyright (c) 2002 IBM Corp.  All rights reserved.
 * This file is made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 */

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;

/**
 * The DefaultTaskListResourceAdapter is the default
 * implementation of the ITaskListResourceAdapter used by the
 * TaskList for resource adaption.
 */

class DefaultTaskListResourceAdapter implements ITaskListResourceAdapter {
	
	private static ITaskListResourceAdapter singleton;

	/**
	 * Constructor for DefaultTaskListResourceAdapter.
	 */
	DefaultTaskListResourceAdapter() {
		super();
	}
	
	/**
	 * Return the default instance used for TaskList adapting.
	 */
	static ITaskListResourceAdapter getDefault(){
		if(singleton == null)
			singleton = new DefaultTaskListResourceAdapter();
		return singleton;
	}

	/*
	 * @see ITaskListResourceAdapter#getAffectedResource(IAdaptable)
	 */
	public IResource getAffectedResource(IAdaptable adaptable) {

		IResource resource = (IResource) adaptable.getAdapter(IResource.class);
		if (resource == null)
			return (IFile) adaptable.getAdapter(IFile.class);
		else
			return resource;

	}

}