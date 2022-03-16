package ejercicio2;

public class TCreditoVisa extends TarjetaCredito {

	public double CalcularPrecioTotal(CantidadItemMenu pedido, Propina propina) {

		return super.CalcularPrecioTotal(pedido, propina) - (pedido.ObtenerBebida() * 3 / 100);

	}

}
