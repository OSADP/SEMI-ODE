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
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseHandler {

	private static final Logger logger = LoggerFactory.getLogger(ResponseHandler.class);
	
	private static final String NEW_LINE = System.getProperty("line.separator");
	private static final String CONNECTED_TAG = "CONNECTED:";
	private static final String START_TAG = "START:";
	private static final String STOP_TAG = "STOP:";
	private static final String ERROR_TAG = "ERROR:";
	private static final Map<Integer,String> dialogIDPrefixLookup = new HashMap<Integer,String>();
	private static int fileCounter = 0;
	
	static {
		dialogIDPrefixLookup.put(-1, "all");
		dialogIDPrefixLookup.put(154, "vsd");
		dialogIDPrefixLookup.put(156, "adv");
		dialogIDPrefixLookup.put(162, "isd");
	}
	
	private AppContext appContext;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS");
	
	private ObjectMapper mapper = new ObjectMapper();
	private String messageTypePrefix = "msg";
	private String resultEncoding = "full";
	
	public ResponseHandler(AppContext appContext) {
		this.appContext = appContext;
	}
	
	public void handleMessage(String message) {
		if (message.startsWith(STOP_TAG)) {
			logger.info(message);
		}
	}
	
	private void processStartTag(String message) {
		if (message.startsWith(START_TAG)) {
			// default values in case parsing fails
			messageTypePrefix = "msg";
			resultEncoding = "full";
			String jsonMessage = message.substring(START_TAG.length());
			try {
				JsonNode rootNode = mapper.readTree(jsonMessage);
				messageTypePrefix = dialogIDPrefixLookup.get(rootNode.get("dialogID").asInt());
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
}
