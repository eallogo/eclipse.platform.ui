/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.ui.views.markers.internal;

import org.eclipse.swt.graphics.Image;

public interface IField {
	
	/**
	 * @return the name of the field.
	 */
	String getName();

	/**
	 * @return the description of the field.
	 */
	String getDescription();

	/**
	 * @return the image associated with the description of the field or <code>null<code>.
	 */
	Image getDescriptionImage();
	
	/**
	 * @return The text to be displayed in the column header for this field.
	 */
	String getColumnHeaderText();
	
	/**
	 * @return The image to be displayed in the column header for this field or <code>null<code>.
	 */
	Image getColumnHeaderImage();
	
	/**
	 * @param obj
	 * @return The String value of the object for this particular field to be displayed to the user.  
	 */
	String getValue(Object obj);

	/**
	 * @param obj
	 * @return The image value of the object for this particular field to be displayed to the user
	 * or <code>null<code>.
	 */
	Image getImage(Object obj);
	
	/**
	 * @param obj1
	 * @param obj2
	 * @return Either:
	 * 	<li>a negative number if the value of obj1 is less than the value of obj2 for this field.
	 *  <li><code>0</code> if the value of obj1 and the value of obj2 are equal for this field.
	 *  <li>a positive number if the value of obj1 is greater than the value of obj2 for this field.
	 */
	int compare(Object obj1, Object obj2);
}
