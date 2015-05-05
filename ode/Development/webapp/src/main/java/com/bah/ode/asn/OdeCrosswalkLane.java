package com.bah.ode.asn;

import java.util.List;

public class OdeCrosswalkLane extends OdeLane {
   public OdeCrosswalkLaneAttributes laneAttributes;
   public List<OdeLaneOffsets> keepOutList;
   
	public OdeCrosswalkLane() {
	   super();
   }
	
	public OdeCrosswalkLane(byte[] laneNumber, Integer laneWidthCm,
         List<OdeLaneOffsets> nodeList, List<OdeConnectsTo> connectsTo,
         OdeCrosswalkLaneAttributes laneAttributes,
         List<OdeLaneOffsets> keepOutList
         ) {
	   super(laneNumber, laneWidthCm, nodeList, connectsTo);
	   this.laneAttributes = laneAttributes;
	   this.keepOutList = keepOutList;
   }

	public OdeCrosswalkLaneAttributes getLaneAttributes() {
		return laneAttributes;
	}

	public OdeCrosswalkLane setLaneAttributes(OdeCrosswalkLaneAttributes laneAttributes) {
		this.laneAttributes = laneAttributes;
		return this;
	}

	public List<OdeLaneOffsets> getKeepOutList() {
		return keepOutList;
	}

	public OdeCrosswalkLane setKeepOutList(List<OdeLaneOffsets> keepOutList) {
		this.keepOutList = keepOutList;
		return this;
	}

	
}
