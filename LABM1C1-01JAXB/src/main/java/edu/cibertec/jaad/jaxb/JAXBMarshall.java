package edu.cibertec.jaad.jaxb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JAXBMarshall {

	private static Logger LOG =
			LoggerFactory.getLogger(JAXBMarshall.class);
	public static void main(String[] args) {
		Profesor profesor = new Profesor();
		profesor.setCodigo(1234);
		profesor.setNombre("Juan");
		profesor.setApellido("Perez");
		profesor.setFechaIngreso(new GregorianCalendar(2015,10,5).getTime());
		
		try {
			File profesorXML = new File("profesor.xml");
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			JAXBContext context = JAXBContext.newInstance(Profesor.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(profesor, profesorXML);
			marshaller.marshal(profesor, baos);
			
			LOG.info("Salida:\n"+new String(baos.toByteArray()));
		} catch (Exception e) {
			LOG.error("Error al generar el archivo",e);
		}
	}
}
