package com.bah.ode.api.sec;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.Key;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.Security;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;

import javax.inject.Singleton;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;
import org.jose4j.jwa.AlgorithmConstraints;
import org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers;
import org.jose4j.jwe.JsonWebEncryption;
import org.jose4j.jwe.KeyManagementAlgorithmIdentifiers;
import org.jose4j.jwk.JsonWebKey;
import org.jose4j.jwk.PublicJsonWebKey;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jwk.RsaJwkGenerator;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.jose4j.lang.JoseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bah.ode.dds.client.ws.CASClient;


/**
 * Generates and validates JWT Tokens
 *
 */
@Singleton
public class TokenAuthenticationService {
	private static Logger logger = LoggerFactory.getLogger(TokenAuthenticationService.class);
	
	private static String CLAIMS_ISSUER = "ODE";
	private static String CLAIMS_AUDIENCE = "Subscribers"; 
	
	private RsaJsonWebKey rsaJsonWebKey;
	private JsonWebKey jwk;
	
	public TokenAuthenticationService(String pemFilePath)
	{
		try {
			InputStream pemInputStream = TokenAuthenticationService.class
  			.getClassLoader().getResourceAsStream(pemFilePath);
			loadRsaPEMFile(pemInputStream);
			String jwkJson = "{\"kty\":\"oct\",\"k\":\"Fdh9u8rINxfivbrianbbVT1u232VQBZYKx1HGAGPt2I\"}";
		    this.jwk = JsonWebKey.Factory.newJwk(jwkJson);
		} catch (IOException e) {
			logger.error("Error Reading RSA File", e);
		
		} catch (JoseException e) {
			
			logger.error("Error Creating RSA Key Pair for JWT", e);
		}
	}
	
	public TokenAuthenticationService() throws JoseException
	{
		this.rsaJsonWebKey = RsaJwkGenerator.generateJwk(2048);
		
		this.rsaJsonWebKey.setKeyId("k1");
		logger.info("RSA Getkey: " + rsaJsonWebKey.getKey());
		logger.info("RSaKey toJSON: " +rsaJsonWebKey.toJson());
		logger.info("Pub Key: " +rsaJsonWebKey.getPublicKey().toString());

		String jwkJson = "{\"kty\":\"oct\",\"k\":\"Fdh9u8rINxfivbrianbbVT1u232VQBZYKx1HGAGPt2I\"}";
	    this.jwk = JsonWebKey.Factory.newJwk(jwkJson);
	    logger.info("jwk String: " + jwk.getKey().toString());
	    logger.info("jwk: " + jwk.getKey());
	    logger.info("jwk: " + jwk.getKey().toString());
	}
	
	public String generateToken(long userId)
	{	  
		String token = null;
		try{
			
			JwtClaims claims = createClaims(userId);
			String jwt = buildJwsToken(claims);
			token = buildJweToken(jwt);
			logger.info(claims.toJson());
			logger.info("jwt: " + jwt); 
			logger.info("token: " + token);
		}
		catch (Throwable t)
		{
			logger.error("Error creating token", t);
		}
		return token;	
	}
	
	public boolean isValid(String jwe) throws JoseException
	{
		boolean result = false;
		if (null==jwe){
			return result;
		}
		try{
			
			String jwt = deocodeJwe(jwe);

			logger.info("Decoded JWT: " +jwt);
			
			JwtConsumer jwtConsumer = new JwtConsumerBuilder()
	        //.setRequireExpirationTime() // the JWT must have an expiration time
	        .setAllowedClockSkewInSeconds(60) // allow some leeway in validating time based claims to account for clock skew
	        .setRequireSubject() // the JWT must have a subject claim
	        .setExpectedIssuer(CLAIMS_ISSUER) // whom the JWT needs to have been issued by
	        .setExpectedAudience(CLAIMS_AUDIENCE) // to whom the JWT is intended for
	        .setVerificationKey(rsaJsonWebKey.getKey()) // verify the signature with the public key
	        .setJweAlgorithmConstraints(AlgorithmConstraints.DISALLOW_NONE)
	        .build(); // create the JwtConsumer instance
			
			jwtConsumer.processToClaims(jwt);
			result = true;
		}
    	catch (InvalidJwtException e)
        {
    		logger.warn("Invalid JWT! ", e);
            result = false;
        }
		return result;
	}
	
	private JwtClaims createClaims(long userId)
	{
		JwtClaims claims = new JwtClaims();
	    claims.setIssuer(CLAIMS_ISSUER);  					// who creates the token and signs it
	    claims.setAudience(CLAIMS_AUDIENCE); 				// to whom the token is intended to be sent
	    claims.setExpirationTimeMinutesInTheFuture(60); // time when the token will expire (10 minutes from now)
	    claims.setGeneratedJwtId(); 					// a unique identifier for the token
	    claims.setIssuedAtToNow();  					// when the token was issued/created (now)
	    claims.setNotBeforeMinutesInThePast(2); 		// time before which the token is not yet valid (2 minutes ago)
	    claims.setSubject(String.valueOf(userId)); 		// the subject/principal is whom the token is about
	    
	    List<String> requestTypes = Arrays.asList("qry", "sub");
	    claims.setStringListClaim("requestType", requestTypes); 
	    List<String> dataTypes = Arrays.asList("veh", "qry", "int", "agg");
	    claims.setStringListClaim("dataTypes", dataTypes); 

	    return claims;
	}

	private String buildJwsToken(JwtClaims claims) throws JoseException
	{

	    // Give the JWK a Key ID (kid), which is just the polite thing to do
	    rsaJsonWebKey.setKeyId("k1");
		JsonWebSignature jws = new JsonWebSignature();
		 
		jws.setPayload(claims.toJson());
		// The JWT is signed using the private key
	    jws.setKey(rsaJsonWebKey.getPrivateKey());
	    
	    // Set the Key ID (kid) header because it's just the polite thing to do.
	    // We only have one key in this example but a using a Key ID helps
	    // facilitate a smooth key rollover process
	    jws.setKeyIdHeaderValue(rsaJsonWebKey.getKeyId());

	    // Set the signature algorithm on the JWT/JWS that will integrity protect the claims
    	jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);
    	return jws.getCompactSerialization();
	}
	
	private String buildJweToken(String jwt) throws JoseException
	{
	    // Create a new Json Web Encryption object
	    JsonWebEncryption senderJwe = new JsonWebEncryption();
	    senderJwe.setContentTypeHeaderValue("jwt");
	    senderJwe.setAlgorithmHeaderValue(KeyManagementAlgorithmIdentifiers.DIRECT);	    
	    senderJwe.setEncryptionMethodHeaderParameter(ContentEncryptionAlgorithmIdentifiers.AES_128_CBC_HMAC_SHA_256);
	    
	    senderJwe.setPlaintext(jwt);
	    
	    senderJwe.setKey(jwk.getKey());
	    String compactSerialization = senderJwe.getCompactSerialization();
	    logger.info("Header: + " + senderJwe.getHeaders().getFullHeaderAsJsonString());
	    logger.info("Header: "  + senderJwe.getHeaders().getEncodedHeader());
	    logger.info("Payload: " + senderJwe.getPayload());
	   	   
	   return compactSerialization;
		
	}
	
	private boolean isValidJweHeader(String jwe) 
	{
		JsonWebEncryption receiverJwe = new JsonWebEncryption();
		
		try{
			receiverJwe.setCompactSerialization(jwe);
			return isValidJweHeader(receiverJwe);
		}
		catch(JoseException e ){
			return false;
		}
	}
	
	private boolean isValidJweHeader (JsonWebEncryption receiverJwe)
	{
	    
		return (receiverJwe.getEncryptionMethodHeaderParameter().equals(ContentEncryptionAlgorithmIdentifiers.AES_128_CBC_HMAC_SHA_256) &&
				receiverJwe.getAlgorithmHeaderValue().equals(KeyManagementAlgorithmIdentifiers.DIRECT) &&
				receiverJwe.getContentTypeHeaderValue().equals("jwt")		
				);
	}
	
	public String deocodeJwe(String jwe) throws JoseException, InvalidJwtException
	{
		if (!isValidJweHeader(jwe))
		{
			return null;
		}
	    JsonWebEncryption receiverJwe = new JsonWebEncryption();
	    // Set the compact serialization on new Json Web Encryption object
	    receiverJwe.setCompactSerialization(jwe);
	    // Symmetric encryption, like we are doing here, requires that both parties have the same key.
	    // The key will have had to have been securely exchanged out-of-band somehow.
	    receiverJwe.setKey(jwk.getKey());
	  
	    // Get the message that was encrypted in the JWE. This step performs the actual decryption steps.
	    return receiverJwe.getPlaintextString();
	     
	}
	
	private void loadRsaPEMFile(InputStream pemInputStream) throws IOException, JoseException
	{
//		CertificateFactory fact = CertificateFactory.getInstance("X.509");
////		FileInputStream is = new FileInputStream (args[0]);
//		X509Certificate cer = (X509Certificate) fact.generateCertificate(pemInputStream);
////		PublicKey key = cer.getPublicKey();
//		rsaJsonWebKey = (RsaJsonWebKey) PublicJsonWebKey.Factory.newPublicJwk(cer.getPublicKey();;
//		this.rsaJsonWebKey.setPrivateKey(cer.());
//		
//		
		BufferedReader br = new BufferedReader(new InputStreamReader(pemInputStream )); // new FileReader(pemKeyPath));
		Security.addProvider(new BouncyCastleProvider());
		PEMParser pp = new PEMParser(br);
		PEMKeyPair pemKeyPair = (PEMKeyPair) pp.readObject();
		KeyPair kp = new JcaPEMKeyConverter().getKeyPair(pemKeyPair);
		pp.close();
		rsaJsonWebKey = (RsaJsonWebKey) PublicJsonWebKey.Factory.newPublicJwk(kp.getPublic());
		this.rsaJsonWebKey.setPrivateKey(kp.getPrivate());
	}
}
