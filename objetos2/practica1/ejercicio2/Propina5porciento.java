package ejercicio2;

public class Propina5porciento extends Propina {

	public double CalcularPropina(CantidadItemMenu pedido) {

		return (pedido.CalcularPedido() * 5 / 100);
	}
}
