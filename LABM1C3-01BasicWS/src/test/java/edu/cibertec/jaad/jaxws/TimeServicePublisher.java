package edu.cibertec.jaad.jaxws;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeServicePublisher {
	
	private static final Logger LOG = LoggerFactory.getLogger(TimeServicePublisher.class);
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9090/timeservice", new BasicTimeService());
		LOG.info("En ejecución ...");
	}
}
