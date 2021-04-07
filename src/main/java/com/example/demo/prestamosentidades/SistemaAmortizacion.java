package com.example.demo.prestamosentidades;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@Entity
@NoArgsConstructor
@AllArgsConstructor
public abstract class SistemaAmortizacion implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String FRANCES = "Frances";
	public static final String AMERICANO = "Americano";
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//	private Double interes;
//	private Double saldoRestante;
//	private Double cuota;
//	private Double capitalAmortizado;
//	private Double sumaInteres;
//	private Double sumaCuotas;
//	private Double sumaCapitalAmortizado; // Este es para el Frances, para buscar un atributo que me evitara pedir 2
//											// veces el mismo atributo a la clase padre.

	private Prestamo prestamo;

	private void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public static Frances get(String tipo) {
		if (FRANCES.equals(tipo))
			return new Frances();
		return null;
	}

}
