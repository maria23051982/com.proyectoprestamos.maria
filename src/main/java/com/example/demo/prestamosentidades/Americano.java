package com.example.demo.prestamosentidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Americano extends SistemaAmortizacionabstract {

	//   for (numerodecuotas=1 ; numerodecuotas <= cantidaddecuotas-1; numerodecuotas++) {
	     
		   public double getInteres() {
         	
        	 return super.getInteres(Math.abs(((getTasa()/100)/12)*getMonto()));
        }
		  public double getCapitalamortizado() {
	           	
	          	 return super.getCapitalamortizado(Math.abs(0));
	          }
		       
		       public double getCuota() {
		           	
		          	 return super.getCuota(Math.abs(getInteres() + getCapitalamortizado()));
		          }
	   
		       public double getSaldoRestante(double d) {
		           	
		         	 return super.getCuota(Math.abs(getMonto()+getInteres() - getCuota()));
		         }
			   
		       {
		    	   getInteres(Math.abs(((getTasa()/100)/12)*getMonto()));
		    	   
		    	   getCapitalamortizado(Math.abs(getMonto()));
		    	   
		    	   getCuota(Math.abs(getInteres() + getCapitalamortizado()));   
		    	   
		  	       getSaldoRestante(Math.abs(getMonto()+getInteres() - getCuota()));
		
		  		         }
		  			   
		     @Override
		    public double getSumainteres() {
		    	
		    	return super.getSumainteres(Math.abs(((getTasa()/100)/12)*getMonto()* ((getCantidaddecuotas()+1)/2)));
		    }
			 
				
			  @Override
			public double getSumacuotas() {
				
				return super.getSumacuotas(Math.abs(getSumainteres(getSumainteres())+ getMonto()));
			}

}