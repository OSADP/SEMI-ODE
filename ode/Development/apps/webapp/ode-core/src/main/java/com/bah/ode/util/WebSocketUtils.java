package com.bah.ode.util;

import java.io.IOException;

import javax.websocket.Session;

public class WebSocketUtils {
   public static void send(Session session, String message) throws IOException {
      session.getBasicRemote().sendText(message);
   }

   public static void sendAsync(Session session, String message) throws IOException {
      session.getAsyncRemote().sendText(message);
   }
}
