package ejercicio2;

public class TCreditoVisa extends TarjetaCredito {

	public double CalcularPrecioTotal(Pedido pedido, Propina propina) {

		return super.CalcularPrecioTotal(pedido, propina) - (pedido.ObtenerBebida() * 3 / 100);

	}

}
