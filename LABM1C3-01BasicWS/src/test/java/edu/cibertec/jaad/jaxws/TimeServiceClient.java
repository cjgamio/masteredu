package edu.cibertec.jaad.jaxws;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeServiceClient {

	private static final Logger LOG = LoggerFactory.getLogger(TimeServiceClient.class);
	public static void main(String[] args) throws MalformedURLException {
		URL url;
		//Esto hace que use el UDDI es decir, que realice dos viajes
		url = new URL("http://localhost:9090/timeservice?wsdl");
		//Para que viaje una vez y el archivo estara al nivel del pom.xml
		//url = new File("timeservice.wsdl").toURI().toURL();
		//Esto es para que el archivo wsdl donde debe estar a la altura del src main resources
		//url= TimeServiceClient.class.getClassLoader().getResource("timeservice.wsdl");
		QName qName= new QName(
				"http://jaxws.jaad.cibertec.edu/",
				"BasicTimeServiceService");
		Service service = Service.create(url, qName);
		TimeService servicePort= service.getPort(TimeService.class);
		
		setupIp(servicePort);
		
		String time= servicePort.getTimeAsString();
		LOG.info("Time String=["+time+"]");
		Long timelong=servicePort.getTimeAsElapsed();
		LOG.info("Time Long=["+timelong+"]");
	}
	/**
	 * usar comando netstat -noa | fin "9090"
	 * para ver el listener del puerto
	 */
	
	private static void setupIp(TimeService port){
		BindingProvider provider = (BindingProvider)port;
		Map<String, Object> map = provider.getRequestContext();
		map.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "http://localhost:9090/timeservice");
	}
}
