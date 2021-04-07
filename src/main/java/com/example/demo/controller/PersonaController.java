package com.example.demo.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.prestamosentidades.Persona;
import com.example.demo.repositorios.UsuarioRepository;

@RestController
@RequestMapping("/persona")

public class PersonaController {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@RequestMapping("/alta")
	public String alta(Model model) {
		Persona persona = new Persona();
		model.addAttribute("persona", persona);

		return "alta";
	}

	@RequestMapping("/listado")
	public String list(Model model) {
		model.addAttribute("persona", UsuarioRepository.findAllActive());
		return "listado";
	}

	@RequestMapping("/borrados")
	public String deleted(Model model) {
		model.addAttribute("persona", UsuarioRepository.findAllNonActive());
		return "listado";
	}

	@RequestMapping(value = "/persona", method = { RequestMethod.POST, RequestMethod.PUT })
	public String edit(@RequestParam(value = "id") int id, Model model) {
		Persona persona = usuarioRepository.findById(id);
		model.addAttribute("persona", persona);
		return "editar";
	}

	@RequestMapping(value = "/save", method = { RequestMethod.POST, RequestMethod.PUT })
	public String save(@RequestParam(value = "nombre") String nombre, @RequestParam(value = "apellido") String apellido,
			@RequestParam(value = "dni") long dni,
			Model model) throws ParseException {

		

		Persona persona = new Persona(apellido, nombre, dni);
		persona.setId((long) usuarioRepository.count());
		usuarioRepository.save(persona);
		model.addAttribute("persona", persona);
		return "redirect:/listado";
	}

	@RequestMapping(value = "/edit/{id}", method = { RequestMethod.POST, RequestMethod.PUT })
	public String edit(@PathVariable(value = "id") Integer id, @RequestParam(value = "nombre") String nombre,
			@RequestParam(value = "apellido") String apellido, @RequestParam(value = "dni") long dni,
			@RequestParam(value = "activo", required = false) Boolean activo, Model model) throws ParseException {


		Persona persona = usuarioRepository.findById(id);
		persona.setApellido(apellido);
		persona.setNombre(nombre);
		persona.setDni(dni);
//		persona.setActivo(activo != null);
		persona.setActivo(activo == null ? false : true);

		return "redirect:/listado";
	}

	@PostMapping(value = "/conf-borrar")
	public String borrar(@RequestParam(value = "id") int id, Model model) {
		Persona persona = usuarioRepository.findById(id);
		model.addAttribute("persona", persona);
		return "confirmarBorrado";
	}

	@PostMapping(value = "/borrar/{id}")
	public String personaBorrada(@PathVariable(value = "id") int id, Model model) {
		try {
			usuarioRepository.delete(id);
		} catch (Exception e) {
			model.addAttribute("error", "No se pudo eliminar el registro");
			return "error";
		}
		return "personaBorrada";
	}

	@GetMapping(value = "/error")
	public String error() {
		return "error";
	}
}
