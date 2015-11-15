package edu.cibertec.jaad.json;

import java.io.File;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSONMarshall {
	private static final Logger LOG = LoggerFactory.getLogger(JSONMarshall.class);
	
	public static void main(String[] args) {
		Programa programa = new Programa();
		programa.setNombre("Java Architec App Developer");
		programa.setCodigo(1234);
		
		List<String> modulos = new ArrayList<String>();
		modulos.add("Fundamentos");
		modulos.add("Arquitectura web");
		
		programa.setModulos(modulos);
		programa.setFechaInicio(new GregorianCalendar(2015,9,26).getTime());
		programa.setFechaFin(new GregorianCalendar(2016,3,3).getTime());
		
		/**
		 * No necesita ninguna anotacion en la clase Programa para generar el .json
		 * Si usamos alguna anotacion, sera para ordenar, cosas de presentación
		 */
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.configure(Feature.INDENT_OUTPUT, true);
			mapper.writeValue(new File("programa.json"), programa);
			
			LOG.info("\n "+mapper.writeValueAsString(programa));
		} catch (Exception e) {
			LOG.error("Error ",e);
		}
	}
}
