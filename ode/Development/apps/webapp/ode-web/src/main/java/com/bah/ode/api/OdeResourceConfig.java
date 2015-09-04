package com.bah.ode.api;

import javax.inject.Singleton;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.bah.ode.api.providers.LiferayWSFactory;
import com.bah.ode.api.providers.TokeRepositoryFactory;
import com.bah.ode.api.providers.TokenAuthenticationServiceFactory;
import com.bah.ode.api.sec.TokenAuthenticationService;
import com.bah.ode.api.sec.TokenRepository;
import com.bah.ode.api.sec.filters.LiferayWSClient;
import com.bah.ode.context.AppContext;

public class OdeResourceConfig extends ResourceConfig {

	public OdeResourceConfig() {
		register(new AbstractBinder() {
	        @Override
	        protected void configure() {
	            bindFactory(LiferayWSFactory.class).to(LiferayWSClient.class).in(Singleton.class);
	            bindFactory(TokenAuthenticationServiceFactory.class).to(TokenAuthenticationService.class).in(Singleton.class);
	            bindFactory(TokeRepositoryFactory.class).to(TokenRepository.class);
	        }
		});

	}
}
 
 
 