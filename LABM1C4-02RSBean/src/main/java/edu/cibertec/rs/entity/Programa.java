package edu.cibertec.rs.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Programa {
	private String id;
	private String nombre;
	private Double duracion;
	private Date fechaInicio;
	private Date fechaFin;
	
	public Programa(){
		
	}
	public Programa(String id, String nombre, Double duracion,
			Date fechaInicio, Date fechaFin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getDuracion() {
		return duracion;
	}
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	@Override
	public String toString() {
		return "Programa [id=" + id + ", nombre=" + nombre + ", duracion="
				+ duracion + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + "]";
	}
	
}
