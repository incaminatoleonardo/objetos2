package ejercicio2;

public class Bebida extends Alimento {

	public Bebida(String nombre, int costo) {
		super(nombre, costo);

	}

	@Override
	public int ObetenerCosto() {

		return this.costo;
	}

}
