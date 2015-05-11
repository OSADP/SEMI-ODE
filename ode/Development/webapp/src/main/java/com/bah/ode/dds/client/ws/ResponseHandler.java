/**
 * Copyright 2014 Leidos
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bah.ode.dds.client.ws;

import java.io.IOException;

import javax.websocket.MessageHandler;
import javax.websocket.RemoteEndpoint.Async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.DdsRequest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class ResponseHandler implements MessageHandler.Whole<String> {

	private static final Logger logger = LoggerFactory.getLogger(ResponseHandler.class);
	
	protected static final String CONNECTED_TAG = "CONNECTED:";
	protected static final String START_TAG = "START:";
	protected static final String STOP_TAG = "STOP:";
	protected static final String ERROR_TAG = "ERROR:";
	
	private AppContext appContext;
	protected Async async;
	
	private ObjectMapper mapper = new ObjectMapper();
	private String messageTypePrefix = "msg";
	private String resultEncoding = "full";
	
	public ResponseHandler(AppContext appContext, Async async) {
		this.appContext = appContext;
		this.async = async;
	}
	
//	public abstract void handleMessage(String message);
	
	private void processStartTag(String message) {
		if (message.startsWith(START_TAG)) {
			// default values in case parsing fails
			messageTypePrefix = "msg";
			resultEncoding = "full";
			String jsonMessage = message.substring(START_TAG.length());
			try {
				JsonNode rootNode = mapper.readTree(jsonMessage);
				messageTypePrefix = DdsRequest.Dialog.getById(rootNode.get("dialogID").asInt()).name();
				resultEncoding = rootNode.get("resultEncoding").textValue();
			} catch (Exception e) {
				logger.error("Error processing Start Tag", e);
			}
		}
	}
	
   private void processStopTag(String message) throws IOException {
      if (message.startsWith(STOP_TAG)) {
      }
   }

	public void disable() {
		async = null;
   }

}
