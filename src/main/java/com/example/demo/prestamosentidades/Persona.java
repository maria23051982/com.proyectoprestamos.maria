package com.example.demo.prestamosentidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("PERSONA")
public class Persona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private String apellido;
	private Long dni;

	@OneToMany
	private List<Prestamo> prestamos = new ArrayList<>();

	public void agregarPrestamos(Prestamo prestamo) {
		prestamos.add(prestamo);

	}

	public void setDtype(String dtype) {
		
		
	}

	public void setEmail(Email email) {
		
		
	}

	public void setPassword(String password) {
	
		
	}

	



}
