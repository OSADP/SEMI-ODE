package com.bah.ode.model;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import javax.websocket.DecodeException;

import org.junit.Test;

import com.bah.ode.dds.client.ws.AsdDecoder;

public class OdeAdvisoryDataTest {
   private static String ASD_BASE64_1 = "MIHRgAIAnIEBBYIEAAAAAIMEAAAAAYQEU1hNSYUBAaYcoAyABBmhR4CBBM1WB4ChDIAEGHAagIEEzx/LAKeBlIAEAAAVs4EBAoIBAYWBhTCBgoABEIEJWE1ERkJfSUNFgwEBpGswaYABAqEboRmgEIAED63bxYEE0DpmhoICAOqBAv//ggECggIH3oMDBTCnhAJ9AIUBAqYQgAQPrd50gQTQOm8tggIA6ocCCZyIAQCpEjAQgAL//6IKoAijBgQEGPwAeaoKoAgwBqAEgAIXGIUCAAA=";
   private static String oadJson1 = "{\"position\":{\"latitude\":42.0,\"longitude\":-83.5},\"groupID\":\"00000000\",\"timeToLive\":\"halfHour\",\"serviceRegion\":{\"nwCorner\":{\"latitude\":43.0000000,\"longitude\":-85.0000000},\"seCorner\":{\"latitude\":41.0000000,\"longitude\":-82.0000000}},\"advisoryMessage\":{\"id\":\"000015B3\",\"type\":\"tim\",\"distType\":\"01\",\"travelerInfo\":{\"dataFrameCount\":1,\"dataFrames\":[{\"frameType\":\"roadSignage\",\"msgId\":{\"roadSignID_chosen\":{\"position\":{\"latitude\":26.3052229,\"longitude\":-80.1479034,\"elevation\":23.4},\"viewAngle\":{\"headingSlice\":65535},\"mutcdCode\":\"warning\"}},\"startYear\":2014,\"startTime\":340135,\"duratonTime\":32000,\"priority\":2,\"commonAnchor\":{\"latitude\":26.3052916,\"longitude\":-80.1476819,\"elevation\":23.4},\"commonLaneWidth\":2460,\"commonDirectionality\":\"forward\",\"regions\":[{\"directions\":[\"allHeadings\"],\"area\":{\"shapePointSet_chosen\":{\"anchor\":{},\"nodeList\":[{\"xOffsetCm\":6396,\"yOffsetCm\":121}]}}}],\"content\":{\"advisory_chosen\":{\"sequence\":[{\"code_chosen\":{\"code\":5912}}]}}}],\"msgID\":\"travelerInformation\",\"packetID\":\"584D4446425F494345\",\"typeName\":\"TravelerInformation\"}},\"dataType\":\"AdvisoryData\",\"version\":1}";

   private static String ASD_BASE64_2 = "MIIBGYACAJyBAQWCBAAAAACDBAAAAAGEBL7vAAiFAQGmHKAMgAQZO5IAgQTOfgsSoQyABBk6gqyBBM6BrECngdyABAAAFbOBAQKCAQGFgc0wgcqAARCBCQAAAAAACQIUAaSBtTCBsoABAqEboRmgEIAEGTrqtoEEzoAz3IICALiBAgAMggECggIH3oMDBVyAhAJ9AIUBAqYQgAQZOu22gQTOgDryggIAt4cCAW6pITAfgAIADKIZoBeCAQCjEgQEBZMDRwQEBl4DtwQEBOYDBapHoUUwGqAYgRZXb29kd2FyZCBBdmVudWUgQ2xvc2VkMCegJYEjYmV0d2VlbiBTdGF0ZSBTdCBhbmQgRS4gR3JhbmQgUml2ZXKFAmAg";
   private static String oadJson2 = "{\"position\":{\"latitude\":42.329966999999996,\"longitude\":-83.0481495},\"groupID\":\"00000000\",\"timeToLive\":\"halfHour\",\"serviceRegion\":{\"nwCorner\":{\"latitude\":42.3334400,\"longitude\":-83.0600430},\"seCorner\":{\"latitude\":42.3264940,\"longitude\":-83.0362560}},\"advisoryMessage\":{\"id\":\"000015B3\",\"type\":\"tim\",\"distType\":\"01\",\"travelerInfo\":{\"dataFrames\":[{\"frameType\":\"roadSignage\",\"msgId\":{\"roadSignID_chosen\":{\"position\":{\"latitude\":42.3291574,\"longitude\":-83.0458916,\"elevation\":18.4},\"viewAngle\":{\"headingSlice\":12},\"mutcdCode\":\"warning\"}},\"startYear\":2014,\"startTime\":351360,\"duratonTime\":32000,\"priority\":2,\"commonAnchor\":{\"latitude\":42.3292342,\"longitude\":-83.0457102,\"elevation\":18.3},\"commonLaneWidth\":366,\"regions\":[{\"directions\":[\"from045_0to067_5degrees\",\"from067_5to090_0degrees\"],\"area\":{\"shapePointSet_chosen\":{\"anchor\":{},\"directionality\":\"forward\",\"nodeList\":[{\"xOffsetCm\":1427,\"yOffsetCm\":839},{\"xOffsetCm\":1630,\"yOffsetCm\":951},{\"xOffsetCm\":1254,\"yOffsetCm\":773}]}}}],\"content\":{\"workZone_chosen\":{\"sequence\":[{\"text_chosen\":{\"text\":\"Woodward Avenue Closed\"}},{\"text_chosen\":{\"text\":\"between State St and E. Grand River\"}}]}}}],\"msgID\":\"travelerInformation\",\"packetID\":\"000000000009021401\",\"typeName\":\"TravelerInformation\"}},\"dataType\":\"AdvisoryData\",\"version\":1}";

   @Test
   public void testOdeAdvisoryData() throws DecodeException, UnsupportedEncodingException {
      DdsData ddsData = new AsdDecoder().decode(ASD_BASE64_1);
      OdeAdvisoryData oad = new OdeAdvisoryData(ddsData.getAsd());
      oad.setReceivedAt(null);
      assertEquals(oadJson1, oad.toJson());

      ddsData = new AsdDecoder().decode(ASD_BASE64_2);
      oad = new OdeAdvisoryData(ddsData.getAsd());
      oad.setReceivedAt(null);
      assertEquals(oadJson2, oad.toJson());
   }

}
