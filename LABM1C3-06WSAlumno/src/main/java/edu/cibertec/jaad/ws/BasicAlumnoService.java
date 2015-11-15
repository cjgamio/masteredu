package edu.cibertec.jaad.ws;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import edu.cibertec.jaad.db.AlumnoRepository;
import edu.cibertec.jaad.entities.Alumno;

@WebService(endpointInterface="edu.cibertec.jaad.ws.AlumnoService")
@HandlerChain(file="/handler-chain.xml")
public class BasicAlumnoService implements AlumnoService{

	@Override
	public Alumno retrieve(String numDoc) {
		// TODO Auto-generated method stub
		return AlumnoRepository.retrieveAlumnoByDoc(numDoc);
	}

	@Override
	public boolean addAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return AlumnoRepository.addAlumno(alumno);
	}
	
}
