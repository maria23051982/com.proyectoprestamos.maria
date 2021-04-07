package com.example.demo.prestamosentidades;



import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
@Entity
public class Prestamo{
	
	
	private double monto;
	private int numerodecuotas;
	private Date fechaprestamo;
	private double tasa;
	@OneToMany
	List<Cuota>listadocuotas;
	

}

