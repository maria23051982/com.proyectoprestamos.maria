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
		return Math.abs(getInteres() + getCapitalamortizado());
	}

	public double getSaldoRestante(double d) {

		return getMonto() + getInteres() - getCuota();
	}

//	{
//		getInteres(Math.abs(((getTasa() / 100) / 12) * getMonto()));
//
//		getCapitalamortizado(Math.abs(getMonto()));
//
//		getCuota(Math.abs(getInteres() + getCapitalamortizado()));
//
//		getSaldoRestante(Math.abs(getMonto() + getInteres() - getCuota()));
//
//	}

	@Override
	public double getSumaInteres() {
		return ((getTasa() / 100) / 12) * getMonto() * ((getNumeroDeCuotas() + 1) / 2);
	}

}