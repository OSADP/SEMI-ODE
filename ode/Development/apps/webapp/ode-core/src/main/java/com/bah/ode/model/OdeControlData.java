package com.bah.ode.model;

import com.bah.ode.dds.client.ws.ControlMessage;

public class OdeControlData extends OdeMsgPayload {

   private static final long serialVersionUID = 1L;
   
   public enum Tag {
      CONNECTED, START, STOP, ERROR
   }

   
   private Long dataSourceBundleCount; 
   private Long receivedRecordCount; 
   private Long sentRecordCount; 
   private Tag tag;
   
   public OdeControlData() {
      super();
   }

   public OdeControlData(Tag tag) {
      super();
      setTag(tag);
   }

   public OdeControlData(ControlMessage controlMessage) {
      setDataSourceBundleCount(controlMessage.getRecordCount());
      setTag(controlMessage.getTag());
   }

   private void setTag(com.bah.ode.dds.client.ws.ControlMessage.Tag tag2) {
      setTag(Tag.valueOf(tag2.name()));
   }

   public Long getDataSourceBundleCount() {
      return dataSourceBundleCount;
   }

   public OdeControlData setDataSourceBundleCount(Long dataSourceBundleCount) {
      this.dataSourceBundleCount = dataSourceBundleCount;
      return this;
   }

   public Long getReceivedRecordCount() {
      return receivedRecordCount;
   }

   public OdeControlData setReceivedRecordCount(Long receivedRecordCount) {
      this.receivedRecordCount = receivedRecordCount;
      return this;
   }

   public Long getSentRecordCount() {
      return sentRecordCount;
   }

   public OdeControlData setSentRecordCount(Long sentRecordCount) {
      this.sentRecordCount = sentRecordCount;
      return this;
   }

   public Tag getTag() {
      return tag;
   }

   public void setTag(Tag tag) {
      this.tag = tag;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((dataSourceBundleCount == null) ? 0
            : dataSourceBundleCount.hashCode());
      result = prime * result
            + (int) (receivedRecordCount ^ (receivedRecordCount >>> 32));
      result = prime * result
            + ((sentRecordCount == null) ? 0 : sentRecordCount.hashCode());
      result = prime * result + ((tag == null) ? 0 : tag.hashCode());
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
      if (dataSourceBundleCount == null) {
         if (other.dataSourceBundleCount != null)
            return false;
      } else if (!dataSourceBundleCount.equals(other.dataSourceBundleCount))
         return false;
      if (receivedRecordCount != other.receivedRecordCount)
         return false;
      if (sentRecordCount == null) {
         if (other.sentRecordCount != null)
            return false;
      } else if (!sentRecordCount.equals(other.sentRecordCount))
         return false;
      if (tag != other.tag)
         return false;
      return true;
   }

}
