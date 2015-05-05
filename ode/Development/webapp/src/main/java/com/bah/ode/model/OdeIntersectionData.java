package com.bah.ode.model;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.OdeGeoRegion;
import com.bah.ode.asn.OdeGroupId;
import com.bah.ode.asn.OdeMapData;
import com.bah.ode.asn.OdeSpatData;
import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.semi.IntersectionSituationData;
import com.oss.asn1.Coder;

public class OdeIntersectionData {
	private static Logger logger = LoggerFactory.getLogger(OdeIntersectionData.class);

	private OdeGroupId groupId;
	private OdeGeoRegion serviceRegion;
	private OdeMapData mapData;
	private OdeSpatData spatData;
	
	public OdeIntersectionData() {
	}

	public OdeIntersectionData(OdeGroupId groupId, OdeGeoRegion serviceRegion,
         OdeMapData mapData, OdeSpatData spatData) {
	   super();
	   this.groupId = groupId;
	   this.serviceRegion = serviceRegion;
	   this.mapData = mapData;
	   this.spatData = spatData;
   }

	public OdeIntersectionData(IntersectionSituationData isd) {
		this.setGroupId(new OdeGroupId(isd.getGroupID()));
		this.setServiceRegion(new OdeGeoRegion(isd.getServiceRegion()));
		this.setMapData(new OdeMapData(isd.getIntersectionRecord().getMapData()));
		this.setSpatData(new OdeSpatData(isd.getIntersectionRecord().getSpatData()));
   }

	public OdeGroupId getGroupId() {
		return groupId;
	}

	public OdeIntersectionData setGroupId(OdeGroupId groupId) {
		this.groupId = groupId;
		return this;
	}

	public OdeGeoRegion getServiceRegion() {
		return serviceRegion;
	}

	public OdeIntersectionData setServiceRegion(OdeGeoRegion serviceRegion) {
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

	public static OdeIntersectionData create(byte[] intersectionData) {
		InputStream ins = new ByteArrayInputStream(intersectionData);
		OdeIntersectionData intData = null;
		
		Coder coder = Oss.getBERCoder();
		try {
			IntersectionSituationData isd = new IntersectionSituationData();
			coder.decode(ins, isd);
			ins.close();
			
			intData = new OdeIntersectionData(isd);
			
		} catch (Exception e) {
			logger.error("Error decoding ", e);
		} finally {
		}
		return intData;		
	}
	
}
