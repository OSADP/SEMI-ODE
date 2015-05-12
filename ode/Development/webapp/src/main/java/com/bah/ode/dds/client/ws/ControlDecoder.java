package com.bah.ode.dds.client.ws;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.dds.client.ws.ControlMessage.Tag;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.DdsRequest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ControlDecoder extends DdsDecoder implements Decoder.Text<DdsData> {

	private static final Logger logger = LoggerFactory.getLogger(ControlDecoder.class);
	private ObjectMapper mapper = new ObjectMapper();

	@Override
   public DdsData decode(String message) throws DecodeException {
		DdsData control = new DdsData();
		
		try {
			if (isControlMessage(message)) {
				Tag tag = Tag.valueOf(message);
				String jsonMessage = message.substring(tag.name().length());
				try {
					JsonNode rootNode = mapper.readTree(jsonMessage);
					control.getControlMessage()
						.setDialog(DdsRequest.Dialog.getById(rootNode.get("dialogID").asInt()))
						.setEncoding(rootNode.get("resultEncoding").textValue())
						.setTag(tag);
					
				} catch (Exception e) {
					logger.error("Error processing Start Tag", e);
				}
			}
		} catch (Exception e) {
			logger.error("Error decoding ", e);
		} finally {
		}
		
		return control;
   }

	@Override
   public boolean willDecode(String message) {
		return isControlMessage(message);
   }

}
