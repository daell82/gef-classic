/*******************************************************************************
 * Copyright (c) 2004, 2010 IBM Corporation and others.
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

package org.eclipse.gef.examples.text.model.commands;

import org.eclipse.gef.examples.text.model.Container;
import org.eclipse.gef.examples.text.model.ModelElement;
import org.eclipse.gef.examples.text.model.ModelLocation;

public class InsertModelElement extends MiniEdit {

	private final Container parent;
	private final int offset;
	private final ModelElement child;
	private final ModelLocation location;

	public InsertModelElement(Container parent, int offset, ModelElement child, ModelLocation location) {
		this.parent = parent;
		this.offset = offset;
		this.child = child;
		this.location = location;
	}

	@Override
	public void apply() {
		parent.add(child, offset);
	}

	@Override
	public boolean canApply() {
		return true;
	}

	@Override
	public ModelLocation getResultingLocation() {
		return location;
	}

	@Override
	public void rollback() {
		parent.remove(child);
	}

}
