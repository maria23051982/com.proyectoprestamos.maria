package com.example.demo.prestamosentidades;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@SpringBootApplication

public class Americano extends SistemaAmortizacion {

	
		 SistemaAmortizacion monto;
		 SistemaAmortizacion cantidaddecuotas;
		 SistemaAmortizacion tasa;
		
		private int numerodecuotas;
		private double interes;
		private double capitalamortizado;
		private double cuota;
		private double sumacuotas;
		private double sumainteres;
		
		
		{

		
		for (numerodecuotas=1;numerodecuotas<=(cantidaddecuotas-1); numerodecuotas++) {
			 System.out.println("Nro.Cuotas "+numerodecuotas);
			 interes = (((tasa)/100)/12)*monto;
			 System.out.println("Int�res($) "+interes);
			 capitalamortizado = 0;
			 System.out.println("Capital Amortizado ($) " +capitalamortizado);
			 cuota = interes + capitalamortizado;
			 System.out.println("Cuota ($) "+cuota);
			 System.out.println(" ");
		}
		
		{ 
		 numerodecuotas = cantidaddecuotas;
		 System.out.println("Nro.Cuotas "+numerodecuotas);
		 interes = (((tasa)/100)/12)*monto;
		 System.out.println("Interes($) "+interes);
		 capitalamortizado = monto;
		 System.out.println("Capital Amortizado ($) " +capitalamortizado);
		 cuota = interes + capitalamortizado;
		 System.out.println("Cuota ($) "+cuota);
		 System.out.println(" ");
		
		}
	
		 {
		 sumainteres = ((Tasa/100)/12) * Monto * ((plazo+1)/2); 
		 sumacuota =  SumaInteres + Monto;	
		 System.out.println("La suma de interes es: $ "+ sumainteres);
		 System.out.println("El total a pagar es: $ "+ sumacuotas);
		 }
		 
		 }
  }
		 

