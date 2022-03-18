package ejercicio2;

public class Propina5porciento extends Propina {

	public double CalcularPropina(Pedido pedido) {

		return (pedido.sumarPedidoTotal() * 5 / 100);
	}
}
