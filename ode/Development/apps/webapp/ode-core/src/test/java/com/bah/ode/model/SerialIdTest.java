package com.bah.ode.model;

import org.junit.*;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

import static org.junit.Assert.*;

import java.util.UUID;

/**
 * The class <code>SerialIdTest</code> contains tests for the class
 * <code>{@link SerialId}</code>.
 *
 * @generatedBy CodePro at 2/25/16 3:16 PM
 * @author 572682
 * @version $Revision: 1.0 $
 */
@RunWith(JMockit.class)
public class SerialIdTest {

   /**
    * Run the SerialId() constructor test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testSerialId_01(@Mocked UUID uuid)
      throws Exception {
      
      new Expectations() {
         {
            UUID.randomUUID(); returns(uuid);
            uuid.toString(); returns("RandomUUID");
         }
      };
      
      SerialId result = new SerialId();

      // add additional test code here
      assertNotNull(result);
      assertEquals(0L, result.getSerialNumber());
      assertEquals("RandomUUID_1.0.0", result.toString());
      assertEquals(1L, result.incrementAndGet());
      assertEquals(1L, result.getBundleId());
      assertEquals(1L, result.getSerialNumber());
      assertEquals(2L, result.incrementAndGet());
      assertEquals(2L, result.getBundleId());
      assertEquals(0, result.nextRecordId());
      assertEquals(2L, result.getSerialNumber());
      assertEquals("RandomUUID", result.getStreamId());
      assertEquals(0, result.getRecordId());
      assertEquals(1, result.getBundleSize());
   }

   /**
    * Run the SerialId(String) constructor test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testSerialId_02() throws Exception {
      String serialId = "";

      SerialId result = new SerialId(serialId);

      // add additional test code here
      assertNotNull(result);
      assertEquals("_1.0.0", result.toString());
      assertEquals(0L, result.getBundleId());
      assertEquals("", result.getStreamId());
      assertEquals(0, result.getRecordId());
      assertEquals(1, result.getBundleSize());
      assertEquals(0L, result.getSerialNumber());
      assertEquals(1L, result.incrementAndGet());
      assertEquals(0, result.getRecordId());
      assertEquals(1L, result.getBundleId());
   }

   /**
    * Run the SerialId(String) constructor test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testSerialId_03() throws Exception {
      String serialId = "StreamId_5.6.3";

      SerialId result = new SerialId(serialId);

      // add additional test code here
      assertNotNull(result);
      assertEquals("StreamId_5.6.3", result.toString());
      assertEquals(6L, result.getBundleId());
      assertEquals("StreamId", result.getStreamId());
      assertEquals(3, result.getRecordId());
      assertEquals(5, result.getBundleSize());
      assertEquals(33L, result.getSerialNumber());
      assertEquals(34L, result.incrementAndGet());
      assertEquals(4, result.getRecordId());
      assertEquals(6L, result.getBundleId());
   }

   /**
    * Run the SerialId(String) constructor test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testSerialId_04() throws Exception {
      String serialId = "StreamId_5.6.4";

      SerialId result = new SerialId(serialId);

      // add additional test code here
      assertNotNull(result);
      assertEquals("StreamId_5.6.4", result.toString());
      assertEquals(6L, result.getBundleId());
      assertEquals("StreamId", result.getStreamId());
      assertEquals(4, result.getRecordId());
      assertEquals(5, result.getBundleSize());
      assertEquals(34L, result.getSerialNumber());
      assertEquals(35L, result.incrementAndGet());
      assertEquals(0, result.getRecordId());
      assertEquals(7L, result.getBundleId());
   }

   /**
    * Run the SerialId(String) constructor test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testSerialId_05() throws Exception {
      String serialId = "SerialId_5";

      SerialId result = new SerialId(serialId);

      // add additional test code here
      assertNotNull(result);
      assertEquals("SerialId_5.0.0", result.toString());
      assertEquals(0L, result.getBundleId());
      assertEquals("SerialId", result.getStreamId());
      assertEquals(0, result.getRecordId());
      assertEquals(5, result.getBundleSize());
   }

   /**
    * Run the SerialId(String) constructor test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testSerialId_06() throws Exception {
      String serialId = "SerialId_5.4";

      SerialId result = new SerialId(serialId);

      // add additional test code here
      assertNotNull(result);
      assertEquals("SerialId_5.4.0", result.toString());
      assertEquals(4L, result.getBundleId());
      assertEquals("SerialId", result.getStreamId());
      assertEquals(0, result.getRecordId());
      assertEquals(5, result.getBundleSize());
   }

   /**
    * Run the SerialId(String,int,long,int) constructor test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testSerialId_17() throws Exception {
      String streamId = "";
      int bundleSize = 1;
      long bundleId = 1L;
      int recordId = 1;

      SerialId result = new SerialId(streamId, bundleSize, bundleId, recordId);

      // add additional test code here
      assertNotNull(result);
      assertEquals("_1.2.0", result.toString());
      assertEquals(3L, result.incrementAndGet());
      assertEquals(3L, result.getBundleId());
      assertEquals(0, result.nextRecordId());
      assertEquals("", result.getStreamId());
      assertEquals(0, result.getRecordId());
      assertEquals(1, result.getBundleSize());
   }

   /**
    * Run the SerialId(String,int,long,int) constructor test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testSerialId_18() throws Exception {
      String streamId = "";
      int bundleSize = 2;
      long bundleId = 1L;
      int recordId = 0;

      SerialId result = new SerialId(streamId, bundleSize, bundleId, recordId);

      // add additional test code here
      assertNotNull(result);
      assertEquals("_2.1.0", result.toString());
      assertEquals(3L, result.incrementAndGet());
      assertEquals(1L, result.getBundleId());
      assertEquals(0, result.nextRecordId());
      assertEquals("", result.getStreamId());
      assertEquals(1, result.getRecordId());
      assertEquals(2, result.getBundleSize());
   }

   /**
    * Run the SerialId clone() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testClone_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);

      SerialId result = fixture.clone();

      // add additional test code here
      assertNotNull(result);
      assertEquals("_2.1.1", result.toString());
      assertEquals(4L, result.incrementAndGet());
      assertEquals(2L, result.getBundleId());
      assertEquals(1, result.nextRecordId());
      assertEquals("", result.getStreamId());
      assertEquals(0, result.getRecordId());
      assertEquals(2, result.getBundleSize());
   }

   /**
    * Run the boolean equals(Object) method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testEquals_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);
      Object obj = new SerialId("", 2, 1L, 1);

      boolean result = fixture.equals(obj);

      // add additional test code here
      assertEquals(true, result);
   }

   /**
    * Run the long getBundleId() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testGetBundleId_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);

      long result = fixture.getBundleId();

      // add additional test code here
      assertEquals(1L, result);
   }

   /**
    * Run the int getBundleSize() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testGetBundleSize_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);

      int result = fixture.getBundleSize();

      // add additional test code here
      assertEquals(2, result);
   }

   /**
    * Run the int getRecordId() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testGetRecordId_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);

      int result = fixture.getRecordId();

      // add additional test code here
      assertEquals(1, result);
   }

   /**
    * Run the String getStreamId() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testGetStreamId_1() throws Exception {
      SerialId fixture = new SerialId("SID", 2, 1L, 1);

      String result = fixture.getStreamId();

      // add additional test code here
      assertEquals("SID", result);
   }

   /**
    * Run the int hashCode() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testHashCode_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);

      int result = fixture.hashCode();

      // add additional test code here
      assertEquals(955265, result);
   }

   /**
    * Run the int hashCode() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testHashCode_2() throws Exception {
      SerialId fixture = new SerialId((String) null, 1, 1L, 1);

      int result = fixture.hashCode();

      // add additional test code here
      assertEquals(984064, result);
   }

   /**
    * Run the long incrementAndGet() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testIncrementAndGet_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);

      long result = fixture.incrementAndGet();

      // add additional test code here
      assertEquals(4L, result);
   }

   /**
    * Run the boolean isRightAfter(SerialId) method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testIsRightAfter_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 2L, 1);
      SerialId prev = new SerialId("", 2, 1L, 1);

      boolean result = fixture.isRightAfter(prev);

      // add additional test code here
      assertEquals(false, result);
   }

   /**
    * Run the boolean isRightAfter(SerialId) method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testIsRightAfter_2() throws Exception {
      SerialId fixture = new SerialId("", 2, 2L, 1);
      SerialId prev = new SerialId("", 2, 2L, 0);

      boolean result = fixture.isRightAfter(prev);

      // add additional test code here
      assertEquals(true, result);
   }

   /**
    * Run the boolean isRightAfter(SerialId) method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testIsRightAfter_3() throws Exception {
      SerialId fixture = new SerialId("", 2, 3L, 0);
      SerialId prev = new SerialId("", 2, 2L, 0);

      boolean result = fixture.isRightAfter(prev);

      // add additional test code here
      assertEquals(false, result);
   }

   /**
    * Run the boolean isRightBefore(SerialId) method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testIsRightBefore_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);
      SerialId next = new SerialId("", 2, 2L, 0);

      boolean result = fixture.isRightBefore(next);

      // add additional test code here
      assertEquals(true, result);
   }

   /**
    * Run the boolean isRightBefore(SerialId) method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testIsRightBefore_2() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);
      SerialId next = new SerialId("", 2, 2L, 1);

      boolean result = fixture.isRightBefore(next);

      // add additional test code here
      assertEquals(false, result);
   }

   /**
    * Run the boolean isRightBefore(SerialId) method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testIsRightBefore_3() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);
      SerialId next = new SerialId("", 2, 1L, 0);

      boolean result = fixture.isRightBefore(next);

      // add additional test code here
      assertEquals(false, result);
   }

   /**
    * Run the int nextRecordId() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testNextRecordId_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 0);

      int result = fixture.nextRecordId();

      // add additional test code here
      assertEquals(1, result);
   }

   /**
    * Run the SerialId setStreamId(String) method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testSetStreamId_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);
      String streamId = "New";

      SerialId result = fixture.setStreamId(streamId);

      // add additional test code here
      assertNotNull(result);
      assertEquals("New_2.1.1", result.toString());
      assertEquals(4L, result.incrementAndGet());
      assertEquals(2L, result.getBundleId());
      assertEquals(1, result.nextRecordId());
      assertEquals("New", result.getStreamId());
      assertEquals(0, result.getRecordId());
      assertEquals(2, result.getBundleSize());
   }

   /**
    * Run the String toString() method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Test
   public void testToString_1() throws Exception {
      SerialId fixture = new SerialId("", 2, 1L, 1);

      String result = fixture.toString();

      // add additional test code here
      assertEquals("_2.1.1", result);
   }

   /**
    * Perform pre-test initialization.
    *
    * @throws Exception
    *            if the initialization fails for some reason
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @Before
   public void setUp() throws Exception {
      // add additional set up code here
   }

   /**
    * Perform post-test clean-up.
    *
    * @throws Exception
    *            if the clean-up fails for some reason
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   @After
   public void tearDown() throws Exception {
      // Add additional tear down code here
   }

   /**
    * Launch the test.
    *
    * @param args
    *           the command line arguments
    *
    * @generatedBy CodePro at 2/25/16 3:16 PM
    */
   public static void main(String[] args) {
      new org.junit.runner.JUnitCore().run(SerialIdTest.class);
   }
}