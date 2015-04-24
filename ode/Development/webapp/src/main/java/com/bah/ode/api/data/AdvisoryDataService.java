package com.bah.ode.api.data;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.bah.ode.api.AbstractService;


@Path("/advs")
public class AdvisoryDataService extends AbstractService {
	
	@POST
	@Path("/queries/{queryId}")
	public Response requestQuery(@PathParam("queryId") String queryId) {
		return Response.serverError().build();
	}

}
