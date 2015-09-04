package com.bah.ode.api.providers;

import org.glassfish.hk2.api.Factory;

import com.bah.ode.api.sec.TokenRepository;


public class TokeRepositoryFactory implements Factory<TokenRepository> { 

	@Override
	public TokenRepository provide() {		
		
		return TokenRepository.getInstance();
	}

	@Override
	public void dispose(TokenRepository instance) {
		// TODO Auto-generated method stub
		
	}
}