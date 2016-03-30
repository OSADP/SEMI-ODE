package com.bah.ode.util;

import java.io.IOException;

import javax.websocket.Session;

public class WebSocketUtils {
   
   public static void send(Session session, String message) throws IOException {
      synchronized(session) {
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
