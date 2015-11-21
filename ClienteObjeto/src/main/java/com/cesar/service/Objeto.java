package com.cesar.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface Objeto {

	@GET
	@Path("/resultado/{argumento1}/{argumento2}")
	@Produces(MediaType.APPLICATION_XML)
	public Response getObj(@PathParam("argumento1") int arg1, @PathParam("argumento2") int arg2);
}
