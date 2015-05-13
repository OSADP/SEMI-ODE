package com.bah.ode.dds.client.ws;

import javax.websocket.RemoteEndpoint.Async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.model.DdsData;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.WebSocketMessageHandler;

public class DdsMessageHandler implements WebSocketMessageHandler<DdsData> {

	private static final Logger logger = LoggerFactory.getLogger(DdsMessageHandler.class);
	
	protected Async async;
	
	public DdsMessageHandler(Async async) {
	   this.async = async;
   }

	@Override
   public void onMessage(DdsData ddsData) {
		if (async != null && ddsData.haveData()) {
			try {
				async.sendText(JsonUtils.toJson(ddsData));
			} catch (Exception e) {
				logger.error("Error decoding ", e);
			} finally {
			}
		}
   }
	public void disable() {
		async = null;
   }
}
