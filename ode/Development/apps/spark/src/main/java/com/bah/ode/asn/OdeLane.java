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


public class OdeLane {
   private byte[] laneNumber;
   private Integer laneWidthCm;
   private List<OdeLaneOffsets> nodeList;
   private List<OdeConnectsTo> connectsTo;
   
	public OdeLane() {
	   super();
   }

	public OdeLane(byte[] laneNumber, Integer laneWidthCm,
			List<OdeLaneOffsets> nodeList, List<OdeConnectsTo> connectsTo) {
	   super();
	   this.laneNumber = laneNumber;
	   this.laneWidthCm = laneWidthCm;
	   this.nodeList = nodeList;
	   this.connectsTo = connectsTo;
   }

	public byte[] getLaneNumber() {
		return laneNumber;
	}

	public OdeLane setLaneNumber(byte[] laneNumber) {
		this.laneNumber = laneNumber;
		return this;
	}

	public Integer getLaneWidthCm() {
		return laneWidthCm;
	}

	public OdeLane setLaneWidthCm(Integer laneWidthCm) {
		this.laneWidthCm = laneWidthCm;
		return this;
	}

	public List<OdeLaneOffsets> getNodeList() {
		return nodeList;
	}

	public OdeLane setNodeList(List<OdeLaneOffsets> nodeList) {
		this.nodeList = nodeList;
		return this;
	}
   
	public List<OdeConnectsTo> getConnectsTo() {
		return connectsTo;
	}

	public OdeLane setConnectsTo(List<OdeConnectsTo> connectsTo) {
		this.connectsTo = connectsTo;
		return this;
	}

   

}
