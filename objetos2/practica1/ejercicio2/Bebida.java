package ejercicio2;

public class Bebida extends Alimento {

	private String nombre;
	public double costo;

	public Bebida(String nombre, int costo) {
		super();
		this.nombre = nombre;
		this.costo = costo;
	}

	public double ObetenerCostoBebida() {
		return this.costo;
	}
}
