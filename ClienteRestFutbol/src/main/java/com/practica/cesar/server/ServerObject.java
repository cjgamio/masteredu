package com.practica.cesar.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.simple.container.SimpleServerFactory;

public class ServerObject {

	private static final Logger LOG = LoggerFactory.getLogger(ServerObject.class);
	
	public static void main(String[] arg)
	{
		try {
			SimpleServerFactory.create("http://localhost:8080");
			LOG.info("Se inicio server");
		} catch (Exception e) {
			LOG.error("{}", e);
		}
	}
}
