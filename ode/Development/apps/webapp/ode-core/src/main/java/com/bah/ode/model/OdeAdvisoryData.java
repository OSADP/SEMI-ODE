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

   private OdePosition3D centerPosition;
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
      
      setCenterPosition(this.serviceRegion.getCenterPosition());
      
      setAdvisoryMessage(new OdeAdvisoryDetails(asd.getAsdmDetails()));
   }

   public OdePosition3D getCenterPosition() {
      return centerPosition;
   }

   public void setCenterPosition(OdePosition3D centerPosition) {
      this.centerPosition = centerPosition;
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
   public OdePosition3D getPosition() {
      return getCenterPosition();
   }

   @Override
   public boolean isInBounds(OdeGeoRegion region) {
      return GeoUtils.isPositionInBoundsInclusive(centerPosition, region);
   }

   @Override
   public ZonedDateTime getTimestamp() {
      try {
         if (advisoryMessage.getStartTime() == null ||
               advisoryMessage.getStopTime() == null) {
            return null;
         } else {
            ZonedDateTime startTime = DateTimeUtils.isoDateTime(advisoryMessage.getStartTime());
            ZonedDateTime endTime = DateTimeUtils.isoDateTime(advisoryMessage.getStopTime());
            return startTime.plusSeconds(endTime.toEpochSecond() - startTime.toEpochSecond());
         }
      } catch (ParseException e) {
         logger.error("Error getting timestamp: ", e);
      }

      return null;
   }

   @Override
   public boolean isOnTime(ZonedDateTime start, ZonedDateTime end) {
      return DateTimeUtils.isBetweenTimesInclusive(getTimestamp(),
            start, end);
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result
            + ((advisoryMessage == null) ? 0 : advisoryMessage.hashCode());
      result = prime * result + ((groupID == null) ? 0 : groupID.hashCode());
      result = prime * result + ((centerPosition == null) ? 0 : centerPosition.hashCode());
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
      if (centerPosition == null) {
         if (other.centerPosition != null)
            return false;
      } else if (!centerPosition.equals(other.centerPosition))
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
