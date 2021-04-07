package com.example.demo.prestamosentidades;


import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
@Entity
public class Cuota extends Prestamo{


	public Cuota getListadocuotas() {
		return getListadocuotas() ;
	}
	
	@ManyToOne
	private FormasPagos formaspagos;
	@Enumerated
	private Estado estado;
	@ManyToOne
	private Refinanciacion refinanciacion;
	
}
