package com.bah.ode.api.admin;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.bah.ode.api.AbstractService;
import com.bah.ode.model.OdeSubscription;


@Path("/subs")
public class SubscriptionAdminService extends AbstractService {
	
	@GET
	@Path("{id}")
	public OdeSubscription getSubscription(@PathParam("id") String id) {
		return null;
		
	}

}
