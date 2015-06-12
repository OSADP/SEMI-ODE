package com.bah.ode.main;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//package org.apache.spark.examples.streaming;

import org.apache.spark.storage.StorageLevel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.DdsClientFactory;
import com.bah.ode.dds.client.ws.DdsClientFactory.DdsClientException;
import com.bah.ode.dds.client.ws.IsdDecoder;
import com.bah.ode.dds.client.ws.VsdDecoder;
import com.bah.ode.model.DdsData;
import com.bah.ode.model.DdsRequest;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.receiver.WebSocketReceiver;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.WebSocketClient;
import com.bah.ode.wrapper.WebSocketClient.WebSocketException;

/**
 * Counts words in UTF8 encoded, '\n' delimited text received from the network
 * every second.
 *
 * Usage: JavaNetworkWordCount <hostname> <port> <hostname> and <port> describe
 * the TCP server that Spark Streaming would connect to receive data.
 *
 * To run this on your local machine, you need to first run a Netcat server `$
 * nc -lk 9999` and then run the example `$ bin/run-example
 * org.apache.spark.examples.streaming.JavaNetworkWordCount localhost 9999`
 */
public final class OdeSparkApp {
   private AppContext appContext;
   private static final Logger logger = LoggerFactory.getLogger(OdeSparkApp.class);

   public OdeSparkApp(AppContext appContext) {
      super();
      this.appContext = appContext;
   }

   public static void main(String[] args) {
      try {
         System.out.println("num args: " + args.length);
         if (args.length > 0) {
            System.out.println("args:");
            for (int i = 0; i < args.length; i++)
               System.out.println(args[i]);
            
         }
         
         if (args.length < 3) {
            System.err.println("Usage: "
                  + OdeSparkApp.class.getName() 
                  + " <spark app name> <spark app microbatch duration> <"
                  + DdsRequest.class.getName() 
                  + " in JSON format>");
            System.exit(1);
         }

         AppContext appContext = AppContext.getInstance();
         appContext.init(args[0], Long.parseLong(args[1]));

         OdeSparkApp app = new OdeSparkApp(appContext);
         app.init(args[2]);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   void init(String request) throws DdsClientException, WebSocketException {
      OdeRequest odeRequest = (OdeRequest) JsonUtils.fromJson(request,
            OdeRequest.class);

      WebSocketReceiver receiver = new WebSocketReceiver(
            StorageLevel.MEMORY_ONLY_2());

      DdsRequest ddsRequest = null;

      WebSocketClient<DdsData> wsClient = null;
      if (odeRequest.getDataType() == OdeDataType.IntersectionData) {
         wsClient = DdsClientFactory.create(appContext, receiver,
               IsdDecoder.class);
         ddsRequest = (DdsRequest) DdsRequest.create()
               .setDialogID(DdsRequest.Dialog.ISD.getId())
               .setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
               .setSystemSubName(DdsRequest.SystemSubName.SDC.getName())
               .setNwLat(odeRequest.getNwLat()).setNwLon(odeRequest.getNwLon())
               .setSeLat(odeRequest.getSeLat()).setSeLon(odeRequest.getSeLon());
      } else if (odeRequest.getDataType() == OdeDataType.VehicleData) {
         wsClient = DdsClientFactory.create(appContext, receiver,
               VsdDecoder.class);
         ddsRequest = (DdsRequest) DdsRequest.create()
               .setDialogID(DdsRequest.Dialog.VSD.getId())
               .setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
               .setSystemSubName(DdsRequest.SystemSubName.SDC.getName())
               .setNwLat(odeRequest.getNwLat()).setNwLon(odeRequest.getNwLon())
               .setSeLat(odeRequest.getSeLat()).setSeLon(odeRequest.getSeLon());
      }
      receiver.setWsClient(wsClient);

      wsClient.connect();
      String subreq = ddsRequest.subscriptionRequest();
      logger.info("Sending subscription request: {}", subreq);

      wsClient.send(subreq);
   }
}
