package ejercicio2;

public class TarjetaCredito {

	public double CalcularPrecioTotal(Pedido pedido, Propina propina) {

		return pedido.sumarPedidoTotal() + propina.CalcularPropina(pedido);

	}

}
