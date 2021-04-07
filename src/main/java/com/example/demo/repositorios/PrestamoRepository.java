package com.example.demo.repositorios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.prestamosentidades.Prestamo;

@Component
@Scope("singleton")
public class PrestamoRepository {
	
List<Prestamo> prestamo = new ArrayList<>();
	
	public void save(Prestamo pres) {
		prestamo.add(pres);
	}
	public List<Prestamo> findAll() {
		return prestamo;
	}

	public int count() {
		return prestamo.size();
	}
	public Prestamo findById(int numerodecuotas) {
		try {
			return prestamo.get(numerodecuotas);
		} catch (Exception e) {
			throw new RuntimeException("No existe la cuota con id "+numerodecuotas);
		}
	}


}
