package com.bah.ode.model;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.OdeAdvisoryDetails;
import com.bah.ode.asn.OdeGeoRegion;
import com.bah.ode.asn.OdePosition3D;
import com.bah.ode.asn.oss.semi.AdvisorySituationData;
import com.bah.ode.util.CodecUtils;
import com.bah.ode.util.DateTimeUtils;
import com.bah.ode.util.GeoUtils;

public final class OdeAdvisoryData extends OdeData
      implements HasPosition, HasTimestamp {

   private static final long serialVersionUID = -8570818421787304109L;

   private static Logger logger = LoggerFactory
         .getLogger(OdeAdvisoryData.class);

   public enum OdeTimeToLive {
      minute, halfHour, day, week, month, year
   }

   // bitwise constants for setting distType by ORing
   public static final byte DIST_TYPE_NONE = 0;
   public static final byte DIST_TYPE_RSU = 1;
   public static final byte DIST_TYPE_IP = 2;

   private OdePosition3D position;
   private String groupID;
   private OdeTimeToLive timeToLive;
   private OdeGeoRegion serviceRegion;
   private OdeAdvisoryDetails advisoryMessage;

   public OdeAdvisoryData(AdvisorySituationData asd)
         throws UnsupportedEncodingException {
      super();

      if (asd.getGroupID() != null)
         setGroupId(CodecUtils.toHex(asd.getGroupID().byteArrayValue()));

      if (asd.getTimeToLive() != null)
         setTimeToLive(OdeTimeToLive.valueOf(asd.getTimeToLive().name()));
      
      setServiceRegion(new OdeGeoRegion(asd.getServiceRegion()));
      
      setPosition(this.serviceRegion.getCenterPosition());
      
      setAdvisoryMessage(new OdeAdvisoryDetails(asd.getAsdmDetails()));
   }

   public OdePosition3D getPosition() {
      return position;
   }

   public void setPosition(OdePosition3D position) {
      this.position = position;
   }

   public String getGroupId() {
      return groupID;
   }

   public void setGroupId(String groupID) {
      this.groupID = groupID;
   }

   public OdeTimeToLive getTimeToLive() {
      return timeToLive;
   }

   public void setTimeToLive(OdeTimeToLive timeToLive) {
      this.timeToLive = timeToLive;
   }

   public OdeGeoRegion getServiceRegion() {
      return serviceRegion;
   }

   public void setServiceRegion(OdeGeoRegion serviceRegion) {
      this.serviceRegion = serviceRegion;
   }

   public OdeAdvisoryDetails getAdvisoryMessage() {
      return advisoryMessage;
   }

   public void setAdvisoryMessage(OdeAdvisoryDetails advisoryMessage) {
      this.advisoryMessage = advisoryMessage;
   }

   @Override
   public ZonedDateTime getTimestamp() {
      try {
         return DateTimeUtils.isoDateTime(getReceivedAt());
      } catch (ParseException e) {
         logger.error("Error getting timestamp: ", e);
      }

      return null;
   }

   @Override
   public boolean isInBounds(OdePosition3D position) {
      return GeoUtils.isPositionInBoundsInclusive(position, serviceRegion);
   }

   @Override
   public boolean isOnTime(ZonedDateTime dateTime) {
      try {
         return DateTimeUtils.isBetweenTimesInclusive(getTimestamp(),
               DateTimeUtils.isoDateTime(getAdvisoryMessage().getStartTime()),
               DateTimeUtils.isoDateTime(getAdvisoryMessage().getStopTime()));
      } catch (ParseException e) {
         logger.error("Error getting timestamp: ", e);
      }
      return false;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result
            + ((advisoryMessage == null) ? 0 : advisoryMessage.hashCode());
      result = prime * result + ((groupID == null) ? 0 : groupID.hashCode());
      result = prime * result + ((position == null) ? 0 : position.hashCode());
      result = prime * result
            + ((serviceRegion == null) ? 0 : serviceRegion.hashCode());
      result = prime * result
            + ((timeToLive == null) ? 0 : timeToLive.hashCode());
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
      OdeAdvisoryData other = (OdeAdvisoryData) obj;
      if (advisoryMessage == null) {
         if (other.advisoryMessage != null)
            return false;
      } else if (!advisoryMessage.equals(other.advisoryMessage))
         return false;
      if (groupID == null) {
         if (other.groupID != null)
            return false;
      } else if (!groupID.equals(other.groupID))
         return false;
      if (position == null) {
         if (other.position != null)
            return false;
      } else if (!position.equals(other.position))
         return false;
      if (serviceRegion == null) {
         if (other.serviceRegion != null)
            return false;
      } else if (!serviceRegion.equals(other.serviceRegion))
         return false;
      if (timeToLive != other.timeToLive)
         return false;
      return true;
   }

}
