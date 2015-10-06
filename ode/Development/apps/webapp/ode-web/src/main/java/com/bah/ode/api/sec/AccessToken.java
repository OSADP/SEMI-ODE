package com.bah.ode.api.sec;

import org.jose4j.jwe.JsonWebEncryption;
import org.jose4j.jwt.GeneralJwtException;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.lang.JoseException;

public class AccessToken {

   private JwtClaims claims;
   private JsonWebEncryption jwe;
   private boolean isValid;

   public AccessToken(JwtClaims claims, JsonWebEncryption jwe, boolean isValid) {
      this.claims = claims;
      this.jwe = jwe;
      this.isValid = isValid;
   }

   public boolean isValid() {
      return isValid;
   }

   public String getId() throws GeneralJwtException {
      return claims.getJwtId();
   }

   public JwtClaims getClaims() {
      return claims;
   }

   public String getWebToken() throws JoseException {
      return jwe.getCompactSerialization();
   }

   @Override
   public String toString() {
      return "AccessToken [claims=" + claims.toJson() + "]";
   }

}
