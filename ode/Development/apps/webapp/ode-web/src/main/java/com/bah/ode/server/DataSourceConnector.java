package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.DdsMessageHandler;
import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.server.DdsRequestManager.DdsRequestManagerException;
import com.bah.ode.wrapper.MQTopic;

public class DataSourceConnector {
   private static Logger logger = LoggerFactory.getLogger(DataSourceConnector.class);
   private static AppContext appContext = AppContext.getInstance();

   private OdeMetadata metadata;
   private DdsRequestManager ddsMgr;
   private TestRequestManager testMgr;
   
   private BaseDataPropagator propagator;
   
   
   public DataSourceConnector(OdeMetadata metadata, BaseDataPropagator propagator) {
      super();
      this.metadata = metadata;
      this.propagator = propagator;
   }
   
   public void sendRequest() 
         throws DataSourceConnectorException {
      try {
         logger.info("Sending request for {}", metadata.getOutputTopic());
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
                        AppContext.SPARK_DATA_PROCESSOR_INPUT_TOPIC), partitions);
                  metadata.setInputTopic(ovdfTopic);
               }
               if (odeRequest.getRequestType() == OdeRequestType.Test) {
                  connectToTestDataSource();
               } else {
                  sendRequestToDDS(odeRequest);
               }
               break;
            case IntersectionData:
            case AdvisoryData:
            case MapData:
            case SPaTData:
               if (odeRequest.getRequestType() == OdeRequestType.Test) {
                  connectToTestDataSource();
               } else {
                  sendRequestToDDS(odeRequest);
               }
               break;
            case WeatherData:
               connectToWeatherDataSource();
               break;
            case AsnBase64:
            case AsnHex:
               sendRequestToDDS(odeRequest);
               break;
            default:
            
         } // End of switch statement
      } catch (Exception e) {
         throw new DataSourceConnectorException("Error sending data request.", e);
      }
   }
   
   private void connectToWeatherDataSource() {
      // TODO Auto-generated method stub
      
   }
   private void connectToTestDataSource() {
      if (testMgr == null) {
         testMgr = new TestRequestManager(metadata);
         
         //FOR TEST ONLY
         if (AppContext.loopbackTest()) {
            testMgr.setLoopbackTestPropagator(propagator);
         }
         //FOR TEST ONLY
      }
   }

   private void sendRequestToDDS(OdeRequest odeRequest)
         throws DdsRequestManagerException {
      if (ddsMgr == null)
         ddsMgr = new DdsRequestManager(metadata);

      //FOR TEST ONLY
      if (AppContext.loopbackTest()) {
         DdsMessageHandler handler = (DdsMessageHandler) 
               ddsMgr.getDdsClient().getHandler();
         handler.setLoopbackTestPropagator(propagator);
      }
      //FOR TEST ONLY
      
      ddsMgr.sendDdsDataRequest(odeRequest);
   }
   
   public void cancelDataRequest() throws DataSourceConnectorException {
      try {
         if (ddsMgr != null) {
            ddsMgr.cancelDdsSubscription();
         }
      } catch (Exception e) {
         throw new DataSourceConnectorException("Error canceling data request.", e);
      }
   }


   public TestRequestManager getTestMgr() {
      return testMgr;
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
