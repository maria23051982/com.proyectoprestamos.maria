package com.example.demo.repositorios;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.prestamosentidades.Persona;

@Repository
@Transactional
public interface UsuarioRepository extends JpaRepository<Persona, Long> {

}