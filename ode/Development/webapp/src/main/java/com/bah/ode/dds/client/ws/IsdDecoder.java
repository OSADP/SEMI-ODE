package com.bah.ode.dds.client.ws;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.semi.IntersectionSituationData;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.OdeIntersectionData;
import com.bah.ode.util.CodecUtils;
import com.oss.asn1.Coder;

public class IsdDecoder extends DdsDecoder implements Decoder.Text<OdeIntersectionData> {

	private static final Logger logger = LoggerFactory.getLogger(IsdDecoder.class);

	@Override
   public OdeIntersectionData decode(String message) throws DecodeException {
		OdeIntersectionData iData = new OdeIntersectionData();
		DdsData ddsData = new DdsData();
		if (!isControlMessage(message)) {
	//			OdeIntersectionData intData = OdeIntersectionData.create(CodecUtils.fromBase64(message));
	//			async.sendText(JsonUtils.toJson(intData));
			InputStream ins = new ByteArrayInputStream(CodecUtils.fromBase64(message));
			
			Coder coder = Oss.getBERCoder();
			try {
				ddsData.setIsd(new IntersectionSituationData());
				iData.setDdsData(ddsData);
				coder.decode(ins, ddsData.getIsd());
			} catch (Exception e) {
				logger.error("Error decoding ", e);
			} finally {
				try {
	            ins.close();
	         } catch (IOException e) {
					logger.warn("Error closing input stream: ", e);
	         }
			}
		} else {
			ddsData.setControlMessage(new ControlMessage());
		}
		iData.setDdsData(ddsData);
		return iData;
   }

	@Override
   public boolean willDecode(String message) {
		return true;
   }

}
