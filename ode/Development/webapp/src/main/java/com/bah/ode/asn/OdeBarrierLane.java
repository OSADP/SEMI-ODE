package com.bah.ode.asn;

import java.util.List;


public class OdeBarrierLane extends OdeLane {
   private Integer barrierAttributes;

   
	public OdeBarrierLane() {
	   super();
   }

	public OdeBarrierLane(byte[] laneNumber, Integer laneWidthCm,
			List<OdeLaneOffsets> nodeList, Integer barrierAttributes) {
	   super(laneNumber, laneWidthCm, nodeList, null);
	   this.barrierAttributes = barrierAttributes;
   }

	public Integer getBarrierAttributes() {
		return barrierAttributes;
	}

	public OdeLane setBarrierAttributes(Integer barrierAttributes) {
		this.barrierAttributes = barrierAttributes;
		return this;
	}

}
