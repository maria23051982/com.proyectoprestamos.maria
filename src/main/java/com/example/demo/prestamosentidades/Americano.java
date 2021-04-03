package com.example.demo.prestamosentidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Americano extends SistemaAmortizacion {

	public double getInteres() {
		return ((getTasa() / 100) / 12) * getMonto();
	}

	public double getCapitalamortizado() {

		return 0;
	}

	public double getCuota() {
		return getInteres() + getCapitalamortizado();
	}

	public double getSaldoRestante(double d) {

		return getMonto() + getInteres() - (getCuota()*getNumeroDeCuotas());
	}


	public double getSumaInteres() {
		return ((getTasa() / 100) / 12) * getMonto() * ((getNumeroDeCuotas() + 1) / 2);
	}

	
	public double getSumacuotas() {
		
		return getSumaInteres() + getMonto();
	}
}