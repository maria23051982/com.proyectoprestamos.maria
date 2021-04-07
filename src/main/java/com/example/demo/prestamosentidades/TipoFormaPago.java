package com.example.demo.prestamosentidades;

public enum TipoFormaPago {

	DEBITO_AUTOMATICO("Debito Automatico"), EFECTIVO("Efectivo"), TRANSFERENCIA("Transferencia Bancaria");

	private String descripcion;

	TipoFormaPago(String desc) {
		this.setDescripcion(desc);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
