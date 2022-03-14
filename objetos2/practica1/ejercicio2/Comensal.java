package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Comensal {

	private static List<Pedido> pedidos = new ArrayList<>();
	private TarjetaCredito tarjetacredito;
	private Propina propina;

	public static void AñadirPedido(Alimento alimento, int cantidad) {

		Pedido pedido = new Pedido(alimento, cantidad);
		pedidos.add(pedido);

	}

	public static void ConfirmarPedido(TarjetaCredito tarjeta, Propina propina) {
		System.out.println("El costo total de bebidas es: " + Comensal.CostoBebidas());
	}

	public static int CostoBebidas() {
		int CostoBebidas = 0;
		for (Pedido pedido : pedidos) {
			CostoBebidas = CostoBebidas + pedido.ObetenerCostoTotal();
		}

		return CostoBebidas;
	}

}
