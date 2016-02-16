package com.bah.ode.model;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import javax.websocket.DecodeException;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.bah.ode.dds.client.ws.AsdDecoder;
import com.bah.ode.metrics.OdeMetrics;
import com.bah.ode.metrics.OdeMetrics.Context;
import com.bah.ode.metrics.OdeMetrics.Meter;
import com.bah.ode.metrics.OdeMetrics.Timer;

import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class OdeAdvisoryDataTest {
   private static String ASD_BASE64_1 = "MIHRgAIAnIEBBYIEAAAAAIMEAAAAAYQEU1hNSYUBAaYcoAyABBmhR4CBBM1WB4ChDIAEGHAagIEEzx/LAKeBlIAEAAAVs4EBAoIBAYWBhTCBgoABEIEJWE1ERkJfSUNFgwEBpGswaYABAqEboRmgEIAED63bxYEE0DpmhoICAOqBAv//ggECggIH3oMDBTCnhAJ9AIUBAqYQgAQPrd50gQTQOm8tggIA6ocCCZyIAQCpEjAQgAL//6IKoAijBgQEGPwAeaoKoAgwBqAEgAIXGIUCAAA=";
   private static String oadJson1 = "{\"advisoryMessage\":{\"id\":\"000015B3\",\"type\":\"tim\",\"distType\":\"01\",\"travelerInfo\":{\"dataFrameCount\":1,\"dataFrames\":[{\"frameType\":\"roadSignage\",\"msgId\":{\"roadSignID_chosen\":{\"position\":{\"latitude\":26.3052229,\"longitude\":-80.1479034,\"elevation\":23.4},\"viewAngles\":[\"from000_0to022_5degrees\",\"from022_5to045_0degrees\",\"from045_0to067_5degrees\",\"from067_5to090_0degrees\",\"from090_0to112_5degrees\",\"from112_5to135_0degrees\",\"from135_0to157_5degrees\",\"from157_5to180_0degrees\",\"from180_0to202_5degrees\",\"from202_5to225_0degrees\",\"from225_0to247_5degrees\",\"from247_5to270_0degrees\",\"from270_0to292_5degrees\",\"from292_5to315_0degrees\",\"from315_0to337_5degrees\",\"from337_5to360_0degrees\"],\"mutcdCode\":\"warning\"},\"chosenFieldName\":\"roadSignID_chosen\"},\"startYear\":2014,\"startTime\":340135,\"duratonTime\":32000,\"priority\":2,\"commonAnchor\":{\"latitude\":26.3052916,\"longitude\":-80.1476819,\"elevation\":23.4},\"commonLaneWidth\":2460,\"commonDirectionality\":\"forward\",\"regions\":[{\"directions\":[\"from000_0to022_5degrees\",\"from022_5to045_0degrees\",\"from045_0to067_5degrees\",\"from067_5to090_0degrees\",\"from090_0to112_5degrees\",\"from112_5to135_0degrees\",\"from135_0to157_5degrees\",\"from157_5to180_0degrees\",\"from180_0to202_5degrees\",\"from202_5to225_0degrees\",\"from225_0to247_5degrees\",\"from247_5to270_0degrees\",\"from270_0to292_5degrees\",\"from292_5to315_0degrees\",\"from315_0to337_5degrees\",\"from337_5to360_0degrees\"],\"area\":{\"shapePointSet_chosen\":{\"nodeList\":[{\"xOffsetCm\":6396,\"yOffsetCm\":121}]},\"chosenFieldName\":\"shapePointSet_chosen\"}}],\"content\":{\"advisory_chosen\":[{\"code_chosen\":5912,\"chosenFieldName\":\"text_chosen\"}],\"chosenFieldName\":\"advisory_chosen\"}}],\"msgID\":\"travelerInformation\",\"packetID\":\"584D4446425F494345\"}},\"centerPosition\":{\"latitude\":42.0,\"longitude\":-83.5},\"groupID\":\"00000000\",\"timeToLive\":\"halfHour\",\"serviceRegion\":{\"nwCorner\":{\"latitude\":43.0000000,\"longitude\":-85.0000000},\"seCorner\":{\"latitude\":41.0000000,\"longitude\":-82.0000000}},\"dataType\":\"AdvisoryData\",\"version\":1}";

   private static String ASD_BASE64_2 = "MIIBGYACAJyBAQWCBAAAAACDBAAAAAGEBL7vAAiFAQGmHKAMgAQZO5IAgQTOfgsSoQyABBk6gqyBBM6BrECngdyABAAAFbOBAQKCAQGFgc0wgcqAARCBCQAAAAAACQIUAaSBtTCBsoABAqEboRmgEIAEGTrqtoEEzoAz3IICALiBAgAMggECggIH3oMDBVyAhAJ9AIUBAqYQgAQZOu22gQTOgDryggIAt4cCAW6pITAfgAIADKIZoBeCAQCjEgQEBZMDRwQEBl4DtwQEBOYDBapHoUUwGqAYgRZXb29kd2FyZCBBdmVudWUgQ2xvc2VkMCegJYEjYmV0d2VlbiBTdGF0ZSBTdCBhbmQgRS4gR3JhbmQgUml2ZXKFAmAg";
   private static String oadJson2 = "{\"advisoryMessage\":{\"id\":\"000015B3\",\"type\":\"tim\",\"distType\":\"01\",\"travelerInfo\":{\"dataFrames\":[{\"frameType\":\"roadSignage\",\"msgId\":{\"roadSignID_chosen\":{\"position\":{\"latitude\":42.3291574,\"longitude\":-83.0458916,\"elevation\":18.4},\"viewAngles\":[\"from045_0to067_5degrees\",\"from067_5to090_0degrees\"],\"mutcdCode\":\"warning\"},\"chosenFieldName\":\"roadSignID_chosen\"},\"startYear\":2014,\"startTime\":351360,\"duratonTime\":32000,\"priority\":2,\"commonAnchor\":{\"latitude\":42.3292342,\"longitude\":-83.0457102,\"elevation\":18.3},\"commonLaneWidth\":366,\"regions\":[{\"directions\":[\"from045_0to067_5degrees\",\"from067_5to090_0degrees\"],\"area\":{\"shapePointSet_chosen\":{\"directionality\":\"forward\",\"nodeList\":[{\"xOffsetCm\":1427,\"yOffsetCm\":839},{\"xOffsetCm\":1630,\"yOffsetCm\":951},{\"xOffsetCm\":1254,\"yOffsetCm\":773}]},\"chosenFieldName\":\"shapePointSet_chosen\"}}],\"content\":{\"workZone_chosen\":[{\"text_chosen\":\"Woodward Avenue Closed\",\"chosenFieldName\":\"text_chosen\"},{\"text_chosen\":\"between State St and E. Grand River\",\"chosenFieldName\":\"text_chosen\"}],\"chosenFieldName\":\"workZone_chosen\"}}],\"msgID\":\"travelerInformation\",\"packetID\":\"000000000009021401\"}},\"centerPosition\":{\"latitude\":42.329966999999996,\"longitude\":-83.0481495},\"groupID\":\"00000000\",\"timeToLive\":\"halfHour\",\"serviceRegion\":{\"nwCorner\":{\"latitude\":42.3334400,\"longitude\":-83.0600430},\"seCorner\":{\"latitude\":42.3264940,\"longitude\":-83.0362560}},\"dataType\":\"AdvisoryData\",\"version\":1}";

   @Mocked
   OdeMetrics metrics;

   @Mocked
   Meter meter;

   @Mocked
   Timer timer;
   
   @Mocked
   Context context;
   
   @Test
   public void testOdeAdvisoryData() throws DecodeException, UnsupportedEncodingException {
      new Expectations() {

         {
            OdeMetrics.getInstance(); returns(metrics);
            
            metrics.meter("ASD_RecordsReceived"); returns(meter);
            meter.mark();
            
            metrics.timer("ASD_DecodeTime"); returns(timer);
            timer.time(); returns(context);
            
            context.stop();
         }
      };
      
      DdsData ddsData = new AsdDecoder().decode(ASD_BASE64_1);
      OdeAdvisoryData oad = new OdeAdvisoryData(null, ddsData.getAsd());
      oad.setReceivedAt(null);
      assertEquals(oadJson1, oad.toJson());

      ddsData = new AsdDecoder().decode(ASD_BASE64_2);
      oad = new OdeAdvisoryData(null, ddsData.getAsd());
      oad.setReceivedAt(null);
      assertEquals(oadJson2, oad.toJson());
   }

}
