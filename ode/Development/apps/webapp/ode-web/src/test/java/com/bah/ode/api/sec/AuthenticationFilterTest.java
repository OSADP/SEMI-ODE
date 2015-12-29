package com.bah.ode.api.sec;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.bah.ode.api.sec.filters.LiferayWSClient;
import com.bah.ode.api.sec.filters.MainAuthenticationFilter;

import mockit.Deencapsulation;
import mockit.Injectable;
import mockit.Mocked;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class AuthenticationFilterTest {

   @Injectable
   MainAuthenticationFilter filter;

   @Injectable
   LiferayWSClient client;

   @Mocked
   ContainerRequestContext requestContext;

   String validAuthHeaderValue = "Basic dXNlckBsaWZlcmF5LmNvbTp0ZXN0"; // user@liferay.com:test
   String invalidAuthHeaderValue = "Basic dXNlckBsaWZlcmF5LmNvbXRlc3Q="; // Invalid
                                                                         // user@liferay.comtest
                                                                         // no
                                                                         // ":"
                                                                         // in
                                                                         // string

   @Test
   public void missingOrInvalidAuthenticationeHeader() throws IOException {
//      new Expectations() {
//         {
//            requestContext.getHeaderString(MainAuthenticationFilter.BASIC);
//            result = "Basic ";
//         };
//      };
//
      Deencapsulation.setField(filter, client);

      filter.filter(requestContext);

   }

   // Test with invalid credentials
   @Test
   public void invalidAuthenticationCredentials() throws IOException {
//      new Expectations() {
//         {
//            requestContext.getHeaderString(MainAuthenticationFilter.BASIC);
//            result = validAuthHeaderValue;
//            client.getUserIdByEmail(anyString, anyString);
//            result = new NumberFormatException(); // Indicates Authentication
//                                                  // with Liferay Failed
//         };
//      };
      Deencapsulation.setField(filter, client);
      filter.filter(requestContext);
   }

   @Test
   public void validAuthenticationCredentials() throws Throwable {
//      new Expectations() {
//         {
//            requestContext.getHeaderString(MainAuthenticationFilter.BASIC);
//            result = validAuthHeaderValue;
//            client.getUserIdByEmail("user@liferay.com", "test");
//            result = new NumberFormatException();
//         };
//      };
      Deencapsulation.setField(filter, client);

      filter.filter(requestContext);
   }
}
