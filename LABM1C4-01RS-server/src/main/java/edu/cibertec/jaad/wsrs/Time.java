package edu.cibertec.jaad.wsrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/time")
public interface Time {
	@Path("/text")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	String getTimeText();
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	String getTimeHTML();
	
	@GET
	@Produces(MediaType.TEXT_XML)
	String getTimeXML();
}
