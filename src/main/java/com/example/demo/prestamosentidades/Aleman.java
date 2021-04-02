package com.example.demo.prestamosentidades;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Aleman extends SistemaAmortizacion {

	public double getInteres() {

		return super.getInteres(Math.abs(((getTasa() / 100) / 12) * getMonto()));
	}

	public double getCapitalamortizado() {

		return super.getCapitalamortizado(Math.abs(getMonto() / getCantidaddecuotas()));
	}

	public double getCuota() {

		return super.getCuota(Math.abs(getInteres() + getCapitalamortizado()));
	}

	public double getSaldoRestante() {

		return super.getCuota(Math.abs(getMonto() - getCapitalamortizado()));
	}

//	for (numerodecuotas=2;numerodecuotas<=(cantidaddecuotas); numerodecuotas++) {

	@Override
	public double getInteres(double abs) {

		return super.getInteres((Math.abs(((getTasa() / 100) / 12) * getSaldorestante())));
	}

	{
		getSumainteres(getSumainteres() + getInteres());

	}

	{
		getCapitalamortizado(getMonto() / getCantidaddecuotas());
	}

	{
		getSumacuotas(getSumacuotas() + getCuota());
	}
	{
		getSaldoRestante();
	}

}