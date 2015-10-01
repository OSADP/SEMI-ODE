package com.bah.ode.model;

public final class OdeFullMessage extends OdeDataAbstractFinal {
   private static final long serialVersionUID = -2887658115524006534L;
   
   public String fullMessage;

   public OdeFullMessage(String fullMessage) {
      super();
      this.fullMessage = fullMessage;
   }

   @Override
   protected void initDefault() {
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result
            + ((fullMessage == null) ? 0 : fullMessage.hashCode());
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
      OdeFullMessage other = (OdeFullMessage) obj;
      if (fullMessage == null) {
         if (other.fullMessage != null)
            return false;
      } else if (!fullMessage.equals(other.fullMessage))
         return false;
      return true;
   }

   @Override
   protected void setDataType() {
      setDataType(OdeDataType.OtherData);
   }

}
