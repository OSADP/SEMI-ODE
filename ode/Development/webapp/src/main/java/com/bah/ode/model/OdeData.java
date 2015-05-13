package com.bah.ode.model;

public class OdeData {
	private DdsData ddsData;

	public OdeData() {
	   super();
   }

	public OdeData(DdsData ddsData) {
	   super();
	   this.ddsData = ddsData;
   }

	public DdsData getDdsData() {
		return ddsData;
	}

	public OdeData setDdsData(DdsData ddsData) {
		this.ddsData = ddsData;
		return this;
	}
	
	

}
