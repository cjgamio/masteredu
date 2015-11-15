package edu.cibertec.rs.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.simple.container.SimpleServerFactory;

public class ProgramaServer {
	private static final Logger LOG = LoggerFactory.getLogger(ProgramaServer.class);
	public static void main(String[] args) {
		try{
			SimpleServerFactory.create("http://localhost:9090");
			LOG.info("Servidor iniciado!!");
		}catch(Exception ex){
			LOG.error("Error al iniciar el servidor", ex);
		}
	}
}
