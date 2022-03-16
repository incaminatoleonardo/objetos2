package ejercicio2;

public class Propina2porciento extends Propina {

	public double CalcularPropina(Pedido pedido) {
		return (pedido.CalcularPedido() * 2 / 100);
	}

}
