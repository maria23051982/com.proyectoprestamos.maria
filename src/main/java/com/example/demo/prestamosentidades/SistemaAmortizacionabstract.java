package com.example.demo.prestamosentidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class SistemaAmortizacionabstract extends SistemaAmortizacion {
      private Double tasa;
      private Double monto;
      private Long cantidaddecuotas;
      
	
 

	public double getCapitalamortizado(double abs) {
		
		return 0;
	}


	public double getCuota(double abs) {
		return 0;
	}


	public double getInteres(double abs) {

		return 0;
	}


	public double getSumainteres(double abs) {
		
		return 0;
	}


	public double getSumacuotas(double abs) {
		
		return 0;
	}


	
}
