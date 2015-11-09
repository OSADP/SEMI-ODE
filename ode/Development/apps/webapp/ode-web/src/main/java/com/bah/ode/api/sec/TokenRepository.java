package com.bah.ode.api.sec;

import java.util.concurrent.ConcurrentHashMap;

import org.jose4j.jwt.GeneralJwtException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TokenRepository {

   private static Logger logger = LoggerFactory
         .getLogger(TokenRepository.class);

   private static TokenRepository instance = null;
   private ConcurrentHashMap<String, AccessToken> tokenStore;

   private TokenRepository() {
      tokenStore = new ConcurrentHashMap<String, AccessToken>();
   }

   public static synchronized TokenRepository getInstance() {
      if (null == instance) {
         instance = new TokenRepository();
      }
      return instance;
   }

   public void addToken(AccessToken token) throws GeneralJwtException {
      tokenStore.put(token.getId(), token);
      logger.info("Token added: {}", token);
   }

   public boolean validateToken(AccessToken token) throws GeneralJwtException {
      boolean valid = tokenStore.containsKey(token.getId());
      logger.info("Token validation result: {} for token {}", valid, token);
      return valid;
   }

   public AccessToken destroyToken(AccessToken token)
         throws GeneralJwtException {
      AccessToken removed = tokenStore.remove(token.getId());
      logger.info("Token removed: {}", token);
      return removed;
   }

}
