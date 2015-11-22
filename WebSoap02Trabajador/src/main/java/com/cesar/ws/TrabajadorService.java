package com.cesar.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.cesar.entity.Trabajador;

@WebService
public interface TrabajadorService {

	@WebMethod
	public List<Trabajador> listarTodo();
	
	@WebMethod
	public Trabajador encontrarTrabajador(String codigo);
	
	@WebMethod
	public String crearTrabajador(Trabajador trabajador);
	
}
