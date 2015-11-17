package edu.cibertec.rsws.service;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/calcrs")
public class CalculadoraService implements Calculadora{

	

	@Override
	public Response getSuma(Integer a,Integer b) {
		Response.ResponseBuilder resp;
		
		Integer resultado = a+b;
		resp = Response.status(Response.Status.OK).entity(resultado+"");
		return resp.build();
	}

	@Override
	public Response getResta(Integer a, Integer b) {
		Response.ResponseBuilder resp;
		Integer resul = a-b;
		resp = Response.status(Response.Status.OK).entity(resul+"");
		return resp.build();
	}
	
	

}
