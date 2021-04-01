package com.example.demo.prestamosentidades;

public class CuotaVencida extends Estado{
	
	public CuotaVencida() {
		this.nombre = "CuotaRefinanciada";
	}
	
	@Override
	public Estado getEstadoSiguiente() {
		return new CuotaRefinanciada();
	}
}
