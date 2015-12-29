package com.bah.ode.model;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import javax.websocket.DecodeException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.bah.ode.dds.client.ws.AsdDecoder;

public class OdeAdvisoryDataTest {
   private static String ASD_BASE64_1 = "MIHRgAIAnIEBBYIEAAAAAIMEAAAAAYQEU1hNSYUBAaYcoAyABBmhR4CBBM1WB4ChDIAEGHAagIEEzx/LAKeBlIAEAAAVs4EBAoIBAYWBhTCBgoABEIEJWE1ERkJfSUNFgwEBpGswaYABAqEboRmgEIAED63bxYEE0DpmhoICAOqBAv//ggECggIH3oMDBTCnhAJ9AIUBAqYQgAQPrd50gQTQOm8tggIA6ocCCZyIAQCpEjAQgAL//6IKoAijBgQEGPwAeaoKoAgwBqAEgAIXGIUCAAA=";
   private static String oadJson = "{\"position\":{\"latitude\":42.0,\"longitude\":-83.5},\"groupID\":\"00000000\",\"timeToLive\":\"halfHour\",\"serviceRegion\":{\"nwCorner\":{\"latitude\":43.0000000,\"longitude\":-85.0000000},\"seCorner\":{\"latitude\":41.0000000,\"longitude\":-82.0000000}},\"advisoryMessage\":{\"id\":\"000015B3\",\"type\":\"tim\",\"distType\":\"01\",\"travelerInfo\":{\"dataFrameCount\":1,\"dataFrames\":[{\"frameType\":\"roadSignage\",\"msgId\":{\"chosenClass\":\"com.bah.ode.model.OdeRoadSignId\",\"chosenObject\":{\"position\":{\"latitude\":26.3052229,\"longitude\":-80.1479034,\"elevation\":23.4},\"viewAngle\":{\"headingSlice\":65535},\"mutcdCode\":\"warning\"}},\"startYear\":2014,\"startTime\":340135,\"duratonTime\":32000,\"priority\":2,\"commonAnchor\":{\"latitude\":26.3052916,\"longitude\":-80.1476819,\"elevation\":23.4},\"commonLaneWidth\":2460,\"commonDirectionality\":\"forward\",\"regions\":[{\"directions\":[\"allHeadings\"],\"area\":{\"mChosenFlag\":1,\"mChosenValue\":{\"nodeList\":{\"elements\":[{\"mValue\":[24,-4,0,121]}]}}}}],\"content\":{\"chosenClass\":\"com.bah.ode.model.OdeAdvisoryDataFrame$MessageContent$CodeOrTextSequence\",\"chosenObject\":{\"sequence\":[{\"chosenClass\":\"com.bah.ode.model.OdeAdvisoryDataFrame$MessageContent$CodeOrText$Code\",\"chosenObject\":{\"code\":5912}}]}}}],\"msgID\":\"travelerInformation\",\"packetID\":\"XMDFB_ICE\",\"typeName\":\"TravelerInformation\"}},\"dataType\":\"AdvisoryData\",\"version\":1}";
   
   private static String ASD_BASE64_2 = "MIIBGYACAJyBAQWCBAAAAACDBAAAAAGEBL7vAAiFAQGmHKAMgAQZO5IAgQTOfgsSoQyABBk6gqyBBM6BrECngdyABAAAFbOBAQKCAQGFgc0wgcqAARCBCQAAAAAACQIUAaSBtTCBsoABAqEboRmgEIAEGTrqtoEEzoAz3IICALiBAgAMggECggIH3oMDBVyAhAJ9AIUBAqYQgAQZOu22gQTOgDryggIAt4cCAW6pITAfgAIADKIZoBeCAQCjEgQEBZMDRwQEBl4DtwQEBOYDBapHoUUwGqAYgRZXb29kd2FyZCBBdmVudWUgQ2xvc2VkMCegJYEjYmV0d2VlbiBTdGF0ZSBTdCBhbmQgRS4gR3JhbmQgUml2ZXKFAmAg";

   @BeforeClass
   public static void setUpBeforeClass() throws Exception {
   }

   @AfterClass
   public static void tearDownAfterClass() throws Exception {
   }

   @Before
   public void setUp() throws Exception {
   }

   @After
   public void tearDown() throws Exception {
   }

   @Test
   public void testOdeAdvisoryData() throws DecodeException, UnsupportedEncodingException {
      DdsData ddsData = new AsdDecoder().decode(ASD_BASE64_1);
      OdeAdvisoryData oad = new OdeAdvisoryData(ddsData.getAsd());
      oad.setReceivedAt(null);
      assertEquals(oadJson, oad.toJson());

      ddsData = new AsdDecoder().decode(ASD_BASE64_2);
      oad = new OdeAdvisoryData(ddsData.getAsd());
      oad.setReceivedAt(null);
      assertEquals(oadJson, oad.toJson());
   }

   @Test
   public void testGetTimestamp() {
      fail("Not yet implemented");
   }

   @Test
   public void testIsInBounds() {
      fail("Not yet implemented");
   }

   @Test
   public void testIsOnTime() {
      fail("Not yet implemented");
   }

}
