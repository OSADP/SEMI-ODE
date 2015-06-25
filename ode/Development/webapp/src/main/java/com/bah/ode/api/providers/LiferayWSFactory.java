package com.bah.ode.api.providers;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;

import org.glassfish.hk2.api.Factory;

import com.bah.ode.api.sec.filters.LiferayWSClient;
import com.bah.ode.context.AppContext;

/**
 * 
 *  
 *
 */
public class LiferayWSFactory implements Factory<LiferayWSClient> {

	@Context
	private ServletContext context;
	
	@Override
	public LiferayWSClient provide() {
	
		return new LiferayWSClient(context.getInitParameter(AppContext.LIFERAY_WS_SERVER_HOST), 
				 				   context.getInitParameter(AppContext.LIFERAY_WS_COMPANY_ID));
	}

	@Override
	public void dispose(LiferayWSClient instance) {
		// TODO Auto-generated method stub
		
	}
	
 
    
	
	
}
