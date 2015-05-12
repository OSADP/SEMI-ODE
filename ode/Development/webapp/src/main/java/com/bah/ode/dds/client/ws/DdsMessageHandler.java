package com.bah.ode.dds.client.ws;

import javax.websocket.RemoteEndpoint.Async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.wrapper.WebSocketMessageHandler;

public abstract class DdsMessageHandler<T> implements WebSocketMessageHandler<T> {

	private static final Logger logger = LoggerFactory.getLogger(DdsMessageHandler.class);
	
	protected Async async;
	
	public DdsMessageHandler(AppContext appContext, Async async) {
	   this.async = async;
   }

	public void disable() {
		async = null;
   }
}
