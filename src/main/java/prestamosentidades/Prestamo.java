package prestamosentidades;

import java.time.LocalDate;
import java.util.Calendar;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor

public class Prestamo {
 
	private double monto;
	private long cantidaddecuotas;
	private Calendar fechaprestamo;
	private double tasa;
	Cuota listadocuotas;
  	
}

