package com.bah.ode.model;

import com.bah.ode.util.JsonUtils;

public class DdsSubRequest extends DdsRequest {
   private static final long serialVersionUID = -3817847278248921651L;
   
   private final int vsmType = 31;
   private String    systemSubName;

   public int getVsmType() {
      return vsmType;
   }

   public String getSystemSubName() {
      return systemSubName;
   }

   public DdsSubRequest setSystemSubName(String systemSubName) {
      this.systemSubName = systemSubName;
      return this;
   }

   @Override
   public String toString() {
      return "SUBSCRIBE:" + JsonUtils.toJson(this);
   }
   
}
