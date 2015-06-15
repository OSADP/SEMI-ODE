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
