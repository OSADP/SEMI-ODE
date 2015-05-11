package com.bah.ode.wrapper;

import java.io.InputStream;
import java.security.KeyStore;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;

public class SSLBuilder {

	public static SSLContext buildSSLContext(
			InputStream keystoreStream,
			String keystorePass) throws SSLException {

		try {
	      KeyStore keystore = KeyStore.getInstance(KeyStore.getDefaultType());
	      
	      try {
	      	keystore.load(keystoreStream, keystorePass.toCharArray());
	      } finally {
	      	keystoreStream.close();
	      }

	      // Trust own CA and all self-signed certs
	      SSLContext sslcontext = SSLContexts.custom()
	      		.loadTrustMaterial(keystore, new TrustSelfSignedStrategy())
	      		.build();
	      
	      return sslcontext;
      } catch (Exception e) {
      	throw new SSLBuilder().new SSLException(e);
      }
	}
	
	public class SSLException extends Exception {

      private static final long serialVersionUID = 1L;

		public SSLException(Exception e) {
	      super(e);
      }
		
	}

}
