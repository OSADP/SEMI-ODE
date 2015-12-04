package com.bah.ode.model;

import com.bah.ode.asn.OdeGeoRegion;
import com.bah.ode.asn.oss.semi.AdvisorySituationData;

public final class OdeAdvisoryData extends OdeData {

   private static final long serialVersionUID = -8570818421787304109L;

   public enum OdeTimeToLive {
      MINUTE, 
      HALF_HOUR, 
      DAY, 
      WEEK, 
      MONTH, 
      YEAR
   }
   
   public enum OdeAdvisoryBroadcastType {
      SPAT_AGGREGATE, 
      MAP, 
      TIM, 
      EV
   }
   
   // bitwise constants for setting distType by ORing
   public static final byte DIST_TYPE_NONE = 0;
   public static final byte DIST_TYPE_RSU = 1;
   public static final byte DIST_TYPE_IP = 2;
   
   public OdeTimeToLive timeToLive;
   public OdeGeoRegion serviceRegion;
   public String asdmID;
   public OdeAdvisoryBroadcastType asdmType;
   public Byte distType;
   public String startTime;
   public String stopTime;
   public String advisoryMessage;
   
   public OdeAdvisoryData(AdvisorySituationData asd) {
      super();
      
      //TODO
   }
   
   
}
