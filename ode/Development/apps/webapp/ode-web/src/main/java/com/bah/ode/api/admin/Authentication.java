package com.bah.ode.api.admin;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.sec.AccessToken;
import com.bah.ode.api.sec.SecurityService;
import com.bah.ode.api.sec.TokenAuthenticationService;
import com.bah.ode.api.sec.TokenRepository;
import com.bah.ode.model.OdeAuthorization;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMsgMetadata;
import com.bah.ode.model.OdeStatus;

//TODO: change path to tokens
@Path("/auth")
public class Authentication {

   private static Logger logger = LoggerFactory.getLogger(Authentication.class);
   @Inject
   TokenAuthenticationService tokenProvider;
   @Inject
   TokenRepository tokenRepository;
   @Context
   ContainerRequestContext crc;

   // TODO: change path to 'new'
   @GET
   @Path("/login")
   public Response userLogin() throws Exception {

      AccessToken token = tokenProvider.generateToken((long) crc.getProperty("userId"));
      OdeDataMessage dm = new OdeDataMessage();
      if (null != token) {
         tokenRepository.addToken(token);
         OdeAuthorization auth = new OdeAuthorization()
            .setToken(token.getWebToken());
         dm.setMetadata(new OdeMsgMetadata()
           .setPayloadType(OdeDataType.Authorization))
           .setPayload(auth);
         return Response.ok(dm.toJson()).build();
      } else {
         OdeStatus msg = new OdeStatus();
         msg.setCode(OdeStatus.Code.FAILURE).setMessage(
               "Unable to create Authentication Token");
         dm.setMetadata(new OdeMsgMetadata()
           .setPayloadType(OdeDataType.Status))
           .setPayload(msg);
         return Response.status(Status.INTERNAL_SERVER_ERROR).entity(dm.toJson())
               .build();
      }
   }

   // TODO: Change verb to DELETE
   @POST
   @Path("/logout")
   public Response userLogout() {
      OdeStatus msg = new OdeStatus();
      String authHeader = crc.getHeaderString(HttpHeaders.AUTHORIZATION);

      if (!authHeader.contains("Bearer")) {
         msg.setCode(OdeStatus.Code.FAILURE).setMessage("Invalid Token");
         return Response.status(Status.UNAUTHORIZED).entity(msg).build();
      }
      try {
         AccessToken token = (AccessToken) crc
               .getProperty(SecurityService.ACCESS_TOKEN);
         boolean result = null != tokenRepository.destroyToken(token);
         logger.info("Revoked Token: {}", result);

      } catch (Exception e) {
         logger.warn("Logout Error", e);
         msg.setCode(OdeStatus.Code.FAILURE).setMessage("Invalid Token");
         return Response.status(Status.UNAUTHORIZED).entity(msg).build();
      }
      return Response
            .ok(msg.setCode(OdeStatus.Code.SUCCESS).setMessage(
                  "Successful Logout")).build();
   }

}
