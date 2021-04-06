package com.example.demo.prestamosentidades;

import java.sql.Time;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Refinanciacion extends Cuota {

    private Time fechaVencimiento;
    private Time fechaPago;
    
    //Aca deberia llamar al metodo para calcular los dias para sacar la multa.
    
	long fechaInicialMs = fechaVencimiento.getTime();
	long fechaFinalMs = fechaPago.getTime();
	long diferencia = fechaFinalMs - fechaInicialMs;
	double dias = Math.floor(diferencia / (1000 * 60 * 60 * 24));
	
/*	if (dias > 0) {
		
		  public double getCuota(){
		     	
		     	return (Math.abs(getListadocuotas()*((1+0,1)*dias)));
		     }
		
		     }
		
	}

    */
}
