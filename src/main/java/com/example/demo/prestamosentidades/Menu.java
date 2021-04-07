package com.example.demo.prestamosentidades;

import java.util.Set;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Menu {

	private String itemMenu;
	private String nombre;
	
}