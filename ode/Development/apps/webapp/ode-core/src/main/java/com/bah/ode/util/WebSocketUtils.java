package com.bah.ode.util;

import java.io.IOException;

import javax.websocket.Session;

import com.bah.ode.context.AppContext;

public class WebSocketUtils {
   
   private static boolean async = 
         AppContext.getInstance().getBoolean("websocket.sendAsync.byDefault", false);
   
   public static void send(Session session, String message) throws IOException {
      synchronized(session) {
         if (async)
            session.getAsyncRemote().sendText(message);
         else
            session.getBasicRemote().sendText(message);
      }
   }
   
   public static void sendSync(Session session, String message) throws IOException {
      synchronized(session) {
         session.getBasicRemote().sendText(message);
      }
   }
   
   public static void sendAsync(Session session, String message) throws IOException {
      synchronized(session) {
         session.getAsyncRemote().sendText(message);
      }
   }
}
