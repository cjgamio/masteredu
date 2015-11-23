package com.practica.cesar.repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.practica.cesar.entity.Futbolista;

public class RepositoryFutbolista {

	private static final Map<String, Futbolista> mapa;
	static{
		mapa = new HashMap<String, Futbolista>();
		Calendar fecha = Calendar.getInstance();
		fecha.add(Calendar.YEAR, -10);
		Futbolista f1 = new Futbolista("f1", "guerrero", 30, fecha.getTime());
		fecha.add(Calendar.YEAR, 5);
		Futbolista f2 = new Futbolista("f2", "farfan", 29, fecha.getTime());
		fecha.add(Calendar.YEAR, -10);
		Futbolista f3 = new Futbolista("f3", "pizarro", 31, fecha.getTime());
		fecha.add(Calendar.YEAR, 7);
		Futbolista f4 = new Futbolista("f4", "cuevita", 28, fecha.getTime());
		mapa.put(f1.getCodigo(), f1);
		mapa.put(f2.getCodigo(), f2);
		mapa.put(f3.getCodigo(), f3);
		mapa.put(f4.getCodigo(), f4);
	}
	
	public List<Futbolista> listarTodos()
	{
		return new ArrayList<Futbolista>(mapa.values());
	}
	
	public Futbolista encontrarFutbolista(String codigo)
	{
		return mapa.get(codigo);
	}
	
	public String crearFutbolista(Futbolista futbolista)
	{
		mapa.put(futbolista.getCodigo(), futbolista);
		return "Se guardo con exito, "+futbolista.toString();
	}
}
