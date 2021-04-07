package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.prestamosentidades.Prestamo;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

}
