package com.bah.ode.api.data;

import java.net.URL;

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

class Sub {
	public String id;
}

@Path("/ints")
public class IntersectionDataService extends AbstractService {

	private static final Logger logger = LoggerFactory
	      .getLogger(IntersectionDataService.class);

	private AppContext appContext;
	private URL ddsWsUrl;
	
	public IntersectionDataService() {
	   super();
	   
	   this.appContext = AppContext.getInstance();
	   
		try {
	      ddsWsUrl = new URL("https",
	      		appContext.getParam(AppContext.DDS_DOMAIN),
	      		Integer.parseInt(appContext.getParam(AppContext.DDS_PORT)),
	      		appContext.getParam(AppContext.DDS_RESOURCE_IDENTIFIER));
      } catch (Exception e) {
	      logger.error("Error initializing.", e);
      }
   }

	@GET
	@Path("/{enc}")
	public Response requestSubscription(@PathParam("enc") String enc,
	      @QueryParam("nwLat") double nwLat, @QueryParam("nwLat") double nwLon,
	      @QueryParam("nwLat") double seLat, @QueryParam("nwLat") double seLon) {
		try {
			DdsRequest request = new DdsRequest();
			request.setNwLat(nwLat);
			request.setNwLon(nwLon);
			request.setSeLat(seLat);
			request.setSeLon(seLon);
			
	      ResponseHandler responseHandler = new ResponseHandler(
	      		AppContext.getInstance());
	      WarehouseClient wsClient = WarehouseClient.configure(
	      		AppContext.getInstance(), responseHandler);
	      logger.info("Opening WebSocket connection " + ddsWsUrl.toExternalForm());
	      
	      wsClient.connectBlocking();
	      wsClient.send(request.toString());
			
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
		Sub sub = new Sub();
		
		return Response.ok(sub).build();
	}

	@GET
	@Path("/subs/{subId}")
	public Response requestSubscription(
	      @PathParam("subId") String subId) {
		try {
			
		} catch (Exception e) {
			throw new WebApplicationException(e);
		}
		Sub sub = new Sub();
		sub.id = subId;
		
		return Response.ok(sub).build();
	}

	@GET
	@Path("/queries/{queryId}")
	public Response requestQuery(@PathParam("queryId") String queryId) {
		return Response.serverError().build();
	}

}
