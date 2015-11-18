package com.cesar.cliente;

import java.net.URI;

import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;


public class Cliente {
	private static final Logger LOG = LoggerFactory.getLogger(Cliente.class);
	public static void main(String[] args) {
		//URI location = UriBuilder.fromUri("http://localhost:9090/calcrs")
		URI location = UriBuilder.fromUri("http://localhost:8080/saludar")
				.build();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(location);
		
		String result = resource
				.path("say").path("junior").path("2")
				.get(String.class);
		LOG.info("result {}", result);
		
		String resta = resource
				.path("say").queryParam("titular", "master")
				.queryParam("cantidad", "5")
				.get(String.class);
		LOG.info("resultotrp {}", resta);
		
		
		
		
		
			
	}

}
