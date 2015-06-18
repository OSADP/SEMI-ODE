package com.bah.ode.model;

public class OdeQryRequest extends OdeRequest {
   private static final long serialVersionUID = 2596739570485872508L;

   private String startDate;
   private String endDate;
   
   public OdeQryRequest(Double nwLat, Double nwLon, Double seLat, Double seLon,
         OdeDataType dataType, String startDate, String endDate) {
      super(nwLat, nwLon, seLat, seLon, dataType);
      this.startDate = startDate;
      this.endDate = endDate;
   }

   public String getStartDate() {
      return startDate;
   }

   public OdeQryRequest setStartDate(String startDate) {
      this.startDate = startDate;
      return this;
   }

   public String getEndDate() {
      return endDate;
   }

   public OdeQryRequest setEndDate(String endDate) {
      this.endDate = endDate;
      return this;
   }

}
