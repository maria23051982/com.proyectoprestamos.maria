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
	private int numeroDeCuotas;
	private double interes;
	private double saldoRestante;
	private double cuota;
	private double capitalAmortizado;
	private double sumaInteres;
	private double tasa;
	private double monto;
	private double sumacuotas;
	private double sumacapitalamortizado; //Este es para el Frances, para buscar un atributo que me evitara pedir 2 veces el mismo atributo a la clase padre.
	
	
}