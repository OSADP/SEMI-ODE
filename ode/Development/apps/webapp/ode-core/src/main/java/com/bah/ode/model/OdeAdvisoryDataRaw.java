package com.bah.ode.model;

import com.bah.ode.asn.oss.semi.AdvisorySituationData;

public final class OdeAdvisoryDataRaw extends OdeDataAbstractFinal {

   private static final long serialVersionUID = 8233414612786188661L;
   
   public AdvisorySituationData asd;

   public OdeAdvisoryDataRaw(AdvisorySituationData asd) {
      super();
      this.asd = asd;
   }

   @Override
   protected void initDefault() {
   }

   @Override
   protected void setDataType() {
      setDataType(OdeDataType.AdvisoryData);
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((asd == null) ? 0 : asd.hashCode());
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
      OdeAdvisoryDataRaw other = (OdeAdvisoryDataRaw) obj;
      if (asd == null) {
         if (other.asd != null)
            return false;
      } else if (!asd.equals(other.asd))
         return false;
      return true;
   }
}
