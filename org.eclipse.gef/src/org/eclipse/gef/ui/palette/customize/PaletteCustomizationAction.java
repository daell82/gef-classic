/*******************************************************************************
 * Copyright (c) 2000, 2010 IBM Corporation and others.
 *
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.gef.ui.palette.customize;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * <code>PaletteCustomizationAction</code>s are used to manipulate the palette
 * model. They can enable and disable themselves when needed.
 * 
 * <p>
 * This class is mainly a result of code-factoring.
 * </p>
 * 
 * @author Pratik Shah
 */
public abstract class PaletteCustomizationAction extends Action {

	/**
	 * Call this method to have the action update its state and enable or disable
	 * itself.
	 */
	public abstract void update();

	/**
	 * @see org.eclipse.jface.action.Action#setImageDescriptor(ImageDescriptor)
	 */
	@Override
	public void setImageDescriptor(ImageDescriptor newImage) {
		super.setImageDescriptor(newImage);
		setHoverImageDescriptor(newImage);
	}

}
