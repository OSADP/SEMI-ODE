/**
 * Copyright 2014 Leidos
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bah.ode.dds.client.ws;

import java.io.IOException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.SSLContext;

import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.context.AppContext;

public class CASClient {

	private static final Logger logger = LoggerFactory.getLogger(CASClient.class);

	private AppContext appContext;
	private SSLConnectionSocketFactory sslSocketFactory;
	
	public static CASClient configure(AppContext appContext) throws KeyManagementException,
			KeyStoreException, NoSuchAlgorithmException, CertificateException,
			IOException {

		CASClient casClient = new CASClient();
		casClient.appContext = appContext;
		
		SSLContext sslContext = SSLBuilder.buildSSLContext(
				appContext.getParam(AppContext.DDS_KEYSTORE_FILE_PATH),
				appContext.getParam(AppContext.DDS_KEYSTORE_PASSWORD));

		casClient.sslSocketFactory = SSLBuilder
				.buildSSLConnectionSocketFactory(sslContext);

		return casClient;
	}
	
	public String login()
			throws ClientProtocolException, IOException, CASLoginException {

		String casUrl = appContext.getParam(AppContext.DDS_CAS_URL);
		
		String ticketGrantingTicket = getTicketGrantingTicket(
				casUrl,
		      appContext.getParam(AppContext.DDS_CAS_USERNAME),
		      appContext.getParam(AppContext.DDS_CAS_PASSWORD));
		logger.info("Got ticketGrantingTicket " + ticketGrantingTicket);

		String ddsHttpWebSocketUrl = new URL("https", 
      		appContext.getParam(AppContext.DDS_DOMAIN),
      		Integer.parseInt(appContext.getParam(AppContext.DDS_PORT)),
      		appContext.getParam(AppContext.DDS_RESOURCE_IDENTIFIER)).toExternalForm();
		String serviceTicket = getServiceTicket(
				casUrl, ticketGrantingTicket,	ddsHttpWebSocketUrl);
		logger.info("Got serviceTicket " + serviceTicket);
		
		String sessionID = getServiceCall(ddsHttpWebSocketUrl, serviceTicket);
		logger.info("Successful CAS login with sessionID " + sessionID);

		return sessionID;
	}

	private String getTicketGrantingTicket(String server, String username,
			String password)
			throws ClientProtocolException, IOException, CASLoginException {

		CloseableHttpClient httpclient = HttpClients.custom()
				.setSSLSocketFactory(sslSocketFactory).build();
		try {

			HttpUriRequest request = RequestBuilder.post().setUri(server)
					.addParameter("username", username)
					.addParameter("password", password).build();
			CloseableHttpResponse response = httpclient.execute(request);
			
			int statusCode = response.getStatusLine().getStatusCode();
			String responseBody = EntityUtils.toString(response.getEntity());

			if (statusCode == HttpStatus.SC_CREATED) { //201
				Matcher matcher = Pattern.compile(".*action=\".*/(.*?)\".*")
						.matcher(responseBody);
				if (matcher.matches()) {
					return matcher.group(1);
				} else {
					throw new CASLoginException("CAS getTicketGrantingTicket failed. No ticket found in body: " + responseBody);
				}
			} else {
				throw new CASLoginException("CAS getTicketGrantingTicket failed. Response code: " + statusCode + " body: " + responseBody);
			}
			
		} finally {
			httpclient.close();
		}
	}

	private String getServiceTicket(String server, String ticketGrantingTicket,
			String service)
			throws ClientProtocolException, IOException, CASLoginException {

		CloseableHttpClient httpclient = HttpClients.custom()
				.setSSLSocketFactory(sslSocketFactory).build();
		try {

			HttpUriRequest request = RequestBuilder.post()
					.setUri(server + "/" + ticketGrantingTicket)
					.addParameter("service", service).build();

			CloseableHttpResponse response = httpclient.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			String responseBody = EntityUtils.toString(response.getEntity());

			if (statusCode == HttpStatus.SC_OK) { //200
				return responseBody;
			} else {
				throw new CASLoginException("CAS getServiceTicket failed. Response code: " + statusCode + " body: " + responseBody);
			}
			
		} finally {
			httpclient.close();
		}
	}

	private String getServiceCall(String service, String serviceTicket) throws IOException, CASLoginException {

		CookieStore cookieStore = new BasicCookieStore();
		CloseableHttpClient httpclient = HttpClients.custom()
				.setDefaultCookieStore(cookieStore).setSSLSocketFactory(sslSocketFactory)
				.build();

		try {

			HttpUriRequest request = RequestBuilder.get().setUri(service)
					.addParameter("ticket", serviceTicket).build();

			CloseableHttpResponse response = httpclient.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			String responseBody = EntityUtils.toString(response.getEntity());

			if (statusCode == HttpStatus.SC_OK || statusCode == HttpStatus.SC_NOT_FOUND) { //200 or 404
				return getSessionID(cookieStore);
			} else {
				throw new CASLoginException("CAS getServiceCall failed. Response code: " + statusCode + " body: " + responseBody);
			}
			
		} finally {
			httpclient.close();
		}
	}

	private String getSessionID(CookieStore cookieStore) {
		String sessionID = "";
		for (Cookie c : cookieStore.getCookies()) {
			if (c.getName().equals(AppContext.JSESSIONID_KEY)) {
				sessionID = c.getValue();
				break;
			}
		}
		return sessionID;
	}
	
	public class CASLoginException extends Exception {

		private static final long serialVersionUID = 3103235434315019560L;
		
		public CASLoginException(String message) {
			super(message);
		}

		public CASLoginException(Throwable cause) {
			super(cause);
		}

		public CASLoginException(String message, Throwable cause) {
			super(message, cause);
		}
	}
}
