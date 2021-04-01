package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.prestamosentidades.IUsuariobaseDao;

public class Usuariobase implements IUsuariobaseService{
	
	@Autowired
	private IUsuariobaseDao usuariobaseDao;
	
	/**
	 * Method to get all the task
	 * @return
	 */

	@Override
	public List<Usuariobase> getUsuariobase() {
		return getUsuariobase() ;
	}
}

