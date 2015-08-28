package com.bah.ode.server;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.bah.ode.context.AppContext;

public class InitServeletListener  implements ServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext servletContext = sce.getServletContext();

		AppContext appContext = AppContext.getInstance();
		appContext.init(servletContext);	
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		AppContext.getInstance().shutDown();
		
	}	   
}