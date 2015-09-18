package com.bah.ode.model;

import com.bah.ode.asn.oss.semi.IntersectionSituationData;

public class OdeIntersectionDataRaw extends OdeDataAbstractFinal {
   private static final long serialVersionUID = -8532539311037896899L;
   
   public IntersectionSituationData isd;

   public OdeIntersectionDataRaw(IntersectionSituationData isd) {
      super();
      this.isd = isd;
   }

   @Override
   protected void init() {
      setDataType(OdeDataType.IntersectionData);
   }

}
