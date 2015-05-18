package com.bah.ode.wrapper;

import static org.junit.Assert.fail;

import javax.net.ssl.SSLContext;

import mockit.Mocked;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.bah.ode.wrapper.HttpClientFactory.HttpClient;
import com.bah.ode.wrapper.HttpClientFactory.HttpException;

@RunWith(JMockit.class)
public class HttpClientFactoryTest {

   @Mocked
   SSLContext sslContext;
   
   @Mocked
   SSLConnectionSocketFactory factory;
   
   @Test
   public void testBuild() {
      try {
         HttpClientFactory.build(sslContext);
         new Verifications() {{
            new SSLConnectionSocketFactory(
                  withAny(sslContext), new String[] { "TLSv1" }, null,
                  SSLConnectionSocketFactory.getDefaultHostnameVerifier()); times=1;
         }};
      } catch (HttpException e) {
         fail(e.toString());
      }
   }

   @Test
   public void testCreateHttpClient() {
      try {
         
         HttpClientFactory factory = HttpClientFactory.build(sslContext);
         HttpClient client = factory.createHttpClient();

         new Verifications() {{
            new SSLConnectionSocketFactory(
                  withAny(sslContext), new String[] { "TLSv1" }, null,
                  SSLConnectionSocketFactory.getDefaultHostnameVerifier()); times=1;
         }};
      } catch (Exception e) {
         fail(e.toString());
      }
   }

}
