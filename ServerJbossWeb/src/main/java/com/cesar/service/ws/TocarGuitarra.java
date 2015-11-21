package com.cesar.service.ws;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class TocarGuitarra implements Guitarra {

	@Override
	public Response playlist(Integer arg1, Integer arg2) {
		Response.ResponseBuilder rb;
		rb = Response.status(Response.Status.OK).entity("Resultado: "+(arg1+arg2));
		return rb.build();
	}

	@Override
	public Response conampersand(Integer arg3, Integer arg4) {
		Response.ResponseBuilder rb;
		rb = Response.status(Response.Status.OK).entity("Resultado otro: "+(arg3+arg4));
		return rb.build();
	}

}
