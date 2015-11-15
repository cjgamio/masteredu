package edu.cibertec.jaad.db;

import java.util.HashMap;
import java.util.Map;

import edu.cibertec.jaad.entities.Alumno;

public class AlumnoRepository {
	private static Map<String, Alumno> alumnos = 
			new HashMap<String, Alumno>();
	
	public static boolean addAlumno(Alumno alumno){
		return true;
		
	}
	
	public static Alumno retrieveAlumnoByDoc(String numDoc){
		return alumnos.get(numDoc);
		
	}
}
