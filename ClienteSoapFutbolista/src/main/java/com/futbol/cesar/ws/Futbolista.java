
package com.futbol.cesar.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para futbolista complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="futbolista">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "futbolista", propOrder = {
    "codigo",
    "edad",
    "fechaIngreso",
    "nombre"
})
public class Futbolista {

    protected String codigo;
    protected int edad;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngreso;
    protected String nombre;

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     */
    public void setEdad(int value) {
        this.edad = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngreso(XMLGregorianCalendar value) {
        this.fechaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

	@Override
	public String toString() {
		return "Futbolista [codigo=" + codigo + ", edad=" + edad
				+ ", fechaIngreso=" + fechaIngreso + ", nombre=" + nombre + "]";
	}

}
