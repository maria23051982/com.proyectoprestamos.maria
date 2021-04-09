package com.example.demo.prestamosentidades;

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
@DiscriminatorValue("USUARIO")
public class Usuario extends Persona {

	private static final long serialVersionUID = 1L;

	private String password;

}
