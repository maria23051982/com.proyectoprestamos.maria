package com.example.demo.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.repositorios.PrestamoRepository;
import com.example.demo.prestamosentidades.Prestamo;

@Controller
@RequestMapping("/")

public class PrestamoController {
	@Autowired
	PrestamoRepository prestamoRepository;

	@GetMapping("/")
	public String getIndex() {
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/alta")
	public String alta(Model model) {
		Prestamo prestamo = new Prestamo();
		prestamo.setFechaprestamo(new Date());
		model.addAttribute("prestamo", prestamo);

		return "alta";
	}

	@RequestMapping("/listado")
	public String list(Model model) {
		model.addAttribute("prestamo", prestamoRepository.findAllActive());
		return "listado";
	}


	@RequestMapping(value = "/prestamo", method = { RequestMethod.POST, RequestMethod.PUT })
	public String edit(@RequestParam(value = "numerodecuotas") int numerodecuotas, Model model) {
		Prestamo prestamo = prestamoRepository.findById(numerodecuotas);
		model.addAttribute("prestamo", prestamo);
		return "editar";
	}

	@RequestMapping(value = "/save", method = { RequestMethod.POST, RequestMethod.PUT })
	public String save(@RequestParam(value = "monto") Double monto, @RequestParam(value = "tasa") Double tasa,
			@RequestParam(value = "numerodecuotas") int numerodecuotas, @RequestParam(value = "fechaprestamo") String fechaprestamo,
			Model model) throws ParseException {

		Date fecha = new SimpleDateFormat("yyyy-mm-dd").parse(fechaprestamo);

		Prestamo prestamo = new Prestamo(monto, numerodecuotas, fecha, tasa, null);
		prestamo.setNumerodecuotas((int) prestamoRepository.count());
		prestamoRepository.save(prestamo);
		model.addAttribute("prestamo", prestamo);
		return "redirect:/listado";
	}


}
