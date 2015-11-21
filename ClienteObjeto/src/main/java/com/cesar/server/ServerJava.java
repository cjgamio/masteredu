package com.cesar.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.simple.container.SimpleServerFactory;


public class ServerJava {

	public static final Logger LOG = LoggerFactory.getLogger(ServerJava.class);
	public static void main(String[] args) {
		try {
			SimpleServerFactory.create("http://localhost:8080");
			LOG.info("Servidor Iniciado!!!");
		} catch (Exception ex) {
			LOG.error("Error al inicar el servidor", ex);
		}

	}
}
