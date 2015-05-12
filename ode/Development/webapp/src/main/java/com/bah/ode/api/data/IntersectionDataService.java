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
import com.bah.ode.dds.client.ws.DdsClientFactory;
import com.bah.ode.dds.client.ws.IsdDecoder;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.DdsRequest;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.WebSocketClient;

@Path("/ints")
public class IntersectionDataService extends AbstractService {

	private static final Logger logger = LoggerFactory
	      .getLogger(IntersectionDataService.class);

	private AppContext appContext;
   private WebSocketClient<DdsData> wsClient = null;
	
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
		try {
			request = (DdsRequest) DdsRequest.create()
					.setDialogID(DdsRequest.Dialog.ISD.getId())
					.setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
					.setSystemSubName(DdsRequest.SystemSubName.SDC.getName())
					.setNwLat(nwLat)
					.setNwLon(nwLon)
					.setSeLat(seLat)
					.setSeLon(seLon);
			
			
	      wsClient = DdsClientFactory.create(appContext, null, IsdDecoder.class);
	      
	      String subreq = request.subscriptionRequest();
			logger.info("Sending subscription request: {}", subreq);
	      
	      wsClient.send(request.subscriptionRequest());
			
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
		
		return Response.ok().build();
	}

	@GET
	@Path("/stop")
	public Response stopSubscription(@QueryParam("sessionId") String sessionId) {
		Response response;
		
		logger.info("Received {}", getUriInfo().getRequestUri().toString());

		try {
			logger.info("Stopping : {}", sessionId);
	      
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
