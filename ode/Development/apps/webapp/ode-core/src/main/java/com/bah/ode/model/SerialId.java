package com.bah.ode.model;

import java.util.UUID;

public class SerialId {
   private static final char UUID_DELIMITER = '_';
   private static final char SERIAL_NUMBERS_DELIMITER = '.';
   
   private String streamId;
   private int bundleSize = 1;
   private long bundleId = 0;
   private int recordId = 0;

   
   public SerialId() {
      super();
      streamId = UUID.randomUUID().toString();
   }

   public SerialId(String streamId, int bundleSize, 
         long bundleId, int recordId) {
      super();
      if (streamId != null)
         this.streamId = streamId;
      else
         this.streamId = "";
      
      this.bundleSize = bundleSize;
      this.bundleId = bundleId + (recordId / this.bundleSize);
      this.recordId = recordId % bundleSize;
   }

   public SerialId (String serialId) {
      // Split on Non-alphanumerics and hyphen
      String[] splitId  = serialId.split(
            "[" + UUID_DELIMITER + SERIAL_NUMBERS_DELIMITER +"]+");
      
      if (splitId.length >= 1)
         this.streamId     = splitId[0];
      else
         this.streamId     = serialId;
      
      if (splitId.length >= 2)
         this.bundleSize   = Integer.parseInt(splitId[1]);
      
      if (splitId.length >= 3)
         this.bundleId     = Long.parseLong(splitId[2]);
      
      if (splitId.length >= 4)
         this.recordId     = Integer.parseInt(splitId[3]);
   }
   
   public int nextRecordId() {
      return (recordId + 1) % bundleSize;
   }
   
   synchronized public long incrementAndGet() {
      bundleId += (recordId + 1) / bundleSize;
      recordId = nextRecordId();
      return getSerialNumber();
   }
   
   public SerialId clone() {
      return new SerialId(streamId, bundleSize, bundleId, recordId);
   }
   

   public boolean isRightAfter (SerialId prev) {
      return (this.getSerialNumber() == prev.getSerialNumber() + 1);
   }
   
   public boolean isRightBefore (SerialId next) {
      return (this.getSerialNumber() + 1 == next.getSerialNumber());
   }
   
   public long getSerialNumber() {
      return (this.bundleId * this.bundleSize + this.recordId);
   }

   public String getStreamId() {
      return streamId;
   }

   public SerialId setStreamId(String streamId) {
      this.streamId = streamId;
      return this;
   }

   public long getBundleId() {
      return bundleId;
   }

   public int getRecordId() {
      return recordId;
   }

   public int getBundleSize() {
      return bundleSize;
   }

   @Override
   public String toString() {
      return streamId + UUID_DELIMITER + bundleSize + 
            SERIAL_NUMBERS_DELIMITER + bundleId + 
            SERIAL_NUMBERS_DELIMITER + recordId;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + (int) (bundleId ^ (bundleId >>> 32));
      result = prime * result + bundleSize;
      result = prime * result + recordId;
      result = prime * result + ((streamId == null) ? 0 : streamId.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      SerialId other = (SerialId) obj;
      if (bundleId != other.bundleId)
         return false;
      if (bundleSize != other.bundleSize)
         return false;
      if (recordId != other.recordId)
         return false;
      if (streamId == null) {
         if (other.streamId != null)
            return false;
      } else if (!streamId.equals(other.streamId))
         return false;
      return true;
   }

}
