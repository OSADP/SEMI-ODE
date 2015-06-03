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
import java.util.List;

import com.bah.ode.asn.oss.dsrc.ConnectsTo;

public class OdeConnectsTo {
	private Integer laneNumber;
	private OdeLaneManeuverCode laneManeuverCode;
	
	public OdeConnectsTo() {
	   super();
   }

	public OdeConnectsTo(Integer laneNumber, OdeLaneManeuverCode laneManeuverCode) {
	   super();
	   this.laneNumber = laneNumber;
	   this.laneManeuverCode = laneManeuverCode;
   }

	public static List<OdeConnectsTo> createList(ConnectsTo connectsTo) {
		byte[] bytes = connectsTo.byteArrayValue();
		ArrayList<OdeConnectsTo> odeConnectsTos = new ArrayList<OdeConnectsTo>();
		
		for (int i = 0; i < bytes.length; i += 2) {
			odeConnectsTos.add(
					new OdeConnectsTo((int) bytes[i], OdeLaneManeuverCode.values[bytes[i+1]]));
		}
		
		return odeConnectsTos;
   }

	public Integer getLaneNumber() {
		return laneNumber;
	}

	public OdeConnectsTo setLaneNumber(Integer laneNumber) {
		this.laneNumber = laneNumber;
		return this;
	}

	public OdeLaneManeuverCode getLaneManeuverCode() {
		return laneManeuverCode;
	}

	public OdeConnectsTo setLaneManeuverCode(OdeLaneManeuverCode laneManeuverCode) {
		this.laneManeuverCode = laneManeuverCode;
		return this;
	}
	
	
}
