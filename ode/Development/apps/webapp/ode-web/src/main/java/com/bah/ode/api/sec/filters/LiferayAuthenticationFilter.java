package com.bah.ode.api.sec.filters;

import java.io.IOException;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.DatatypeConverter;

@Provider
@Priority(Priorities.AUTHENTICATION)
public class LiferayAuthenticationFilter implements ContainerRequestFilter {

   public static String AUTH_HEADER = "Authorization";

   @Context
   private ServletContext context;

   @Inject
   private LiferayWSClient client;

   @Override
   public void filter(ContainerRequestContext requestContext)
         throws IOException {

      String auth = requestContext.getHeaderString(AUTH_HEADER);
      String[] lap = decode(auth);

      // If login or password fail
      if (lap == null || lap.length != 2) {
         requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
               .entity("Missing Username or Password").build());
      }
      long userId;

      try {
         // Get user Id with supplied email and password
         // if no user is returned then authentication failed
         userId = client.getUserIdByEmail(lap[0], lap[1]);
         requestContext.setProperty("userId", new Long(userId));
      } catch (Exception e) {
         requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED)
               .entity("Unable to Authenticate. Error" + e.toString()).build());
      }

   }

   
   
   
   /**
    * Decode the basic auth and convert it to array login/password
    * 
    * @param auth
    *           The string encoded authentication
    * @return The login (index 0), the password (index 1)
    */
   private String[] decode(String auth) {

      // Return if the string is empty or null
      if (auth == null || auth.length() == 0)
         return null;

      // Replacing "Basic THE_BASE_64" to "THE_BASE_64" directly
      auth = auth.replaceFirst("[B|b]asic ", "");

      if (auth == null || auth.length() == 0)
         return null;

      // Decode the Base64 into byte[]
      byte[] decodedBytes = DatatypeConverter.parseBase64Binary(auth);

      // check for plain text in the password. (ugh)

      // If the decode fails in any case
      if (decodedBytes == null || decodedBytes.length == 0) {
         return null;
      }
      // Now we can convert the byte[] into a splitted array :
      // - the first one is login,
      // - the second one password
      return new String(decodedBytes).split(":", 2);
   }

}
