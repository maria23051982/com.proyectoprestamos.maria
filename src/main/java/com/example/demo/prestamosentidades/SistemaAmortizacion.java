package com.example.demo.prestamosentidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public abstract class SistemaAmortizacion extends Prestamo {

	
	private double interes;
	private double saldoRestante;
	private double cuota;
	private double capitalAmortizado;
	private double sumaInteres;
	private double sumacuotas;
	private double sumacapitalamortizado; //Este es para el Frances, para buscar un atributo que me evitara pedir 2 veces el mismo atributo a la clase padre.
	
	
	public Integer getPlazo() {
		
		return getPlazo();
	}
	
/*	 ArrayList<Double> listadocuotas = new ArrayList<Double>() 
 
	 for (int i = 1; i<=plazo; i++) { 
		 
		 listadocuotas.add(getInteres());
	     listadocuotas.add(getCuota());
		 listadocuotas.add(getCapitalAmortizado());
		 listadocuotas.add(getSaldoRestante());
		 listadocuotas.add(getSumaInteres());
		 listadocuotas.add(getSumacuotas());
	 }
*/	

}






