package com.practica.cesar;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.practica.cesar.entity.Futbolista;

public interface FutbolistaSei {

	@GET
	@Path("/listar")
	public List<Futbolista> listarTodos();
	
	@POST
	@Path("/crear")
	public Response crearFutbolista(Futbolista futbolista);
	
	@GET
	@Path("/encontrar/{codigo}")
	@Produces(MediaType.TEXT_XML)
	public Response encontrarFutbolista(@PathParam("codigo") String code);
}
