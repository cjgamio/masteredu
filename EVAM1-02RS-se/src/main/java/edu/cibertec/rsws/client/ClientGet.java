package edu.cibertec.rsws.client;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;


public class ClientGet {
	private static final Logger LOG = LoggerFactory.getLogger(ClientGet.class);
	public static void main(String[] args) {
		//URI location = UriBuilder.fromUri("http://localhost:9090/calcrs")
		URI location = UriBuilder.fromUri("http://localhost:8080/calcrs")
				.build();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(location);
		
		String result = resource
				.path("suma").path("12").path("2")
				.get(String.class);
		LOG.info( result);
		
		String resta = resource
				.path("resta").queryParam("a", "25")
				.queryParam("b", "5")
				.get(String.class);
		LOG.info( resta);
		
		
		
		
		
			
	}

}
