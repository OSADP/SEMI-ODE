package com.bah.ode.model;

public class OdeSubRequest extends OdeRequest {
   private static final long serialVersionUID = -5219513940183321970L;

   public OdeSubRequest() {
      super();
   }

   public OdeSubRequest(Double nwLat, Double nwLon, Double seLat, 
         Double seLon, OdeRequestType requestType,
         OdeDataType dataType) {
      super(nwLat, nwLon, seLat, seLon, requestType, dataType);
   }

}
