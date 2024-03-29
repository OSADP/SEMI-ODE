package com.bah.ode.api.sec.filters;

import javax.inject.Singleton;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

@Singleton
public class LiferayWSClient {

   final String liferayHostname;
   final String companyId;

   public LiferayWSClient() {

      this(null, null);
   }

   public LiferayWSClient(String hostname, String liferayCompanyId) {
      this.liferayHostname = hostname;
      this.companyId = liferayCompanyId;
   }

   /**
    * Authenticates user via username and password. Successful authentication
    * will return the user ID.<br>
    * Unsuccessful authentication will throw NumberFormat Exception
    * 
    * @param userEmailAddress
    *           - user's email address
    * @param password
    *           - user's account password
    * @return User ID of the user's Email address
    */
   public long getUserIdByEmail(String userEmailAddress, String password) {
      // logger.debug("Authenticating user: {}", userEmailAddress);

      Client client = buildAuthenticationClient(userEmailAddress, password);

      return Long.parseLong(client.target(liferayHostname)
            .path("/api/jsonws/user/get-user-id-by-email-address/")
            .path("company-id").path(companyId).path("email-address")
            .path(userEmailAddress).request(MediaType.WILDCARD_TYPE)
            .get(String.class));
   }

   /**
    * Returns list of JSON objects describing the User Roles of the User
    * 
    * @param user
    *           - username (usually email address)
    * @param pass
    *           - user password
    * @param userId
    *           User Id that we wish to know the roles.
    * @return User roles
    */
   public String getUserRolesbyId(String user, String pass, long userId) {

      Client client = buildAuthenticationClient(user, pass);

      return client.target(liferayHostname)
            .path("/api/jsonws/role/get-user-roles/userId/")
            .path(String.valueOf(userId)).request(MediaType.WILDCARD_TYPE)
            .get(String.class);
   }
   
   /**
    * Builds authentication client to communicate with Liferay Web Services
    * 
    * @param user
    *           User Name
    * @param pass
    *           Password
    * @return Jersery Client with Basic Authentication Configured
    */
   private static Client buildAuthenticationClient(String user, String pass) {
      HttpAuthenticationFeature feature = HttpAuthenticationFeature
            .basicBuilder().credentials(user, pass).build();

      ClientConfig clientConfig = new ClientConfig();

      Client client = ClientBuilder.newClient(clientConfig);
      client.register(feature);

      return client;
   }
}
