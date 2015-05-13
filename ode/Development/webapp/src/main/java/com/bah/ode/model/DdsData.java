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
