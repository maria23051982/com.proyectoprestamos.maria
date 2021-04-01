package prestamosentidades;

public class CuotaRefinanciada {
	public CuotaRefinanciada() {
		this.nombre = "CuotaRefinanciada";
	}
	
	@Override
	public Estado getEstadoSiguiente() {
		return new CuotaPagada();
	}
}

