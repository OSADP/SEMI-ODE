/*******************************************************************************
 * Copyright (c) 2015 US DOT - Joint Program Office
 *
 * The Government has unlimited rights to all documents/material produced under 
 * this task order. All documents and materials, to include the source code of 
 * any software produced under this contract, shall be Government owned and the 
 * property of the Government with all rights and privileges of ownership/copyright 
 * belonging exclusively to the Government. These documents and materials may 
 * not be used or sold by the Contractor without written permission from the CO.
 * All materials supplied to the Government shall be the sole property of the 
 * Government and may not be used for any other purpose. This right does not 
 * abrogate any other Government rights.
 *
 * Contributors:
 *     Booz | Allen | Hamilton - initial API and implementation
 *******************************************************************************/
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
import com.bah.ode.model.DdsData;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.WebSocketClient;

@Path("/ints")
public class IntersectionDataService extends AbstractService {

	private static final Logger logger = LoggerFactory
	      .getLogger(IntersectionDataService.class);

   private WebSocketClient<DdsData> wsClient = null;
	
	public IntersectionDataService() {
	   super();
   }

	@GET
	@Path("/start")
	public Response startSubscription(
	      @QueryParam("nwLat") double nwLat, @QueryParam("nwLon") double nwLon,
	      @QueryParam("seLat") double seLat, @QueryParam("seLon") double seLon) {
		
		logger.info("Received {}", getUriInfo().getAbsolutePath());
		try {
//			request = (DdsRequest) DdsRequest.create()
//					.setDialogID(DdsRequest.Dialog.ISD.getId())
//					.setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
//					.setSystemSubName(DdsRequest.SystemSubName.SDC.getName())
//					.setNwLat(nwLat)
//					.setNwLon(nwLon)
//					.setSeLat(seLat)
//					.setSeLon(seLon);
//			
//			
//	      wsClient = DdsClientFactory.create(appContext, null, IsdDecoder.class);
//	      
//	      String subreq = request.subscriptionRequest();
//			logger.info("Sending subscription request: {}", subreq);
//	      
//	      wsClient.send(request.subscriptionRequest());
			
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
				response = Response.status(Status.NOT_FOUND).entity(
				      JsonUtils.newJson("sessionId", sessionId)).build();
				logger.error("Session ID Not Found: {}", sessionId);
			} else {
				wsClient.close();
				response = Response.ok(JsonUtils.newJson(
				      "sessionId", sessionId)).build();
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
