package com.cesar.repositorio;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cesar.entity.Trabajador;

public class RepositorioTrabajador {

	private static final Map<String, Trabajador> mapa;
	static{
		Calendar fecha = Calendar.getInstance();
		fecha.add(Calendar.YEAR, -2);
		mapa = new HashMap<String, Trabajador>();
		Trabajador t1 =  new Trabajador("c1", "cesar", "gamio", 24, "programador java", fecha.getTime());
		fecha = Calendar.getInstance();
		fecha.add(Calendar.YEAR, -20);
		Trabajador t2 =  new Trabajador("c2", "augu", "gam", 44, "manager senior", fecha.getTime());
		fecha = Calendar.getInstance();
		fecha.add(Calendar.YEAR, -1);
		Trabajador t3 =  new Trabajador("c3", "fio", "fioape", 14, "doctor", fecha.getTime());
		fecha = Calendar.getInstance();
		fecha.add(Calendar.YEAR, -18);
		Trabajador t4 =  new Trabajador("c4", "rosa", "sanchez", 34, "gerente", fecha.getTime());
		mapa.put(t1.getCodigo(), t1);
		mapa.put(t2.getCodigo(), t2);
		mapa.put(t3.getCodigo(), t3);
		mapa.put(t4.getCodigo(), t4);
	}
	
	public List<Trabajador> listarTodos()
	{
		return new ArrayList<Trabajador>(mapa.values());
	}
	
	public Trabajador encontrarTrabajador(String codigo)
	{
		return mapa.get(codigo);
	}
	
	public String crearTrabajador(Trabajador trabajador)
	{
		mapa.put(trabajador.getCodigo(), trabajador);
		return "Se guardo con exito: "+trabajador.toString();
	}
}
