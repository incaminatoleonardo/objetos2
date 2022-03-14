package ejercicio2;

public abstract class Alimento {

	private String nombre;
	public int costo;

	public Alimento(String nombre, int costo) {
		this.nombre = nombre;
		this.costo = costo;
	}

	public abstract int ObetenerCosto();
}
