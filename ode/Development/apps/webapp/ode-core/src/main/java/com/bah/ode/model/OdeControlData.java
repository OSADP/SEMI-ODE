package com.bah.ode.model;

import com.bah.ode.dds.client.ws.ControlMessage;

public class OdeControlData extends OdeMsgPayload {

   private static final long serialVersionUID = 1L;
   
   private Integer dataSourceRecordCount = 0; 
   private Integer recordCount = 0; 

   public OdeControlData() {
      super();
   }

   public OdeControlData(ControlMessage controlMessage) {
      setDataSourceRecordCount(controlMessage.getRecordCount());
   }

   @Override
   protected void setDataType() {
      this.setDataType(OdeDataType.Control);
   }

   public Integer getRecordCount() {
      return recordCount;
   }

   public OdeControlData setRecordCount(Integer queryResultCount) {
      this.recordCount = queryResultCount;
      return this;
   }

   public Integer getDataSourceRecordCount() {
      return dataSourceRecordCount;
   }

   public OdeControlData setDataSourceRecordCount(Integer dataSourceRecordCount) {
      this.dataSourceRecordCount = dataSourceRecordCount;
      return this;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime
            * result
            + ((dataSourceRecordCount == null) ? 0 : dataSourceRecordCount
                  .hashCode());
      result = prime * result
            + ((recordCount == null) ? 0 : recordCount.hashCode());
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
      OdeControlData other = (OdeControlData) obj;
      if (dataSourceRecordCount == null) {
         if (other.dataSourceRecordCount != null)
            return false;
      } else if (!dataSourceRecordCount.equals(other.dataSourceRecordCount))
         return false;
      if (recordCount == null) {
         if (other.recordCount != null)
            return false;
      } else if (!recordCount.equals(other.recordCount))
         return false;
      return true;
   }

}
