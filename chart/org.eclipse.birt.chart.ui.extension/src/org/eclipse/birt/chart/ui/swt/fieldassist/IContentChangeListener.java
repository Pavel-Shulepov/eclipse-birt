/*******************************************************************************
 * Copyright (c) 2009 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.chart.ui.swt.fieldassist;

import org.eclipse.swt.widgets.Control;

/**
 * The interface defines a listener for content change event.
 * 
 * @since 2.5
 */

public interface IContentChangeListener
{

	/**
	 * Handle content changed.
	 * 
	 * @param control
	 *            the control whose content is changed.
	 * @param newValue
	 *            the new content.
	 * @param oldValue
	 *            the old content.
	 */
	public void contentChanged( Control control, Object newValue,
			Object oldValue );
}
