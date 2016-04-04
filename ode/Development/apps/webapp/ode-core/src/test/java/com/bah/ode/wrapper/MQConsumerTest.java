package com.bah.ode.wrapper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import kafka.consumer.KafkaStream;
import mockit.Expectations;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

/**
 * The class <code>MQConsumerTest</code> contains tests for the class <code>{@link MQConsumer}</code>.
 *
 * @generatedBy CodePro at 2/26/16 1:33 PM
 * @author 572682
 * @version $Revision: 1.0 $
 */
@RunWith(JMockit.class)
public class MQConsumerTest {

   @Mocked KafkaStream<String, String> a_stream;
   @Mocked DataProcessor<String, String> processor;
   
   private int a_threadNumber = 1;
   private int maxCacheSize = 3;

   private MQConsumer<String, String, String> fixture;
   
   /**
    * Run the MQConsumer(KafkaStream<K,V>,int,DataProcessor<V,R>,long,long,int) constructor test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/26/16 1:33 PM
    */
   @Test
   public void testMQConsumer_1()
      throws Exception {
      new Expectations() {
         {
            
         }
      };
      
      MQConsumer<String, String, String> result = 
            new MQConsumer<String, String, String>(
                  a_stream, a_threadNumber, processor, 
                  maxCacheSize);

      // add additional test code here
      assertNotNull(result);
   }

  /**
    * Run the String sendInOrder(V,boolean) method test.
    *
    * @throws Exception
    *
    * @generatedBy CodePro at 2/26/16 1:33 PM
    */
   @Test
   public void testSendInOrder_1()
      throws Exception {
      new Expectations() {
         {
            processor.process(anyString);
         }
      };
      
      boolean isStored = false;
      String msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.0#0\"}}";
      
      String result = fixture.sendInOrder(msg, isStored);
      assertEquals("{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.0#0\"}}", result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.1#1\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertEquals("{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.1#1\"}}", result);
     
      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.3#3\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertNull(result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.2#2\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertEquals("{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.2#2\"}}", result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.4#4\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertEquals("{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.4#4\"}}", result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.7#7\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertNull(result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.9#9\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertNull(result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.8#8\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertNull(result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.6#6\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertEquals("{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.7#7\"}}", result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.0.5#5\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertNull(result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.1.0#10\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertEquals("{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.1.0#10\"}}", result);

      msg = "{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.1.1#11\"}}";
      result = fixture.sendInOrder(msg, isStored);
      assertEquals("{\"payload\":{\"serialId\":\"cc9abef1-bcf0-4daf-9b45-da7fb47e6a9f_10.1.1#11\"}}", result);
   }

   /**
    * Perform pre-test initialization.
    *
    * @throws Exception
    *         if the initialization fails for some reason
    *
    * @generatedBy CodePro at 2/26/16 1:33 PM
    */
   @Before
   public void setUp()
      throws Exception {
      fixture = new MQConsumer<String, String, String>(
            a_stream, a_threadNumber, processor, 
            maxCacheSize);
   }

   /**
    * Perform post-test clean-up.
    *
    * @throws Exception
    *         if the clean-up fails for some reason
    *
    * @generatedBy CodePro at 2/26/16 1:33 PM
    */
   @After
   public void tearDown()
      throws Exception {
      // Add additional tear down code here
   }

   /**
    * Launch the test.
    *
    * @param args the command line arguments
    *
    * @generatedBy CodePro at 2/26/16 1:33 PM
    */
   public static void main(String[] args) {
      new org.junit.runner.JUnitCore().run(MQConsumerTest.class);
   }
}