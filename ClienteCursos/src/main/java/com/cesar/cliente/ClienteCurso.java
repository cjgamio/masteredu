package com.cesar.cliente;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cesar.entity.Curso;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class ClienteCurso {

	private static final Logger LOG = LoggerFactory.getLogger(ClienteCurso.class);
	
	public static void main(String[] arg){
		URI location = UriBuilder.fromUri("http://localhost:8080/curso/ejecutar").build();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource web = client.resource(location);
		
		List<Curso> lista = web.path("listar").accept(MediaType.TEXT_XML).get(new GenericType<List<Curso>>(){});
		for (Curso curso : lista) {
			LOG.info("Curso {}",curso);
		}
		
		Curso c = new Curso("codigo4", "Java 4", "Arquitecto", 30, true);
		String result = web.path("crear").type(MediaType.TEXT_XML).post(String.class, c);
		LOG.info("Curso creado: {}",result);
		
		Curso encontrado = web.path("encontrar").path("codigo2").accept(MediaType.TEXT_XML).get(Curso.class);
		LOG.info("Se encontro {}",encontrado);
		
		List<Curso> lista2 = web.path("listar").accept(MediaType.TEXT_XML).get(new GenericType<List<Curso>>(){});
		LOG.info("LISTA----------------");
		for (Curso curso : lista2) {
			LOG.info("{}",curso);
		}
	}
}
