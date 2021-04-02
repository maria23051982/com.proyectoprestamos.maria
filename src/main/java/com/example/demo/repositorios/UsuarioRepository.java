package com.example.demo.repositorios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.prestamosentidades.Persona;

@Component
@Scope("singleton")
public class UsuarioRepository {
	List<Persona> persona = new ArrayList<>();
	
	public void save(Persona p) {
		persona.add(p);
	}
	
	public void delete(int ix) {
		persona.remove(ix);
	}
	public List<Persona> findAll() {
		return persona;
	}

	public int count() {
		return persona.size();
	}
	public Persona findById(int ix) {
		try {
			return persona.get(ix);
		} catch (Exception e) {
			throw new RuntimeException("No existe la persona con id "+ix);
		}
	}

	public List<Persona> findAllNonActive() {
		return persona.stream().filter(p -> !p.getActivo()).collect(Collectors.toList());
	}

	public List<Persona> findAllActive() {
		return persona.stream().filter(p -> p.getActivo()).collect(Collectors.toList());
	}
}