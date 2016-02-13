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
   
   // FOR LOOPBACK TEST ONLY
   private BaseDataPropagator distributor;
   
   public BaseDataPropagator getDistributor() {
      return distributor;
   }
   public void setDistributor(BaseDataPropagator distributor) {
      this.distributor = distributor;
   }
   // FOR LOOPBACK TEST ONLY

   
   public DataSourceConnector(OdeMetadata metadata) {
      super();
      this.metadata = metadata;
   }
   
   public void connectToSource() 
         throws DataSourceConnectorException {
      try {
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
                  connectToTestDataSource(metadata);
               } else {
                  connectToDDS(metadata);
               }
               break;
            case IntersectionData:
            case AdvisoryData:
            case MapData:
            case SPaTData:
               if (odeRequest.getRequestType() == OdeRequestType.Test) {
                  connectToTestDataSource(metadata);
               } else {
                  connectToDDS(metadata);
               }
               break;
            case WeatherData:
               connectToWeatherDataSource(metadata);
               break;
            default:
            
         }
      } catch (Exception e) {
         throw new DataSourceConnectorException("Error sending data request.", e);
      }
   }
   private void connectToWeatherDataSource(OdeMetadata metadata) {
      // TODO Auto-generated method stub
      
   }
   private void connectToTestDataSource(OdeMetadata metadata) {
      testMgr = new TestRequestManager(metadata);
      //FOR TEST ONLY
      if (AppContext.loopbackTest())
         testMgr.setLoopbackTestPropagator(distributor);
   }
   private void connectToDDS(OdeMetadata metadata)
         throws DdsRequestManagerException {
      ddsMgr = new DdsRequestManager(metadata);
      //FOR TEST ONLY
      if (AppContext.loopbackTest()) {
         ddsMgr.setLoopbackTestPropagator(distributor);
         DdsMessageHandler handler = (DdsMessageHandler) 
               ddsMgr.getDdsClient().getHandler();
         handler.setDistributor(distributor);
      }
      
      logger.info("Connecting to DDS");
      ddsMgr.sendDdsDataRequest();
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


   public static class DataSourceConnectorException extends Exception {
      private static final long serialVersionUID = 1L;

      public DataSourceConnectorException(String message, Exception e) {
         super(message, e);
      }
      
   }
   

}
