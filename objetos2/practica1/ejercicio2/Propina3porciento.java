package ejercicio2;

public class Propina3porciento extends Propina {

	public double CalcularPropina(Pedido pedido) {

		return (pedido.sumarPedidoTotal() * 3 / 100);
	}
}
