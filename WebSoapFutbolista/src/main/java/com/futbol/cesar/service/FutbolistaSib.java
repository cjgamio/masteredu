package com.futbol.cesar.service;

import java.util.List;

import javax.jws.WebService;

import com.futbol.cesar.entity.Futbolista;
import com.futbol.cesar.repository.RepositoryFutbolista;

@WebService(endpointInterface="com.futbol.cesar.service.FutbolistaSei")
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
	public Futbolista encontrarFutbolista(String codigo) {
		return repo.encontrarFutbolista(codigo);
	}

	@Override
	public String crearFutbolista(Futbolista futbolista) {
		return repo.crearFutbolista(futbolista);
	}

}
