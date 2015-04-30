package com.bah.ode.server;

import java.util.concurrent.ConcurrentHashMap;

import javax.websocket.CloseReason;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.ResponseHandler;
import com.bah.ode.dds.client.ws.WarehouseClient;
import com.bah.ode.model.DdsRequest;
import com.bah.ode.model.OdeRequest;
import com.bah.util.JsonUtils;

/**
 * @ServerEndpoint gives the relative name for the end point This will be
 *                 accessed via ws://host:8080/ode/ws Where
 *                 "host" is the address of the host, "ode" is the
 *                 context root and "ws" is the address to access this
 *                 class from the server
 */
@ServerEndpoint("/api/ws/{rtype}/{dtype}")
public class WebSocketServer {
	private static Logger logger = LoggerFactory.getLogger(WebSocketServer.class);
	private AppContext appContext = AppContext.getInstance();
	private static ConcurrentHashMap<String, WarehouseClient> sessions =
			new ConcurrentHashMap<String, WarehouseClient>();
	
	/**
	 * @OnOpen allows us to intercept the creation of a new session. The session
	 *         class allows us to send data to the user. In the method onOpen,
	 *         we'll let the user know that the handshake was successful.
	 */
	@OnOpen
	public String onOpen(
			Session session, 
			EndpointConfig endpointConfig,
			@PathParam("rtype") String rtype,
			@PathParam("dtype") String dtype) 
	{
		String sessionId = session.getId();
		
		logger.info("Connection opened. Session ID: {}, "
				+ "Request Type: {}, "
				+ "Data Type Requested: {}", sessionId, rtype, dtype);
		
		String msg = null;
		try {
			msg = "Connection Established.";
			
			if (rtype.equals("sub")) {
				if (dtype.equals("ints")) {
					
			      ResponseHandler responseHandler = new ResponseHandler(appContext,
			      		session.getAsyncRemote());
			      WarehouseClient wsClient = 
			      		WarehouseClient.configure(appContext, responseHandler);
			      
			      sessions.put(sessionId, wsClient);
			      
					logger.info("Connecting to {}: ", wsClient.getURI());
			      wsClient.connectBlocking();
			      
				}
			}
			
		} catch (Exception ex) {
			msg = String.format("Error processing connection request %s", 
					session.getRequestURI());
			logger.error(msg, ex);
		}
		return msg;
	}

	/**
	 * When a user sends a message to the server, this method will intercept the
	 * message and allow us to react to it. For now the message is read as a
	 * String.
	 */
	@OnMessage
	public String onMessage(
			Session session, 
			String message,
			boolean last,
			@PathParam("rtype") String rtype,
			@PathParam("dtype") String dtype)
	{
		String sessionId = session.getId();
		OdeRequest odeRequest = null;
		logger.info("Request from {}: {}", sessionId, message);
		
      WarehouseClient wsClient = sessions.get(sessionId);
      
		try {
			odeRequest = (OdeRequest) JsonUtils.fromJson(message, OdeRequest.class);
			
			DdsRequest ddsRequest = (DdsRequest) DdsRequest.create()
					.setDialogID(DdsRequest.Dialog.ISD.getId())
					.setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
					.setSystemSubName(DdsRequest.SystemSubName.SDC.getName())
					.setNwLat(odeRequest.getNwLat())
					.setNwLon(odeRequest.getNwLon())
					.setSeLat(odeRequest.getSeLat())
					.setSeLon(odeRequest.getSeLon());
			
	      String subreq = ddsRequest.subscriptionRequest();
			logger.info("Sending subscription request: {}", subreq);
	      
	      wsClient.send(subreq);
		} catch (Exception ex) {
			logger.error("Error procesing request {}.", message, ex);
		}
		return message;
	}

	/**
	 * The user closes the connection.
	 * 
	 * Note: you can't send messages to the client from this method
	 */
	@OnClose
	public void onClose(
			Session session,
			CloseReason reason)
	{
		String sessionId = session.getId();
      WarehouseClient wsClient = sessions.remove(sessionId);
      wsClient.close();
		
		logger.info("Session {} disconnected.", sessionId);
		if (reason != null)
			logger.info("Reason: {}", reason.getCloseCode());
	}
}