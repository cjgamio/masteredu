
package edu.cibertec.jaad.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.cibertec.jaad.ws package. 
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

    private final static QName _AddAlumno_QNAME = new QName("http://ws.jaad.cibertec.edu/", "addAlumno");
    private final static QName _AddAlumnoResponse_QNAME = new QName("http://ws.jaad.cibertec.edu/", "addAlumnoResponse");
    private final static QName _Retrieve_QNAME = new QName("http://ws.jaad.cibertec.edu/", "retrieve");
    private final static QName _RetrieveResponse_QNAME = new QName("http://ws.jaad.cibertec.edu/", "retrieveResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.cibertec.jaad.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddAlumno }
     * 
     */
    public AddAlumno createAddAlumno() {
        return new AddAlumno();
    }

    /**
     * Create an instance of {@link AddAlumnoResponse }
     * 
     */
    public AddAlumnoResponse createAddAlumnoResponse() {
        return new AddAlumnoResponse();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link Alumno }
     * 
     */
    public Alumno createAlumno() {
        return new Alumno();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAlumno }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaad.cibertec.edu/", name = "addAlumno")
    public JAXBElement<AddAlumno> createAddAlumno(AddAlumno value) {
        return new JAXBElement<AddAlumno>(_AddAlumno_QNAME, AddAlumno.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAlumnoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaad.cibertec.edu/", name = "addAlumnoResponse")
    public JAXBElement<AddAlumnoResponse> createAddAlumnoResponse(AddAlumnoResponse value) {
        return new JAXBElement<AddAlumnoResponse>(_AddAlumnoResponse_QNAME, AddAlumnoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retrieve }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaad.cibertec.edu/", name = "retrieve")
    public JAXBElement<Retrieve> createRetrieve(Retrieve value) {
        return new JAXBElement<Retrieve>(_Retrieve_QNAME, Retrieve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jaad.cibertec.edu/", name = "retrieveResponse")
    public JAXBElement<RetrieveResponse> createRetrieveResponse(RetrieveResponse value) {
        return new JAXBElement<RetrieveResponse>(_RetrieveResponse_QNAME, RetrieveResponse.class, null, value);
    }

}
