package com.practica.cesar.cliente;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.practica.cesar.entity.Futbolista;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class ClienteFutbolForServerJboss {
	private static final Logger LOG = LoggerFactory.getLogger(ClienteFutbolForServerJboss.class);
	
	public static void main (String[] arg)
	{
		URI location = UriBuilder.fromUri("http://localhost:8080").build();
		ClientConfig conf = new DefaultClientConfig();
		Client client = Client.create(conf);
		WebResource web = client.resource(location);
		List<Futbolista> lista = web
				.path("futbolserver")
				.path("futbolin")
				.path("listar")
				.accept(MediaType.TEXT_XML)
				.get(new GenericType<List<Futbolista>>(){});
		LOG.info("LISTAR-------------");
		for (Futbolista futbolista : lista) {
			LOG.info("{}",futbolista.toString());
		}
		
		Futbolista f1 = web
				.path("futbolserver")
				.path("futbolin")
				.path("encontrar")
				.path("f3")
				.accept(MediaType.TEXT_XML)
				.get(Futbolista.class);
		LOG.info("Se encontro: {}", f1.toString());
	
		Futbolista f2 = new Futbolista("f5", "new player", 27, new Date());
		String result = web
				.path("futbolserver")
				.path("futbolin")
				.path("crear")
				.type(MediaType.TEXT_XML)
				.post(String.class, f2);
		LOG.info("{}",result);
	}
}
