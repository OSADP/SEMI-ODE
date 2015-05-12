package com.bah.ode.dds.client.ws;

import javax.websocket.EndpointConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.dds.client.ws.ControlMessage.Tag;
import com.bah.ode.wrapper.WebSocketMessageDecoder;

public class DdsDecoder implements WebSocketMessageDecoder {

	private static final Logger logger = LoggerFactory.getLogger(DdsDecoder.class);

	@Override
	public void init(EndpointConfig endpointConfig) {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	protected static boolean isControlMessage(String message) {
		Tag[] tags = ControlMessage.Tag.values();
		
		for (Tag tag : tags) {
			if (message.startsWith(tag.name())) {
				return true;
			}
		}
		
		return false;
	}
}
