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

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import com.bah.ode.asn.oss.dsrc.Approach;
import com.bah.ode.asn.oss.dsrc.Intersection_.Approaches;

public class OdeApproach {
   public String name;
   public Integer id;
   public List<OdeVehicleReferenceLane> drivingLanes;
   public List<OdeVehicleComputedLane> computedLanes;
   public List<OdeSpecialLane> trainsAndBuses;
   public List<OdeBarrierLane> barriers;
   public List<OdeCrosswalkLane> crosswalks;
   
	public OdeApproach() {
	   super();
   }

	public OdeApproach(String name, Integer id,
         List<OdeVehicleReferenceLane> drivingLanes,
         List<OdeVehicleComputedLane> computedLanes,
         List<OdeSpecialLane> trainsAndBuses, List<OdeBarrierLane> barriers,
         List<OdeCrosswalkLane> crosswalks) {
	   super();
	   this.name = name;
	   this.id = id;
	   this.drivingLanes = drivingLanes;
	   this.computedLanes = computedLanes;
	   this.trainsAndBuses = trainsAndBuses;
	   this.barriers = barriers;
	   this.crosswalks = crosswalks;
   }

	public OdeApproach(Approach a) {
	   this.name = a.getName() != null ? a.getName().stringValue() : null;
	   this.id = a.getId() != null ? a.getId().intValue() : null;
	   this.drivingLanes = a.getDrivingLanes() != null ? OdeVehicleReferenceLane.createList(a.getDrivingLanes()) : null;
//TODO	   
//	   this.computedLanes = a.getComputedLanes() != null ? OdeVehicleComputedLane.createList(a.getComputedLanes()) : null;
//	   this.trainsAndBuses = a.getTrainsAndBuses() != null ? OdeSpecialLane.createList(a.getTrainsAndBuses()) : null; 
//	   this.barriers = a.getBarriers() != null ? OdeBarrierLane.createList(a.getBarriers()) : null;
//	   this.crosswalks = a.getCrosswalks() != null ? OdeCrosswalkLane.createList(a.getCrosswalks()) : null;
   }

	public static List<OdeApproach> createList(Approaches approaches) {
		
      @SuppressWarnings("unchecked")
      Enumeration<Approach> apprchs = approaches.elements();
      List<OdeApproach> odeApproachs = new ArrayList<OdeApproach>();
      
      if (null != apprchs) {
      	while (apprchs.hasMoreElements()) {
      		Approach a = apprchs.nextElement();
      	
	      	if (null != a) {
	      		odeApproachs.add(new OdeApproach(a));
	      	}
      	}
      }
	      
	   return odeApproachs;
   }

	public String getName() {
		return name;
	}

	public OdeApproach setName(String name) {
		this.name = name;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public OdeApproach setId(Integer id) {
		this.id = id;
		return this;
	}

	public List<OdeVehicleReferenceLane> getDrivingLanes() {
		return drivingLanes;
	}

	public OdeApproach setDrivingLanes(List<OdeVehicleReferenceLane> drivingLanes) {
		this.drivingLanes = drivingLanes;
		return this;
	}

	public List<OdeVehicleComputedLane> getComputedLanes() {
		return computedLanes;
	}

	public OdeApproach setComputedLanes(List<OdeVehicleComputedLane> computedLanes) {
		this.computedLanes = computedLanes;
		return this;
	}

	public List<OdeSpecialLane> getTrainsAndBuses() {
		return trainsAndBuses;
	}

	public OdeApproach setTrainsAndBuses(List<OdeSpecialLane> trainsAndBuses) {
		this.trainsAndBuses = trainsAndBuses;
		return this;
	}

	public List<OdeBarrierLane> getBarriers() {
		return barriers;
	}

	public OdeApproach setBarriers(List<OdeBarrierLane> barriers) {
		this.barriers = barriers;
		return this;
	}

	public List<OdeCrosswalkLane> getCrosswalks() {
		return crosswalks;
	}

	public OdeApproach setCrosswalks(List<OdeCrosswalkLane> crosswalks) {
		this.crosswalks = crosswalks;
		return this;
	}

   
}
