package com.practica.cesar.service;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.practica.cesar.entity.Futbolista;
import com.practica.cesar.repositorio.RepositorioFutbolista;

@Path("/futbol")
public class FutbolistaSib implements FutbolistaSei {

	private static final RepositorioFutbolista repo;
	static {
		repo = new RepositorioFutbolista();
	}
	
	@Override
	public List<Futbolista> listarTodos() {
		return repo.listarTodo();
	}

	@Override
	public Response crearFutbolista(Futbolista futbolista) {
		Response.ResponseBuilder rb;
		rb = Response.status(Response.Status.OK).entity(repo.crearFutbolista(futbolista));
		return rb.build();
	}

	@Override
	public Response encontrarFutbolista(String code) {
		Response.ResponseBuilder rb;
		rb= Response.status(Response.Status.OK).entity(repo.encontrarFutbolista(code));
		return rb.build();
	}

}
