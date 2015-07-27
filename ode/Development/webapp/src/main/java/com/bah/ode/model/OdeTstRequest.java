package com.bah.ode.model;

public class OdeTstRequest extends OdeRequest {
   private static final long serialVersionUID = -5219513940183321970L;

   public OdeTstRequest() {
      super();
   }

   public OdeTstRequest(Double nwLat, Double nwLon, Double seLat, 
         Double seLon, OdeDataType dataType) {
      super(nwLat, nwLon, seLat, seLon, OdeRequestType.Test, dataType);
   }

}
