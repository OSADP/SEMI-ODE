package com.bah.ode.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.AsdDecoder;
import com.bah.ode.dds.client.ws.DdsClientFactory;
import com.bah.ode.dds.client.ws.IsdDecoder;
import com.bah.ode.dds.client.ws.MapDecoder;
import com.bah.ode.dds.client.ws.SpatDecoder;
import com.bah.ode.dds.client.ws.VsdDecoder;
import com.bah.ode.exception.OdeException;
import com.bah.ode.model.DdsQryRequest;
import com.bah.ode.model.DdsRequest;
import com.bah.ode.model.DdsRequest.SystemName;
import com.bah.ode.model.DdsSubRequest;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequest.DataSource;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeStatus;
import com.bah.ode.wrapper.WebSocketClient;
import com.bah.ode.wrapper.WebSocketClient.WebSocketException;
import com.bah.ode.wrapper.WebSocketMessageDecoder;

public class DdsRequestManager extends DataRequestManager {
   private static Logger logger = 
         LoggerFactory.getLogger(DdsRequestManager.class);

   private static AppContext appContext = AppContext.getInstance();
   
   private static InboundTopicManagerSingleton itms = 
         InboundTopicManagerSingleton.getInstance();
   private static OutboundTopicManagerSingleton otms = 
         OutboundTopicManagerSingleton.getInstance();
   
   private DdsRequest ddsRequest;
   private WebSocketClient<?> ddsClient;
   
   @SuppressWarnings("unchecked")
   public DdsRequestManager(OdeMetadata metadata) 
         throws DdsRequestManagerException {
      super(metadata, itms, otms);
      OdeRequest odeRequest = metadata.getOdeRequest();
      try {
         // get a data manager to start the data flow
         ddsRequest = buildDdsRequest(odeRequest);
         
         Class<?> decoder = null;
         if (odeRequest.getDataType() == OdeDataType.VehicleData) {
            decoder = VsdDecoder.class;
         } else if (odeRequest.getDataType() == OdeDataType.AggregateData) {
            decoder = VsdDecoder.class;
         } else if (odeRequest.getDataType() == OdeDataType.IntersectionData) {
            decoder = IsdDecoder.class;
         } else if (odeRequest.getDataType() == OdeDataType.AdvisoryData) {
            decoder = AsdDecoder.class;
         } else if (odeRequest.getDataType() == OdeDataType.MapData) {
            decoder = MapDecoder.class;
         } else if (odeRequest.getDataType() == OdeDataType.SPaTData) {
            decoder = SpatDecoder.class;
         }
   
         ddsClient = DdsClientFactory.create(appContext, metadata, 
               (Class<? extends WebSocketMessageDecoder<?>>) decoder);
         
         if (ddsClient == null)
            throw new DdsRequestManagerException("Error creating DDS Client");
      } catch (Exception e) {
         throw new DdsRequestManagerException("Error sending Data Request.", e);
      }
   }


   public static DdsRequest buildDdsRequest(OdeRequest odeRequest)
               throws DdsRequestManagerException, OdeException {
      OdeStatus status = new OdeStatus();
      DdsRequest ddsRequest;
      OdeRequestType requestType = odeRequest.getRequestType();
      if (requestType == OdeRequestType.Subscription) {
         ddsRequest = new DdsSubRequest()
               .setSystemSubName(systemName(odeRequest).getName());
      } else if (requestType == OdeRequestType.Query) {
         DdsQryRequest qryRequest = new DdsQryRequest()
            .setSystemQueryName(systemName(odeRequest).getName());
         
         if (odeRequest instanceof OdeQryRequest) {
            OdeQryRequest odeQuery = (OdeQryRequest) odeRequest;
            qryRequest.setStartDate(odeQuery.getStartDate());
            qryRequest.setEndDate(odeQuery.getEndDate());
            /*
             * Because some data are bundled (VSD, for instance), never skip. 
             * ODE will unbundle and skip the records as needed.
             */
            qryRequest.setSkip(0);

            /*
             * Because some data are bundled (VSD, for instance), add the skip 
             * to the limit to ensure that we will get enough records to skip 
             * and limit independent of the data source.
             */
            qryRequest.setLimit(odeQuery.getSkip() + odeQuery.getLimit());
         }
         ddsRequest = qryRequest;
      } else {
         status.setCode(OdeStatus.Code.INVALID_REQUEST_TYPE_ERROR)
               .setMessage(
                     String.format(
                           "Invalid request type %s. Valid request types are %s",
                           requestType.getShortName(),
                           OdeRequestType.shortNames()));
         logger.error(status.toString());
         throw new DdsRequestManagerException(status.toString());
      }

      ddsRequest
            .setResultEncoding(DdsRequest.ResultEncoding.BASE_64.getEnc())
            .setNwLat(odeRequest.getNwLat()).setNwLon(odeRequest.getNwLon())
            .setSeLat(odeRequest.getSeLat()).setSeLon(odeRequest.getSeLon());

      OdeDataType dataType = odeRequest.getDataType();
      if (dataType == OdeDataType.IntersectionData || 
            dataType == OdeDataType.MapData        ||
            dataType == OdeDataType.SPaTData) {
         ddsRequest.setDialogID(DdsRequest.Dialog.ISD.getId());
      } else if (dataType == OdeDataType.VehicleData || 
            dataType == OdeDataType.AggregateData) {
         ddsRequest.setDialogID(DdsRequest.Dialog.VSD.getId());
      } else if (dataType == OdeDataType.AdvisoryData) {
         ddsRequest.setDialogID(DdsRequest.Dialog.ASD.getId());
      } else {
         status.setCode(OdeStatus.Code.INVALID_DATA_TYPE_ERROR)
               .setMessage(
                     String.format(
                           "Invalid data type %s requested. Valid data types are %s",
                           dataType, OdeDataType.shortNames()));
         logger.error(status.toString());
         throw new DdsRequestManagerException(status.getMessage());
      }

      return ddsRequest;
   }

   private static SystemName systemName(OdeRequest odeRequest) {
      SystemName sysName;
      
      OdeRequest.DataSource dataSource = odeRequest.getDataSource();
      if (dataSource == null)
         dataSource = defaultDataSource(odeRequest);
      
      switch (dataSource) {
         case SDC: sysName = SystemName.SDC; break;
         case SDW: sysName = SystemName.SDW; break;
         case SDPC: sysName = SystemName.SDPC; break;
         default: sysName = defaultSystemName(odeRequest);
      }
      
      return sysName;
   }


   public static DataSource defaultDataSource(OdeRequest odeRequest) {
      DataSource dataSource;
      if (odeRequest.getRequestType() == OdeRequestType.Subscription)
         dataSource = DataSource.SDC;
      else
         dataSource = DataSource.SDPC;
      return dataSource;
   }
   
   public static SystemName defaultSystemName(OdeRequest odeRequest) {
      SystemName sysName;
      if (odeRequest.getRequestType() == OdeRequestType.Subscription)
         sysName = SystemName.SDC;
      else
         sysName = SystemName.SDPC;
      return sysName;
   }


   public void sendDdsDataRequest() throws DdsRequestManagerException {
      try {
         ddsClient.connect();
         
         // Send the new request
         String sDdsRequest = ddsRequest.toString();
         logger.info("Sending request: {}", sDdsRequest);
   
         addSubscriber();
         
         if (ddsClient.getWsSession() != null)
            ddsClient.send(sDdsRequest);
         else
            throw new DdsRequestManagerException("DDS Client Session is null, probably NOT CONNECTED.");
            
         
      } catch (Exception e) {
         throw new DdsRequestManagerException("Error sending Data Request.", e);
      }
   }

   
   public WebSocketClient<?> getDdsClient() {
      return ddsClient;
   }


   public static class DdsRequestManagerException extends Exception {
      private static final long serialVersionUID = 1L;

      public DdsRequestManagerException(String message, Exception e) {
         super(message, e);
      }

      public DdsRequestManagerException(String message) {
         super(message);
      }
      
   }


   public void cancelDdsSubscription() throws DdsRequestManagerException {
      if (ddsClient != null) {
         try {
            ddsClient.close();
         } catch (WebSocketException e) {
            throw new DdsRequestManagerException("Error closing DDS Client: ", e);
         }
      }
   }
}
