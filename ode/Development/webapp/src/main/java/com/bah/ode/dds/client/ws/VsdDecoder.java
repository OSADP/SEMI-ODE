package com.bah.ode.dds.client.ws;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.websocket.DecodeException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.semi.VehSitDataMessage;
import com.bah.ode.model.DdsData;
import com.bah.ode.util.CodecUtils;
import com.oss.asn1.Coder;

public class VsdDecoder extends DdsDecoder {

	private static final Logger logger = LoggerFactory.getLogger(VsdDecoder.class);

	@Override
   public DdsData decode(String message) throws DecodeException {
		DdsData ddsData = super.decode(message);
		// if it's not a control message decode it as a ASN.1 message
		if (ddsData.getControlMessage() == null) {
			InputStream ins = new ByteArrayInputStream(CodecUtils.fromBase64(message));
			
			Coder coder = Oss.getBERCoder();
			try {
				ddsData.setVsd(new VehSitDataMessage());
				coder.decode(ins, ddsData.getVsd());
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
