package com.bah.ode.asn;

import com.bah.ode.asn.oss.dsrc.FurtherInfoID;
import com.bah.ode.model.OdeObject;
import com.bah.ode.util.CodecUtils;

public class OdeFurtherInfoID extends OdeObject {

   private static final long serialVersionUID = -6449213999012759703L;
   private String furtherInfoId;

   public OdeFurtherInfoID(FurtherInfoID furtherInfoId2) {
      this.setFurtherInfoId(CodecUtils.toHex(furtherInfoId2.byteArrayValue()));
   }

   public String getFurtherInfoId() {
      return furtherInfoId;
   }

   public void setFurtherInfoId(String furtherInfoId) {
      this.furtherInfoId = furtherInfoId;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result
            + ((furtherInfoId == null) ? 0 : furtherInfoId.hashCode());
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
      OdeFurtherInfoID other = (OdeFurtherInfoID) obj;
      if (furtherInfoId == null) {
         if (other.furtherInfoId != null)
            return false;
      } else if (!furtherInfoId.equals(other.furtherInfoId))
         return false;
      return true;
   }

}