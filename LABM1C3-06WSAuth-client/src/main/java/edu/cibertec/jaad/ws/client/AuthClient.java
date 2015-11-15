package edu.cibertec.jaad.ws.client;

import java.net.URL;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.jaad.ws.Alumno;
import edu.cibertec.jaad.ws.AlumnoService;
import edu.cibertec.jaad.ws.BasicAlumnoServiceService;

public class AuthClient {
	private static final Logger LOG = LoggerFactory.getLogger(AuthClient.class);

	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:9090/alumno?wsdl");
			QName qname = new QName(
					"http://ws.jaad.cibertec.edu/", 
					"BasicAlumnoServiceService");
			BasicAlumnoServiceService service =
					new BasicAlumnoServiceService(url, qname);
			AlumnoService port = service.getPort(AlumnoService.class);
			Alumno alumno = new Alumno();
			alumno.setNumDoc("001");
			alumno.setCorreo("alumno@micorreo.com");
			alumno.setEdad(23);
			alumno.setNombre("Jose Lopez");
			GregorianCalendar cal = new GregorianCalendar();
			cal.set(1992, 10, 12);
			alumno.setFechaNacimiento(
					DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
			port.addAlumno(alumno);
			LOG.info("Alumno registrado");
			Alumno alumnoResult = port.retrieve("001");
			LOG.info("Alumno consultado=[{}]", alumno);
		} catch (Exception ex) {
			LOG.error("Error al invocar el alumno", ex);
		}
		
	}
}
