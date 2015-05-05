package com.bah.ode.asn;

public enum OdeLayerType {
	NONE,
	MIXED_CONTENT,
	GENERAL_MAP_DATA,
	INTERSECTION_DATA,
	CURVE_DATA,
	ROADWAY_SECTION_DATA,
	PARKING_AREA_DATA,
	SHARED_LANE_DATA;
	
	public static final OdeLayerType[] values = values(); 
}
