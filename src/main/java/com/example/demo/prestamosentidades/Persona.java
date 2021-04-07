package com.example.demo.prestamosentidades;


	import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private Long dni;
	
    {
		
		
	}
	public void setActivo(boolean b) { //Estas 2 ultimas me lo creo, me pedia crearla 01/04
		
		
	}
	public boolean getActivo() {
	
		return false;
	}


}
