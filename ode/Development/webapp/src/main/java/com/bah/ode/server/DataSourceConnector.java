package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.server.DdsRequestManager.DdsRequestManagerException;
import com.bah.ode.wrapper.MQTopic;

public class DataSourceConnector {
   private static Logger logger = LoggerFactory.getLogger(DataSourceConnector.class);
   private static AppContext appContext = AppContext.getInstance();

   private DdsRequestManager ddsMgr;
   
   public void sendDataRequest(OdeRequest odeRequest, MQTopic outputTopic) 
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
               
               if (!OdeRequestManager.isPassThrough(odeRequest.getDataType())) {
                  if (!appContext.getParam(AppContext.SPARK_MASTER).isEmpty() 
                        && appContext.getSparkStreamingConext() == null)
                     appContext.init(appContext.getServletContext());

                  int partitions = Integer.parseInt(appContext.getParam(
                        AppContext.KAFKA_DEFAULT_CONSUMER_THREADS));
                  
                  MQTopic vsdTopic = MQTopic.create(
                        AppContext.VSD_INBOUND_TOPIC, partitions);
                  
                  metadata.setInputTopic(vsdTopic);
                  ddsMgr = new DdsRequestManager(dataType, metadata);
                  /*
                   *  Add subscriber only if it is not pass-through because
                   *  if it is pass-through, the subscriber has already been
                   *  added to the outbound queue by the ODE Request Manager
                   */
                  ddsMgr.addNewSubscriber();
               } else {
                  ddsMgr = new DdsRequestManager(dataType, metadata);
               }
               
               logger.info("Connecting to DDS");
               ddsMgr.sendDdsDataRequest(odeRequest);
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
         return ddsMgr.removeSubscriber();
      } catch (DdsRequestManagerException e) {
         throw new DataSourceConnectorException("Error canceling data request.", e);
      }
   }


   public static class DataSourceConnectorException extends Exception {
      private static final long serialVersionUID = 1L;

      public DataSourceConnectorException(String message, Exception e) {
         super(message, e);
      }
      
   }
   

}
