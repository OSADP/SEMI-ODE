package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.server.DdsRequestManager.DdsRequestManagerException;
import com.bah.ode.wrapper.MQTopic;

public class DataSourceConnector {
   private static Logger logger = LoggerFactory.getLogger(DataSourceConnector.class);
   private static AppContext appContext = AppContext.getInstance();

   private DdsRequestManager ddsMgr;
   
   public void sendDataRequest(OdeRequest odeRequest, MQTopic outboundTopic) 
         throws DataSourceConnectorException {
      try {
         OdeDataType dataType = odeRequest.getDataType();
         switch (dataType) {
            case VehicleData:
            case IntersectionData:
            case MAPData:
            case SPaTData:
            case AggregateData:
               String topicName = outboundTopic.getName();
               if (!DdsRequestManager.isPassThrough(odeRequest.getDataType())) {
                  topicName = AppContext.VSD_INBOUND_TOPIC;
                  
                  if (!appContext.getParam(AppContext.SPARK_MASTER).isEmpty() 
                        && appContext.getSparkStreamingConext() == null)
                     appContext.init(appContext.getServletContext());
               }
                  
               ddsMgr = new DdsRequestManager(dataType, topicName);
               logger.info("Connecting to DDS");
               ddsMgr.sendDdsDataRequest(odeRequest, outboundTopic);
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
