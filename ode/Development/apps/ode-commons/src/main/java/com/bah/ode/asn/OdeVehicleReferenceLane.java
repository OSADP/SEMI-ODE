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

import com.bah.ode.asn.oss.dsrc.Approach.DrivingLanes;
import com.bah.ode.asn.oss.dsrc.VehicleReferenceLane;

public class OdeVehicleReferenceLane extends OdeLane {
   public OdeVehicleLaneAttributes laneAttributes;
   public List<OdeLaneOffsets> keepOutList;
   
	public OdeVehicleReferenceLane() {
	   super();
   }
	
	public OdeVehicleReferenceLane(byte[] laneNumber, Integer laneWidthCm,
         List<OdeLaneOffsets> nodeList, List<OdeConnectsTo> connectsTo,
         OdeVehicleLaneAttributes laneAttributes,
         List<OdeLaneOffsets> keepOutList
         ) {
	   super(laneNumber, laneWidthCm, nodeList, connectsTo);
	   this.laneAttributes = laneAttributes;
	   this.keepOutList = keepOutList;
   }
	
	public OdeVehicleReferenceLane(VehicleReferenceLane dl) {
		super(dl.getLaneNumber().byteArrayValue(),
		      dl.getLaneWidth().intValue(),
		      OdeLaneOffsets.createList(dl.getNodeList()),
		      OdeConnectsTo.createList(dl.getConnectsTo()));
		
		this.laneAttributes = new OdeVehicleLaneAttributes(
				dl.getLaneAttributes() != null ? 
						dl.getLaneAttributes().intValue() : 
							OdeVehicleLaneAttributes.NO_LANE_DATA);
	   this.keepOutList = OdeLaneOffsets.createList(dl.getKeepOutList());
   }

	public static List<OdeVehicleReferenceLane> createList(DrivingLanes drivingLanes) {
		ArrayList<OdeVehicleReferenceLane> odeDrivingLanes = new ArrayList<OdeVehicleReferenceLane>();
		
		@SuppressWarnings("unchecked")
      Enumeration<VehicleReferenceLane> dls = drivingLanes.elements();
		
		if (null != dls) {
			while (dls.hasMoreElements()) {
				VehicleReferenceLane dl = dls.nextElement();
				if (null != dl)
					odeDrivingLanes.add(new OdeVehicleReferenceLane(dl));
			}
		}
	   return odeDrivingLanes;
   }

	public OdeVehicleLaneAttributes getLaneAttributes() {
		return laneAttributes;
	}
	public OdeVehicleReferenceLane setLaneAttributes(OdeVehicleLaneAttributes laneAttributes) {
		this.laneAttributes = laneAttributes;
		return this;
	}
	public List<OdeLaneOffsets> getKeepOutList() {
		return keepOutList;
	}
	public OdeVehicleReferenceLane setKeepOutList(List<OdeLaneOffsets> keepOutList) {
		this.keepOutList = keepOutList;
		return this;
	}

   
}
