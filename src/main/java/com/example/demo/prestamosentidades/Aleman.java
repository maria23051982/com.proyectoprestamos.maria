package com.example.demo.prestamosentidades;


import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Aleman extends SistemaAmortizacion {
	
			
		public double getInteres(double d) {
			
			return ((getTasa() / 100) / 12) * getMonto();
		}
		
	    public double getSumaInteres(double d) {
	    	
	    	return (getSumaInteres()+getInteres());
	    }

		public double getCapitalAmortizado(double d) {
			
			return getMonto()/getPlazo();
		}
		

		public double getCuota(double d) {
		
			return getCapitalAmortizado()+getInteres();
		}
		
	    public double getSumacuotas(double d) {
	    	
	    	return getSumacuotas()+ getCuota();
	    
	    }
	   
	  
	    public double getSaldoRestante(double d) {
		
		return (getMonto()-(getCapitalAmortizado()*getPlazo()));
	}

	
		
}



	

  

