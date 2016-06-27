package com.bah.ode.server;

import javax.websocket.CloseReason;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.server.AbstractDataSourceManager.DataSourceManagerException;
import com.bah.ode.wrapper.MQTopic;

public class DataSourceConnector {
   private static Logger logger = LoggerFactory.getLogger(DataSourceConnector.class);
   private static AppContext appContext = AppContext.getInstance();

   private OdeMetadata metadata;
   
   private AbstractDataSourceManager dataSoureMgr;
   
   private BaseDataPropagator propagator;
   
   
   public DataSourceConnector(OdeMetadata metadata, BaseDataPropagator propagator) {
      super();
      this.metadata = metadata;
      this.propagator = propagator;
   }
   
   public void sendRequest() 
         throws DataSourceConnectorException {
      try {
         if (metadata.getOdeRequest().getRequestType() != OdeRequestType.Deposit)
            logger.info("Sending request for {}", metadata.getOutputTopic());
         else
            logger.debug("Sending request for {}", metadata.getOutputTopic());
         
         OdeRequest odeRequest = metadata.getOdeRequest();
         OdeDataType dataType = odeRequest.getDataType();
         int partitions = appContext.getInt(
               AppContext.KAFKA_CONSUMER_THREADS,
               AppContext.DEFAULT_KAFKA_CONSUMER_THREADS);
         switch (dataType) {
            case VehicleData:
            case AggregateData:
               if (!OdeRequestManager.isPassThrough(odeRequest.getDataType())) {
                  MQTopic ovdfTopic = MQTopic.create(appContext.getParam(
                        AppContext.SPARK_TRANSFORMER_INPUT_TOPIC), partitions);
                  metadata.setInputTopic(ovdfTopic);
               }
               if (odeRequest.getRequestType() == OdeRequestType.Test) {
                  connectToTestDataSource();
               } else {
                  connectToDDS(odeRequest);
               }
               break;
            case IntersectionData:
            case AdvisoryData:
            case MapData:
            case SPaTData:
               if (odeRequest.getRequestType() == OdeRequestType.Test) {
                  connectToTestDataSource();
               } else {
                  connectToDDS(odeRequest);
               }
               break;
            case WeatherData:
               connectToWeatherDataSource();
               break;
            case AsnBase64:
            case AsnHex:
               connectToDDS(odeRequest);
               break;
            default:
            
         } // End of switch statement
         
         dataSoureMgr.setMetadata(metadata);
         
         //FOR TEST ONLY
         if (AppContext.loopbackTest()) {
            dataSoureMgr.setPropagator(propagator);
         }
         //FOR TEST ONLY
         
         dataSoureMgr.sendRequest(odeRequest);
      } catch (Exception e) {
         throw new DataSourceConnectorException("Error sending data request.", e);
      }
   }
   
   private void connectToWeatherDataSource() {
      // TODO Auto-generated method stub
      
   }
   
   private void connectToTestDataSource() {
      if (dataSoureMgr == null) {
         TestRequestManager testMgr = 
               new TestRequestManager(metadata);
         
         dataSoureMgr = testMgr;
      }
   }

   private void connectToDDS(OdeRequest odeRequest)
         throws DataSourceManagerException {
      DdsRequestManager ddsMgr;
      if (dataSoureMgr == null) {
         ddsMgr = new DdsRequestManager(metadata);
         dataSoureMgr = ddsMgr;
      } else {
         dataSoureMgr.setMetadata(metadata);
      }
   }
   
   public void close() throws DataSourceConnectorException {
      try {
         propagator.close(new CloseReason(
               CloseReason.CloseCodes.NORMAL_CLOSURE,
               "Data Request Canceled"));
         if (dataSoureMgr != null) {
            dataSoureMgr.close();
         }
      } catch (Exception e) {
         throw new DataSourceConnectorException("Error canceling data request.", e);
      }
   }


   public AbstractDataSourceManager getDataSourceManager() {
      return dataSoureMgr;
   }

   
   public OdeMetadata getMetadata() {
      return metadata;
   }
   public DataSourceConnector setMetadata(OdeMetadata metadata) {
      this.metadata = metadata;
      return this;
   }


   public BaseDataPropagator getPropagator() {
      return propagator;
   }

   public void setPropagator(BaseDataPropagator propagator) {
      this.propagator = propagator;
   }



   public static class DataSourceConnectorException extends Exception {
      private static final long serialVersionUID = 1L;

      public DataSourceConnectorException(String message, Exception e) {
         super(message, e);
      }

      public DataSourceConnectorException(String string) {
         super(string);
      }
      
   }
   

}
