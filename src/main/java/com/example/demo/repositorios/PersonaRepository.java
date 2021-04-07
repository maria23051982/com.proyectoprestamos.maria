package com.example.demo.repositorios;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.prestamosentidades.Persona;

@Repository
@Transactional
public interface PersonaRepository extends JpaRepository<Persona, Long> {

	Optional<Persona> findByDni(Long dni);

}
