package com.bah.ode.server;

import java.io.IOException;

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

import com.bah.ode.api.ws.OdeStatus;
import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.DdsClient;
import com.bah.ode.dds.client.ws.IsdResponseHandler;
import com.bah.ode.dds.client.ws.ResponseHandler;
import com.bah.ode.dds.client.ws.VsdResponseHandler;
import com.bah.ode.model.DdsRequest;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.util.JsonUtils;

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
	private ResponseHandler responseHandler;
	DdsClient wsClient = null; 

	
	/**
	 * @OnOpen allows us to intercept the creation of a new session. The session
	 *         class allows us to send data to the user. In the method onOpen,
	 *         we'll let the user know that the handshake was successful.
	 */
	@OnOpen
	public void onOpen(
			Session session, 
			EndpointConfig endpointConfig,
			@PathParam("rtype") String rtype,
			@PathParam("dtype") String dtype) 
	{
		String sessionId = session.getId();
		
		logger.info("Connection opened. Session ID: {}, "
				+ "Request Type: {}, "
				+ "Data Type Requested: {}", sessionId, rtype, dtype);
		
		OdeStatus msg = new OdeStatus();
		try {
			if (rtype.equals("sub")) {
				if (dtype.equals("ints")) {
			      responseHandler = new IsdResponseHandler(appContext, session.getAsyncRemote());
				} else if (dtype.equals("vehs")) {
			      responseHandler = new VsdResponseHandler(appContext, session.getAsyncRemote());
				}
				
				if (null != responseHandler) {
					wsClient = DdsClient.create(appContext, responseHandler);
			      
					msg.setCode(OdeStatus.Code.SUCCESS);
					msg.setMessage("Connection Established.");
					session.getAsyncRemote().sendText(msg.toJson());
				} else {
					msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
					   .setMessage(String.format("Invalid data type %s requested. Valid data types are 'ints', 'vehs', 'aggs'", dtype));
					logger.error(msg.toString());
				}
			} else {
				msg.setCode(OdeStatus.Code.INVALID_REQUEST_TYPE_ERROR)
			   .setMessage(String.format("Invalid request type %s. Valid request types are 'sub', 'qry'", rtype));
				logger.error(msg.toString());
			}
			
		} catch (Exception ex) {
			msg.setCode(OdeStatus.Code.SOURCE_CONNECTION_ERROR)
		   .setMessage(String.format("Error processing connection request %s", 
					session.getRequestURI()));
			logger.error(msg.toString(), ex);
		}
	}

	/**
	 * When a user sends a message to the server, this method will intercept the
	 * message and allow us to react to it. For now the message is read as a
	 * String.
	 */
	@OnMessage
	public void onMessage(
			Session session, 
			String message,
			boolean last,
			@PathParam("rtype") String rtype,
			@PathParam("dtype") String dtype)
	{
		String sessionId = session.getId();
		OdeRequest odeRequest = null;
		logger.info("Request from {}: {}", sessionId, message);
		
		OdeStatus msg = new OdeStatus();
		try {
			if (rtype.equals("sub") && wsClient != null) {
				odeRequest = (OdeRequest) JsonUtils.fromJson(message, OdeRequest.class);
	
				DdsRequest ddsRequest = null;
				if (dtype.equals("ints")) {
					ddsRequest = (DdsRequest) DdsRequest.create()
							.setDialogID(DdsRequest.Dialog.ISD.getId())
							.setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
							.setSystemSubName(DdsRequest.SystemSubName.SDC.getName())
							.setNwLat(odeRequest.getNwLat())
							.setNwLon(odeRequest.getNwLon())
							.setSeLat(odeRequest.getSeLat())
							.setSeLon(odeRequest.getSeLon());
					
				} else if (dtype.equals("vehs")) {
					ddsRequest = (DdsRequest) DdsRequest.create()
							.setDialogID(DdsRequest.Dialog.VSD.getId())
							.setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
							.setSystemSubName(DdsRequest.SystemSubName.SDC.getName())
							.setNwLat(odeRequest.getNwLat())
							.setNwLon(odeRequest.getNwLon())
							.setSeLat(odeRequest.getSeLat())
							.setSeLon(odeRequest.getSeLon());
				}
				
				if (null != ddsRequest) {
			      String subreq = ddsRequest.subscriptionRequest();
					logger.info("Sending subscription request: {}", subreq);
			      
			      wsClient.send(subreq);
				} else {
					msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
				   	.setMessage(String.format("Invalid data type %s requested. Valid data types are 'ints', 'vehs', 'aggs'", dtype));
					logger.error(msg.toString());
				}
			} else {
				msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
			   .setMessage(String.format("Invalid request type %s. Valid request types are 'sub', 'qry'", rtype));
				logger.error(msg.toString());
			}
			
		} catch (Exception ex) {
			msg.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
		   .setMessage(String.format("Error procesing request %s.", session.getRequestURI()));
			logger.error(msg.toString(), ex);
		}
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
      try {
	      if (wsClient != null)
		         wsClient.close();
		
			logger.info("Session {} disconnected.", sessionId);
			if (reason != null)
				logger.info("Reason: {}", reason.getCloseCode());
			
      } catch (IOException e) {
			logger.error("Error closing session " + sessionId, e);
      }
	}
}