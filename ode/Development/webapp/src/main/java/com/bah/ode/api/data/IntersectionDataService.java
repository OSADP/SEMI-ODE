package com.bah.ode.api.data;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.api.AbstractService;
import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.IsdResponseHandler;
import com.bah.ode.dds.client.ws.ResponseHandler;
import com.bah.ode.dds.client.ws.WarehouseClient;
import com.bah.ode.model.DdsRequest;
import com.bah.ode.util.JsonUtils;

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
	@Path("/start")
	public Response startSubscription(
	      @QueryParam("nwLat") double nwLat, @QueryParam("nwLon") double nwLon,
	      @QueryParam("seLat") double seLat, @QueryParam("seLon") double seLon) {
		
		logger.info("Received {}", getUriInfo());
		DdsRequest request = null;
      WarehouseClient wsClient = null;
		try {
			request = (DdsRequest) DdsRequest.create()
					.setDialogID(DdsRequest.Dialog.ISD.getId())
					.setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
					.setSystemSubName(DdsRequest.SystemSubName.SDC.getName())
					.setNwLat(nwLat)
					.setNwLon(nwLon)
					.setSeLat(seLat)
					.setSeLon(seLon);
			
			
	      ResponseHandler responseHandler = new IsdResponseHandler(appContext, null);
	      wsClient = WarehouseClient.configure(appContext, responseHandler);
	      
			logger.info("Connecting to {}: ", wsClient.getURI());
	      wsClient.connectBlocking();
	      
	      String subreq = request.subscriptionRequest();
			logger.info("Sending subscription request: {}", subreq);
	      
	      wsClient.send(request.subscriptionRequest());
			
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
		
		return Response.ok(JsonUtils.toJson("sessionId", wsClient.getSessionId())).build();
	}

	@GET
	@Path("/stop")
	public Response stopSubscription(@QueryParam("sessionId") String sessionId) {
		Response response;
		
		logger.info("Received {}", getUriInfo().getRequestUri().toString());

		WarehouseClient wsClient = null;
		try {
			logger.info("Stopping : {}", sessionId);
	      
			wsClient = WarehouseClient.getClients().remove(sessionId);
			if (wsClient == null) {
				response = Response.status(Status.NOT_FOUND).entity(JsonUtils.toJson("sessionId", sessionId)).build();
				logger.error("Session ID Not Found: {}", sessionId);
			} else {
				wsClient.close();
				response = Response.ok(JsonUtils.toJson("sessionId", sessionId)).build();
			}
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
		
		return response;
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
