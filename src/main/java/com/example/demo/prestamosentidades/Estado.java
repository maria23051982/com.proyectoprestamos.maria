package com.example.demo.prestamosentidades;

import javax.persistence.Entity;

@Entity

enum Estado {

CUOTA_VENCIDA("Cuota Vencida"), CUOTA_PAGADA("Cuota Pagada"),CUOTA_REFINANCIADA("Cuota Refinanciada");

private String descripcion;

private Estado(String descripcion) {
	this.descripcion = descripcion;
	
}
 public String getDescripcion() {
	 return descripcion;
 }
 
 public void setDescripcion(String descripcion) {
	 this.descripcion = descripcion;
 }
}
