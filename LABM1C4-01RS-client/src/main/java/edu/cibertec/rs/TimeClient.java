package edu.cibertec.rs;

import java.net.URI;
import java.security.Provider.Service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class TimeClient {
	private static final Logger LOG = LoggerFactory.getLogger(TimeClient.class);

	public static void main(String[] args) {
		// 1. Ubicar la URL base del servicio
		URI serviceLocation = UriBuilder.fromUri(
				"http://localhost:8080/LAB4M1C4-01").build();

		// 2. Crear el cliente
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);

		// 3. Obtenemos el servicio
		WebResource resource = client.resource(serviceLocation);

		// 4. Invocamos el servicio
		String result;
		result = resource
				.path("time")
				.path("text")
				.accept(MediaType.TEXT_PLAIN)
				.get(String.class);
		LOG.info("TEXT_PLAIN=[{}]", result);

		result = resource
				.path("time")
				.accept(MediaType.TEXT_XML)
				.get(String.class);
		LOG.info("TEXT_XML=[{}]", result);
		
		result = resource
				.path("time")
				.accept(MediaType.TEXT_HTML)
				.accept(MediaType.TEXT_XML)
				.get(String.class);
		LOG.info("TEXT_HTML=[{}]", result);
	}
}
