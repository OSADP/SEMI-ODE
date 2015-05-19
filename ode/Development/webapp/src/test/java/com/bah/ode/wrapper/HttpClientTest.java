package com.bah.ode.wrapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.ws.rs.core.Response;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.params.HttpParams;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.bah.ode.wrapper.HttpClientFactory.HttpClient;
import com.bah.ode.wrapper.HttpClientFactory.HttpException;
import com.bah.ode.wrapper.HttpClientFactory.HttpResponse;

@RunWith(JMockit.class)
public class HttpClientTest {

   @Mocked
   SSLContext sslContext;
   
   @Mocked
   CloseableHttpClient closeableHttpClient;

   @SuppressWarnings("deprecation")
   @Test
   public void testGet() throws Exception {
      { // BEGIN Happy Path
         URI uri = new URI("http://ip:port/path");
         String headerKey = "headerKey";
         String headerValue = "headerValue";
         String paramKey = "paramKey";
         String paramValue = "paramValue";
         String entityContent = "entityContent";
         
         MockCloseableHttpResponse closeableresponse = new MockCloseableHttpResponse();
         closeableresponse.setStatusLine(new BasicStatusLine(new ProtocolVersion("http", 1, 1), 
               HttpStatus.SC_OK, "SUCCESS"));
         BasicHttpEntity entity = new BasicHttpEntity();
         entity.setContent(new ByteArrayInputStream(entityContent.getBytes()));
         closeableresponse.setEntity(entity);
         HttpUriRequest request = RequestBuilder
               .get(uri)
               .addHeader(headerKey, headerValue)
               .addParameter(paramKey, paramValue)
               .build();
         
         new Expectations() {{
            // Note: withAny returns the request,, that's why object instance
            ///      is passed rather than a type.
            closeableHttpClient.execute(withAny(request)); result = closeableresponse;
         }};

         HttpClient client = HttpClientFactory.build(sslContext).createHttpClient();

         HttpResponse response = client.get(uri.toString(), 
               Collections.singletonMap(headerKey, headerValue), 
               Collections.singletonMap(paramKey, paramValue));
         
         assertEquals(entityContent, response.getBody());
         assertEquals(Response.Status.OK, response.getStatusCode());
         
         closeableresponse.close();

         new Verifications() {{
            HttpUriRequest captured;
            closeableHttpClient.execute(captured = withCapture());
            assertEquals(request.toString(), captured.toString());
            
            Header[] capturedHeaders = captured.getAllHeaders();
            assertEquals(1, capturedHeaders.length);
            assertEquals(headerKey, capturedHeaders[0].getName());
            assertEquals(headerValue, capturedHeaders[0].getValue());
         }};
      }// END Happy Path

      { // BEGIN simulating a bad request
         MockCloseableHttpResponse closeableresponse = new MockCloseableHttpResponse();
         closeableresponse.setStatusLine(new BasicStatusLine(new ProtocolVersion("http", 1, 1), 
               HttpStatus.SC_BAD_REQUEST, "FAILURE"));
         BasicHttpEntity entity = new BasicHttpEntity();
         entity.setContent(new ByteArrayInputStream("".getBytes()));
         closeableresponse.setEntity(entity);
         HttpUriRequest request = RequestBuilder.get().build();
         
         new Expectations() {{
            closeableHttpClient.execute(withAny(request)); result = closeableresponse;
         }};

         HttpClient client = HttpClientFactory.build(sslContext).createHttpClient();

         HttpResponse response = client.get(null, null, null);
         
         assertEquals("", response.getBody());
         assertEquals(Response.Status.BAD_REQUEST, response.getStatusCode());
         
         closeableresponse.close();
         
         new Verifications() {{
            HttpUriRequest captured;
            closeableHttpClient.execute(captured = withCapture());
            
            assertEquals(request.toString(), captured.toString());

            Header[] capturedHeaders = captured.getAllHeaders();
            assertEquals(0, capturedHeaders.length);
         }};
      }// END simulating a bad request

      { // BEGIN execute throws exception
         HttpUriRequest request = RequestBuilder.get().build();
         
         new Expectations() {{
            closeableHttpClient.execute(withAny(request)); result = new IOException();
         }};

         HttpClient client = HttpClientFactory.build(sslContext).createHttpClient();

         try {
            client.get(null, null, null);
            fail("Exception was aexpected.");
         } catch (HttpException e) {
            
         } catch (Exception e) {
            fail("Unexpected Exception." + e);
         }
         
         new Verifications() {{
            HttpUriRequest captured;
            closeableHttpClient.execute(captured = withCapture());
            
            assertEquals(request.toString(), captured.toString());

            Header[] capturedHeaders = captured.getAllHeaders();
            assertEquals(0, capturedHeaders.length);
         }};
      }// END execute throws exception
   }

   @Test
   public void testPost() throws Exception {
      { // BEGIN Happy Path
         URI uri = new URI("http://ip:port/path");
         String headerKey = "headerKey";
         String headerValue = "headerValue";
         String paramKey = "paramKey";
         String paramValue = "paramValue";
         String entityContent = "entityContent";
         
         MockCloseableHttpResponse closeableresponse = new MockCloseableHttpResponse();
         closeableresponse.setStatusLine(new BasicStatusLine(new ProtocolVersion("http", 1, 1), 
               HttpStatus.SC_OK, "SUCCESS"));
         BasicHttpEntity entity = new BasicHttpEntity();
         entity.setContent(new ByteArrayInputStream(entityContent.getBytes()));
         closeableresponse.setEntity(entity);
         
         HttpUriRequest request = RequestBuilder.post(uri)
               .addHeader(headerKey, headerValue)
               .addParameter(paramKey, paramValue)
               .setEntity(entity)
               .build();
         
         new Expectations() {{
            // Note: withAny returns the request,, that's why object instance
            ///      is passed rather than a type.
            closeableHttpClient.execute(withAny(request)); result = closeableresponse;
         }};

         HttpClient client = HttpClientFactory.build(sslContext).createHttpClient();

         HttpResponse response = client.post(uri.toString(), 
               Collections.singletonMap(headerKey, headerValue), 
               Collections.singletonMap(paramKey, paramValue),
               entityContent);
         
         assertEquals(entityContent, response.getBody());
         assertEquals(Response.Status.OK, response.getStatusCode());
         
         closeableresponse.close();

         new Verifications() {{
            HttpUriRequest captured;
            closeableHttpClient.execute(captured = withCapture());
            assertEquals(request.toString(), captured.toString());
            
            Header[] capturedHeaders = captured.getAllHeaders();
            assertEquals(1, capturedHeaders.length);
            assertEquals(headerKey, capturedHeaders[0].getName());
            assertEquals(headerValue, capturedHeaders[0].getValue());
         }};
      }// END Happy Path

      { // BEGIN simulating a bad request
         MockCloseableHttpResponse closeableresponse = new MockCloseableHttpResponse();
         closeableresponse.setStatusLine(new BasicStatusLine(new ProtocolVersion("http", 1, 1), 
               HttpStatus.SC_BAD_REQUEST, "FAILURE"));
         BasicHttpEntity entity = new BasicHttpEntity();
         entity.setContent(new ByteArrayInputStream("".getBytes()));
         closeableresponse.setEntity(entity);
         HttpUriRequest request = RequestBuilder.post().build();
         
         new Expectations() {{
            closeableHttpClient.execute(withAny(request)); result = closeableresponse;
         }};

         HttpClient client = HttpClientFactory.build(sslContext).createHttpClient();

         HttpResponse response = client.post(null, null, null, null);
         
         assertEquals("", response.getBody());
         assertEquals(Response.Status.BAD_REQUEST, response.getStatusCode());
         
         closeableresponse.close();
         
         new Verifications() {{
            HttpUriRequest captured;
            closeableHttpClient.execute(captured = withCapture());
            
            assertEquals(request.toString(), captured.toString());

            Header[] capturedHeaders = captured.getAllHeaders();
            assertEquals(0, capturedHeaders.length);
         }};
      }// END simulating a bad request

      { // BEGIN execute throws exception
         HttpUriRequest request = RequestBuilder.post().build();
         
         new Expectations() {{
            closeableHttpClient.execute(withAny(request)); result = new IOException();
         }};

         HttpClient client = HttpClientFactory.build(sslContext).createHttpClient();

         try {
            client.post(null, null, null, null);
            fail("Exception was aexpected.");
         } catch (HttpException e) {
            
         } catch (Exception e) {
            fail("Unexpected Exception." + e);
         }
         
         new Verifications() {{
            HttpUriRequest captured;
            closeableHttpClient.execute(captured = withCapture());
            
            assertEquals(request.toString(), captured.toString());

            Header[] capturedHeaders = captured.getAllHeaders();
            assertEquals(0, capturedHeaders.length);
         }};
      }// END execute throws exception
   }

   @Test
   public void testGetCookies() throws HttpException {
      HttpClient client = HttpClientFactory.build(sslContext).createHttpClient();
      Map<String, String> cookies = client.getCookies();
      
      // Not much can be tested here.
      assertEquals(0, cookies.size());
   }

   @Test
   public void testClose() throws Exception {
      HttpClient client = HttpClientFactory.build(sslContext).createHttpClient();
      
      // Not much can be tested here. If no exception is thrown, test is PASSed
      client.close();
   }

   class MockCloseableHttpResponse implements CloseableHttpResponse {
      private StatusLine statusLine;
      private HttpEntity entity;

      
      @Override
      public StatusLine getStatusLine() {
         return statusLine;
      }

      @Override
      public void setStatusLine(StatusLine statusLine) {
         this.statusLine = statusLine;
      }

      @Override
      public HttpEntity getEntity() {
         return entity;
      }

      @Override
      public void setEntity(HttpEntity entity) {
         this.entity = entity;
      }

      @Override
      public void setStatusLine(ProtocolVersion ver, int code) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void setStatusLine(ProtocolVersion ver, int code, String reason) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void setStatusCode(int code) throws IllegalStateException {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void setReasonPhrase(String reason) throws IllegalStateException {
         // TODO Auto-generated method stub
         
      }

      @Override
      public Locale getLocale() {
         // TODO Auto-generated method stub
         return null;
      }

      @Override
      public void setLocale(Locale loc) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public ProtocolVersion getProtocolVersion() {
         // TODO Auto-generated method stub
         return null;
      }

      @Override
      public boolean containsHeader(String name) {
         // TODO Auto-generated method stub
         return false;
      }

      @Override
      public Header[] getHeaders(String name) {
         // TODO Auto-generated method stub
         return null;
      }

      @Override
      public Header getFirstHeader(String name) {
         // TODO Auto-generated method stub
         return null;
      }

      @Override
      public Header getLastHeader(String name) {
         // TODO Auto-generated method stub
         return null;
      }

      @Override
      public Header[] getAllHeaders() {
         // TODO Auto-generated method stub
         return null;
      }

      @Override
      public void addHeader(Header header) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void addHeader(String name, String value) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void setHeader(Header header) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void setHeader(String name, String value) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void setHeaders(Header[] headers) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void removeHeader(Header header) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void removeHeaders(String name) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public HeaderIterator headerIterator() {
         // TODO Auto-generated method stub
         return null;
      }

      @Override
      public HeaderIterator headerIterator(String name) {
         // TODO Auto-generated method stub
         return null;
      }

      @Override
      public HttpParams getParams() {
         // TODO Auto-generated method stub
         return null;
      }

      @Override
      public void setParams(HttpParams params) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void close() throws IOException {
         // TODO Auto-generated method stub
         
      }
      
   }
}
