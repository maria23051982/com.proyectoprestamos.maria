package prestamosentidades;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.Ejemplo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@SpringBootApplication

public class frances extends SistemaAmortizacion {

	
		    SistemaAmortizacion monto;
		    SistemaAmortizacion cantidaddecuotas;
		    SistemaAmortizacion.getTasa(tasa);
		   
			private int numerodecuotas;
			private double interes;
			private double saldorestante;
			private double cuota;
			private double capitalamortizado;
			private double ani;
			private double sumacuotas;
			private double sumainteres;
			
			


			{

	  ani = (((tasa)/100)/12) /(1- (Math.pow (1+ (tasa/100)/12),-cantidaddecuotas));
	  sumainteres = 0;
	  sumacuotas = 0;
	 
		 numerodecuotas = 1;
		 System.out.println("Nro.Cuotas "+numerodecuotas);
		 interes = ((tasa)/100)/12)*monto;
		 System.out.println("Interes($) "+interes);
		 sumainteres= sumainteres + interes;
		 cuota = monto * ani;
		 System.out.println("Cuota "+cuota);
		 sumacuotas= sumacuotas + cuota;
		 capitalamortizado= cuota - interes;
		 System.out.println("Capital amortizado "+capitalamortizado);
		 saldorestante = monto - capitalamortizado;
		 System.out.println("Saldo restante "+saldorestante);
		 System.out.println(" ");
		
		 {
	
	for (numerodecuotas=2; numerodecuotas <= cantidaddecuotas; numerodecuotas++) {
		System.out.println("Nro.Cuotas "+numerodecuotas);
		 interes = (((tasa)/100)/12)*saldorestante;
		 System.out.println("Interes "+interes);
		 sumainteres= sumainteres + interes;
		 cuota = monto * ani;
		 System.out.println("Cuota "+cuota);
		 sumacuotas= sumacuotas + cuota;
		 capitalamortizado= cuota - interes;
		 System.out.println("Capital amortizado "+capitalamortizado);
		 saldorestante = saldorestante - capitalamortizado;
		 System.out.println("Saldor Restante "+saldorestante);
		 System.out.println(" ");
		
	}
	
	{
		
		 System.out.println("La suma de interes es: $ "+ sumainteres);
		 System.out.println("El total a pagar es: $ "+ sumacuotas);
		 

		 
	}	
	
		 }
			}
}
	
