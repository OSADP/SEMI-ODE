package com.bah.ode.api.sec;

import javax.servlet.ServletContext;
import javax.ws.rs.container.ContainerRequestContext;

import mockit.Mocked;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.bah.ode.api.sec.filters.LiferayAuthenticationFilter;
import com.bah.ode.api.sec.filters.LiferayWSClient;

@RunWith(JMockit.class)
public class AuthenticationFilterTest {
	
	// Mock 
	@Mocked 
	LiferayWSClient client; 
	
	@Mocked 
	ContainerRequestContext reqeustContext;
	
	
	// Test Response with no credentials provided 
	@Test
	public void missingAuthenticationCredentials()
	{
//		LiferayAuthenticationFilter filter = new LiferayAuthenticationFilter();
//		
//		
//		filter.filter(requestContext);
//		
	}
	
	// Test with invalid credentials 
	@Test
	public void invliadAuthenticationCredentials()
	{
		
	}
	
	// 
	@Test
	public void validAuthenticationCredentials()
	{
		
	}
	
	
	
	
	
	
}
