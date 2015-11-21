package com.cesar.cliente;


import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;


public class Cliente {

	private static final Logger LOG = LoggerFactory.getLogger(Cliente.class);
	public static void main(String[] arg)
	{
		URI location = UriBuilder.fromUri("http://localhost:8080/guitar").build();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource web = client.resource(location);
		
		String result = web.path("nota").path("2").path("2").accept(MediaType.TEXT_PLAIN).get(String.class);
		LOG.info("Resultado 1 {}",result);
		
		result = web.path("nota").queryParam("acorde1", "4").queryParam("acorde2", "7").accept(MediaType.TEXT_PLAIN).get(String.class);
		LOG.info("Resultado 2 {}",result);
	}
}
