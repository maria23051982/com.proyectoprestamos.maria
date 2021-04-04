package com.example.demo.prestamosentidades;


import java.util.Date;

import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor

public class Cuota {

	private Date fechavencimiento;
	private Date fechapago;

	@ManyToOne
	private FormasPagos formaspagos;
	@ManyToOne
	private Estado estado;
	@ManyToOne
	private Refinanciacion refinanciacion;
}
