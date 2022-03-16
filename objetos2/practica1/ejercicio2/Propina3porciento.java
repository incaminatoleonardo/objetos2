package ejercicio2;

public class Propina3porciento extends Propina {

	public double CalcularPropina(CantidadItemMenu pedido) {

		return (pedido.CalcularPedido() * 3 / 100);
	}
}
