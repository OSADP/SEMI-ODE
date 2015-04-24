package com.bah.ode.api.admin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.bah.ode.api.AbstractService;
import com.bah.ode.model.OdeQuery;


@Path("/queries")
public class QueryAdminService extends AbstractService {
	
	@GET
	@Path("{id}")
	public OdeQuery getQuery(@PathParam("id") String id) {
		return null;
		
	}

}
