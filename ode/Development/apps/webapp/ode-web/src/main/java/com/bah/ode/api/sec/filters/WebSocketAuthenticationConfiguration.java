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
			//List<String> authHeaders = request.getHeaders(); //getOrDefault(SecurityService.AUTH_HEADER, Collections.<String>emptyList());
			 HttpSession httpSession = (HttpSession)request.getHttpSession();
			 
			Map<String,List<String>> headers = request.getHeaders();
			if (headers.containsKey(SecurityService.AUTH_HEADER.toLowerCase()))
			{
				// Put command is is key,value
				config.getUserProperties().put(SecurityService.AUTH_HEADER.toLowerCase(),
												headers.get(SecurityService.AUTH_HEADER.toLowerCase()+httpSession.getId()).get(0) );
			}
			else{
				// Invalid Authentication Message
				config.getUserProperties().put(SecurityService.AUTH_HEADER.toLowerCase(),
						SecurityService.INVALID_AUTHENTICATION);
			}			
		}
		catch (Throwable t)
		{
			logger.error("Error in Modifying websocket ServerEndpointConfig", t);
		}
	}
}
