package com.bah.ode.dds.client.ws;

import java.util.List;

import javax.websocket.RemoteEndpoint.Async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeVehicleData;
import com.bah.ode.util.JsonUtils;

public class VsdResponseHandler extends ResponseHandler {

	private static final Logger logger = LoggerFactory.getLogger(VsdResponseHandler.class);

	public VsdResponseHandler(AppContext appContext, Async async) {
	   super(appContext, async);
   }

	@Override
   public void onMessage(String message) {
		if (message.startsWith(START_TAG) || message.startsWith(STOP_TAG) || 
				message.startsWith(CONNECTED_TAG) || message.startsWith(ERROR_TAG)) {
			logger.trace(message);
		} else {
			List<OdeVehicleData> vehData = OdeVehicleData.fromBase64(message);
			if (async != null) {
				for (OdeVehicleData veh : vehData) {
					async.sendText(JsonUtils.toJson(veh));
				}
			}
		}
   }
}
