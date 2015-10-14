package com.bah.ode.server;

import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.DdsMessageHandler;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.wrapper.MQTopic;

public class DataSourceConnector {
   private static Logger logger = LoggerFactory.getLogger(DataSourceConnector.class);
   private static AppContext appContext = AppContext.getInstance();

   private MQTopic outputTopic;
   private DdsRequestManager ddsMgr;
   private TestRequestManager testMgr;
   
   // FOR LOOPBACK TEST ONLY
   private Session clientSession;
   public Session getClientSession() {
      return clientSession;
   }
   public void setClientSession(Session clientSession) {
      this.clientSession = clientSession;
   }
   // FOR LOOPBACK TEST ONLY

   public DataSourceConnector(MQTopic clientTopic) {
      this.outputTopic = clientTopic;
   }

   public void sendDataRequest(OdeRequest odeRequest) 
         throws DataSourceConnectorException {
      try {
         OdeDataType dataType = odeRequest.getDataType();
         switch (dataType) {
            case VehicleData:
            case IntersectionData:
            case MAPData:
            case SPaTData:
            case AggregateData:
               OdeMetadata metadata = new OdeMetadata();
               // By default all data go directly to the output topic
               metadata.setInputTopic(outputTopic);
               metadata.setOutputTopic(outputTopic);
               metadata.setOdeRequest(odeRequest);
               
               if (!OdeRequestManager.isPassThrough(odeRequest.getDataType())) {
                  int partitions = Integer.parseInt(appContext.getParam(
                        AppContext.KAFKA_DEFAULT_CONSUMER_THREADS));
                  
                  MQTopic ovdfTopic = MQTopic.create(appContext.getParam(
                        AppContext.ODE_VEH_DATA_FLAT_TOPIC), partitions);
                  
                  metadata.setInputTopic(ovdfTopic);
                  if (odeRequest.getRequestType() == OdeRequestType.Test) {
                     testMgr = new TestRequestManager(dataType, metadata);
                     //FOR TEST ONLY
                     if (AppContext.loopbackTest())
                        testMgr.setClientSession(clientSession);
                  } else {
                     ddsMgr = new DdsRequestManager(odeRequest, metadata);
                     //FOR TEST ONLY
                     if (AppContext.loopbackTest()) {
                        ddsMgr.setClientSession(clientSession);
                        DdsMessageHandler handler = (DdsMessageHandler) 
                              ddsMgr.getDdsClient().getHandler();
                        handler.setClientSession(clientSession);
                     }
                     /*
                      *  Add subscriber only if it is not pass-through because
                      *  if it is pass-through, the subscriber has already been
                      *  added to the outbound queue by the ODE Request Manager
                      */
                     ddsMgr.addSubscriber();
                     
                     logger.info("Connecting to DDS");
                     ddsMgr.sendDdsDataRequest();
                  }
               } else {
                  if (odeRequest.getRequestType() == OdeRequestType.Test) {
                     testMgr = new TestRequestManager(dataType, metadata);
                     //FOR TEST ONLY
                     if (AppContext.loopbackTest())
                        testMgr.setClientSession(clientSession);
                  } else {
                     ddsMgr = new DdsRequestManager(odeRequest, metadata);
                     //FOR TEST ONLY
                     if (AppContext.loopbackTest()) {
                        ddsMgr.setClientSession(clientSession);
                        DdsMessageHandler handler = (DdsMessageHandler) 
                              ddsMgr.getDdsClient().getHandler();
                        handler.setClientSession(clientSession);
                     }

                     logger.info("Connecting to DDS");
                     ddsMgr.sendDdsDataRequest();
                  }
               }
               
               break;
            case WeatherData:
               //TODO
               break;
            default:
            
         }
      } catch (Exception e) {
         throw new DataSourceConnectorException("Error sending data request.", e);
      }
   }
   
   public int cancelDataRequest() throws DataSourceConnectorException {
      try {
         if (ddsMgr != null) {
            int requestersRmaining = ddsMgr.removeSubscriber();
            if (requestersRmaining == 0) {
               ddsMgr.cancelDdsSubscription();
            }
            return requestersRmaining;
         } else {
            return 0;
         }
      } catch (Exception e) {
         throw new DataSourceConnectorException("Error canceling data request.", e);
      }
   }


   public MQTopic getOutputTopic() {
      return outputTopic;
   }

   public TestRequestManager getTestMgr() {
      return testMgr;
   }

   public static class DataSourceConnectorException extends Exception {
      private static final long serialVersionUID = 1L;

      public DataSourceConnectorException(String message, Exception e) {
         super(message, e);
      }
      
   }
   

}
