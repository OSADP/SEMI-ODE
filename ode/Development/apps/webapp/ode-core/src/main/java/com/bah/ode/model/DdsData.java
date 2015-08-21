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
package com.bah.ode.model;

import com.bah.ode.asn.oss.semi.AdvisorySituationData;
import com.bah.ode.asn.oss.semi.IntersectionSituationData;
import com.bah.ode.asn.oss.semi.VehSitDataMessage;
import com.bah.ode.dds.client.ws.ControlMessage;

public class DdsData {
	
	private ControlMessage controlMessage;
	private IntersectionSituationData isd;
	private VehSitDataMessage vsd;
	private AdvisorySituationData asd;
	private String fullMessage;
	
	public boolean haveData() {
		return controlMessage != null ||
				isd != null             ||
				vsd != null             ||
				asd != null					||
				fullMessage != null;
	}
	
	public ControlMessage getControlMessage() {
		return controlMessage;
	}

	public DdsData setControlMessage(ControlMessage controlMessage) {
		this.controlMessage = controlMessage;
		return this;
	}

	public IntersectionSituationData getIsd() {
		return isd;
	}

	public DdsData setIsd(IntersectionSituationData isd) {
		this.isd = isd;
		return this;
	}

	public VehSitDataMessage getVsd() {
		return vsd;
	}

	public DdsData setVsd(VehSitDataMessage vsd) {
		this.vsd = vsd;
		return this;
	}

	public AdvisorySituationData getAsd() {
		return asd;
	}

	public DdsData setAsd(AdvisorySituationData asd) {
		this.asd = asd;
		return this;
	}

	public String getFullMessage() {
		return fullMessage;
	}

	public DdsData setFullMessage(String fullMessage) {
		this.fullMessage = fullMessage;
		return this;
	}

}
