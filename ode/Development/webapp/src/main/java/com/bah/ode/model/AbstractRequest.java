package com.bah.ode.model;


@SuppressWarnings("serial")
public class AbstractRequest extends OdeObject {

   private Double nwLat;
   private Double nwLon;
   private Double seLat;
   private Double seLon;
   
	public Double getNwLat() {
		return nwLat;
	}

	public void setNwLat(Double nwLat) {
		this.nwLat = nwLat;
	}

	public Double getNwLon() {
		return nwLon;
	}

	public void setNwLon(Double nwLon) {
		this.nwLon = nwLon;
	}

	public Double getSeLat() {
		return seLat;
	}

	public void setSeLat(Double seLat) {
		this.seLat = seLat;
	}

	public Double getSeLon() {
		return seLon;
	}

	public void setSeLon(Double seLon) {
		this.seLon = seLon;
	}
   
}
