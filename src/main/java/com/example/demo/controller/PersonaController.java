package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.prestamosentidades.Persona;

import com.example.demo.repositorios.PersonaRepository;

@Controller
@RequestMapping("/personas")
public class PersonaController {

	@Autowired
	PersonaRepository personaRepository;

	@RequestMapping("")
	public String alta(Model model) {
		model.addAttribute("persona", new Persona());
		return "personas/alta";
	}

	@RequestMapping("/listado")
	public String list(Model model) {
		model.addAttribute("personas", personaRepository.findAll());
		return "personas/listado";
	}

	@RequestMapping(value = "/personas", method = { RequestMethod.POST, RequestMethod.PUT })
	public String edit(@RequestParam(value = "id") Long id, Model model) {

		Optional<Persona> persona = personaRepository.findById(id);

		if (!persona.isPresent())
			return "redirect:/error";

		model.addAttribute("personas", persona.get());
		return "editar";
	}

	@PostMapping("/save")
	public String save(@RequestParam(value = "dni", required = true) Long dni,
			@RequestParam(value = "nombre", required = true) String nombre,
			@RequestParam(value = "apellido", required = true) String apellido) {
		
	
		Persona persona = personaRepository.findByDni(dni).get();
		if (persona == null)
			return "redirect:/error";

		
		persona.setDni(dni);
		persona.setNombre(nombre);
		persona.setApellido(apellido);
		
		personaRepository.save(persona);

		return "redirect:/listado";
	}

	@PostMapping(value = "/conf-borrar")
	public String borrar(@RequestParam(value = "id") int id, Model model) {
//		Persona persona = usuarioRepository.findById(id);
//		model.addAttribute("persona", persona);
		return "confirmarBorrado";
	}

	@PostMapping(value = "/borrar/{id}")
	public String personaBorrada(@PathVariable(value = "id") int id, Model model) {
//		try {
//			usuarioRepository.delete(id);
//		} catch (Exception e) {
//			model.addAttribute("error", "No se pudo eliminar el registro");
//			return "error";
//		}
		return "personaBorrada";
	}

	@GetMapping(value = "/error")
	public String error(Model model) {
		return "error";
	}
}
