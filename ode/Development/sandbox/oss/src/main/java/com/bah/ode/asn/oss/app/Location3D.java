package com.bah.ode.asn.oss.app;

public class Location3D {
	private Long latitude;
	private Long longitude;
	private String elevation;
	
	public Location3D(Long latitude, Long longitude, String elevation) {
	   super();
	   this.latitude = latitude;
	   this.longitude = longitude;
	   this.elevation = elevation;
   }

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public String getElevation() {
		return elevation;
	}

	public void setElevation(String elevation) {
		this.elevation = elevation;
	}

	
}
