package com.bah.ode.model;

import java.math.BigDecimal;

public class OdeTstRequest extends OdeRequest {
   private static final long serialVersionUID = -5219513940183321970L;

   public OdeTstRequest() {
      super();
   }

   public OdeTstRequest(BigDecimal nwLat, BigDecimal nwLon, BigDecimal seLat, 
         BigDecimal seLon, OdeDataType dataType) {
      super(nwLat, nwLon, seLat, seLon, OdeRequestType.Test, dataType);
   }

}
