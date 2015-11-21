package com.cesar.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Curso {

	private String codigoCurso;
	private String nombre;
	private String nivel;
	private int edad;
	private boolean activo;
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	
	public Curso(String codigoCurso, String nombre, String nivel, int edad,
			boolean activo) {
		super();
		this.codigoCurso = codigoCurso;
		this.nombre = nombre;
		this.nivel = nivel;
		this.edad = edad;
		this.activo = activo;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Curso [codigoCurso=" + codigoCurso + ", nombre=" + nombre
				+ ", nivel=" + nivel + ", edad=" + edad + ", activo=" + activo
				+ "]";
	}
	
}
