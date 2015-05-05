package com.bah.ode.asn;

import java.util.List;

public class OdeVehicleComputedLane extends OdeLane {
   public OdeVehicleLaneAttributes laneAttributes;
   public Integer refLaneNum;
   public Integer lineOffsetCm;
   public List<OdeLaneOffsets> keepOutList;
   
	public OdeVehicleComputedLane() {
	   super();
   }
	
	public OdeVehicleComputedLane(byte[] laneNumber, Integer laneWidthCm,
			List<OdeConnectsTo> connectsTo,
         OdeVehicleLaneAttributes laneAttributes,
         Integer refLaneNum,
         Integer lineOffsetCm,
         List<OdeLaneOffsets> keepOutList
         ) {
	   super(laneNumber, laneWidthCm, null, connectsTo);
	   this.laneAttributes = laneAttributes;
	   this.refLaneNum = refLaneNum;
	   this.lineOffsetCm = lineOffsetCm;
	   this.keepOutList = keepOutList;
   }

	public OdeVehicleLaneAttributes getLaneAttributes() {
		return laneAttributes;
	}

	public OdeVehicleComputedLane setLaneAttributes(OdeVehicleLaneAttributes laneAttributes) {
		this.laneAttributes = laneAttributes;
		return this;
	}

	public Integer getRefLaneNum() {
		return refLaneNum;
	}

	public OdeVehicleComputedLane setRefLaneNum(Integer refLaneNum) {
		this.refLaneNum = refLaneNum;
		return this;
	}

	public Integer getLineOffsetCm() {
		return lineOffsetCm;
	}

	public OdeVehicleComputedLane setLineOffsetCm(Integer lineOffsetCm) {
		this.lineOffsetCm = lineOffsetCm;
		return this;
	}

	public List<OdeLaneOffsets> getKeepOutList() {
		return keepOutList;
	}

	public OdeVehicleComputedLane setKeepOutList(List<OdeLaneOffsets> keepOutList) {
		this.keepOutList = keepOutList;
		return this;
	}

   
}
