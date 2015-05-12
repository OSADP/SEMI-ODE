package com.bah.ode.dds.client.ws;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.semi.VehSitDataMessage;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.OdeVehicleData;
import com.bah.ode.util.CodecUtils;
import com.oss.asn1.Coder;

public class VsdDecoder extends DdsDecoder implements Decoder.Text<OdeVehicleData> {

	private static final Logger logger = LoggerFactory.getLogger(VsdDecoder.class);

	@Override
   public OdeVehicleData decode(String message) throws DecodeException {
		OdeVehicleData vData = new OdeVehicleData();
		
		DdsData ddsData = new DdsData();
		if (!isControlMessage(message)) {
			
	//			OdeVehicleData intData = OdeVehicleData.create(CodecUtils.fromBase64(message));
	//			async.sendText(JsonUtils.toJson(intData));
			InputStream ins = new ByteArrayInputStream(CodecUtils.fromBase64(message));
			
			Coder coder = Oss.getBERCoder();
			try {
				ddsData.setVsd(new VehSitDataMessage());
				vData.setDdsData(ddsData);
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
		} else {
			ddsData.setControlMessage(new ControlMessage());
		}
		vData.setDdsData(ddsData);
		return vData;
   }

	@Override
   public boolean willDecode(String message) {
		return true;
   }

}
