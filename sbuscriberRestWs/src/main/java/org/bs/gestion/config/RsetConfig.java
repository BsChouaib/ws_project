package org.bs.gestion.config;

import org.bs.gestion.service.SubscriberService;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class RsetConfig extends ResourceConfig{

	public RsetConfig(Class<?>...classes ) 
	{
		register(SubscriberService.class);
		register(CorsFilter.class);
	}
	
	
}
