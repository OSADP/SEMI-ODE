package com.bah.ode.model;

public class OdeSubRequest extends OdeRequest {
   private static final long serialVersionUID = -5219513940183321970L;

   public OdeSubRequest(Double nwLat, Double nwLon, Double seLat, Double seLon,
         OdeDataType dataType) {
      super(nwLat, nwLon, seLat, seLon, dataType);
   }

}
