package com.bah.ode.server;

import java.io.IOException;

import javax.websocket.Session;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.asn.OdeGeoRegion;
import com.bah.ode.context.AppContext;
import com.bah.ode.dds.client.ws.AsdDecoder;
import com.bah.ode.dds.client.ws.DdsClientFactory;
import com.bah.ode.dds.client.ws.DdsMessageHandler;
import com.bah.ode.dds.client.ws.DepositResponseDecoder;
import com.bah.ode.dds.client.ws.IsdDecoder;
import com.bah.ode.dds.client.ws.VsdDecoder;
import com.bah.ode.distributors.BaseDataPropagator;
import com.bah.ode.model.DdsDepRequest;
import com.bah.ode.model.DdsQryRequest;
import com.bah.ode.model.DdsRequest;
import com.bah.ode.model.DdsRequest.EncodeType;
import com.bah.ode.model.DdsRequest.SystemName;
import com.bah.ode.model.DdsSubRequest;
import com.bah.ode.model.OdeDataMessage;
import com.bah.ode.model.OdeDataType;
import com.bah.ode.model.OdeDepRequest;
import com.bah.ode.model.OdeException;
import com.bah.ode.model.OdeMetadata;
import com.bah.ode.model.OdeQryRequest;
import com.bah.ode.model.OdeRequest;
import com.bah.ode.model.OdeRequest.DataSource;
import com.bah.ode.model.OdeRequestType;
import com.bah.ode.model.OdeStatus;
import com.bah.ode.util.JsonUtils;
import com.bah.ode.wrapper.WebSocketClient;
import com.bah.ode.wrapper.WebSocketClient.WebSocketException;
import com.bah.ode.wrapper.WebSocketMessageDecoder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class DdsRequestManager extends AbstractDataSourceManager {
   private static Logger logger = 
         LoggerFactory.getLogger(DdsRequestManager.class);

   private static AppContext appContext = AppContext.getInstance();
   
   private WebSocketClient<?> ddsClient;
   private Session session;
   
   @SuppressWarnings("unchecked")
   public DdsRequestManager(OdeMetadata metadata) 
         throws DataSourceManagerException {
      this.metadata = metadata;
      
      OdeRequest odeRequest = this.metadata.getOdeRequest();
      try {
         Class<?> decoder = null;
         if (odeRequest.getRequestType() == OdeRequestType.Deposit) {
            decoder = DepositResponseDecoder.class;
         } else { 
            if (odeRequest.getDataType() == OdeDataType.VehicleData) {
               decoder = VsdDecoder.class;
            } else if (odeRequest.getDataType() == OdeDataType.AggregateData) {
               decoder = VsdDecoder.class;
            } else if (odeRequest.getDataType() == OdeDataType.IntersectionData) {
               decoder = IsdDecoder.class;
            } else if (odeRequest.getDataType() == OdeDataType.AdvisoryData) {
               decoder = AsdDecoder.class;
            } else if (odeRequest.getDataType() == OdeDataType.MapData) {
               decoder = IsdDecoder.class;
            } else if (odeRequest.getDataType() == OdeDataType.SPaTData) {
               decoder = IsdDecoder.class;
            }
         }   
         ddsClient = DdsClientFactory.create(appContext, this.metadata, 
               (Class<? extends WebSocketMessageDecoder<?>>) decoder);
         
         if (ddsClient == null)
            throw new DataSourceManagerException("Error creating DDS Client");
      } catch (Exception e) {
         throw new DataSourceManagerException("Error sending Data Request.", e);
      }
   }


   private DdsRequest buildDdsRequest(OdeRequest odeRequest)
               throws DataSourceManagerException, OdeException, IOException {
      OdeStatus status = new OdeStatus();
      DdsRequest ddsRequest;
      OdeRequestType requestType = odeRequest.getRequestType();
      if (requestType == OdeRequestType.Subscription) {
         ddsRequest = new DdsSubRequest()
               .setSystemSubName(systemName(odeRequest).getName());
         String serviceRegion = appContext.getParam(AppContext.SERVICE_REGION);
         if (serviceRegion == null) {
            ddsRequest
            .setNwLat(odeRequest.getNwLat()).setNwLon(odeRequest.getNwLon())
            .setSeLat(odeRequest.getSeLat()).setSeLon(odeRequest.getSeLon());
         } else {
            OdeGeoRegion geoRegion = new OdeGeoRegion(serviceRegion);
            ddsRequest
            .setNwLat(geoRegion.getNwCorner().getLatitude())
            .setNwLon(geoRegion.getNwCorner().getLongitude())
            .setSeLat(geoRegion.getSeCorner().getLatitude())
            .setSeLon(geoRegion.getSeCorner().getLongitude());
         }
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
            if (odeQuery.getLimit() != null) {
               qryRequest.setLimit(
                     (odeQuery.getSkip() != null  ? odeQuery.getSkip().intValue() : 0) + 
                     odeQuery.getLimit().intValue());
            }
         }
         ddsRequest = qryRequest;
         ddsRequest
         .setNwLat(odeRequest.getNwLat()).setNwLon(odeRequest.getNwLon())
         .setSeLat(odeRequest.getSeLat()).setSeLon(odeRequest.getSeLon());
      } else if (requestType == OdeRequestType.Deposit) {
         OdeDepRequest odeDepReq = (OdeDepRequest) odeRequest;
         if (StringUtils.isNotEmpty(odeDepReq.getData()))
            ddsRequest = buildDepositRequest(odeDepReq);
         else
            ddsRequest = null;
      } else {
         status.setCode(OdeStatus.Code.INVALID_REQUEST_TYPE_ERROR)
               .setMessage(
                     String.format(
                           "Invalid request type %s. Valid request types are %s",
                           requestType.getShortName(),
                           OdeRequestType.shortNames()));
         logger.error(status.toString());
         throw new DataSourceManagerException(status.toString());
      }

      if (requestType != OdeRequestType.Deposit) {
         ddsRequest
            .setResultEncoding(DdsRequest.EncodeType.base64.name());

         OdeDataType dataType = odeRequest.getDataType();
         switch (dataType) {
         case IntersectionData:
         case MapData:
         case SPaTData:
            ddsRequest.setDialogID(DdsRequest.Dialog.ISD.getId());
            break;
         case VehicleData:
         case AggregateData:
            ddsRequest.setDialogID(DdsRequest.Dialog.VSD.getId());
            break;
         case AdvisoryData:
            ddsRequest.setDialogID(DdsRequest.Dialog.ASD.getId());
            break;
         default:
            status.setCode(OdeStatus.Code.DATA_TYPE_NOT_SUPPORTED)
            .setMessage(
                  String.format(
                        "Invalid data type %s requested. Valid data types are %s",
                        dataType, OdeDataType.shortNames()));
            logger.error(status.toString());
            throw new DataSourceManagerException(status.getMessage());
         }
      }


      return ddsRequest;
   }

   private static DdsDepRequest buildDepositRequest(OdeDepRequest odeDepReq) 
         throws IOException, DataSourceManagerException {
      DdsDepRequest ddsDepReq = new DdsDepRequest();
      
      String sEncodeType = StringUtils.lowerCase(odeDepReq.getEncodeType());
      EncodeType encodeType = DdsRequest.EncodeType.valueOf(sEncodeType);
      if (encodeType == EncodeType.base64 || encodeType == EncodeType.hex) {
         ddsDepReq
               .setSystemDepositName(DdsRequestManager.systemName(odeDepReq).getName())
               .setEncodeType(encodeType.name())
               .setEncodedMsg(odeDepReq.getData());
      } else {
         // If the message does not appear to be a json, throw exception
         if (!JsonUtils.isValid(odeDepReq.getData()))
            throw new DataSourceManagerException("Invalid Data for Deposit");
         
         ObjectNode odm = OdeDataMessage.jsonStringToObjectNode(odeDepReq.getData());
         if (odm != null) {
            JsonNode payload = odm.get(AppContext.PAYLOAD_STRING);
            JsonNode payloadTypeNode = 
                  odm.get(AppContext.METADATA_STRING).get(AppContext.PAYLOAD_TYPE_STRING);
            if (payload != null && payloadTypeNode != null) {
               OdeDataType payloadType = OdeDataType.getByShortName(payloadTypeNode.textValue());
               
               if (payloadType != null) {
                  switch (payloadType) {
                  case VehicleData:
                     break;

                  case AdvisoryData:
                     break;
   
                  default:
                     throw new DataSourceManagerException(
                           "Unsupported payloadType: " + payloadTypeNode.textValue()); 
                  }
               } else {
                  throw new DataSourceManagerException(
                        "Invalid payloadType: " + payloadTypeNode.textValue()); 
               }
            } else { // unsupported message
               throw new DataSourceManagerException(
                     "Unsupported message: " + odeDepReq.getData() +
                     "\npayload and metadata are required."); 
            }
         }
      }
      return ddsDepReq;
   }


   public static SystemName systemName(OdeRequest odeRequest) {
      SystemName sysName;
      
      OdeRequest.DataSource dataSource = null; 
      if (odeRequest.getDataSource() != null)
         dataSource = OdeRequest.DataSource.valueOf(odeRequest.getDataSource());
      
      if (dataSource == null)
         dataSource = defaultDataSource(odeRequest);
      
      switch (dataSource) {
         case SDC:
         case DEPOSIT_SDC:
            sysName = SystemName.SDC; break;
         case SDW:
         case DEPOSIT_SDW:
            sysName = SystemName.SDW; break;
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


   @Override
   public void sendRequest(OdeRequest odeRequest) throws DataSourceManagerException {
      try {
         if (session == null) {
            logger.info("Connecting to DDS");
            session = ddsClient.connect();
         }
         
         if (odeRequest.getRequestType() != OdeRequestType.Deposit)
            logger.info("Sending request to DDS for topic: {}", metadata.getInputTopic());
         else
            logger.debug("Sending request to DDS for topic: {}", metadata.getInputTopic());
            
         if (session != null) {
            // Send the new request
            DdsRequest ddsRequest = buildDdsRequest(odeRequest);
            if (ddsRequest != null) {
               String sDdsRequest = ddsRequest.toString();

               if (odeRequest.getRequestType() != OdeRequestType.Deposit)
                  logger.info("Sending DDS request: {}", sDdsRequest);
               
               ddsClient.send(sDdsRequest);
            }
         } else {
            throw new DataSourceManagerException("DDS Client Session is null, probably NOT CONNECTED.");
         }
      } catch (Exception e) {
         try {
            ddsClient.close();
         } catch (WebSocketException e1) {
            logger.error("Error Closing DDS Client.", e1);
         }
         throw new DataSourceManagerException("Error sending Data Request.", e);
      }
   }

   
   public WebSocketClient<?> getDdsClient() {
      return ddsClient;
   }


   public void close() throws DataSourceManagerException {
      if (ddsClient != null) {
         try {
            logger.info("Closing WebSocket Client for Request {}", this.metadata.getKey());
            ddsClient.close();
         } catch (WebSocketException e) {
            throw new DataSourceManagerException("Error closing DDS Client: ", e);
         }
      }
   }


   @Override
   public void setPropagator(BaseDataPropagator propagator) {
      super.setPropagator(propagator);
      DdsMessageHandler handler = (DdsMessageHandler) ddsClient.getHandler();
      handler.setLoopbackTestPropagator(propagator);
   }

   @Override
   public void setMetadata(OdeMetadata metadata) {
      super.setMetadata(metadata);
      DdsMessageHandler handler = (DdsMessageHandler) ddsClient.getHandler();
      handler.setMetadata(metadata);
   }


}
