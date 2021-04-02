package com.example.demo.prestamosentidades;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class Americano extends SistemaAmortizacionabstract {

	     public double getInteres() {
         	
        	 return super.getInteres(Math.abs(((getTasa()/100)/12)*getMonto()));
        }
		  public double getCapitalamortizado() {
	           	
	          	 return super.getCapitalamortizado(Math.abs(0));
	          }
		       
		       public double getCuota() {
		           	
		          	 return super.getCuota(Math.abs(getInteres() + getCapitalamortizado()));
		          }
	 
   
//		{ 
//		 numerodecuotas = cantidaddecuotas;
//		 System.out.println("Nro.Cuotas "+numerodecuotas);
//		 interes = (((tasa)/100)/12)*monto;
//		 System.out.println("Interes($) "+interes);
//		 capitalamortizado = monto;
//		 System.out.println("Capital Amortizado ($) " +capitalamortizado);
//		 cuota = interes + capitalamortizado;
//		 System.out.println("Cuota ($) "+cuota);
//		 System.out.println(" ");
//		
//		}
//	
//		 {
//		 sumainteres = ((Tasa/100)/12) * Monto * ((plazo+1)/2); 
//		 sumacuota =  SumaInteres + Monto;	
//		 System.out.println("La suma de interes es: $ "+ sumainteres);
//		 System.out.println("El total a pagar es: $ "+ sumacuotas);
//		 }
//		 
	 

}




