package ejercicio2;

public abstract class TarjetaCredito {

	public double CalcularPrecioTotal(Pedido pedido, Propina propina) {

		return pedido.CalcularPedido() + propina.CalcularPropina(pedido);

	}

}
