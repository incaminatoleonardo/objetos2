package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<CantidadItemMenu> itemMenuBebidas = new ArrayList<>();
	private List<CantidadItemMenu> itemMenuComidas = new ArrayList<>();
	// private TarjetaCredito tarjetacredito;
	// private Propina propina;

	public void añadirBebida(CantidadItemMenu comestible) {

		itemMenuBebidas.add(comestible);

	}

	public void añadirComida(CantidadItemMenu comestible) {

		itemMenuComidas.add(comestible);

	}

	public double sumarPedidoBebida() {

		double costoBebida = 0;
		for (CantidadItemMenu cantidadItemMenu : itemMenuBebidas) {

			costoBebida = costoBebida + cantidadItemMenu.sumarComestibles();

		}

		return costoBebida;
	}

	public double sumarPedidoComida() {

		double costoComida = 0;
		for (CantidadItemMenu cantidadItemMenu : itemMenuComidas) {

			costoComida = costoComida + cantidadItemMenu.sumarComestibles();

		}

		return costoComida;
	}

	public double sumarPedidoTotal() {

		return sumarPedidoBebida() + sumarPedidoComida();
	}

	@Override
	public String toString() {
		return "Pedido [itemMenuBebidas=" + itemMenuBebidas.toString() + ", itemMenuComidas="
				+ itemMenuComidas.toString() + "]";
	}

	/*
	 * public static void ConfirmarPedido(TarjetaCredito tarjeta, Propina propina) {
	 * double costoTotal = 0; for (CantidadItemMenu pedido : pedidos) { costoTotal =
	 * costoTotal + tarjeta.CalcularPrecioTotal(pedido, propina);
	 * 
	 * }
	 * 
	 * System.out.println("El costo total del pedido es: " + costoTotal); }
	 */

}
