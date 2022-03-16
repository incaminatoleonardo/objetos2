package ejercicio2;

public class Pedido {

	// private Alimento alimento;
	// private int cantidad;

	private Bebida bebida;
	private PlatoPrincipal comida;

	public Pedido(Bebida bebida, PlatoPrincipal comida) {
		super();
		this.bebida = bebida;
		this.comida = comida;
	}

	public double CalcularPedido() {

		return comida.ObetenerCostoPlato() + bebida.ObetenerCostoBebida();

	}

	public double ObtenerBebida() {

		return bebida.ObetenerCostoBebida();

	}

	public double ObtenerComida() {

		return comida.ObetenerCostoPlato();

	}

}
