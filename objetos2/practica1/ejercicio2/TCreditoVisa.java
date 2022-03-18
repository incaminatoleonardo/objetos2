package ejercicio2;

public class TCreditoVisa extends TarjetaCredito {

	public double CalcularPrecioTotal(Pedido pedido, Propina propina) {

		return super.CalcularPrecioTotal(pedido, propina) - (pedido.sumarPedidoBebida() * 3 / 100);

	}

}
