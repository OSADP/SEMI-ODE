package com.bah.ode.dds.client.ws;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import javax.websocket.RemoteEndpoint.Async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.oss.Oss;
import com.bah.ode.asn.oss.semi.IntersectionSituationData;
import com.bah.ode.context.AppContext;
import com.bah.ode.util.CodecUtils;
import com.bah.ode.util.JsonUtils;
import com.oss.asn1.Coder;

public class IsdResponseHandler extends ResponseHandler {

	private static final Logger logger = LoggerFactory.getLogger(IsdResponseHandler.class);

	public IsdResponseHandler(AppContext appContext, Async async) {
	   super(appContext, async);
   }

	@Override
   public void onMessage(String message) {
		if (message.startsWith(START_TAG) || message.startsWith(STOP_TAG) || 
				message.startsWith(CONNECTED_TAG) || message.startsWith(ERROR_TAG)) {
			logger.trace(message);
		} else {
//			OdeIntersectionData intData = OdeIntersectionData.create(CodecUtils.fromBase64(message));
			if (async != null) {
//				async.sendText(JsonUtils.toJson(intData));
				InputStream ins = new ByteArrayInputStream(CodecUtils.fromBase64(message));
				
				Coder coder = Oss.getBERCoder();
				try {
					IntersectionSituationData value = new IntersectionSituationData();
					coder.decode(ins, value);
					ins.close();
					
					if (async != null)
						async.sendText(JsonUtils.toJson(value));
				} catch (Exception e) {
					logger.error("Error decoding ", e);
				} finally {
				}
			}
		}
   }
	
	

}
