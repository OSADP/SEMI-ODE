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
