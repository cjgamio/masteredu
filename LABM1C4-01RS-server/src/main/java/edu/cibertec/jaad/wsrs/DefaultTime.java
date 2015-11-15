package edu.cibertec.jaad.wsrs;

import java.util.Date;

import javax.ws.rs.Path;

@Path("/time")
public class DefaultTime implements Time{

	@Override
	public String getTimeText() {
		return new Date().toString();
	}
	
	@Override
	public String getTimeHTML() {
		String resultado =
				"<html>" +
				"<body><h1>" + new Date().toString() + "</h1></body>" +
				"</html>"; 
		return resultado;
	}

	@Override
	public String getTimeXML() {
		String resultado =
				"<?xml version=\"1.0\"?>" +
			    "<time>" + new Date().toString() + "</time>";
		return resultado;
	}
	
}
