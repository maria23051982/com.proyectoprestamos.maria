package com.example.demo.prestamosentidades;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class FormasPagos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long numeroentidad;
 private String nombreentidad;
 private Long cuenta;
 private Calendar fechapago;
 private Double montopagado;
 private Long numerooperacion;
 
}
