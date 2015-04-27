package com.bah.ode.api.data;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.AbstractService;
import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.ResponseHandler;
import com.bah.ode.dds.client.ws.WarehouseClient;
import com.bah.ode.model.DdsRequest;

@Path("/ints")
public class IntersectionDataService extends AbstractService {

	private static final Logger logger = LoggerFactory
	      .getLogger(IntersectionDataService.class);

	private AppContext appContext;
	
	public IntersectionDataService() {
	   super();
	   
	   this.appContext = AppContext.getInstance();
   }

	@GET
	@Path("/{enc}")
	public Response requestSubscription(
	      @QueryParam("nwLat") double nwLat, @QueryParam("nwLon") double nwLon,
	      @QueryParam("seLat") double seLat, @QueryParam("seLon") double seLon) {
		
		logger.info("Received {}", getUriInfo());
		DdsRequest request = null;
		try {
			request = (DdsRequest) DdsRequest.create()
					.setDialogID(DdsRequest.Dialog.ISD)
					.setResultEncoding(DdsRequest.ResultEncoding.BASE_64)
					.setSystemSubName(DdsRequest.SystemSubName.SDC)
					.setNwLat(nwLat)
					.setNwLon(nwLon)
					.setSeLat(seLat)
					.setSeLon(seLon);
			
			
	      ResponseHandler responseHandler = new ResponseHandler(appContext);
	      WarehouseClient wsClient = WarehouseClient.configure(
	      		appContext, responseHandler);
	      
			logger.info("Connecting to {}", wsClient.getURI());
	      wsClient.connectBlocking();
	      
	      String subreq = request.subscriptionRequest();
			logger.info("Sending subscription request: {}", subreq);
	      
	      wsClient.send(request.subscriptionRequest());
			
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
		
		return Response.ok(request).build();
	}

	@GET
	@Path("/subs/{subId}")
	public Response requestSubscription(
	      @PathParam("subId") String subId) {
		try {
			
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
		
		return Response.ok().build();
	}

	@GET
	@Path("/queries/{queryId}")
	public Response requestQuery(@PathParam("queryId") String queryId) {
		return Response.serverError().build();
	}

}
