package com.cesar.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.cesar.entity.Curso;

public interface Cursos {

	@GET
	@Path("/listar")
	@Produces({MediaType.APPLICATION_XML, MediaType.TEXT_XML})
	public List<Curso> listar();
	
	@POST
	@Path("/crear")
	@Consumes(MediaType.TEXT_XML)
	public Response crearCurso(Curso curso);
	
	@GET
	@Path("/encontrar/{codigo}")	
	public Response encontrarCurso(@PathParam("codigo") String codigo);
}
