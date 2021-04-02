package com.example.demo.prestamosentidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class SistemaAmortizacionabstract {
      private Double tasa;
      private Double monto;
      private Long cantidaddecuotas;
      
	
 

	public double getCapitalamortizado(double capitalamortizado) {
		
		return 0;
	}


	public double getCuota(double cuota) {
		return 0;
	}


	public double getInteres(double interes) {

		return 0;
	}
     
}
