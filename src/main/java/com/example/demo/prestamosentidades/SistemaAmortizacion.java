package com.example.demo.prestamosentidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public abstract class SistemaAmortizacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private int numerodecuotas;
	private double interes;
	private double saldorestante;
	private double cuota;
	private double capitalamortizado;
	private double ani;
	private double sumacuotas;
	private double sumainteres;
	
}

