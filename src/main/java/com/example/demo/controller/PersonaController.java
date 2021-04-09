package com.example.demo.controller;

import java.text.ParseException;
import java.util.Optional;
import javax.validation.constraints.Email;
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
	private Email email;

	@RequestMapping("/alta")
	public String alta(Model model) {
		Persona persona = new Persona();
		model.addAttribute("personas", persona);

		return "alta";
	}

	@RequestMapping("/listado")
	public String list(Model model) {
		model.addAttribute("personas", personaRepository.findAll());
		return "listado";
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
			@RequestParam(value = "dtype", required = true) String dtype,
			@RequestParam(value = "nombre", required = true) String nombre,
			@RequestParam(value = "apellido", required = true) String apellido,
			@RequestParam(value = "email", required = true) Email email,
			@RequestParam(value = "password", required = true) String password)
			{


      this.setEmail(email);
		return "redirect:/listado";
	}

	@RequestMapping(value = "/edit/{id}", method = { RequestMethod.POST, RequestMethod.PUT })
	public String edit(@PathVariable(value = "id") Integer id,
			@RequestParam(value = "dni", required = true) Long dni,
			@RequestParam(value = "dtype", required = true) String dtype,
			@RequestParam(value = "nombre", required = true) String nombre,
			@RequestParam(value = "apellido", required = true) String apellido,
			@RequestParam(value = "email", required = true) Email email,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "activo", required = false) Boolean activo, Model model) throws ParseException {


		return "redirect:/listado";
	}

	@PostMapping(value = "/conf-borrar")
	public String borrar(@RequestParam(value = "id") int id, Model model) {

		return "confirmarBorrado";
	}

	@PostMapping(value = "/borrar/{id}")
	public String personaBorrada(@PathVariable(value = "id") int id, Model model) {

		return "personaBorrada";
	}

	@GetMapping(value = "/error")
	public String error(Model model) {
		return "error";
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}
}