package com.bah.ode.api.sec;

import java.util.concurrent.ConcurrentHashMap;

import org.jose4j.jwt.GeneralJwtException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TokenRepository {

	 private static Logger logger = LoggerFactory.getLogger(TokenRepository.class);
	
	 private static TokenRepository instance = null;
	 private ConcurrentHashMap<String, AccessToken> tokenStore;
	
	 private TokenRepository() 	 {
		  tokenStore = new  ConcurrentHashMap<String, AccessToken>();
	 }
	 
	 public static synchronized TokenRepository getInstance()
	 {
		 if (null == instance) {
	         instance = new TokenRepository();
	      }
	      return instance;
	 }
	 
	 public  void addToken(AccessToken token) throws GeneralJwtException
	 {
		tokenStore.put(token.getId(), token); 
	 }
	 
	 public  boolean validateToken(AccessToken token) throws GeneralJwtException
	 {
		return tokenStore.containsKey(token.getId()); 
	 }
	 
	 public  AccessToken destroyToken(AccessToken token) throws GeneralJwtException
	 {
		 return tokenStore.remove(token.getId());
	 }
	 
 
	 


}
