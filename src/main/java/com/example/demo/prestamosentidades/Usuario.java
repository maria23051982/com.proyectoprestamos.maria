package prestamosentidades;


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
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="usuariobase")
public class Usuario implements Serializable{


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
	private Set<Rol> roles  = new HashSet<>();
	
	@Column(name="datos")
	private Date datos;
	

		
		//public Usuario(String username, String password, String email) {
			//this.username = username;
			//if ((password.length() >= 10) == false)
			//	throw new RuntimeException("La contraseña debe ser de al menos 10 caracteres.");
			////this.password = password;
		//	if (!(email.contains("@")))
			//	throw new RuntimeException("El email no tiene el @, por lo tanto no es válido");
		//	this.email = email;

		//}
		
		//public void getMenuUsuario() {
		//	System.out.println("Menus de usuario de "+this.getUsername());
			//for (Rol rol : roles) {
			//	for (Menu item : rol.getMenu()) {
				//	System.out.println(item.getNombre());
				//}
		//	}
		//	System.out.println("******************");
		//}
	
}

	
