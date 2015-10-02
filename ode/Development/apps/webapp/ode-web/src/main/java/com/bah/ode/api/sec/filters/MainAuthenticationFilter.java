package com.bah.ode.api.sec.filters;

import java.io.IOException;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.sec.AccessToken;
import com.bah.ode.api.sec.SecurityService;
import com.bah.ode.api.sec.TokenAuthenticationService;
import com.bah.ode.api.sec.TokenRepository;
import com.bah.ode.model.OdeStatus;

@Provider
@Priority(Priorities.AUTHENTICATION)
public class MainAuthenticationFilter implements ContainerRequestFilter {
   private static Logger logger = LoggerFactory
         .getLogger(MainAuthenticationFilter.class);

   @Inject
   private LiferayWSClient client;
   @Inject
   private TokenAuthenticationService tokenAuthenticator;
   @Inject
   private TokenRepository tokenRepository;

   private static String BEARER = "Bearer";
   private static String BASIC = "Basic";

   @Override
   public void filter(ContainerRequestContext requestContext)
         throws IOException {

      String auth = requestContext.getHeaderString(SecurityService.AUTH_HEADER);

      if (auth == null) {
         abortRequest(requestContext, Response.Status.UNAUTHORIZED,
               "Missing Authorization Header");
         return;
      }
      
      if (auth.startsWith(BASIC)) // &&
                                  // requestContext.getUriInfo().getPath().contains("auth/login")
                                  // )
      {
         basicAuthentication(auth, requestContext);
      } else if (auth.startsWith(BEARER)) {
         tokenAuthentication(auth, requestContext);
      } else {
         abortRequest(requestContext, Response.Status.UNAUTHORIZED,
               "Error Decoding Authorization Header");
      }
   }

   /**
    * Check to see if Token is still Valid (i.e. has not expired) If token has
    * not expired, check to see if token is still active in the token repository
    * 
    * @param authenticationHeaderValue
    * @param crc
    */
   private void tokenAuthentication(String authenticationHeaderValue,
         ContainerRequestContext crc) {
      String authorizationToken = authenticationHeaderValue.replaceFirst(BEARER
            + " ", "");
      try {
         AccessToken token = tokenAuthenticator.decodeToken(authorizationToken);
         if (token.isValid()) {

            if (tokenRepository.validateToken(token)) {
               crc.setProperty(SecurityService.ACCESS_TOKEN, token);
            } else {
               tokenRepository.destroyToken(token);
               abortRequest(crc, Response.Status.UNAUTHORIZED, "Invalid Token");
            }
         } else {
            tokenRepository.destroyToken(token);
            abortRequest(crc, Response.Status.UNAUTHORIZED, "Invalid Token");
         }
      } catch (Exception e) {
         abortRequest(crc, Response.Status.UNAUTHORIZED,
               "Unable to Authenticate token. Error " + e.toString());
      }
   }

   private void basicAuthentication(String authenticationHederValue,
         ContainerRequestContext crc) {
      String[] lap = SecurityService.decode(authenticationHederValue);

      // If login or password fail
      if (lap == null || lap.length != 2) {
         abortRequest(crc, Response.Status.UNAUTHORIZED,
               "Missing UserName or Password");
      }
      long userId;

      try {
         userId = client.getUserIdByEmail(lap[0], lap[1]);
         crc.setProperty("userId", new Long(userId));

      } catch (Exception e) {

         abortRequest(crc, Response.Status.UNAUTHORIZED,
               "Unable to Authenticate. Error " + e.toString());
      }
   }

   private void abortRequest(ContainerRequestContext crc,
         Response.Status status, String message) {
      OdeStatus msg = new OdeStatus();
      msg.setCode(OdeStatus.Code.FAILURE).setMessage(message);
      logger.error(message);

      crc.abortWith(Response.status(status).entity((msg.toJson())).build());
   }
}
