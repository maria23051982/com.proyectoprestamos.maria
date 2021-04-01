package com.example.demo.prestamosentidades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controllers.IUsuariobaseService;
import com.example.demo.controllers.Usuariobase;



@RestController
@RequestMapping (value="baselista")

public class BaseLista {
	
	public class ToDoList {
		
		@Autowired
		private IUsuariobaseService UsuariobaseService;

		@GetMapping(value="usuariobase")
		public List<Usuariobase> getusuariobase() {
			return (List<Usuariobase>) UsuariobaseService.getUsuariobase();
		}
		
		
		
	}
}