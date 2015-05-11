package com.bah.ode.wrapper;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.net.ssl.SSLContext;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientFactory {
	
	private SSLConnectionSocketFactory sslSocketFactory;
	
	public class HttpClient {
		private CloseableHttpClient closeableHttpClient; 
		private CookieStore cookieStore;

		public HttpClient() {
			cookieStore = new BasicCookieStore();
			closeableHttpClient = HttpClientFactory.buildHttpClient(cookieStore, sslSocketFactory);
		}
		
		public HttpResponse get(
				String server, 
				Map<String, String> headers, 
				Map<String, String> params) throws HttpException {

			try {
	         RequestBuilder builder = RequestBuilder.get().setUri(server);
	         
	         CloseableHttpResponse closeableresponse = 
	         		executeRequest(headers, params, builder);
	         
				return new HttpResponse(
						Status.fromStatusCode(closeableresponse.getStatusLine().getStatusCode()),	
						EntityUtils.toString(closeableresponse.getEntity())); 

			} catch (Throwable t) {
         	throw new HttpException(t);
         } finally {
         } 
		}

		public HttpResponse post(
				String server, 
				Map<String, String> headers, 
				Map<String, String> params,
				String body) throws HttpException {

			try {
	         RequestBuilder builder = RequestBuilder.post().setUri(server);
	         
	         if (body != null)
	         	builder.setEntity(new StringEntity(body));
	         
	         CloseableHttpResponse closeableresponse = 
	         		executeRequest(headers, params, builder);
	         
				return new HttpResponse(
						Status.fromStatusCode(closeableresponse.getStatusLine().getStatusCode()),	
						EntityUtils.toString(closeableresponse.getEntity())); 

			} catch (Throwable t) {
         	throw new HttpException(t);
         } finally {
         } 
		}

		private CloseableHttpResponse executeRequest(Map<String, String> headers,
            Map<String, String> params, RequestBuilder builder)
            throws IOException, ClientProtocolException {
	      if (params != null) {
	      	for (String param : params.keySet()) {
	      		builder.addParameter(new BasicNameValuePair(param, params.get(param)));
	      	}
	      }
	      
	      HttpUriRequest request = builder.build();
	      
	      if (headers != null) {
	      	for (String header : headers.keySet()) {
	      		request.setHeader(header, headers.get(header));
	      	}
	      }
	      
	      CloseableHttpResponse closeableresponse = closeableHttpClient.execute(request);
	      return closeableresponse;
      }

		public Map<String, String> getCookies() {
			ConcurrentHashMap<String, String> cookies = new ConcurrentHashMap<String, String>();
			for (Cookie c : cookieStore.getCookies()) {
				cookies.put(c.getName(), c.getValue());
			}
			
			return cookies;
      }

		public void close() throws HttpException {
			try {
	         closeableHttpClient.close();
         } catch (Exception e) {
         	throw new HttpException(e);
         }
      }
	}
	
	public class HttpResponse {
		private Response.Status statucCode;
		private String body;
		
		public HttpResponse() {
	      super();
      }

		public HttpResponse(Response.Status statucCode, String body) {
	      super();
	      this.statucCode = statucCode;
	      this.body = body;
      }

		public Response.Status getStatusCode() {
			return statucCode;
		}

		public HttpResponse setStatucCode(Response.Status statucCode) {
			this.statucCode = statucCode;
			return this;
		}

		public String getBody() {
			return body;
		}

		public HttpResponse setBody(String body) {
			this.body = body;
			return this;
		}
		
		
	}
	
	public class HttpException extends Exception {

      private static final long serialVersionUID = 1L;

		public HttpException(Throwable t) {
	      super(t);
      }
	}

	public static HttpClientFactory build(SSLContext sslContext) throws HttpException {
		HttpClientFactory factory = new HttpClientFactory();
		
      try {
	      factory.sslSocketFactory = buildSSLConnectionSocketFactory(sslContext);
      } catch (Throwable t) {
      	throw factory.new HttpException(t);
      }
		
		return factory;
	}
	
	private static SSLConnectionSocketFactory buildSSLConnectionSocketFactory(SSLContext sslContext) {
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
				sslContext, new String[] { "TLSv1" }, null,
				SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
		return sslsf;
	}

	/**
	 * @param cookieStore or null if no cookies required
	 * @param sslSocketFactory or null of not using SSL
	 * @return
	 */
	private static CloseableHttpClient buildHttpClient(
			CookieStore cookieStore,
			SSLConnectionSocketFactory sslSocketFactory) {
		return HttpClients.custom()
				.setDefaultCookieStore(cookieStore)
				.setSSLSocketFactory(sslSocketFactory).build();
	}
	
	public HttpClient createHttpClient () {
		HttpClient httpClient = new HttpClient();
		
		return httpClient;
	}
	
}
