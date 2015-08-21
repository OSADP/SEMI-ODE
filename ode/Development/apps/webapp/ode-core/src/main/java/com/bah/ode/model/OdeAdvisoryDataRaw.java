package com.bah.ode.model;

import com.bah.ode.asn.oss.semi.AdvisorySituationData;

public class OdeAdvisoryDataRaw extends OdeData {

   private static final long serialVersionUID = 8233414612786188661L;
   
   public AdvisorySituationData asd;

   public OdeAdvisoryDataRaw(AdvisorySituationData asd) {
      super();
      this.asd = asd;
   }

}
