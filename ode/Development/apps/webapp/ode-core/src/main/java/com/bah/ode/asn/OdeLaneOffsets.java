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

import com.bah.ode.asn.oss.dsrc.NodeList;
import com.bah.ode.asn.oss.dsrc.Offsets;
import com.bah.ode.util.ByteUtils;

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
public class OdeLaneOffsets extends OdeRegionOffsets {
   private static final long serialVersionUID = -4812679580897977812L;
   private Integer LaneWidthCm;

   public OdeLaneOffsets() {
      super();
   }

   public OdeLaneOffsets(Integer xOffsetCm, Integer yOffsetCm,
         Integer zOffsetCm, Integer laneWidthCm) {
      super(xOffsetCm.longValue(), yOffsetCm.longValue(), zOffsetCm.longValue());

      LaneWidthCm = laneWidthCm;
   }

   public OdeLaneOffsets(Offsets ofs) {
      if (ofs.byteArrayValue().length >= 2)
         setxOffsetCm(ByteUtils.unsignedByteArrayToLong(ofs.byteArrayValue(), 0, 2));

      if (ofs.byteArrayValue().length >= 4)
         setyOffsetCm(ByteUtils.unsignedByteArrayToLong(ofs.byteArrayValue(), 2, 2));

      if (ofs.byteArrayValue().length >= 6)
         setzOffsetCm(ByteUtils.unsignedByteArrayToLong(ofs.byteArrayValue(), 4, 2));

      if (ofs.byteArrayValue().length >= 8)
         setLaneWidthCm(ByteUtils.unsignedByteArrayToInt(ofs.byteArrayValue(), 6, 2));
   }

   public static List<OdeLaneOffsets> createList(NodeList nodeList) {
      ArrayList<OdeLaneOffsets> nl = new ArrayList<OdeLaneOffsets>();

      for (Offsets ofs : nodeList.elements) {
         nl.add(new OdeLaneOffsets(ofs));
      }
      return nl;
   }

   public Integer getLaneWidthCm() {
      return LaneWidthCm;
   }

   public OdeLaneOffsets setLaneWidthCm(Integer laneWidthCm) {
      LaneWidthCm = laneWidthCm;
      return this;
   }

}
