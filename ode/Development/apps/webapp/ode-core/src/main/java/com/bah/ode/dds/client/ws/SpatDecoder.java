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
package com.bah.ode.dds.client.ws;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.websocket.DecodeException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.semi.IntersectionRecord;
import com.bah.ode.asn.oss.semi.IntersectionSituationData;
import com.bah.ode.model.DdsData;
import com.bah.ode.util.CodecUtils;
import com.oss.asn1.Coder;

public class SpatDecoder extends DdsDecoder {

   private static final Logger logger = LoggerFactory
         .getLogger(SpatDecoder.class);

   @Override
   public DdsData decode(String message) throws DecodeException {
      DdsData ddsData = super.decode(message);
      // if it's not a control message decode it as a ASN.1 message
      if (ddsData.getControlMessage() == null) {
         InputStream ins = new ByteArrayInputStream(
               CodecUtils.fromBase64(message));

         Coder coder = Oss.getBERCoder();
         try {
            IntersectionSituationData isd = new IntersectionSituationData();
            coder.decode(ins, isd);
            
            /*
             *  Must not use isd object because we need to send only the 
             *  SPat Data and ISD has both SPat and Map. So we create an empty
             *  IntersectionSituationData object for the ddsData where we could
             *  populate only what's required.
             */
            IntersectionSituationData spat = new IntersectionSituationData();
            spat.setIntersectionRecord(new IntersectionRecord(null, 
                  isd.getIntersectionRecord().getSpatData()));
            ddsData.setIsd(spat);
         } catch (Exception e) {
            logger.error("Error decoding ", e);
         } finally {
            try {
               ins.close();
            } catch (IOException e) {
               logger.warn("Error closing input stream: ", e);
            }
         }
      }
      return ddsData;
   }

   @Override
   public boolean willDecode(String message) {
      return true;
   }

}
