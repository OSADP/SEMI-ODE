package com.bah.ode.api.sample;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Path("/jaxrs")
@Component
@Scope("prototype")
public class SampleJaxRsResource {
	private static Logger logger = LoggerFactory.getLogger(SampleJaxRsResource.class);

   @Context
   UriInfo uriInfo;
   
   @Context
   private HttpHeaders headers;


   @GET
   @Path("get")
	@Produces("application/text")
	public Response getSample(@QueryParam("nwLat") double nwLat,
			@CookieParam("JSESSIONID") String c,
			@HeaderParam("Cookie") String h) {
		String msg = String.format(
				  "nwLat: %f\n"
				+ "JSESSIONID: %s\n"
				+ "Cookie: %s\n"
				+ "UriInfo: %s\n"
				+ "HeaderString: %s\n"
				, nwLat, c, h, uriInfo.getRequestUri(),
				headers.getHeaderString("Cookie"));
		
		Response r = Response.ok(msg).build(); 
		
		logger.info(msg + "\n" + r);
		return r;
	}
}
