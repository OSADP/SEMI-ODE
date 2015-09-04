package com.bah.ode.api.providers;

import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;

import org.glassfish.hk2.api.Factory;

import com.bah.ode.api.sec.TokenAuthenticationService;
import com.bah.ode.context.AppContext;

public class TokenAuthenticationServiceFactory implements Factory<TokenAuthenticationService> { 

	@Context
	private ServletContext context;
	
	@Override
	public TokenAuthenticationService provide() {		
		
		return  new TokenAuthenticationService(context.getInitParameter(AppContext.TOKEN_KEY_RSA_PEM));
	}
	@Override
	public void dispose(TokenAuthenticationService instance) {
		// TODO Auto-generated method stub
		
	}
}
