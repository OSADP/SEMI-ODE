package com.bah.ode.asn;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import com.bah.ode.asn.oss.dsrc.Intersection_;
import com.bah.ode.asn.oss.dsrc.MapData.Intersections_;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.IntSequenceGenerator;

public class OdeIntersection {
   public String name;
   public byte[] id;
   public OdePosition3D refPoint;
   public byte[] refInterNum;
   public Double orientationDeg;
   public Integer laneWidthCm;
   public OdeIntersectionStatusObject type;
   public List<OdeApproachObject> approaches;
   public List<OdeSignalControlZone> preemptZones;
   public List<OdeSignalControlZone> priorityZones;
   
	public OdeIntersection() {
	   super();
   }

	public OdeIntersection(String name, byte[] id, OdePosition3D refPoint,
         byte[] refInterNum, Double orientationDeg, Integer laneWidthCm,
         OdeIntersectionStatusObject type, List<OdeApproachObject> approaches,
         List<OdeSignalControlZone> preemptZones,
         List<OdeSignalControlZone> priorityZones) {
	   super();
	   this.name = name;
	   this.id = id;
	   this.refPoint = refPoint;
	   this.refInterNum = refInterNum;
	   this.orientationDeg = orientationDeg;
	   this.laneWidthCm = laneWidthCm;
	   this.type = type;
	   this.approaches = approaches;
	   this.preemptZones = preemptZones;
	   this.priorityZones = priorityZones;
   }

	public OdeIntersection(Intersection_ intsct) {
	   this.name = intsct.getName() != null ? intsct.getName().stringValue() : null;
	   this.id = intsct.getId() != null ? intsct.getId().byteArrayValue() : null;
	   this.refPoint = new OdePosition3D(intsct.getRefPoint());
	   this.refInterNum = intsct.getRefInterNum() != null ? intsct.getRefInterNum().byteArrayValue() : null;
	   this.orientationDeg = intsct.getOrientation() != null ? (double)intsct.getOrientation().intValue()/0.0125 : null;
	   this.laneWidthCm = intsct.getLaneWidth() != null ? intsct.getLaneWidth().intValue() : null;
	   this.type = intsct.getType() != null ? new OdeIntersectionStatusObject(intsct.getType().byteArrayValue()) : null;
//TODO	   
//	   this.approaches = intsct.getApproaches() != null ? OdeApproachObject.createList(intsct.getApproaches()) : null;
//	   this.preemptZones = intsct.getPreemptZones() != null ? OdeSignalControlZone.createList(intsct.getPreemptZones()) : null;
//	   this.priorityZones = intsct.getPriorityZones() != null ? OdeSignalControlZone.createList(intsct.getPriorityZones()) : null;
   }

	public static List<OdeIntersection> create(Intersections_ ints) {
		ArrayList<OdeIntersection> intersections = new ArrayList<OdeIntersection>();
		@SuppressWarnings("unchecked")
      Enumeration<Intersection_> xSections = ints.elements();
		
		while (xSections.hasMoreElements()) {
			Intersection_ intersection = xSections.nextElement();
			intersections.add(new OdeIntersection(intersection));
		}
		
		return intersections;
	}

	public String getName() {
		return name;
	}

	public OdeIntersection setName(String name) {
		this.name = name;
		return this;
	}

	public byte[] getId() {
		return id;
	}

	public OdeIntersection setId(byte[] id) {
		this.id = id;
		return this;
	}

	public OdePosition3D getRefPoint() {
		return refPoint;
	}

	public OdeIntersection setRefPoint(OdePosition3D refPoint) {
		this.refPoint = refPoint;
		return this;
	}

	public byte[] getRefInterNum() {
		return refInterNum;
	}

	public OdeIntersection setRefInterNum(byte[] refInterNum) {
		this.refInterNum = refInterNum;
		return this;
	}

	public Double getOrientationDeg() {
		return orientationDeg;
	}

	public OdeIntersection setOrientationDeg(Double orientationDeg) {
		this.orientationDeg = orientationDeg;
		return this;
	}

	public Integer getLaneWidthCm() {
		return laneWidthCm;
	}

	public OdeIntersection setLaneWidthCm(Integer laneWidthCm) {
		this.laneWidthCm = laneWidthCm;
		return this;
	}

	public OdeIntersectionStatusObject getType() {
		return type;
	}

	public OdeIntersection setType(OdeIntersectionStatusObject type) {
		this.type = type;
		return this;
	}

	public List<OdeApproachObject> getApproaches() {
		return approaches;
	}

	public OdeIntersection setApproaches(List<OdeApproachObject> approaches) {
		this.approaches = approaches;
		return this;
	}

	public List<OdeSignalControlZone> getPreemptZones() {
		return preemptZones;
	}

	public OdeIntersection setPreemptZones(List<OdeSignalControlZone> preemptZones) {
		this.preemptZones = preemptZones;
		return this;
	}

	public List<OdeSignalControlZone> getPriorityZones() {
		return priorityZones;
	}

	public OdeIntersection setPriorityZones(List<OdeSignalControlZone> priorityZones) {
		this.priorityZones = priorityZones;
		return this;
	}
	
}
