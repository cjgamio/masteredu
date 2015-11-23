package com.practica.cesar.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Futbolista {

	private String codigo;
	private String nombre;
	private int edad;
	private Date fechaIngreso;
	public Futbolista() {
		// TODO Auto-generated constructor stub
	}
	
	public Futbolista(String codigo, String nombre, int edad, Date fechaIngreso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.edad = edad;
		this.fechaIngreso = fechaIngreso;
	}

	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	@Override
	public String toString() {
		return "Futbolista [codigo=" + codigo + ", nombre=" + nombre
				+ ", edad=" + edad + ", fechaIngreso=" + fechaIngreso + "]";
	}
	
}
