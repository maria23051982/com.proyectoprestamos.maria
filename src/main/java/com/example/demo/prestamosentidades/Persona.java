package com.example.demo.prestamosentidades;


	import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

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
public class Persona extends Usuario implements Serializable{
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellido;
	private Long dni;

}
