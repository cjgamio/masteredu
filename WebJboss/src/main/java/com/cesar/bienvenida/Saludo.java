package com.cesar.bienvenida;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface Saludo {

	@GET
	@Path("/say/{name}/{dias}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response greeting(@PathParam("name") String nombre, @PathParam("dias") int dias);
	
	@GET
	@Path("/say")
	@Produces(MediaType.TEXT_PLAIN)
	public Response notice(@QueryParam("titular") String titular, @QueryParam("cantidad") int cantidad);
}
