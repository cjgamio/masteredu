
package com.futbol.cesar.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.futbol.cesar.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarTodos_QNAME = new QName("http://service.cesar.futbol.com/", "listarTodos");
    private final static QName _EncontrarFutbolistaResponse_QNAME = new QName("http://service.cesar.futbol.com/", "encontrarFutbolistaResponse");
    private final static QName _CrearFutbolista_QNAME = new QName("http://service.cesar.futbol.com/", "crearFutbolista");
    private final static QName _CrearFutbolistaResponse_QNAME = new QName("http://service.cesar.futbol.com/", "crearFutbolistaResponse");
    private final static QName _Futbolista_QNAME = new QName("http://service.cesar.futbol.com/", "futbolista");
    private final static QName _EncontrarFutbolista_QNAME = new QName("http://service.cesar.futbol.com/", "encontrarFutbolista");
    private final static QName _ListarTodosResponse_QNAME = new QName("http://service.cesar.futbol.com/", "listarTodosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.futbol.cesar.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Futbolista }
     * 
     */
    public Futbolista createFutbolista() {
        return new Futbolista();
    }

    /**
     * Create an instance of {@link ListarTodosResponse }
     * 
     */
    public ListarTodosResponse createListarTodosResponse() {
        return new ListarTodosResponse();
    }

    /**
     * Create an instance of {@link EncontrarFutbolista }
     * 
     */
    public EncontrarFutbolista createEncontrarFutbolista() {
        return new EncontrarFutbolista();
    }

    /**
     * Create an instance of {@link CrearFutbolistaResponse }
     * 
     */
    public CrearFutbolistaResponse createCrearFutbolistaResponse() {
        return new CrearFutbolistaResponse();
    }

    /**
     * Create an instance of {@link CrearFutbolista }
     * 
     */
    public CrearFutbolista createCrearFutbolista() {
        return new CrearFutbolista();
    }

    /**
     * Create an instance of {@link EncontrarFutbolistaResponse }
     * 
     */
    public EncontrarFutbolistaResponse createEncontrarFutbolistaResponse() {
        return new EncontrarFutbolistaResponse();
    }

    /**
     * Create an instance of {@link ListarTodos }
     * 
     */
    public ListarTodos createListarTodos() {
        return new ListarTodos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cesar.futbol.com/", name = "listarTodos")
    public JAXBElement<ListarTodos> createListarTodos(ListarTodos value) {
        return new JAXBElement<ListarTodos>(_ListarTodos_QNAME, ListarTodos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarFutbolistaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cesar.futbol.com/", name = "encontrarFutbolistaResponse")
    public JAXBElement<EncontrarFutbolistaResponse> createEncontrarFutbolistaResponse(EncontrarFutbolistaResponse value) {
        return new JAXBElement<EncontrarFutbolistaResponse>(_EncontrarFutbolistaResponse_QNAME, EncontrarFutbolistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearFutbolista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cesar.futbol.com/", name = "crearFutbolista")
    public JAXBElement<CrearFutbolista> createCrearFutbolista(CrearFutbolista value) {
        return new JAXBElement<CrearFutbolista>(_CrearFutbolista_QNAME, CrearFutbolista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearFutbolistaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cesar.futbol.com/", name = "crearFutbolistaResponse")
    public JAXBElement<CrearFutbolistaResponse> createCrearFutbolistaResponse(CrearFutbolistaResponse value) {
        return new JAXBElement<CrearFutbolistaResponse>(_CrearFutbolistaResponse_QNAME, CrearFutbolistaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Futbolista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cesar.futbol.com/", name = "futbolista")
    public JAXBElement<Futbolista> createFutbolista(Futbolista value) {
        return new JAXBElement<Futbolista>(_Futbolista_QNAME, Futbolista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarFutbolista }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cesar.futbol.com/", name = "encontrarFutbolista")
    public JAXBElement<EncontrarFutbolista> createEncontrarFutbolista(EncontrarFutbolista value) {
        return new JAXBElement<EncontrarFutbolista>(_EncontrarFutbolista_QNAME, EncontrarFutbolista.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cesar.futbol.com/", name = "listarTodosResponse")
    public JAXBElement<ListarTodosResponse> createListarTodosResponse(ListarTodosResponse value) {
        return new JAXBElement<ListarTodosResponse>(_ListarTodosResponse_QNAME, ListarTodosResponse.class, null, value);
    }

}
