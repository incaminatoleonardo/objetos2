package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private List<CantidadItemMenu> itemMenuBebidas = new ArrayList<>();
	private List<CantidadItemMenu> itemMenuComidas = new ArrayList<>();

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

}
