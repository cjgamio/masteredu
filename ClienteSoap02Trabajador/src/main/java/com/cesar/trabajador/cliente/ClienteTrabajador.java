package com.cesar.trabajador.cliente;

import java.net.URI;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cesar.ws.SibTrabajadorService;
import com.cesar.ws.Trabajador;
import com.cesar.ws.TrabajadorService;

public class ClienteTrabajador {

	private static final Logger LOG = LoggerFactory.getLogger(ClienteTrabajador.class);
	
	public static void main(String[] arg)
	{
		try {
			URL url = new URL("http://localhost:8080/trabajador02/SibTrabajador?wsdl");
			QName qname = new QName("http://ws.cesar.com/", "SibTrabajadorService");
			SibTrabajadorService sib = new SibTrabajadorService(url, qname);
			TrabajadorService service = sib.getPort(TrabajadorService.class);
			List<Trabajador> lista = service.listarTodo();
			LOG.info("LISTA------------------");
			for (Trabajador trabajador : lista) {
				LOG.info("{}",trabajador.toString());
			}
		} catch (Exception e) {
			LOG.error("erro {}", e);
		}
	}
}
