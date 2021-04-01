package prestamosentidades;

import java.util.Calendar;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor

public class Cuota {

	private Calendar fechadevencimiento;
	private Calendar fechaactual;
	
	FormasPagos formaspagos;
	Estado estado;
	Refinanciacion refinanciacion;
}
