package com.bah.ode.api.spark;

import org.apache.spark.storage.StorageLevel;
import org.apache.spark.streaming.receiver.Receiver;

public class WebSocketReceiver extends Receiver<String> {

   private static final long serialVersionUID = 1L;

   public WebSocketReceiver(StorageLevel storageLevel) {
      super(storageLevel);
      // TODO Auto-generated constructor stub
   }

   @Override
   public void onStart() {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void onStop() {
      // TODO Auto-generated method stub
      
   }

}
