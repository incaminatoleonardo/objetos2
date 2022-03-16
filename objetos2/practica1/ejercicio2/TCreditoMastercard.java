package ejercicio2;

public class TCreditoMastercard extends TarjetaCredito {

	public double CalcularPrecioTotal(CantidadItemMenu pedido, Propina propina) {

		return super.CalcularPrecioTotal(pedido, propina) - (pedido.ObtenerComida() * 2 / 100);

	}

}
