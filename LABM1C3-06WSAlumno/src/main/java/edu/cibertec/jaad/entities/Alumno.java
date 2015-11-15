package edu.cibertec.jaad.entities;

import java.util.Date;

public class Alumno {
	private String  nombre;
	private int edad;
	private String numDoc;
	private Date fechaNacimiento;
	private String correo;
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
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", numDoc="
				+ numDoc + ", fechaNacimiento=" + fechaNacimiento + ", correo="
				+ correo + "]";
	}
	
	
}
