package ejercicio2;

public class TCreditoComPlus extends TarjetaCredito {

	public double CalcularPrecioTotal(Pedido pedido, Propina propina) {

		return super.CalcularPrecioTotal(pedido, propina) - (pedido.sumarPedidoTotal() * 2 / 100);

	}
}
