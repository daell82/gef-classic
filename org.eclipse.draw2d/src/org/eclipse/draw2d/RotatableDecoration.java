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
package org.eclipse.draw2d;

import org.eclipse.draw2d.geometry.Point;

/**
 * An IFigure that can be rotated.
 */
public interface RotatableDecoration extends IFigure {

	/**
	 * Sets the location of this figure.
	 * 
	 * @param p The location
	 */
	@Override
	void setLocation(Point p);

	/**
	 * Sets the reference point used to determine the rotation angle.
	 * 
	 * @param p The reference point
	 */
	void setReferencePoint(Point p);

}
