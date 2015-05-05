package com.bah.ode.asn;

import java.util.List;

public class OdeSpecialLane extends OdeLane {
   public OdeSpecialLaneAttributes laneAttributes;
   public List<OdeLaneOffsets> keepOutList;
   
	public OdeSpecialLane() {
	   super();
   }
	
	public OdeSpecialLane(byte[] laneNumber, Integer laneWidthCm,
         List<OdeLaneOffsets> nodeList, List<OdeConnectsTo> connectsTo,
         OdeSpecialLaneAttributes laneAttributes,
   		List<OdeLaneOffsets> keepOutList) {
	   super(laneNumber, laneWidthCm, nodeList, connectsTo);
	   this.laneAttributes = laneAttributes;
	   this.keepOutList = keepOutList;
   }

	public OdeSpecialLaneAttributes getLaneAttributes() {
		return laneAttributes;
	}

	public OdeSpecialLane setLaneAttributes(OdeSpecialLaneAttributes laneAttributes) {
		this.laneAttributes = laneAttributes;
		return this;
	}

	public List<OdeLaneOffsets> getKeepOutList() {
		return keepOutList;
	}

	public OdeSpecialLane setKeepOutList(List<OdeLaneOffsets> keepOutList) {
		this.keepOutList = keepOutList;
		return this;
	}

	
}
