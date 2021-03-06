
package com.futbol.cesar.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.1
 * 
 */
@WebService(name = "FutbolistaSei", targetNamespace = "http://service.cesar.futbol.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FutbolistaSei {


    /**
     * 
     * @return
     *     returns java.util.List<com.futbol.cesar.ws.Futbolista>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarTodos", targetNamespace = "http://service.cesar.futbol.com/", className = "com.futbol.cesar.ws.ListarTodos")
    @ResponseWrapper(localName = "listarTodosResponse", targetNamespace = "http://service.cesar.futbol.com/", className = "com.futbol.cesar.ws.ListarTodosResponse")
    public List<Futbolista> listarTodos();

    /**
     * 
     * @param arg0
     * @return
     *     returns com.futbol.cesar.ws.Futbolista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "encontrarFutbolista", targetNamespace = "http://service.cesar.futbol.com/", className = "com.futbol.cesar.ws.EncontrarFutbolista")
    @ResponseWrapper(localName = "encontrarFutbolistaResponse", targetNamespace = "http://service.cesar.futbol.com/", className = "com.futbol.cesar.ws.EncontrarFutbolistaResponse")
    public Futbolista encontrarFutbolista(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "crearFutbolista", targetNamespace = "http://service.cesar.futbol.com/", className = "com.futbol.cesar.ws.CrearFutbolista")
    @ResponseWrapper(localName = "crearFutbolistaResponse", targetNamespace = "http://service.cesar.futbol.com/", className = "com.futbol.cesar.ws.CrearFutbolistaResponse")
    public String crearFutbolista(
        @WebParam(name = "arg0", targetNamespace = "")
        Futbolista arg0);

}
