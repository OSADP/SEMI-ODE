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
import com.bah.ode.asn.oss.semi.AdvisorySituationData;
import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.metrics.OdeMetrics.Context;
import com.bah.ode.metrics.OdeMetrics.Meter;
import com.bah.ode.metrics.OdeMetrics.Timer;
import com.bah.ode.model.DdsData;
import com.bah.ode.util.CodecUtils;
import com.oss.asn1.Coder;

public class AsdDecoder extends DdsDecoder {

   private static final Logger logger = LoggerFactory
         .getLogger(AsdDecoder.class);

   private Meter meter = OdeMetrics.getInstance().meter("ASD_RecordsReceived");
   private Timer timer = OdeMetrics.getInstance().timer("ASD_DecodeTime");
   
   @Override
   public DdsData decode(String message) throws DecodeException {
      DdsData ddsData;
      Context context = timer.time();
      try {
         meter.mark();
         ddsData = super.decode(message);
         // if it's not a control message decode it as a ASN.1 message
         if (ddsData.getControlMessage() == null) {
            InputStream ins = new ByteArrayInputStream(
                  CodecUtils.fromBase64(message));

            Coder coder = Oss.getBERCoder();
            try {
               AdvisorySituationData asd = new AdvisorySituationData();
               ddsData.setAsd(asd);
               coder.decode(ins, asd);
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
      } finally {
         context.stop();
      }
      return ddsData;
   }

   @Override
   public boolean willDecode(String message) {
      return true;
   }

}
