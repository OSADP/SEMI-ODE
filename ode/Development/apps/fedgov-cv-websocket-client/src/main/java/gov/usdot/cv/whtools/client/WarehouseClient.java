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
package gov.usdot.cv.whtools.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.java_websocket.client.DefaultSSLWebSocketClientFactory;
import org.java_websocket.drafts.Draft;
import org.java_websocket.drafts.Draft_17;
import org.java_websocket.handshake.ServerHandshake;

import gov.usdot.cv.whtools.client.CASClient.CASLoginException;
import gov.usdot.cv.whtools.client.OdeClient.OdeLoginException;
import gov.usdot.cv.whtools.client.config.ConfigException;
import gov.usdot.cv.whtools.client.config.ConfigUtils;
import gov.usdot.cv.whtools.client.config.WarehouseConfig;
import gov.usdot.cv.whtools.client.handler.AbstractFileListener;
import gov.usdot.cv.whtools.client.handler.RequestHandler;
import gov.usdot.cv.whtools.client.handler.ResponseHandler;

public class WarehouseClient extends org.java_websocket.client.WebSocketClient {

	private static final Logger logger = Logger.getLogger(WarehouseClient.class
			.getName());
	
	private final static String ENCODE_TYPE_HEX = "HEX";
	private final static String ENCODE_TYPE_BASE64 = "Base64";
	private final static String ENCODE_TYPE_BER = "BER";

	private ResponseHandler handler;
   private static long numMsgs = 0;

	@SuppressWarnings("unchecked")
	public static WarehouseClient configure(WarehouseConfig wsConfig, ResponseHandler handler)
			throws URISyntaxException, KeyManagementException,
			KeyStoreException, NoSuchAlgorithmException, CertificateException,
			IOException, CASLoginException, UnrecoverableKeyException {
		
		CASClient casClient = CASClient.configure(wsConfig);
		String jSessionID = casClient.login();
		
		@SuppressWarnings("rawtypes")
		Map headers = new HashMap();
		headers.put(
				"Cookie",
				CASClient.JSESSIONID_KEY + "=" + jSessionID);

		WarehouseClient wsClient = new WarehouseClient(new URI(wsConfig.warehouseURL),
				new Draft_17(), headers); // more about drafts here:
		// http://github.com/TooTallNate/Java-WebSocket/wiki/Drafts
		wsClient.handler = handler;

		if (wsConfig.warehouseURL.startsWith("wss")) {
			SSLContext wsSSLContext = SSLBuilder.buildSSLContext(
					wsConfig.keystoreFile,
					wsConfig.keystorePassword);
			wsClient.setWebSocketFactory(new DefaultSSLWebSocketClientFactory(
					wsSSLContext));
		}
		return wsClient;
	}

   @SuppressWarnings("unchecked")
   public static WarehouseClient configureOde(WarehouseConfig wsConfig, ResponseHandler handler)
         throws URISyntaxException, KeyManagementException,
         KeyStoreException, NoSuchAlgorithmException, CertificateException,
         IOException, OdeLoginException, UnrecoverableKeyException {
      
      OdeClient odeClient = OdeClient.configure(wsConfig);
      String jSessionID = odeClient.login();
      
      @SuppressWarnings("rawtypes")
      Map headers = new HashMap();
      headers.put(
            "Cookie",
            CASClient.JSESSIONID_KEY + "=" + jSessionID);

      WarehouseClient wsClient = new WarehouseClient(new URI(wsConfig.warehouseURL),
            new Draft_17(), headers); // more about drafts here:
      // http://github.com/TooTallNate/Java-WebSocket/wiki/Drafts
      wsClient.handler = handler;

      if (wsConfig.warehouseURL.startsWith("wss")) {
         SSLContext wsSSLContext = SSLBuilder.buildSSLContext(
               wsConfig.keystoreFile,
               wsConfig.keystorePassword);
         wsClient.setWebSocketFactory(new DefaultSSLWebSocketClientFactory(
               wsSSLContext));
      }
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
		try {
         handler.handleMessage(message);
         if (numMsgs % 100 == 0)
            System.out.print("\n" + numMsgs);
         System.out.print(".");
         numMsgs++;
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
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
		logger.error(ex);
		// if the error is fatal then onClose will be called additionally
	}
	
	public static void main(String[] args) throws URISyntaxException,
			UnrecoverableKeyException, KeyManagementException,
			KeyStoreException, NoSuchAlgorithmException, CertificateException,
			FileNotFoundException, IOException, InterruptedException,
			CASLoginException, IllegalAccessException, InvocationTargetException, ConfigException {

		ConfigUtils.initLogger();
        
		String configFile = WarehouseConfig.DEFAULT_CONFIG_FILE;
		if (args != null && args.length > 0) {
			configFile = args[0];
		}
		
		final WarehouseConfig wsConfig = ConfigUtils.loadConfigBean(configFile, WarehouseConfig.class);
		wsConfig.postLoadCalculateValues();
		logger.info(wsConfig);
		
//		CASClient casClient = CASClient.configure(wsConfig);
//		String jSessionID = casClient.login();
//		wsConfig.jSessionID = jSessionID;
//		
//		ResponseHandler handler = new ResponseHandler(wsConfig);
//		WarehouseClient wsClient = WarehouseClient.configure(wsConfig, handler);
//		logger.info("Opening WebSocket to " + wsConfig.warehouseURL);
//		wsClient.connect();

		

		RequestHandler requestHandler = new RequestHandler(wsConfig.requestDir, new AbstractFileListener() {
			@Override
			public void sendRequest(File file) {
				try {
					String request = FileUtils.readFileToString(file);
					logger.info("Sending request " + request);
					
					ResponseHandler responseHandler = new ResponseHandler(wsConfig);
					WarehouseClient wsClient = WarehouseClient.configure(wsConfig, responseHandler);
					logger.info("Opening WebSocket to " + wsConfig.odeWsURL);
					wsClient.connectBlocking();
					wsClient.send(request);
				} catch (Exception e) {
					logger.error("Error sending request ", e);
				}
			}
		});
		
		requestHandler.start();
		
      RequestHandler odeRequestHandler = new RequestHandler(wsConfig.odeRequestDir, new AbstractFileListener() {
         @Override
         public void sendRequest(File file) {
            try {
               String request = FileUtils.readFileToString(file);
               logger.info("Sending request " + request);
               
               ResponseHandler responseHandler = new ResponseHandler(wsConfig);
               WarehouseClient wsClient = WarehouseClient.configureOde(wsConfig, responseHandler);
               logger.info("Opening WebSocket to " + wsConfig.odeWsURL);
               wsClient.connectBlocking();
               wsClient.send(request);
            } catch (Exception e) {
               logger.error("Error sending request ", e);
            }
         }
      });
      

      odeRequestHandler.start();
      
      StringBuilder depositConfigErrors = new StringBuilder();
		if (wsConfig.systemDepositName == null)
			depositConfigErrors.append("systemDepositName is required, ");
		if (wsConfig.encodeType == null)
			depositConfigErrors.append("encodeType is required, ");
		if (wsConfig.depositFileDir == null)
			depositConfigErrors.append("depositFileDir is required ");
		if (depositConfigErrors.length() > 0) {
			logger.error("Configuration errors: " + depositConfigErrors.toString());
			System.exit(-1);
		}
		
		RequestHandler depositHandler = new RequestHandler(wsConfig.depositFileDir, new AbstractFileListener() {
			
			@Override
			public void sendRequest(File file) {
				try {
					ResponseHandler responseHandler = new ResponseHandler(wsConfig);
					WarehouseClient wsClient = WarehouseClient.configure(wsConfig, responseHandler);
					wsClient.connectBlocking();
					String depositMessageFormat = "DEPOSIT: { \"systemDepositName\": \"%s\", \"encodeType\": \"%s\", \"encodedMsg\": \"%s\" }";
					if (wsConfig.encodeType.equals(ENCODE_TYPE_HEX) || wsConfig.encodeType.equals(ENCODE_TYPE_BASE64)) {
						List<String> fileLines = FileUtils.readLines(file);
						for (String line: fileLines) {
							String depositMessage = String.format(depositMessageFormat, wsConfig.systemDepositName, wsConfig.encodeType, line);
							logger.info("Sending deposit message " + depositMessage);
							wsClient.send(depositMessage);
							try { Thread.sleep(wsConfig.depositDelay); } catch (InterruptedException e) {}
						}
					} else if (wsConfig.encodeType.equals(ENCODE_TYPE_BER)) {
						char[] message = Hex.encodeHex(FileUtils.readFileToByteArray(file));
						String depositMessage = String.format(depositMessageFormat, wsConfig.systemDepositName, wsConfig.encodeType, new String(message));
						logger.info("Sending deposit message " + depositMessage);
						wsClient.send(depositMessage);
						try { Thread.sleep(wsConfig.depositDelay); } catch (InterruptedException e) {}
					}
				} catch (Exception e) {
					logger.error("Error sending deposit request ", e);
				}
			}
		});
		
		depositHandler.start();

		while (true) {
			Thread.sleep(1000);
		}
	}
}
