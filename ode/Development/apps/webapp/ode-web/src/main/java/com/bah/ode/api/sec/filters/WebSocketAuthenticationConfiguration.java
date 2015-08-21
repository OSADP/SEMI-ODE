package com.bah.ode.api.sec.filters;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.sec.SecurityService;
import com.bah.ode.api.sec.filters.LiferayWSClient;
import com.bah.ode.context.AppContext;
 
public class WebSocketAuthenticationConfiguration extends ServerEndpointConfig.Configurator {
	private static Logger logger = LoggerFactory
	         .getLogger(WebSocketAuthenticationConfiguration.class);
	/**
	 * Inspired by this SO post regarding accessing information from the HTTP Session object
	 * http://stackoverflow.com/questions/17936440/accessing-httpsession-from-httpservletrequest-in-a-web-socket-serverendpoint/17994303#17994303
	 */
	public WebSocketAuthenticationConfiguration() {	super(); }
	
	@Override
	public void modifyHandshake(ServerEndpointConfig config, HandshakeRequest request, HandshakeResponse response)
	{		
		try{	 
			Map<String,List<String>> headers = request.getHeaders();
			if (headers.containsKey(SecurityService.AUTH_HEADER.toLowerCase())) // Returns False when not converted to lower case
			{
				// Put command is is key,value
				config.getUserProperties().put(SecurityService.AUTH_HEADER,
												headers.get(SecurityService.AUTH_HEADER).get(0).toString());
				
				config.getUserProperties().put(SecurityService.AUTH_HEADER+"Result",
											   	validateCredentials(headers.get(SecurityService.AUTH_HEADER.toLowerCase()).get(0) ));
			}
			else{
				// Invalid Authentication Message
				config.getUserProperties().put(SecurityService.AUTH_HEADER,
												SecurityService.INVALID_AUTHENTICATION);
				config.getUserProperties().put(SecurityService.AUTH_HEADER+"Result", false);
			}			
		}
		catch (Throwable t)
		{
			logger.error("Error in Modifying websocket ServerEndpointConfig", t);
		}
	}
	
	public boolean validateCredentials(String authorizationHeader)
	{
		
		long userId;
		 try {
			String[] lap = SecurityService.decode(authorizationHeader);
			if (lap == null || lap.length != 2) {
				return false;
			}
			LiferayWSClient client = new LiferayWSClient(AppContext.getInstance().getParam(AppContext.LIFERAY_WS_SERVER_HOST), 
														 AppContext.getInstance().getParam(AppContext.LIFERAY_WS_COMPANY_ID));
         
            // Get user Id with supplied email and password
            // if no user is returned then authentication failed
        	// NumberFormatException is thrown by LiferayWSClient when validation fails
            userId = client.getUserIdByEmail(lap[0], lap[1]);
            logger.warn("UserID: {}", String.valueOf(userId));
            return   true;
         }
         catch (NumberFormatException n){
        	 logger.warn("Invalid UserName or Password");   
        	 return false;
         }
         catch (Throwable t) {
        	 logger.warn("AuthorizationHeader: {}", authorizationHeader);
        	 logger.warn("WebSocket Authentication Issue", t);
        	 return false;
         }
         
	}
	
}
