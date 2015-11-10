package com.bah.ode.model;

import com.bah.ode.dds.client.ws.ControlMessage;

public class OdeControlData extends OdeMsgPayload {

   private static final long serialVersionUID = 1L;
   
   private Integer recordCount = 0; 

   public OdeControlData() {
      super();
   }

   public OdeControlData(ControlMessage controlMessage) {
      this.recordCount = controlMessage.getRecordCount();
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

}
