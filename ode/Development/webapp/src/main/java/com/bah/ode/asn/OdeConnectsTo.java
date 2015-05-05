package com.bah.ode.asn;

import java.util.ArrayList;
import java.util.List;

import com.bah.ode.asn.oss.dsrc.ConnectsTo;

public class OdeConnectsTo {
	private Integer laneNumber;
	private OdeLaneManeuverCode laneManeuverCode;
	
	public OdeConnectsTo() {
	   super();
   }

	public OdeConnectsTo(Integer laneNumber, OdeLaneManeuverCode laneManeuverCode) {
	   super();
	   this.laneNumber = laneNumber;
	   this.laneManeuverCode = laneManeuverCode;
   }

	public static List<OdeConnectsTo> createList(ConnectsTo connectsTo) {
		byte[] bytes = connectsTo.byteArrayValue();
		ArrayList<OdeConnectsTo> odeConnectsTos = new ArrayList<OdeConnectsTo>();
		
		for (int i = 0; i < bytes.length; i += 2) {
			odeConnectsTos.add(
					new OdeConnectsTo((int) bytes[i], OdeLaneManeuverCode.values[bytes[i+1]]));
		}
		
		return odeConnectsTos;
   }

	public Integer getLaneNumber() {
		return laneNumber;
	}

	public OdeConnectsTo setLaneNumber(Integer laneNumber) {
		this.laneNumber = laneNumber;
		return this;
	}

	public OdeLaneManeuverCode getLaneManeuverCode() {
		return laneManeuverCode;
	}

	public OdeConnectsTo setLaneManeuverCode(OdeLaneManeuverCode laneManeuverCode) {
		this.laneManeuverCode = laneManeuverCode;
		return this;
	}
	
	
}
