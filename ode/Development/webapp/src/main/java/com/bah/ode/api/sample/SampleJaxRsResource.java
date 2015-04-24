package com.bah.ode.api.sample;

import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.AbstractService;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

class Sub {
	public String id;
}

@Path("/jaxrs")
public class SampleJaxRsResource extends AbstractService {
	private static Logger logger = LoggerFactory.getLogger(SampleJaxRsResource.class);

   @GET
   @Path("{get}")
	@Produces("application/json")
	public Response getSample(
			@PathParam("get") String get,
			@QueryParam("nwLat") double nwLat,
			@CookieParam("JSESSIONID") String c,
			@HeaderParam("Cookie") String h) {
   	
   	// Sample code for using header and form fields
		String msg = String.format(
				  "PathParam: %s\n"
				+ "nwLat: %f\n"
				+ "JSESSIONID: %s\n"
				+ "Cookie: %s\n"
				+ "UriInfo: %s\n"
				+ "HeaderString: %s\n"
				, get, nwLat, c, h, getUriInfo().getRequestUri(),
				getHeaders().getHeaderString("Cookie"));
		
		// Sample code for building a json object
		JsonNodeFactory nodeFactory = JsonNodeFactory.instance;

		ObjectNode node = nodeFactory.objectNode();

		ObjectNode child = nodeFactory.objectNode(); // the child

		child.put("message", "test");

		node.replace("notification", child);
		
		msg = msg + node.toString();

		// sample code for returning an abject as your entity and letting the framework serialize it to JSON
		// You'll need jersey-media-moxy and jersey-media-json-jackson libs for runtime
		Sub sub = new Sub();
		sub.id = msg;
		
		Response r = Response.ok(sub).build(); 
		
		logger.info(sub.toString());
		return r;
	}
}
