package com.cesar.service;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.cesar.entity.Curso;
import com.cesar.repositorio.RepositorioCurso;

@Path("/ejecutar")
public class RespuestaCurso implements Cursos {

	private static final RepositorioCurso repo;
	static{
		repo = new RepositorioCurso();
	}
	
	@Override
	public List<Curso> listar() {		
		return repo.listarTodos();
	}

	@Override
	public Response crearCurso(Curso curso) {
		Response.ResponseBuilder rb;
		String resultado = repo.crearCurso(curso);
		rb = Response.status(Response.Status.OK).entity(resultado);
		return rb.build();
	}

	@Override
	public Response encontrarCurso(String codigo) {
		Response.ResponseBuilder rb;
		Curso curso = repo.encontrarCurso(codigo);
		rb = Response.status(Response.Status.OK).entity(curso);
		return rb.build();
	}

}
