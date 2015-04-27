package com.bah.ode.model;

import com.bah.util.JsonUtils;

public class OdeRequest extends AbstractRequest {

   private String encoding;
   private Double nwLat;
   private Double nwLon;
   private Double seLat;
   private Double seLon;
   
	public String getEncoding() {
		return encoding;
	}

	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

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
   
	public String getSubscriptionRequest() {
		String json = "SUBSCRIBE:" + JsonUtils.toJson(this);
		return json;
	}
   
	public String getQueryRequest() {
		return "QUERY:" + JsonUtils.toJson(this);
	}
}
