package edu.cibertec.rs;

import java.net.URI;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import edu.cibertec.rs.entity.Programa;

public class ClientePost {
	private static final Logger LOG = LoggerFactory.getLogger(ClientePost.class);
	public static void main(String[] args) {
		URI location = UriBuilder
				.fromUri("http://localhost:9090/programa")
				.build();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(location);
		
		Programa programa = new Programa("04", "Java Web", 45.0,
				new GregorianCalendar(2017,1,1).getTime(),
				new GregorianCalendar(2017,7,1).getTime());
		
		ClientResponse response = resource
				.path("create")
				.type(MediaType.TEXT_XML)
				.post(ClientResponse.class, programa);
		LOG.info("HTTP status=[{}]", response.getStatus());
		LOG.info("HTTP response=[{}]", response.getClientResponseStatus());
		Iterator<List<String>> iterator = response.getHeaders().values().iterator();
		while(iterator.hasNext()){
			LOG.info("HTTP Header:[{}]", iterator.next());
		}
	}
}
