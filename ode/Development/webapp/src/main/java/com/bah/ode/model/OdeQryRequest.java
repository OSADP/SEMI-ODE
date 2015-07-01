package com.bah.ode.model;

public class OdeQryRequest extends OdeRequest {
   private static final long serialVersionUID = 2596739570485872508L;

   private String startDate;
   private String endDate;
   
   public OdeQryRequest(Double nwLat, Double nwLon, Double seLat, Double seLon, 
         OdeRequestType requestType, OdeDataType dataType, 
         String startDate, String endDate) {
      super(nwLat, nwLon, seLat, seLon, requestType, dataType);
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

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
      result = prime * result
            + ((startDate == null) ? 0 : startDate.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (!super.equals(obj))
         return false;
      if (getClass() != obj.getClass())
         return false;
      OdeQryRequest other = (OdeQryRequest) obj;
      if (endDate == null) {
         if (other.endDate != null)
            return false;
      } else if (!endDate.equals(other.endDate))
         return false;
      if (startDate == null) {
         if (other.startDate != null)
            return false;
      } else if (!startDate.equals(other.startDate))
         return false;
      return true;
   }

}
