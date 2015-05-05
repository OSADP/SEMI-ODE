package com.bah.ode.asn;

public class OdeVehicleLaneAttributes {
   public static final long NO_LANE_DATA = 0; 
   public static final long EGRESS_PATH = 1; // a two-way path or an outbound path is described 
   public static final long MANEUVER_STRAIGHT_ALLOWED = 2;
   public static final long MANEUVER_LEFT_ALLOWED = 4; 
   public static final long MANEUVER_RIGHT_ALLOWED = 8; 
   public static final long YIELD = 16; 
   public static final long MANEUVER_NO_U_TURN = 32; 
   public static final long MANEUVER_NO_TURN_ON_RED = 64; 
   public static final long MANEUVER_NO_STOP = 128; 
   public static final long NO_STOP = 256; 
   public static final long NO_TURN_ON_RED = 512; 
   public static final long HOV_LANE = 1024; 
   public static final long BUS_ONLY = 2048; 
   public static final long BUS_AND_TAXI_ONLY = 4096; 
   public static final long MANEUVER_HOV_LANE = 8192; 
   public static final long MANEUVER_SHARED_LANE = 16384;	// a "TWLTL" (two way left turn lane)
   public static final long MANEUVER_BIKE_LANE = 32768;

   private long attributes;

	public OdeVehicleLaneAttributes() {
	   super();
   }

	public OdeVehicleLaneAttributes(long attributes) {
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
