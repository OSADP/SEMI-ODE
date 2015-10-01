package com.bah.ode.model;

import com.bah.ode.asn.oss.semi.IntersectionSituationData;

public final class OdeIntersectionDataRaw extends OdeDataAbstractFinal {
   private static final long serialVersionUID = -8532539311037896899L;
   
   public IntersectionSituationData isd;

   public OdeIntersectionDataRaw(IntersectionSituationData isd) {
      super();
      this.isd = isd;
   }

   @Override
   protected void initDefault() {
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + ((isd == null) ? 0 : isd.hashCode());
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
      OdeIntersectionDataRaw other = (OdeIntersectionDataRaw) obj;
      if (isd == null) {
         if (other.isd != null)
            return false;
      } else if (!isd.equals(other.isd))
         return false;
      return true;
   }

   @Override
   protected void setDataType() {
      setDataType(OdeDataType.IntersectionSituationData);
   }

}
