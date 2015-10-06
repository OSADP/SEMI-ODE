package com.bah.ode.model;

import java.math.BigDecimal;

public final class OdeAggregateData extends OdeData {

   private static final long serialVersionUID = 1595406822366147861L;

   private String     key;
   private Long       count;
   private BigDecimal minSpeed;
   private BigDecimal avgSpeed;
   private BigDecimal maxSpeed;

   
   public String getKey() {
      return key;
   }

   public OdeAggregateData setKey(String key) {
      this.key = key;
      return this;
   }

   public Long getCount() {
      return count;
   }

   public OdeAggregateData setCount(Long count) {
      this.count = count;
      return this;
   }

   public BigDecimal getMinSpeed() {
      return minSpeed;
   }

   public OdeAggregateData setMinSpeed(BigDecimal minSpeed) {
      this.minSpeed = minSpeed;
      return this;
   }

   public BigDecimal getAvgSpeed() {
      return avgSpeed;
   }

   public OdeAggregateData setAvgSpeed(BigDecimal avgSpeed) {
      this.avgSpeed = avgSpeed;
      return this;
   }

   public BigDecimal getMaxSpeed() {
      return maxSpeed;
   }

   public void setMaxSpeed(BigDecimal maxSpeed) {
      this.maxSpeed = maxSpeed;
   }

   @Override
   protected void initDefault() {
   }

   @Override
   protected void setDataType() {
      setDataType(OdeDataType.AggregateData);
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((avgSpeed == null) ? 0 : avgSpeed.hashCode());
      result = prime * result + ((count == null) ? 0 : count.hashCode());
      result = prime * result + ((key == null) ? 0 : key.hashCode());
      result = prime * result + ((maxSpeed == null) ? 0 : maxSpeed.hashCode());
      result = prime * result + ((minSpeed == null) ? 0 : minSpeed.hashCode());
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
      OdeAggregateData other = (OdeAggregateData) obj;
      if (avgSpeed == null) {
         if (other.avgSpeed != null)
            return false;
      } else if (!avgSpeed.equals(other.avgSpeed))
         return false;
      if (count == null) {
         if (other.count != null)
            return false;
      } else if (!count.equals(other.count))
         return false;
      if (key == null) {
         if (other.key != null)
            return false;
      } else if (!key.equals(other.key))
         return false;
      if (maxSpeed == null) {
         if (other.maxSpeed != null)
            return false;
      } else if (!maxSpeed.equals(other.maxSpeed))
         return false;
      if (minSpeed == null) {
         if (other.minSpeed != null)
            return false;
      } else if (!minSpeed.equals(other.minSpeed))
         return false;
      return true;
   }

   
}
