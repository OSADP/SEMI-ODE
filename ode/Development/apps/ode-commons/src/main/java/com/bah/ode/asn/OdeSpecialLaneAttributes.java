/*******************************************************************************
 * Copyright (c) 2015 US DOT - Joint Program Office
 *
 * The Government has unlimited rights to all documents/material produced under 
 * this task order. All documents and materials, to include the source code of 
 * any software produced under this contract, shall be Government owned and the 
 * property of the Government with all rights and privileges of ownership/copyright 
 * belonging exclusively to the Government. These documents and materials may 
 * not be used or sold by the Contractor without written permission from the CO.
 * All materials supplied to the Government shall be the sole property of the 
 * Government and may not be used for any other purpose. This right does not 
 * abrogate any other Government rights.
 *
 * Contributors:
 *     Booz | Allen | Hamilton - initial API and implementation
 *******************************************************************************/
package com.bah.ode.asn;

public class OdeSpecialLaneAttributes {
	public static final long NO_DATA = 0;
	public static final long EGRESS_PATH = 1;
	public static final long RAILROAD_TRACK = 2;
	public static final long TRANSIT_ONLY_LANE = 4;
	public static final long HOV_LANE = 8;
	public static final long BUS_ONLY = 16;
	public static final long VEHICLES_ENTERING = 32;
	public static final long VEHICLES_LEAVING = 64;
	public static final long RESERVED = 128;

	private long attributes;

	public OdeSpecialLaneAttributes() {
	   super();
   }

	public OdeSpecialLaneAttributes(long attributes) {
	   super();
	   this.attributes = attributes;
   }

	public long getAttributes() {
		return attributes;
	}

	public void setAttributes(long attributes) {
		this.attributes = attributes;
	}
	
	
}
