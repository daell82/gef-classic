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

package org.eclipse.gef.examples.text;

import org.eclipse.core.runtime.Assert;
import org.eclipse.gef.examples.text.edit.TextEditPart;

/**
 * @since 3.1
 */
public class TextLocation {

	public final int offset;

	public final TextEditPart part;

	/**
	 * @since 3.1
	 */
	public TextLocation(TextEditPart part, int offset) {
		Assert.isNotNull(part);
		this.offset = offset;
		this.part = part;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TextLocation other) {
			return other.offset == offset && other.part == part;
		}
		return false;
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return part.hashCode() << 11 ^ offset;
	}

}
