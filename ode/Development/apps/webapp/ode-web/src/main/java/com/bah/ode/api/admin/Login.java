package com.bah.ode.api.admin;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.bah.ode.api.sec.TokenAuthenticationService;
import com.bah.ode.api.ws.OdeStatus;


@Path("/login")
public class Login {

	@Inject
	TokenAuthenticationService tokenProvider;
	
	@Context 
	ContainerRequestContext crc;
	 
	@GET
	public Response userLogin()
	{
		OdeStatus msg  = new OdeStatus();
		
		String tokenString = tokenProvider.generateToken((long)crc.getProperty("userId"));
		if (null!=tokenString)
		{
			msg.setCode(OdeStatus.Code.SUCCESS).setMessage(tokenString);
			return Response.ok(msg.toJson()).build();
		}
		else
		{
			msg.setCode(OdeStatus.Code.FAILURE).setMessage("Unable to create Authentication Token");
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity(msg.toJson()).build();
		}
	}
}
