package com.cesar.entity;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ObjetoResultado {

	private Integer operacion;
	public ObjetoResultado() {
		// TODO Auto-generated constructor stub
	}
	
	public ObjetoResultado(Integer operacion) {
		super();
		this.operacion = operacion;
	}

	public Integer getOperacion() {
		return operacion;
	}
	public void setOperacion(Integer operacion) {
		this.operacion = operacion;
	}
	@Override
	public String toString() {
		return "ObjetoResultado [operacion=" + operacion + "]";
	}
	
	
}
