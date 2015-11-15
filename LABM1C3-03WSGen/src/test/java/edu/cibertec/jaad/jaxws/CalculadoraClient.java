package edu.cibertec.jaad.jaxws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculadoraClient {
	private static final Logger LOG = LoggerFactory.getLogger(CalculadoraClient.class);
	
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9090/calcws?wsdl");
		QName qname = new QName(
				"http://jaxws.jaad.cibertec.edu/", 
				"BasicCalculadoraService");
		BasicCalculadoraService service = new BasicCalculadoraService(url, qname);
		Calculadora port = service.getBasicCalculadoraPort();
		int result = port.sumar(5, 7);
		LOG.info("Resultado = " + result);
	}
}
