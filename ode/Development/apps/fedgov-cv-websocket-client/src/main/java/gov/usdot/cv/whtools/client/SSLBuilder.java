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
package gov.usdot.cv.whtools.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

import javax.net.ssl.SSLContext;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLContexts;
import org.apache.http.conn.ssl.TrustSelfSignedStrategy;

public class SSLBuilder {

   public static SSLContext buildSSLContext(String keystoreFile,
         String storePassword) throws KeyStoreException,
         NoSuchAlgorithmException, CertificateException, IOException,
         KeyManagementException, UnrecoverableKeyException {
      //
      // // SSLContext protocols: TLS, SSL, SSLv3
      //// SSLContext sc = SSLContext.getInstance("SSLv3");
      // SSLContext sc = SSLContext.getInstance("TLSv1");
      // System.out.println("\nSSLContext class: " + sc.getClass());
      // System.out.println(" Protocol: " + sc.getProtocol());
      // System.out.println(" Provider: " + sc.getProvider());
      //
      // // SSLContext algorithms: SunX509
      // KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
      // System.out.println("\nKeyManagerFactory class: " + kmf.getClass());
      // System.out.println(" Algorithm: " + kmf.getAlgorithm());
      // System.out.println(" Provider: " + kmf.getProvider());
      //
      // // KeyStore types: JKS
      //// String ksName = "herong.jks";
      //// char ksPass[] = "HerongJKS".toCharArray();
      //// char ctPass[] = "My1stKey".toCharArray();
      // KeyStore ks = KeyStore.getInstance("JKS");
      // ks.load(new FileInputStream(keystoreFile),
      // storePassword.toCharArray());
      // System.out.println("\nKeyStore class: " + ks.getClass());
      // System.out.println(" Type: " + ks.getType());
      // System.out.println(" Provider: " + ks.getProvider());
      // System.out.println(" Size: " + ks.size());
      //
      // // Generating KeyManager list
      // kmf.init(ks, storePassword.toCharArray());
      // KeyManager[] kmList = kmf.getKeyManagers();
      // System.out.println("\nKeyManager class: " + kmList[0].getClass());
      // System.out.println(" # of key manager: " + kmList.length);
      //
      // // Generating SSLSocketFactory
      // sc.init(kmList, null, null);
      // return sc;

      SSLContext sslcontext = buildSSLContextApache(keystoreFile,
            storePassword);
      return sslcontext;
   }

   private static SSLContext buildSSLContextApache(String keystoreFile,
         String storePassword) throws KeyStoreException, FileNotFoundException,
         IOException, NoSuchAlgorithmException, CertificateException,
         KeyManagementException {
      
      SSLContext sslcontext;
      if (keystoreFile != null && !keystoreFile.isEmpty()) {
         KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
         FileInputStream instream = new FileInputStream(new File(keystoreFile));
         try {
            trustStore.load(instream, storePassword.toCharArray());
         } finally {
            instream.close();
         }
   
         // Trust own CA and all self-signed certs
         sslcontext = SSLContexts.custom()
               .loadTrustMaterial(trustStore, new TrustSelfSignedStrategy())
               .build();
      } else {
         sslcontext = SSLContexts.createDefault();
      }
      return sslcontext;
   }

   public static SSLConnectionSocketFactory buildSSLConnectionSocketFactory(
         SSLContext sslcontext) {
      SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
            sslcontext, new String[] { "TLSv1" }, null,
            SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
      return sslsf;
   }
}
