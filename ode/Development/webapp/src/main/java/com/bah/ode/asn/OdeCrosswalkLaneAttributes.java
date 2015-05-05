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
