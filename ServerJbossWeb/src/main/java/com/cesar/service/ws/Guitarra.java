package com.cesar.service.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface Guitarra {

	@GET
	@Path("/nota/{acorde1}/{acorde2}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response playlist(@PathParam("acorde1") Integer arg1, @PathParam("acorde2") Integer arg2);
	
	
	@GET
	@Path("/nota")
	public Response conampersand(@QueryParam("acorde1") Integer arg3, @QueryParam("acorde2") Integer arg4);
}
