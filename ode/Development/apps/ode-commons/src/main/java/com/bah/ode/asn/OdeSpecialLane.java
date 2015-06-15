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
