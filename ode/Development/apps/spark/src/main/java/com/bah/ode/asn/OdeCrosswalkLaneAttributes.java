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

public class OdeCrosswalkLaneAttributes {
	public static final long NO_DATA = 0;
	public static final long TWO_WAY_PATH = 1;
	public static final long PEDESTRIAN_CROSSWALK = 2;
	public static final long BIKE_LANE = 4;
	public static final long RAILROAD_TRACK_PRESENT = 8;
	public static final long ONE_WAY_PATH_OF_TRAVEL = 16;
	public static final long PEDESTRIAN_CROSSWALK_TYPE_A = 32;
	public static final long PEDESTRIAN_CROSSWALK_TYPE_B = 64;
	public static final long PEDESTRIAN_CROSSWALK_TYPE_C = 128;
	
	private long attributes;

	public OdeCrosswalkLaneAttributes() {
	   super();
   }

	public OdeCrosswalkLaneAttributes(long attributes) {
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
