package com.practica.cesar;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.practica.cesar.entity.Futbolista;
import com.practica.cesar.repository.RepositoryFutbolista;

@Path("/futbolin")
public class FutbolistaSib implements FutbolistaSei {

	private static final RepositoryFutbolista repo;
	static{
		repo = new RepositoryFutbolista();
	}
	
	@Override
	public List<Futbolista> listarTodos() {
		return repo.listarTodos();
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
		rb = Response.status(Response.Status.OK).entity(repo.encontrarFutbolista(code));
		return rb.build();
	}

}
