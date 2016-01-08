package com.bah.ode.asn;

import com.bah.ode.asn.oss.dsrc.RoadSignID;
import com.bah.ode.model.OdeObject;

public class OdeRoadSignId extends OdeObject {

   private static final long serialVersionUID = 5729514080285088635L;
   
   public enum OdeMUTCDCode {
      none, 
      regulatory, 
      warning, 
      maintenance, 
      motoristService, 
      guide, 
      rec
   }
   
   private OdePosition3D position;
   private OdeHeadingSlice viewAngle;
   private OdeMUTCDCode mutcdCode;
   
   public OdeRoadSignId() {
      super();
   }
   
   public OdeRoadSignId(RoadSignID roadSignID) {
      if (roadSignID.position != null)
         setPosition(new OdePosition3D(roadSignID.position));
      if (roadSignID.viewAngle != null)
         setViewAngle(new OdeHeadingSlice(roadSignID.viewAngle));
      
      if (roadSignID.hasMutcdCode())
         setMutcdCode(OdeMUTCDCode.valueOf(roadSignID.getMutcdCode().name()));
   }

   public OdePosition3D getPosition() {
      return position;
   }
   public void setPosition(OdePosition3D position) {
      this.position = position;
   }
   public OdeHeadingSlice getViewAngle() {
      return viewAngle;
   }
   public void setViewAngle(OdeHeadingSlice viewAngle) {
      this.viewAngle = viewAngle;
   }
   public OdeMUTCDCode getMutcdCode() {
      return mutcdCode;
   }
   public void setMutcdCode(OdeMUTCDCode mutcdCode) {
      this.mutcdCode = mutcdCode;
   }
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result
            + ((mutcdCode == null) ? 0 : mutcdCode.hashCode());
      result = prime * result + ((position == null) ? 0 : position.hashCode());
      result = prime * result
            + ((viewAngle == null) ? 0 : viewAngle.hashCode());
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
      OdeRoadSignId other = (OdeRoadSignId) obj;
      if (mutcdCode != other.mutcdCode)
         return false;
      if (position == null) {
         if (other.position != null)
            return false;
      } else if (!position.equals(other.position))
         return false;
      if (viewAngle != other.viewAngle)
         return false;
      return true;
   }
   
   
}
