package com.example.demo.prestamosentidades;

public class Frances extends SistemaAmortizacion {
	private static final long serialVersionUID = 1L;

	public Frances() {
		
	}

	public double getInteres(double d) {

		return ((getPrestamo().getTasa() / 100) / 12) * getPrestamo().getMonto();
	}

	public double getSumaInteres(double d) {

		return getSumaInteres(serialVersionUID) + getInteres(d);
	}

	public double getCuota(double d) {

		return getPrestamo().getMonto() * (((getPrestamo().getTasa() / 100) / 12)
				/ (1 - (Math.pow(1 + (getPrestamo().getTasa() / 100) / 12, -getPrestamo().getPlazo()))));
	}

	public double getSumacuotas(double d) {

		return getSumacapitalamortizado() + getCuota(d);

	}

	public double getCapitalAmortizado(double d) {

		return getCuota(d) - getInteres(d);
	}

	public double getSumacapitalamortizado() {

		return getSumacapitalamortizado() + getCapitalAmortizado(serialVersionUID);
	}

	public double getSaldoRestante(double d) {

		return getPrestamo().getMonto() - getSumacapitalamortizado();
	}

}
