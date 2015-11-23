package com.futbol.cesar.cliente;

import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.futbol.cesar.ws.Futbolista;
import com.futbol.cesar.ws.FutbolistaSei;
import com.futbol.cesar.ws.FutbolistaSibService;

public class ClienteFutbolistaForServerJboss {

	private static final Logger LOG = LoggerFactory.getLogger(ClienteFutbolistaForServerJboss.class);
	
	public static void main(String[] arg)
	{
		try {
			
			URL url = new URL("http://localhost:8080/futbolserver/FutbolistaSib?wsdl");
			QName q = new QName("http://service.cesar.futbol.com/", "FutbolistaSibService");
			FutbolistaSibService f = new FutbolistaSibService(url, q);
			FutbolistaSei fsei = f.getPort(FutbolistaSei.class);
			
			List<Futbolista> lista = fsei.listarTodos();
			for (Futbolista futbolista : lista) {
				LOG.info("{}", futbolista.toString());
			}
			
		} catch (Exception e) {
			LOG.error("error: {}", e);
		}
	}
}
