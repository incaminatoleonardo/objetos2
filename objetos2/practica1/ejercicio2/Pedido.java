package ejercicio2;

public class Pedido {

	private Alimento alimento;
	private int cantidad;

	public Pedido(Alimento alimento, int cantidad) {
		super();
		this.alimento = alimento;
		this.cantidad = cantidad;
	}

	public int ObetenerCostoTotal() {
		return alimento.ObetenerCosto() * this.cantidad;
	}

}
