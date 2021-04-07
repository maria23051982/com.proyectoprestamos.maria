package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.prestamosentidades.Persona;
import com.example.demo.prestamosentidades.Prestamo;
import com.example.demo.repositorios.PersonaRepository;
import com.example.demo.repositorios.PrestamoRepository;

@Controller
@RequestMapping("/prestamos")
public class PrestamoController {
	@Autowired
	private PrestamoRepository prestamoRepository;

	@Autowired
	private PersonaRepository personaRepository;

	@RequestMapping("")
	public String alta(Model model) {
		model.addAttribute("prestamo", new Prestamo());
		return "prestamos/alta";
	}

	@PostMapping("/save")
	public String save(@RequestParam(value = "dni", required = true) Long dni,
			@RequestParam(value = "monto", required = true) Double monto,
			@RequestParam(value = "tasa", required = true) Double tasa,
			@RequestParam(value = "plazo", required = true) Integer plazo,
			@RequestParam(value = "amortizacion", required = true) String amortizacion) {

//		try {
//			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//			String fechaLimite;
//			Date fecha = sdf.parse(fechaLimite);
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}

		Persona persona = personaRepository.findByDni(dni).get();
		if (persona == null)
			return "redirect:/error";

		Prestamo prestamo = new Prestamo();
		prestamo.setFechaPrestamo(new Date());
		prestamo.setMonto(monto);
		prestamo.setPlazo(plazo);
		prestamo.setTasa(monto);
		prestamo.setTipoPrestamo(amortizacion);
		prestamoRepository.save(prestamo);

		persona.agregarPrestamos(prestamo);
		personaRepository.save(persona);
		return "prestamos/resumen/" + prestamo.getId();
	}

	@PostMapping("/resumen/{id}")
	public String resumen(@PathVariable("id") Long id, Model model) {

		model.addAttribute("prestamo", prestamoRepository.findById(id));
		return "prestamos/resumen";
	}

}
