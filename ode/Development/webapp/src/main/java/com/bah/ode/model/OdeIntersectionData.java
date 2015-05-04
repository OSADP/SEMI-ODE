package com.bah.ode.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.DatatypeConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.OdeDateTime;
import com.bah.ode.asn.OdeHexTool;
import com.bah.ode.asn.OdeLocation3D;
import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.dsrc.AccelerationSet4Way;
import com.bah.ode.asn.oss.dsrc.BrakeSystemStatus;
import com.bah.ode.asn.oss.dsrc.DDateTime;
import com.bah.ode.asn.oss.dsrc.Heading;
import com.bah.ode.asn.oss.dsrc.MapData;
import com.bah.ode.asn.oss.dsrc.Position3D;
import com.bah.ode.asn.oss.dsrc.SteeringWheelAngle;
import com.bah.ode.asn.oss.dsrc.TransmissionAndSpeed;
import com.bah.ode.asn.oss.semi.FundamentalSituationalStatus;
import com.bah.ode.asn.oss.semi.IntersectionRecord;
import com.bah.ode.asn.oss.semi.IntersectionSituationData;
import com.bah.ode.asn.oss.semi.SpatRecord;
import com.bah.ode.asn.oss.semi.VehSitDataMessage;
import com.bah.ode.asn.oss.semi.VehSitDataMessage.Bundle;
import com.bah.ode.asn.oss.semi.VehSitRecord;
import com.bah.ode.asn.oss.semi.VsmEventFlag;
import com.oss.asn1.Coder;

public class OdeIntersectionData {
	private static Logger logger = LoggerFactory.getLogger(OdeIntersectionData.class);

	private OdeGroupId groupId;
	private OdeLocation3D serviceRegion;
	private OdeMapData mapData;
	private OdeSpatData spatData;
	
	public OdeIntersectionData() {
	}

	public OdeGroupId getGroupId() {
		return groupId;
	}

	public OdeIntersectionData setGroupId(OdeGroupId groupId) {
		this.groupId = groupId;
		return this;
	}

	public OdeLocation3D getServiceRegion() {
		return serviceRegion;
	}

	public OdeIntersectionData setServiceRegion(OdeLocation3D serviceRegion) {
		this.serviceRegion = serviceRegion;
		return this;
	}

	public OdeMapData getMapData() {
		return mapData;
	}

	public OdeIntersectionData setMapData(OdeMapData mapData) {
		this.mapData = mapData;
		return this;
	}

	public OdeSpatData getSpatData() {
		return spatData;
	}

	public OdeIntersectionData setSpatData(OdeSpatData spatData) {
		this.spatData = spatData;
		return this;
	}

	public static OdeIntersectionData fromBase64(String base64) {
		InputStream ins = new ByteArrayInputStream(DatatypeConverter.parseBase64Binary(base64));
		OdeIntersectionData intData = new OdeIntersectionData();
		
		Coder coder = Oss.getBERCoder();
		try {
			IntersectionSituationData value = new IntersectionSituationData();
			coder.decode(ins, value);
			ins.close();
			
			IntersectionRecord intRec = value.getIntersectionRecord();
			
			intData.setGroupId(new OdeGroupId(value.getGroupID()))
			       .setMapData(new OdeMapData(intRec.getMapData()))
			       .setSpatData(new OdeSpatData(intRec.getSpatData()));
			
		} catch (Exception e) {
			logger.error("Error decoding ", e);
		} finally {
		}
		return intData;		
	}
	
}
