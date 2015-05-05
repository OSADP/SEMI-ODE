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
