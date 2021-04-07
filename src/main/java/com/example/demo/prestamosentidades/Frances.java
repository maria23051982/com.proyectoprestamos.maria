package com.example.demo.prestamosentidades;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Frances extends SistemaAmortizacion {
	

	   public double getInteres(double d) {
	 		
	 		return ((getTasa() / 100) / 12) * getMonto();
	 	}
	 	
	     public double getSumaInteres(double d) {
	     	
	     	return (getSumaInteres()+getInteres());
	     }

        public double getCuota(double d) {
		
		   return getMonto()*(((getTasa()/100)/12) /(1- (Math.pow (1+ (getTasa()/100)/12, -getNumeroDeCuotas()))));
	     }
        
        public double getSumacuotas(double d) {
        	
        	return getSumacuotas()+ getCuota();
        
        }
     
        public double getCapitalAmortizado(double d) {
    		
    		return getCuota()- getInteres();
    	}
        
       
       public double getSumacapitalamortizado() {
    	
    	return getSumacapitalamortizado()+getCapitalAmortizado();
    }
        
        public double getSaldoRestante(double d) {
        	
        	return getMonto()-getSumacapitalamortizado();
        }
	
}

	
