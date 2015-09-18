package com.bah.ode.model;

public class OdeFullMessage extends OdeDataAbstractFinal {
   private static final long serialVersionUID = -2887658115524006534L;
   
   public String fullMessage;

   public OdeFullMessage(String fullMessage) {
      super();
      this.fullMessage = fullMessage;
   }

   @Override
   protected void init() {
      setDataType(OdeDataType.OtherData);
   }

}
