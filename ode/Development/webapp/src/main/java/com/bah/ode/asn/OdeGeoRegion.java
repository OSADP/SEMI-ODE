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
