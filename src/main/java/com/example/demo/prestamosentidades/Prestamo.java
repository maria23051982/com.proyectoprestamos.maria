package com.example.demo.prestamosentidades;


import java.util.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Entity
public class Prestamo {
 
	private double monto;
	private int numerodecuotas;
	private Date fechaprestamo;
	private double tasa;
	Cuota listadocuotas;
	
public void setActivo(boolean b) { //Estas 2 ultimas me lo creo, me pedia crearla 04/04	
		
	}
	public boolean getActivo() {
	
		return false;
	}


}

