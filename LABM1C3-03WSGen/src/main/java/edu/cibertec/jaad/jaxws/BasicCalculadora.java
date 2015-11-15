package edu.cibertec.jaad.jaxws;

import javax.jws.WebService;

@WebService(endpointInterface= "edu.cibertec.jaad.jaxws.Calculadora")
public class BasicCalculadora implements Calculadora {

	@Override
	public Integer restar(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		return arg0 - arg1;
	}

	@Override
	public Integer sumar(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		return arg0 + arg1;
	}

}
