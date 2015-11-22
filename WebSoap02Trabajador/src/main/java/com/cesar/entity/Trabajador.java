package com.cesar.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Trabajador {

	private String codigo;
	private String nombre;
	private String apellido;
	private int edad;
	private String categoria;
	private Date fechaIngreso;
	public Trabajador() {
		// TODO Auto-generated constructor stub
	}
	public Trabajador(String codigo, String nombre, String apellido, int edad,
			String categoria, Date fechaIngreso) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.categoria = categoria;
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
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return "Trabajador [codigo=" + codigo + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", edad=" + edad + ", categoria="
				+ categoria + ", fechaIngreso=" + fechaIngreso + "]";
	}
		
}
