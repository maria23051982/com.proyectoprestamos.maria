package com.example.demo.prestamosentidades;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor 
@NoArgsConstructor
@SpringBootApplication

public class Aleman extends SistemaAmortizacion {

	
			private int numerodecuotas;
			private double interes;
			private double saldorestante;
			private double cuota;
			private double capitalamortizado;
			private double sumacuotas;
			private double sumainteres;
			
			
//		    {
//	
//	  sumainteres = 0;
//	  sumacuotas = 0;
//	
//		 numerodecuotas = 1;
//		 System.out.println("Nro.Cuota "+numerodecuotas);
//		 interes = (((tasa)/100)/12)*monto;
//		 System.out.println("Int�res($) "+interes);
//		 sumainteres= sumainteres + interes;
//		 capitalamortizado= monto/cantidaddecuotas;
//		 cuota = capitalamortizado + interes;
//		 System.out.println("Cuota "+cuota);
//		 sumacuotas= sumacuotas + cuota;
//		 System.out.println("Capitalamortizado "+ capitalamortizado);
//		 saldorestante = (monto - capitalamortizado);
//		 System.out.println("Saldorestante "+saldorestante);
//		 System.out.println(" ");
//		    }
//	
//		 {
//	
//	for (numerodecuotas=2;numerodecuotas<=(cantidaddecuotas); numerodecuotas++) {
//		System.out.println("Nro.Cuotas "+numerodecuotas);
//		 interes = (((cantidaddecuotas)/100)/12)*saldorestante;
//		 System.out.println("Interes "+ interes);
//		 sumainteres= sumainteres + interes;
//		 capitalamortizado= monto/cantidaddecuotas;
//		 cuota = (capitalamortizado + interes);
//		 sumacuotas = sumacuotas + cuota;
//		 System.out.println("Cuota "+cuota);
//		 System.out.println("Capitalamortizado "+ capitalamortizado);
//		 saldorestante = saldorestante - capitalamortizado;
//		 System.out.println("Saldor Restante "+ saldorestante);
//		 System.out.println(" ");
//		
//	}
//	
//	{
//		
//		 System.out.println("La suma de intereses es: $ "+ sumainteres);
//		 System.out.println("El total a pagar es: $ "+ sumacuotas);
//		 
//	}
//
//		 }
//		 
}
