package edu.cibertec.rs.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.rs.entity.Programa;

@Path("/programa")
public class BasicProgramaService implements ProgramaService{
	private static final Logger LOG = LoggerFactory.getLogger(BasicProgramaService.class);
	private static Map<String, Programa> programas;
	static {
		programas = new HashMap<String, Programa>();
		programas.put("01", new Programa("01", "Java Advanced", 50.0,
				new GregorianCalendar(2016, 6, 1).getTime(),
				new GregorianCalendar(2016, 10, 1).getTime()));
		programas.put("02", new Programa("01", "Java Architect Appl. Dev", 50.0,
				new GregorianCalendar(2016, 2, 1).getTime(),
				new GregorianCalendar(2016, 12, 1).getTime()));
	}
	@Override
	public List<Programa> getProgramas() {
		Collection<Programa> collProgramas = programas.values();
		List<Programa> listaProgramas = new ArrayList<Programa>();
		for (Iterator<Programa> iterator = collProgramas.iterator(); 
				iterator.hasNext();) {
			Programa programa = iterator.next();
			listaProgramas.add(programa);
		}
		return listaProgramas;
	}
	
	@Override
	public Response getPrograma(String id) {
		Programa programa = programas.get(id);
		Response.ResponseBuilder rb;
		if(programa != null){
			rb = Response.status(Response.Status.OK).entity(programa);
		}else{
			rb = Response.status(Response.Status.NOT_FOUND);
		}
		return rb.build();
	}
	
	@Override
	public Response createPrograma(Programa programa) {
		programas.put(programa.getId(), programa);
		return Response.created(URI.create(programa.getId())).build();
	}
	
	
}
