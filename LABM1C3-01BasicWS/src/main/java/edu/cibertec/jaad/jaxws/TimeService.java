package edu.cibertec.jaad.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public interface TimeService {

	@WebMethod
	String getTimeAsString();
	
	@WebMethod
	Long getTimeAsElapsed();
}
