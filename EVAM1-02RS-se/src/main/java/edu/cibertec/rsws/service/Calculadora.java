package edu.cibertec.rsws.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public interface Calculadora {
	
		
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/suma/{a}/{b}")
	Response getSuma(
			@PathParam("a")			
			Integer a, @PathParam("b")Integer b);
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/resta")
	Response getResta(
			@QueryParam("a")		
			Integer a, @QueryParam("b")Integer b);
	
	
	
}
