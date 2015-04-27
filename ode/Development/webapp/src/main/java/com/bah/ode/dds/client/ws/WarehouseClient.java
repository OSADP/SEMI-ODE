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

	@SuppressWarnings("unchecked")
	public static WarehouseClient configure(AppContext appContext,
	      ResponseHandler handler) throws URISyntaxException,
	      KeyManagementException, KeyStoreException, NoSuchAlgorithmException,
	      CertificateException, IOException, CASLoginException {

      logger.info("Logging in to {}", appContext.getParam(AppContext.DDS_CAS_URL));
		CASClient casClient = CASClient.configure(appContext);
		String jSessionID = casClient.login();

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

		SSLContext wsSSLContext = SSLBuilder.buildSSLContext(
		      appContext.getParam(AppContext.DDS_KEYSTORE_FILE_PATH),
		      appContext.getParam(AppContext.DDS_KEYSTORE_PASSWORD));
		wsClient.setWebSocketFactory(new DefaultSSLWebSocketClientFactory(
		      wsSSLContext));
		
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
		logger.info("Connection closed by " + (remote ? "remote peer" : "us"));
	}

	@Override
	public void onError(Exception ex) {
		ex.printStackTrace();
		logger.error("WebSocket Error", ex);
		// if the error is fatal then onClose will be called additionally
	}

//	public static void main(String[] args) throws URISyntaxException,
//	      UnrecoverableKeyException, KeyManagementException, KeyStoreException,
//	      NoSuchAlgorithmException, CertificateException, FileNotFoundException,
//	      IOException, InterruptedException, CASLoginException,
//	      IllegalAccessException, InvocationTargetException, ConfigException {
//
//		final AppContext appContext = AppContext.getInstance();
//		
//		final URL ddsWsUrl = new URL("wss",
//      		appContext.getParam(AppContext.DDS_DOMAIN),
//      		Integer.parseInt(appContext.getParam(AppContext.DDS_PORT)),
//				appContext.getParam(AppContext.DDS_RESOURCE_IDENTIFIER));
//		
//		RequestHandler watcher = new RequestHandler(
//				appContext.getParam(AppContext.REQUEST_FILE_DIR),
//		      new AbstractFileListener() {
//			      @Override
//			      public void sendRequest(File file) {
//				      try {
//					      String request = FileUtils.readFileToString(file);
//					      logger.info("Sending request " + request);
//
//					      ResponseHandler responseHandler = new ResponseHandler(
//					      		AppContext.getInstance());
//					      WarehouseClient wsClient = WarehouseClient.configure(
//					      		AppContext.getInstance(), responseHandler);
//					      logger.info("Opening WebSocket to " + ddsWsUrl.toExternalForm());
//					      wsClient.connectBlocking();
//					      wsClient.send(request);
//				      } catch (Exception e) {
//					      logger.error("Error sending request ", e);
//				      }
//			      }
//		      });
//
//		watcher.start();
//
//		final String depositFileDir = appContext.getParam(AppContext.DEPOSIT_FILE_DIR);
//		final String depositSystemName = appContext.getParam(AppContext.DEPOSIT_SYSTEM_NAME);
//		final String depositEncodeType = appContext.getParam(AppContext.DEPOSIT_ENCODE_TYPE);
//		final Long depositDelay = Long.valueOf(
//      		appContext.getParam(AppContext.DEPOSIT_DELAY));
//		
//		StringBuilder depositConfigErrors = new StringBuilder();
//		if (depositSystemName == null)
//			depositConfigErrors.append(AppContext.DEPOSIT_SYSTEM_NAME + " is required, ");
//		if (depositEncodeType == null)
//			depositConfigErrors.append(AppContext.DEPOSIT_ENCODE_TYPE + " is required, ");
//		if (depositFileDir == null)
//			depositConfigErrors.append(AppContext.DEPOSIT_FILE_DIR + " is required ");
//		if (depositConfigErrors.length() > 0) {
//			logger.error("Configuration errors: " + depositConfigErrors.toString());
//			System.exit(-1);
//		}
//
//		RequestHandler depositHandler = new RequestHandler(
//				depositFileDir, new AbstractFileListener() {
//
//			      @Override
//			      public void sendRequest(File file) {
//				      try {
//					      ResponseHandler responseHandler = new ResponseHandler(
//					            appContext);
//					      WarehouseClient wsClient = WarehouseClient.configure(
//					      		appContext, responseHandler);
//					      String depositMessageFormat = "DEPOSIT: { \"systemDepositName\": \"%s\", \"encodeType\": \"%s\", \"encodedMsg\": \"%s\" }";
//					      if (depositEncodeType.equals(ENCODE_TYPE_HEX)
//					            || depositEncodeType.equals(ENCODE_TYPE_BASE64)) {
//						      List<String> fileLines = FileUtils.readLines(file);
//						      for (String line : fileLines) {
//							      String depositMessage = String.format(
//							            depositMessageFormat,
//							            depositSystemName,
//							            depositEncodeType, line);
//							      logger.info("Sending deposit message "
//							            + depositMessage);
//							      wsClient.send(depositMessage);
//							      try {
//								      Thread.sleep(depositDelay);
//							      } catch (InterruptedException e) {
//							      }
//						      }
//					      } else if (appContext.getParam(AppContext.DEPOSIT_ENCODE_TYPE).equals(ENCODE_TYPE_BER)) {
//						      char[] message = Hex.encodeHex(FileUtils
//						            .readFileToByteArray(file));
//						      String depositMessage = String.format(
//						            depositMessageFormat, depositSystemName,
//						            depositEncodeType, new String(message));
//						      logger.info("Sending deposit message " + depositMessage);
//						      wsClient.send(depositMessage);
//						      try {
//							      Thread.sleep(depositDelay);
//						      } catch (InterruptedException e) {
//						      }
//					      }
//				      } catch (Exception e) {
//					      logger.error("Error sending deposit request ", e);
//				      }
//			      }
//		      });
//
//		depositHandler.start();
//
//		while (true) {
//			Thread.sleep(1000);
//		}
//	}
}
