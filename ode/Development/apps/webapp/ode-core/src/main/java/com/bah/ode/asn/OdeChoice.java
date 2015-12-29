package com.bah.ode.asn;

import com.bah.ode.model.OdeObject;

public abstract class OdeChoice extends OdeObject {

   private static final long serialVersionUID = 2187214491924559144L;

   private String chosenClass;
   private OdeObject chosenObject;
   
   public OdeChoice() {
      super();
   }

   public OdeChoice(OdeObject chosenObject) {
      super();
      setChosenObject(chosenObject);
   }

   public OdeObject getChosenObject() {
      return chosenObject;
   }

   public void setChosenObject(OdeObject chosenObject) {
      this.chosenObject = chosenObject;
      this.chosenClass = this.chosenObject.getClass().getName();
   }

   public String getChosenClass() {
      return chosenClass;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result
            + ((chosenClass == null) ? 0 : chosenClass.hashCode());
      result = prime * result
            + ((chosenObject == null) ? 0 : chosenObject.hashCode());
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
      OdeChoice other = (OdeChoice) obj;
      if (chosenClass == null) {
         if (other.chosenClass != null)
            return false;
      } else if (!chosenClass.equals(other.chosenClass))
         return false;
      if (chosenObject == null) {
         if (other.chosenObject != null)
            return false;
      } else if (!chosenObject.equals(other.chosenObject))
         return false;
      return true;
   }
   
}
