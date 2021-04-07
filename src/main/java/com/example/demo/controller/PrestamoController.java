package com.example.demo.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repositorios.PrestamoRepository;
import com.example.demo.prestamosentidades.Prestamo;

@RestController
@RequestMapping("/prestamo")

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

	}

