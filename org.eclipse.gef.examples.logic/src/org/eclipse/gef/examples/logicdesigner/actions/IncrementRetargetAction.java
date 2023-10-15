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
package org.eclipse.gef.examples.logicdesigner.actions;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.actions.RetargetAction;

import org.eclipse.gef.examples.logicdesigner.LogicMessages;
import org.eclipse.gef.examples.logicdesigner.LogicPlugin;

/**
 * @author hudsonr
 * @since 2.1
 */
public class IncrementRetargetAction extends RetargetAction {

	/**
	 * Constructor for IncrementRetargetAction.
	 */
	public IncrementRetargetAction() {
		super(IncrementDecrementAction.INCREMENT, LogicMessages.IncrementDecrementAction_Increment_ActionLabelText);
		setToolTipText(LogicMessages.IncrementDecrementAction_Increment_ActionToolTipText);
		setImageDescriptor(ImageDescriptor.createFromFile(LogicPlugin.class, "icons/plus.gif")); //$NON-NLS-1$
	}

}
