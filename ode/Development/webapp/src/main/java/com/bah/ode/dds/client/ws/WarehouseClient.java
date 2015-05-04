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
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import javax.net.ssl.SSLContext;

import org.java_websocket.client.DefaultSSLWebSocketClientFactory;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.CASClient.CASLoginException;

public class WarehouseClient extends org.java_websocket.client.WebSocketClient {

	private static final Logger logger = LoggerFactory
	      .getLogger(WarehouseClient.class);
	
	private static ConcurrentHashMap<String, WarehouseClient> clients = new ConcurrentHashMap<String, WarehouseClient>();

	public static ConcurrentHashMap<String, WarehouseClient> getClients() {
		return clients;
	}

	private ResponseHandler handler;
	private AtomicLong numMsgs = new AtomicLong();

	public long getNumMsgs() {
		return numMsgs.get();
	}

	public void setNumMsgs(long numMsgs) {
		this.numMsgs.set(numMsgs);
	}

	public long incrementNumMsgs() {
		return numMsgs.incrementAndGet();
	}

	private String sessionId;
	
	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	
	@SuppressWarnings("unchecked")
	public static WarehouseClient configure(AppContext appContext,
	      ResponseHandler handler) throws URISyntaxException,
	      KeyManagementException, KeyStoreException, NoSuchAlgorithmException,
	      CertificateException, IOException, CASLoginException {

      logger.info("Logging in to {}", appContext.getParam(AppContext.DDS_CAS_URL));
		CASClient casClient = CASClient.configure(appContext);
		String jSessionID = casClient.login();
		logger.info("Session ID: ", jSessionID);

		@SuppressWarnings("rawtypes")
		Map headers = new HashMap();
		headers.put("Cookie", AppContext.JSESSIONID_KEY + "=" + jSessionID);

		URI ddsWsUri = new URI("wss", null, 
      		appContext.getParam(AppContext.DDS_DOMAIN),
      		Integer.parseInt(appContext.getParam(AppContext.DDS_PORT)),
				appContext.getParam(AppContext.DDS_RESOURCE_IDENTIFIER),
				null, null);
		
      logger.info("Opening connection to {}", ddsWsUri.toString());
      WarehouseClient wsClient = new WarehouseClient(ddsWsUri,	new Draft_17(), headers); // more about drafts here:
		// http://github.com/TooTallNate/Java-WebSocket/wiki/Drafts
		wsClient.handler = handler;
		wsClient.setSessionId(jSessionID);

		SSLContext wsSSLContext = SSLBuilder.buildSSLContext(
		      appContext.getParam(AppContext.DDS_KEYSTORE_FILE_PATH),
		      appContext.getParam(AppContext.DDS_KEYSTORE_PASSWORD));
		
		wsClient.setWebSocketFactory(new DefaultSSLWebSocketClientFactory(wsSSLContext));
		
		clients.put(jSessionID, wsClient);
		
		return wsClient;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private WarehouseClient(URI serverUri, Draft draft, Map headers) {
		super(serverUri, draft, headers, 0);
	}

	@Override
	public void onOpen(ServerHandshake handshakedata) {
		logger.info("Connection opened");
	}

	@Override
	public void onMessage(String message) {
		incrementNumMsgs();
		handler.handleMessage(message);
	}

	@Override
	public void onClose(int code, String reason, boolean remote) {
		// The codecodes are documented in class
		// org.java_websocket.framing.CloseFrame
		logger.info("Connection closed by " + (remote ? "remote peer" : "us") + " reason: " + reason);
	}

	@Override
	public void onError(Exception ex) {
		ex.printStackTrace();
		logger.error("WebSocket Error", ex);
		// if the error is fatal then onClose will be called additionally
	}
}
