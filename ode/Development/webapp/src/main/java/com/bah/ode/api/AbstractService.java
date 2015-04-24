package com.bah.ode.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.UriInfo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Consumes("application/json")
@Produces("application/json")
public abstract class AbstractService {

   @Context
   private UriInfo uriInfo;
   
   @Context
   private HttpHeaders headers;

	public UriInfo getUriInfo() {
		return uriInfo;
	}

	public HttpHeaders getHeaders() {
		return headers;
	}

}
