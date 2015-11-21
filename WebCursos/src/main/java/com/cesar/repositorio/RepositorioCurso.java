package com.cesar.repositorio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javassist.CodeConverter.ArrayAccessReplacementMethodNames;

import com.cesar.entity.Curso;

public class RepositorioCurso {

	private static final Map<String, Curso> mapa;
	static{
		mapa = new HashMap<String, Curso>();
		Curso c1 = new Curso("codigo1", "Java 1", "Basico", 18, true);
		Curso c2 = new Curso("codigo2", "Java 2", "Intermedio", 23, false);
		Curso c3 = new Curso("codigo3", "Java 3", "Avanzado", 25, true);
		mapa.put(c1.getCodigoCurso(), c1);
		mapa.put(c2.getCodigoCurso(), c2);
		mapa.put(c3.getCodigoCurso(), c3);
	}
	
	public List<Curso> listarTodos()
	{
		List<Curso> lista = new ArrayList<Curso>(mapa.values());
		return lista;
	}
	
	public String crearCurso(Curso curso)
	{
		String result ="Guardado exitoso, ";
		mapa.put(curso.getCodigoCurso(), curso);
		return result+curso;
	}
	
	public Curso encontrarCurso(String codigo)
	{
		return mapa.get(codigo);
	}
}
