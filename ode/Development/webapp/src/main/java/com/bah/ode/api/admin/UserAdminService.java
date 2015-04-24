package com.bah.ode.api.admin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.bah.ode.api.AbstractService;
import com.bah.ode.model.OdeUser;


@Path("/users")
public class UserAdminService extends AbstractService {
	
	@GET
	@Path("{id}")
	public OdeUser getUser(@PathParam("id") String id) {
		return null;
		
	}

}
