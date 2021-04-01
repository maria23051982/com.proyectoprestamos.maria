package com.example.demo.entidades;


	import java.io.Serializable;
	import java.sql.Date;
	import java.util.ArrayList;
	import java.util.HashSet;
	import java.util.InputMismatchException;
	import java.util.Scanner;
	import java.util.Set;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Table;
	import javax.validation.constraints.Email;

	import org.springframework.boot.CommandLineRunner;
	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.boot.autoconfigure.domain.EntityScan;
	import org.springframework.context.annotation.Bean;
	import org.springframework.format.annotation.DateTimeFormat;

	import com.vaadin.flow.component.polymertemplate.Id;

	//import Prestamos.Rol;
	import lombok.AllArgsConstructor;
	import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
	@Getter
	@Setter
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity

	@Table(name="usuariobase")
	public class Persona implements Serializable{


		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		private String username;
		private String password;
		private String nombre;
		private String apellido;
		private Long dni;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private String email;
		//private Set<Rol> roles  = new HashSet<>();
		
		@Column(name="datos")
		private Date datos;
}
