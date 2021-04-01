package com.example.demo.prestamosentidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class SistemaAmortizacionabstract {
      private Double tasa;
      private Double monto;
      private Long cantidaddecuotas;
}
