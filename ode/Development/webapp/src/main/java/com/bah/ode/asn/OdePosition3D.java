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

import com.bah.ode.asn.oss.dsrc.Position3D;

public class OdePosition3D {
	private Long latitude; // in 1/10th micro degrees
	private Long longitude; // in 1/10th micro degrees
	private byte[] elevation;
		//   -- 1 decimeter LSB (10 cm) 
		//   -- Encode elevations from 0 to 6143.9 meters 
		//   -- above the reference ellipsoid as 0x0000 to 0xEFFF.  
		//   -- Encode elevations from -409.5 to -0.1 meters, 
		//   -- i.e. below the reference ellipsoid, as 0xF001 to 0xFFFF
		//   -- unknown as 0xF000
	
	
	public OdePosition3D(Long latitude, Long longitude, byte[] elevation) {
	   super();
	   this.latitude = latitude;
	   this.longitude = longitude;
	   this.elevation = elevation;
   }

	public OdePosition3D(Position3D nwCorner) {
		this.setLatitude(nwCorner.getLat() != null ? nwCorner.getLat().longValue() : null);
		this.setLongitude(nwCorner.get_long() != null ? nwCorner.get_long().longValue() : null);
		this.setElevation(nwCorner.getElevation() != null ? nwCorner.getElevation().byteArrayValue() : null);
   }

	public Long getLatitude() {
		return latitude;
	}

	public OdePosition3D setLatitude(Long latitude) {
		this.latitude = latitude;
		return this;
	}

	public Long getLongitude() {
		return longitude;
	}

	public OdePosition3D setLongitude(Long longitude) {
		this.longitude = longitude;
		return this;
	}

	public byte[] getElevation() {
		return elevation;
	}

	public OdePosition3D setElevation(byte[] elevation) {
		this.elevation = elevation;
		return this;
	}

	
}
