package com.bah.ode.api.data;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.bah.ode.api.AbstractService;


@Path("/vehs")
public class VehicleDataService extends AbstractService {
	
	@POST
	@Path("/subs/{subcriptionId}")
	public Response requestSubscription(@PathParam("subcriptionId") String subcriptionId) {
		return Response.serverError().build();
	}

	@POST
	@Path("/queries/{queryId}")
	public Response requestQuery(@PathParam("queryId") String queryId) {
		return Response.serverError().build();
	}

}
