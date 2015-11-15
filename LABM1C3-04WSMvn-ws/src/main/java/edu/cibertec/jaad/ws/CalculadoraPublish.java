package edu.cibertec.jaad.ws;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculadoraPublish {
	private static final Logger LOG = LoggerFactory.getLogger(CalculadoraPublish.class);
	public static void main(String[] args) {
		Endpoint.publish(
				"http://localhost:9090/calcws", 
				new BasicCalculadora());
		LOG.info("Servicio publicado");
	}
}
