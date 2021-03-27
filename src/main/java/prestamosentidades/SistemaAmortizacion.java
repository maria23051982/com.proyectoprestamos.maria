package prestamosentidades;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public abstract class SistemaAmortizacion {
	
	public static void main(String[] args) {
		SpringApplication.run(Prestamo.class, args);
	}

	@Bean
	public CommandLineRunner lomboktest() {
		return args -> {
			
			{
				
				Prestamo prestamo = new Prestamo();
				
				 Scanner teclado = new Scanner(System.in);
			
		     // Clientes cliente;
			  System.out.println("Bienvenido al programa de credito");
			  
			
		    System.out.println("Por favor introduzca el monto por teclado: ");
		    prestamo.setMonto(teclado.nextDouble());
		    
	        System.out.println("Por favor introduzca la cantidad de cuotas mensuales");
		    prestamo.setCantidaddecuotas(teclado.nextLong());
		    
		    System.out.println("Por favor introduzca la tasa");
		    prestamo.setTasa(teclado.nextLong());

			prestamo.setFechaprestamo(Calendar.getInstance());
			
		}
		
		};

	}
}


