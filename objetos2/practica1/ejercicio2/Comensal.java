package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Comensal {

	private static List<Pedido> pedidos = new ArrayList<>();
	private TarjetaCredito tarjetacredito;
	private Propina propina;

	public static void AñadirPedido(Bebida bebida, PlatoPrincipal comida) {

		Pedido pedido = new Pedido(bebida, comida);
		pedidos.add(pedido);

	}

	public static void ConfirmarPedido(TarjetaCredito tarjeta, Propina propina) {
		double costoTotal = 0;
		for (Pedido pedido : pedidos) {
			costoTotal = costoTotal + tarjeta.CalcularPrecioTotal(pedido, propina);

		}

		System.out.println("El costo total del pedido es: " + costoTotal);
	}

}
