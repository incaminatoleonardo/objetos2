package ejercicio2;

public class Propina5porciento extends Propina {

	public double CalcularPropina(Pedido pedido) {

		return (pedido.CalcularPedido() * 5 / 100);
	}
}
