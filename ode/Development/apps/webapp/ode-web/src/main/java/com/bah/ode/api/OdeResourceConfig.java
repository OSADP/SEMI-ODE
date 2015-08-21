package com.bah.ode.api;

import javax.inject.Singleton;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.bah.ode.api.providers.LiferayWSFactory;
import com.bah.ode.api.sec.filters.LiferayWSClient;

public class OdeResourceConfig extends ResourceConfig {

	public OdeResourceConfig() {
		register(new AbstractBinder() {
	        @Override
	        protected void configure() {
	            bindFactory(LiferayWSFactory.class).to(LiferayWSClient.class).in(Singleton.class);
	        }
		});
	}
}
 
 
 