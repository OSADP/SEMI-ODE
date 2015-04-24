package com.bah.ode.api.data;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import com.bah.ode.api.AbstractService;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

class Sub {
	public String id;
}

@Path("/ints")
public class InersectionDataService extends AbstractService {

	@GET
	@Path("/subs/{subcriptionId}")
	public Response requestSubscription(
	      @PathParam("subcriptionId") String subcriptionId) {
		String body = null;
		try {
//			JsonNodeFactory nodeFactory = JsonNodeFactory.instance;
//
//			ObjectNode node = nodeFactory.objectNode();
//			node.put("subcriptionId", subcriptionId);
//			body = node.toString();
			
			
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
		Sub sub = new Sub();
		sub.id = subcriptionId;
		
		return Response.ok(sub).build();
	}

	@GET
	@Path("/queries/{queryId}")
	public Response requestQuery(@PathParam("queryId") String queryId) {
		return Response.serverError().build();
	}

}
