package ejercicio2;

public class TCreditoComPlus extends TarjetaCredito {

	public double CalcularPrecioTotal(double costo, Propina propina) {

		return costo - (costo * 2 / 100);

	}
}
