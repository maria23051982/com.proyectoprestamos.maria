package prestamosentidades;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Rol {

	public static void main(String[] args) {
		SpringApplication.run(Rol.class, args);
	}
	@Bean
	public CommandLineRunner lomboktest() {
		return args -> {
	      Usuario  persona = new Usuario();
	     
	  	  List<Usuario> usuarios = new ArrayList<>();
	  	  Set<Menu> itemMenu = new HashSet<>();
	  	  
	  	  persona.setUsername(toString());
	  	  persona.setApellido(toString());
	  	  persona.setNombre(toString());
	  	  persona.setDni(toString());
	  	  persona.setEmail(toString());
	  	  persona.setPassword(toString());
	  	  persona.setRoles(null);
	  	  
		};
	
	
}
	public Object getMenu() {
		return getMenu();
	}
	
}
