package com.futbol.cesar.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.futbol.cesar.entity.Futbolista;

@WebService
public interface FutbolistaSei {

	@WebMethod
	public List<Futbolista> listarTodos();
	
	@WebMethod
	public Futbolista encontrarFutbolista(String codigo);
	
	@WebMethod
	public String crearFutbolista(Futbolista futbolista);
}
