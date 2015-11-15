
package edu.cibertec.jaad.ws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TimeService", targetNamespace = "http://ws.jaad.cibertec.edu/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TimeService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTimeAsString", targetNamespace = "http://ws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.GetTimeAsString")
    @ResponseWrapper(localName = "getTimeAsStringResponse", targetNamespace = "http://ws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.GetTimeAsStringResponse")
    public String getTimeAsString();

    /**
     * 
     * @return
     *     returns long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTimeAsElapsed", targetNamespace = "http://ws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.GetTimeAsElapsed")
    @ResponseWrapper(localName = "getTimeAsElapsedResponse", targetNamespace = "http://ws.jaad.cibertec.edu/", className = "edu.cibertec.jaad.ws.GetTimeAsElapsedResponse")
    public long getTimeAsElapsed();

}