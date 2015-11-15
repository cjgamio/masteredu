package edu.cibertec.jaad.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import edu.cibertec.jaad.entities.Alumno;

@WebService
public interface AlumnoService {
	@WebMethod
	Alumno retrieve(String numDoc);
	
	@WebMethod
	boolean addAlumno(Alumno alumno);
}
