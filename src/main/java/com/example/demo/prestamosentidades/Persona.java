package com.example.demo.prestamosentidades;


	import java.io.Serializable;
import java.util.Date;

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
	public void setFechaNacimiento(Date date) {
		
		
	}
	public void setActivo(boolean b) { //Estas 2 ultimas me lo creo, me pedia crearla 01/04
		
		
	}
	public boolean getActivo() {
	
		return false;
	}


}
