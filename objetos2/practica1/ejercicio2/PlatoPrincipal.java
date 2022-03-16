package ejercicio2;

public class PlatoPrincipal extends Alimento {

	private String nombre;
	public double costo;

	public PlatoPrincipal(String nombre, int costo) {
		super();
		this.nombre = nombre;
		this.costo = costo;
	}

	public double ObetenerCostoPlato() {

		return this.costo;
	}

}
