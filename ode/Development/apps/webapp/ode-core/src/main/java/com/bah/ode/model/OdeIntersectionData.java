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

public final class OdeIntersectionData extends OdeDataAbstractFinal {
   private static final long serialVersionUID = -8672926422209668605L;

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

   @Override
   protected void setDataType() {
      setDataType(OdeDataType.IntersectionData);
   }

   @Override
   protected void initDefault() {
      // TODO Auto-generated method stub
      
   }
	
}
