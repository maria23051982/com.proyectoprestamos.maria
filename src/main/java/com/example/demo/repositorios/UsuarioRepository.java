package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.prestamosentidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
