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
