/*******************************************************************************
 * Copyright (c) 2015 US DOT - Joint Program Office
 *
 * The Government has unlimited rights to all documents/material produced under 
 * this task order. All documents and materials, to include the source code of 
 * any software produced under this contract, shall be Government owned and the 
 * property of the Government with all rights and privileges of ownership/copyright 
 * belonging exclusively to the Government. These documents and materials may 
 * not be used or sold by the Contractor without written permission from the CO.
 * All materials supplied to the Government shall be the sole property of the 
 * Government and may not be used for any other purpose. This right does not 
 * abrogate any other Government rights.
 *
 * Contributors:
 *     Booz | Allen | Hamilton - initial API and implementation
 *******************************************************************************/
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
