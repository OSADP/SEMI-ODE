package com.bah.ode.asn;


public class OdeApproachObject {
   public OdePosition3D refPoint;
   public Integer laneWidthCm;
   public OdeApproach approach;
   public OdeApproach egress;
   
	public OdeApproachObject() {
	   super();
   }

	public OdeApproachObject(OdePosition3D refPoint, Integer laneWidthCm,
         OdeApproach approach, OdeApproach egress) {
	   super();
	   this.refPoint = refPoint;
	   this.laneWidthCm = laneWidthCm;
	   this.approach = approach;
	   this.egress = egress;
   }

	public OdePosition3D getRefPoint() {
		return refPoint;
	}

	public OdeApproachObject setRefPoint(OdePosition3D refPoint) {
		this.refPoint = refPoint;
		return this;
	}

	public Integer getLaneWidthCm() {
		return laneWidthCm;
	}

	public OdeApproachObject setLaneWidthCm(Integer laneWidthCm) {
		this.laneWidthCm = laneWidthCm;
		return this;
	}

	public OdeApproach getApproach() {
		return approach;
	}

	public OdeApproachObject setApproach(OdeApproach approach) {
		this.approach = approach;
		return this;
	}

	public OdeApproach getEgress() {
		return egress;
	}

	public OdeApproachObject setEgress(OdeApproach egress) {
		this.egress = egress;
		return this;
	}

   
}
