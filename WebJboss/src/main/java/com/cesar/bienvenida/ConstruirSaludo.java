package com.cesar.bienvenida;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class ConstruirSaludo implements Saludo {

	@Override
	public Response greeting(String nombre, int dias) {
		Response.ResponseBuilder resp;		
		String resultado = "hola "+nombre+", hay "+dias+" dias.";
		resp = Response.status(Response.Status.OK).entity(resultado);
		return resp.build();
	}

	@Override
	public Response notice(String titular, int cantidad) {
		Response.ResponseBuilder resp;		
		String resultado = "Titular "+titular+", temas: "+cantidad;
		resp = Response.status(Response.Status.OK).entity(resultado);
		return resp.build();
	}

}
