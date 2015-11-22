
package com.cesar.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cesar.ws package. 
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

    private final static QName _ListarTodoResponse_QNAME = new QName("http://ws.cesar.com/", "listarTodoResponse");
    private final static QName _CrearTrabajadorResponse_QNAME = new QName("http://ws.cesar.com/", "crearTrabajadorResponse");
    private final static QName _CrearTrabajador_QNAME = new QName("http://ws.cesar.com/", "crearTrabajador");
    private final static QName _Trabajador_QNAME = new QName("http://ws.cesar.com/", "trabajador");
    private final static QName _EncontrarTrabajadorResponse_QNAME = new QName("http://ws.cesar.com/", "encontrarTrabajadorResponse");
    private final static QName _EncontrarTrabajador_QNAME = new QName("http://ws.cesar.com/", "encontrarTrabajador");
    private final static QName _ListarTodo_QNAME = new QName("http://ws.cesar.com/", "listarTodo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cesar.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EncontrarTrabajadorResponse }
     * 
     */
    public EncontrarTrabajadorResponse createEncontrarTrabajadorResponse() {
        return new EncontrarTrabajadorResponse();
    }

    /**
     * Create an instance of {@link ListarTodo }
     * 
     */
    public ListarTodo createListarTodo() {
        return new ListarTodo();
    }

    /**
     * Create an instance of {@link EncontrarTrabajador }
     * 
     */
    public EncontrarTrabajador createEncontrarTrabajador() {
        return new EncontrarTrabajador();
    }

    /**
     * Create an instance of {@link Trabajador }
     * 
     */
    public Trabajador createTrabajador() {
        return new Trabajador();
    }

    /**
     * Create an instance of {@link CrearTrabajadorResponse }
     * 
     */
    public CrearTrabajadorResponse createCrearTrabajadorResponse() {
        return new CrearTrabajadorResponse();
    }

    /**
     * Create an instance of {@link CrearTrabajador }
     * 
     */
    public CrearTrabajador createCrearTrabajador() {
        return new CrearTrabajador();
    }

    /**
     * Create an instance of {@link ListarTodoResponse }
     * 
     */
    public ListarTodoResponse createListarTodoResponse() {
        return new ListarTodoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cesar.com/", name = "listarTodoResponse")
    public JAXBElement<ListarTodoResponse> createListarTodoResponse(ListarTodoResponse value) {
        return new JAXBElement<ListarTodoResponse>(_ListarTodoResponse_QNAME, ListarTodoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTrabajadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cesar.com/", name = "crearTrabajadorResponse")
    public JAXBElement<CrearTrabajadorResponse> createCrearTrabajadorResponse(CrearTrabajadorResponse value) {
        return new JAXBElement<CrearTrabajadorResponse>(_CrearTrabajadorResponse_QNAME, CrearTrabajadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTrabajador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cesar.com/", name = "crearTrabajador")
    public JAXBElement<CrearTrabajador> createCrearTrabajador(CrearTrabajador value) {
        return new JAXBElement<CrearTrabajador>(_CrearTrabajador_QNAME, CrearTrabajador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Trabajador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cesar.com/", name = "trabajador")
    public JAXBElement<Trabajador> createTrabajador(Trabajador value) {
        return new JAXBElement<Trabajador>(_Trabajador_QNAME, Trabajador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarTrabajadorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cesar.com/", name = "encontrarTrabajadorResponse")
    public JAXBElement<EncontrarTrabajadorResponse> createEncontrarTrabajadorResponse(EncontrarTrabajadorResponse value) {
        return new JAXBElement<EncontrarTrabajadorResponse>(_EncontrarTrabajadorResponse_QNAME, EncontrarTrabajadorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncontrarTrabajador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cesar.com/", name = "encontrarTrabajador")
    public JAXBElement<EncontrarTrabajador> createEncontrarTrabajador(EncontrarTrabajador value) {
        return new JAXBElement<EncontrarTrabajador>(_EncontrarTrabajador_QNAME, EncontrarTrabajador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTodo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.cesar.com/", name = "listarTodo")
    public JAXBElement<ListarTodo> createListarTodo(ListarTodo value) {
        return new JAXBElement<ListarTodo>(_ListarTodo_QNAME, ListarTodo.class, null, value);
    }

}
