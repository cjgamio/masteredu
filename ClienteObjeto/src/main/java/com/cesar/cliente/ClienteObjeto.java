package com.cesar.cliente;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cesar.entity.ObjetoResultado;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class ClienteObjeto {

	private static final Logger LOG = LoggerFactory.getLogger(ClienteObjeto.class);
	public static void main(String[] arg)
	{
		URI location = UriBuilder.fromUri("http://localhost:8080/callobj").build();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource web = client.resource(location);
		
		ObjetoResultado or = web.path("resultado").path("3").path("5").accept(MediaType.APPLICATION_XML)
				.get(ObjetoResultado.class);
		
		LOG.info("Veamos lo que trae", or);
	}
}
