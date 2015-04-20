package com.bah.ode.server;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

import com.bah.ode.context.AppContext;

public class DataServer extends HttpServlet {
	/**
	 * 
	 */
   private static final long serialVersionUID = 1L;
	
   @Override
   public void init() {

      ServletContext servletContext = getServletContext();

      AppContext appContext = AppContext.getInstance();
      appContext.init(servletContext);
   }

}
