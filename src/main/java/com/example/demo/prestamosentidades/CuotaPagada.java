package com.example.demo.prestamosentidades;

public class CuotaPagada extends Estado {
	
	public CuotaPagada() {
		this.nombre = "CuotaPagada";
	}
	
	@Override
	public Estado getEstadoSiguiente() {
		return this;
	}

}
