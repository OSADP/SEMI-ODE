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

import com.bah.ode.asn.oss.dsrc.NodeList;
import com.bah.ode.asn.oss.dsrc.Offsets;

//   -- xOffset  INTEGER (-32767..32767), 
//   -- yOffset  INTEGER (-32767..32767),
//   -- if 6 or 8 bytes in length:
//   -- zOffset  INTEGER (-32767..32767) OPTIONAL,
//            -- all above in signed values where 
//            -- the LSB is in units of 1.0 cm   
//  
//   -- if 8 bytes in length:
//   -- width    LaneWidth               OPTIONAL
//   -- a length of 7 bytes is never used
public class OdeLaneOffsets {
   private Integer xOffsetCm; 
   private Integer yOffsetCm;
   private Integer zOffsetCm;
   private Integer LaneWidthCm;
   
	public OdeLaneOffsets() {
	   super();
   }

	public OdeLaneOffsets(Integer xOffsetCm, Integer yOffsetCm,
         Integer zOffsetCm, Integer laneWidthCm) {
	   super();
	   this.xOffsetCm = xOffsetCm;
	   this.yOffsetCm = yOffsetCm;
	   this.zOffsetCm = zOffsetCm;
	   LaneWidthCm = laneWidthCm;
   }

	public OdeLaneOffsets(Offsets ofs) {
	   if (ofs.byteArrayValue().length >= 2)
	   	this.xOffsetCm = ofs.byteArrayValue()[0] << 8 | ofs.byteArrayValue()[1];
	   
	   if (ofs.byteArrayValue().length >= 4)
	   	this.yOffsetCm = ofs.byteArrayValue()[2] << 8 | ofs.byteArrayValue()[3];
	   
	   if (ofs.byteArrayValue().length >= 6)
	   	this.zOffsetCm = ofs.byteArrayValue()[4] << 8 | ofs.byteArrayValue()[5];
	   
	   if (ofs.byteArrayValue().length >= 8)
	   	LaneWidthCm = ofs.byteArrayValue()[6] << 8 | ofs.byteArrayValue()[7];
   }

	public static List<OdeLaneOffsets> createList(NodeList keepOutList) {
      @SuppressWarnings("unchecked")
      Enumeration<Offsets> kol = keepOutList.elements();
		ArrayList<OdeLaneOffsets> odeKOL = new ArrayList<OdeLaneOffsets>();
		
		if (null != kol) {
			while (kol.hasMoreElements()) {
				Offsets ofs = kol.nextElement();
				if (ofs != null) {
					odeKOL.add(new OdeLaneOffsets(ofs));
				}
			}
		}
	   return odeKOL;
   }
   
	public Integer getxOffsetCm() {
		return xOffsetCm;
	}

	public OdeLaneOffsets setxOffsetCm(Integer xOffsetCm) {
		this.xOffsetCm = xOffsetCm;
		return this;
	}

	public Integer getyOffsetCm() {
		return yOffsetCm;
	}

	public OdeLaneOffsets setyOffsetCm(Integer yOffsetCm) {
		this.yOffsetCm = yOffsetCm;
		return this;
	}

	public Integer getzOffsetCm() {
		return zOffsetCm;
	}

	public OdeLaneOffsets setzOffsetCm(Integer zOffsetCm) {
		this.zOffsetCm = zOffsetCm;
		return this;
	}

	public Integer getLaneWidthCm() {
		return LaneWidthCm;
	}

	public OdeLaneOffsets setLaneWidthCm(Integer laneWidthCm) {
		LaneWidthCm = laneWidthCm;
		return this;
	}

   
}
