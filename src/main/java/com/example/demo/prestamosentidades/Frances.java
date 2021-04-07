package com.example.demo.prestamosentidades;

public class Frances extends SistemaAmortizacion {
	private static final long serialVersionUID = 1L;

	public Frances() {
		// TODO Auto-generated constructor stub
	}

	public double getInteres(double d) {

		return ((getPrestamo().getTasa() / 100) / 12) * getPrestamo().getMonto();
	}

	public double getSumaInteres(double d) {

		return (getSumaInteres() + getInteres());
	}

	public double getCuota(double d) {

		return getPrestamo().getMonto() * (((getPrestamo().getTasa() / 100) / 12)
				/ (1 - (Math.pow(1 + (getPrestamo().getTasa() / 100) / 12, -getPrestamo().getPlazo()))));
	}

	public double getSumacuotas(double d) {

		return getSumaCuotas() + getCuota();

	}

	public double getCapitalAmortizado(double d) {

		return getCuota() - getInteres();
	}

	public double getSumacapitalamortizado() {

		return getSumacapitalamortizado() + getCapitalAmortizado();
	}

	public double getSaldoRestante(double d) {

		return getPrestamo().getMonto() - getSumacapitalamortizado();
	}

}
