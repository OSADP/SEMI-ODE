package com.bah.ode.model;

public class OdeMessage extends OdeObject {

   private static final long serialVersionUID = 6381260328835278701L;

   private Integer v;

   public OdeMessage() {
      super();
      this.v = 1;
   }

   public Integer getV() {
      return v;
   }

   public void setV(Integer v) {
      this.v = v;
   }

   public Integer getVersion() {
      return v;
   }

   public OdeMessage setVersion(Integer v) {
      this.v = v;
      return this;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((v == null) ? 0 : v.hashCode());
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
      OdeMessage other = (OdeMessage) obj;
      if (v == null) {
         if (other.v != null)
            return false;
      } else if (!v.equals(other.v))
         return false;
      return true;
   }

   
}
