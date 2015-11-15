package edu.cibertec.jaad.jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
//
@XmlRootElement(name="elprofe")
@XmlType(propOrder ={"codigo","nombre","apellido","fechaIngreso"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Profesor {
	private Integer codigo;
	@XmlElement(name="nombreone")
	private String nombre;
	private String apellido;
	private Date fechaIngreso;
	/**
	 * CTRL + SHIFT + O -> Sugerencia
	 * ALT + SHIFT + S -> Genera codigo	
	 * 
	 */
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
}
