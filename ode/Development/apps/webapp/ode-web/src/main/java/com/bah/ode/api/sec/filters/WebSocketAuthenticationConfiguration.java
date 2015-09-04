package com.bah.ode.api.sec.filters;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.HandshakeRequest;
import javax.websocket.server.ServerEndpointConfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.sec.AccessToken;
import com.bah.ode.api.sec.SecurityService;
import com.bah.ode.api.sec.TokenAuthenticationService;
import com.bah.ode.api.sec.TokenRepository;
import com.bah.ode.context.AppContext;
 
public class WebSocketAuthenticationConfiguration extends ServerEndpointConfig.Configurator {
	private static Logger logger = LoggerFactory
	         .getLogger(WebSocketAuthenticationConfiguration.class);
	 
	private TokenAuthenticationService tokenAuthenticator;
			//new TokenAuthenticationService(AppContext.getInstance().getParam(AppContext.TOKEN_KEY_RSA_PEM));
	
	/**
	 * Inspired by this SO post regarding accessing information from the HTTP Session object
	 * http://stackoverflow.com/questions/17936440/accessing-httpsession-from-httpservletrequest-in-a-web-socket-serverendpoint/17994303#17994303
	 */
	public WebSocketAuthenticationConfiguration() {
		super();
	
	}
	
	@Override
	public void modifyHandshake(ServerEndpointConfig config, HandshakeRequest request, HandshakeResponse response)
	{	
		HttpSession session = (HttpSession) request.getHttpSession();
		// TODO complete hack to load context parameters consistantly between jersery and Web Socket classes. 
		try{
			tokenAuthenticator = new TokenAuthenticationService(AppContext.getInstance().getParam(AppContext.TOKEN_KEY_RSA_PEM));
		}
		catch (Exception e)
		{
			logger.warn("Error accessing AppContext. Getting reference via Web Socket Session");
			AppContext.getInstance().init(session.getServletContext());
			tokenAuthenticator = new TokenAuthenticationService(AppContext.getInstance().getParam(AppContext.TOKEN_KEY_RSA_PEM));
		}
		
		
		
		try{
			 
			Map<String,List<String>> parameters = request.getParameterMap();
			if (parameters.containsKey(SecurityService.TOKEN_QUERY_PARAM.toLowerCase())) // Returns False when not converted to lower case
			{
				//logger.warn("Token: "+  request.getParameterMap().get(SecurityService.TOKEN_QUERY_PARAM).get(0).toString());
				// Put command is is key,value
				config.getUserProperties().put(SecurityService.AUTH_HEADER,
												parameters.get(SecurityService.TOKEN_QUERY_PARAM).get(0).toString());
				
				config.getUserProperties().put(SecurityService.AUTH_HEADER+"Result",
											   	validateCredentials(parameters.get(SecurityService.TOKEN_QUERY_PARAM.toLowerCase()).get(0) ));
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
	
	public boolean validateCredentials(String authorizationToken)
	{	
		
		 boolean result = false;
		 AccessToken  token  = null;
		 try {
			if (null==authorizationToken)
			{
				return result;
			}			
			
			if (tokenAuthenticator.isValid(authorizationToken))
			{
				token = tokenAuthenticator.decodeToken(authorizationToken);
				result = TokenRepository.getInstance().validateToken(token);
			}
			else
			{
				result = false;
			}
		 }
         catch (Throwable t) {
        	 logger.warn("WebSocket Authentication Issue", t);
        	  result = false;
			try {
//				jsonWebToken = tokenAuthenticator.decodeJwe(authorizationToken);
//				TokenRepository.getInstance().destroyToken(jsonWebToken);
			
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
         }
		 logger.info("Result: "  + result);
         return result;
	}
	
}
