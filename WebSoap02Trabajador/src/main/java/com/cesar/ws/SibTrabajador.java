package com.cesar.ws;

import java.util.List;

import javax.jws.WebService;

import com.cesar.entity.Trabajador;
import com.cesar.repositorio.RepositorioTrabajador;

@WebService(endpointInterface="com.cesar.ws.TrabajadorService")
public class SibTrabajador implements TrabajadorService {

	private static final RepositorioTrabajador repo;
	
	static{
		repo= new RepositorioTrabajador();
	}
	
	@Override
	public List<Trabajador> listarTodo() {
		return repo.listarTodos();
	}

	@Override
	public Trabajador encontrarTrabajador(String codigo) {
		return repo.encontrarTrabajador(codigo);
	}

	@Override
	public String crearTrabajador(Trabajador trabajador) {
		return repo.crearTrabajador(trabajador);
	}

}
