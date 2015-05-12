package com.bah.ode.dds.client.ws;

import javax.websocket.RemoteEndpoint.Async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeIntersectionData;
import com.bah.ode.util.JsonUtils;

public class IsdMessageHandler extends DdsMessageHandler<OdeIntersectionData> {

	private static final Logger logger = LoggerFactory.getLogger(IsdMessageHandler.class);

	public IsdMessageHandler(AppContext appContext, Async async) {
	   super(appContext, async);
   }

	@Override
   public void onMessage(OdeIntersectionData idata) {
//			OdeIntersectionData intData = OdeIntersectionData.create(CodecUtils.fromBase64(message));
		if (idata.getDdsData().getIsd() != null && async != null) {
//				async.sendText(JsonUtils.toJson(intData));
			try {
				
				if (async != null)
					async.sendText(JsonUtils.toJson(idata));
			} catch (Exception e) {
				logger.error("Error decoding ", e);
			} finally {
			}
		}
   }
}
