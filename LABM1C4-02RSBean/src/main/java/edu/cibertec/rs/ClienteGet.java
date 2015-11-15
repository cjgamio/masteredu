package edu.cibertec.rs;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import edu.cibertec.rs.entity.Programa;

public class ClienteGet {
	private static final Logger LOG = LoggerFactory.getLogger(ClienteGet.class);
	public static void main(String[] args) {
		URI location = UriBuilder
				.fromUri("http://localhost:9090/programa")
				.build();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(location);
		
		String result = resource
				.path("list")
				.accept(MediaType.APPLICATION_JSON)
				.get(String.class);
		LOG.info("TEXT=[{}]", result);
		
		List<Programa> lista = resource
				.path("list")
				.accept(MediaType.APPLICATION_JSON)
				.get(new GenericType<List<Programa>>(){});
		LOG.info("LIST=[{}]", lista);
	}
}
