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

import com.bah.ode.asn.oss.semi.GeoRegion;

public class OdeGeoRegion {
	private OdePosition3D nwCorner;
	private OdePosition3D seCorner;

	public OdeGeoRegion() {
	   super();
   }

	public OdeGeoRegion(OdePosition3D nwCorner, OdePosition3D seCorner) {
	   super();
	   this.nwCorner = nwCorner;
	   this.seCorner = seCorner;
   }

	public OdeGeoRegion(GeoRegion serviceRegion) {
		this.setNwCorner(new OdePosition3D(serviceRegion.getNwCorner()));
		this.setSeCorner(new OdePosition3D(serviceRegion.getSeCorner()));
   }

	public OdePosition3D getNwCorner() {
		return nwCorner;
	}

	public OdeGeoRegion setNwCorner(OdePosition3D nwCorner) {
		this.nwCorner = nwCorner;
		return this;
	}

	public OdePosition3D getSeCorner() {
		return seCorner;
	}

	public OdeGeoRegion setSeCorner(OdePosition3D seCorner) {
		this.seCorner = seCorner;
		return this;
	}

	
}
