package ejercicio2;

public class TCreditoMastercard extends TarjetaCredito {

	public double CalcularPrecioTotal(Pedido pedido, Propina propina) {

		return super.CalcularPrecioTotal(pedido, propina) - (pedido.ObtenerComida() * 2 / 100);

	}

}
