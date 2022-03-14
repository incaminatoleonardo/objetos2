package ejercicio2;

public class PlatoPrincipal extends Alimento {

	public PlatoPrincipal(String nombre, int costo) {
		super(nombre, costo);

	}

	@Override
	public int ObetenerCosto() {

		return this.costo;
	}

}
