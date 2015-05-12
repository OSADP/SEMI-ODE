package com.bah.ode.dds.client.ws;

import javax.websocket.RemoteEndpoint.Async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeVehicleData;
import com.bah.ode.util.JsonUtils;

public class VsdMessageHandler extends DdsMessageHandler<OdeVehicleData> {

	private static final Logger logger = LoggerFactory.getLogger(VsdMessageHandler.class);

	public VsdMessageHandler(AppContext appContext, Async async) {
	   super(appContext, async);
   }

	@Override
   public void onMessage(OdeVehicleData vdata) {
		if (vdata.getDdsData().getVsd() != null && async != null) {
			async.sendText(JsonUtils.toJson(vdata));
		}
   }
}
