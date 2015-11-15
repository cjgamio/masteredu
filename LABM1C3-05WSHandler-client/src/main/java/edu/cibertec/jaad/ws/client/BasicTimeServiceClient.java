package edu.cibertec.jaad.ws.client;

import java.net.URL;

import javax.xml.namespace.QName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.jaad.ws.BasicTimeServiceService;
import edu.cibertec.jaad.ws.TimeService;

public class BasicTimeServiceClient {
	private static final Logger LOG =
			LoggerFactory.getLogger(BasicTimeServiceClient.class);
	public static void main(String[] args) {
		try {
			URL url = new URL("http://localhost:9876/timeService?wsdl");
			QName qname = new QName(
					"http://ws.jaad.cibertec.edu/", 
					"BasicTimeServiceService");
			BasicTimeServiceService service = new BasicTimeServiceService(url, qname);
			TimeService port = service.getBasicTimeServicePort();
			LOG.info("Time as String=[{}]", port.getTimeAsString());
		} catch (Exception ex) {
			LOG.error("Error al invocar el WS", ex);
		}
	}
}
