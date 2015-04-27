package com.bah.ode.model;


@SuppressWarnings("serial")
public class BaseRequest extends OdeObject {

   private Double nwLat;
   private Double nwLon;
   private Double seLat;
   private Double seLon;
   
   public BaseRequest() {
   	super();
   }
   
	public BaseRequest(Double nwLat, Double nwLon, Double seLat, Double seLon) {
	   super();
	   this.nwLat = nwLat;
	   this.nwLon = nwLon;
	   this.seLat = seLat;
	   this.seLon = seLon;
   }

	static BaseRequest create() {
		return new BaseRequest();
	}
	
	public Double getNwLat() {
		return nwLat;
	}

	public BaseRequest setNwLat(Double nwLat) {
		this.nwLat = nwLat;
		return this;
	}

	public Double getNwLon() {
		return nwLon;
	}

	public BaseRequest setNwLon(Double nwLon) {
		this.nwLon = nwLon;
		return this;
	}

	public Double getSeLat() {
		return seLat;
	}

	public BaseRequest setSeLat(Double seLat) {
		this.seLat = seLat;
		return this;
	}

	public Double getSeLon() {
		return seLon;
	}

	public BaseRequest setSeLon(Double seLon) {
		this.seLon = seLon;
		return this;
	}
   
}
