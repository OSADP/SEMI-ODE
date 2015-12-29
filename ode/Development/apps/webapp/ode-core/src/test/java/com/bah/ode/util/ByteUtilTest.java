package com.bah.ode.util;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ByteUtilTest {

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
   public void test() {
      byte[] b1 = { (byte) 0xE1, (byte) 0xA6 };

      int i = ByteUtils.unsignedByteArrayToInt(b1);
      long l = ByteUtils.unsignedByteArrayToLong(b1);
      assertEquals(57766, i);
      assertEquals(57766, l);
      
      byte[] b2 = "Test Byte Test Byte ".getBytes();
      l = ByteUtils.unsignedByteArrayToLong(b2, 0, 0);
      assertEquals(0, l);
      l = ByteUtils.unsignedByteArrayToLong(b2, 0, 4);
      assertEquals(1415934836, l);
      l = ByteUtils.unsignedByteArrayToLong(b2, 0, 8);
      assertEquals(6081393814428350836L, l);
      l = ByteUtils.unsignedByteArrayToLong(b2, 0, 10);
      assertEquals(6081393814428350836L, l);
      l = ByteUtils.unsignedByteArrayToLong(b2, 10, 0);
      assertEquals(0, l);
      l = ByteUtils.unsignedByteArrayToLong(b2, 10, 4);
      assertEquals(1415934836, l);
      l = ByteUtils.unsignedByteArrayToLong(b2, 10, 8);
      assertEquals(6081393814428350836L, l);
      l = ByteUtils.unsignedByteArrayToLong(b2, 10, 10);
      assertEquals(6081393814428350836L, l);
      
   }

}
