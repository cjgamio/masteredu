
package edu.cibertec.jaad.jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "BasicCalculadoraService", targetNamespace = "http://jaxws.jaad.cibertec.edu/", wsdlLocation = "file:/D:/Cibertec/JAAD-2015-III/03_Laboratorios/Modulo01/LABM1C3-03WSGen/gen/calcws.wsdl")
public class BasicCalculadoraService
    extends Service
{

    private final static URL BASICCALCULADORASERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(edu.cibertec.jaad.jaxws.BasicCalculadoraService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = edu.cibertec.jaad.jaxws.BasicCalculadoraService.class.getResource(".");
            url = new URL(baseUrl, "file:/D:/Cibertec/JAAD-2015-III/03_Laboratorios/Modulo01/LABM1C3-03WSGen/gen/calcws.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'file:/D:/Cibertec/JAAD-2015-III/03_Laboratorios/Modulo01/LABM1C3-03WSGen/gen/calcws.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        BASICCALCULADORASERVICE_WSDL_LOCATION = url;
    }

    public BasicCalculadoraService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BasicCalculadoraService() {
        super(BASICCALCULADORASERVICE_WSDL_LOCATION, new QName("http://jaxws.jaad.cibertec.edu/", "BasicCalculadoraService"));
    }

    /**
     * 
     * @return
     *     returns Calculadora
     */
    @WebEndpoint(name = "BasicCalculadoraPort")
    public Calculadora getBasicCalculadoraPort() {
        return super.getPort(new QName("http://jaxws.jaad.cibertec.edu/", "BasicCalculadoraPort"), Calculadora.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculadora
     */
    @WebEndpoint(name = "BasicCalculadoraPort")
    public Calculadora getBasicCalculadoraPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jaxws.jaad.cibertec.edu/", "BasicCalculadoraPort"), Calculadora.class, features);
    }

}
