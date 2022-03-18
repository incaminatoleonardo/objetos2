package ejercicio2;

public class Main {

	public static void main(String[] args) {

		// Creacion del pedido
		itemMenu coca = new itemMenu("coca", 7);
		CantidadItemMenu tresCocas = new CantidadItemMenu(coca, 3);
		itemMenu jugo = new itemMenu("jugo", 5);
		CantidadItemMenu dosJugos = new CantidadItemMenu(jugo, 2);

		itemMenu pancho = new itemMenu("pancho", 12);
		CantidadItemMenu dosPanchos = new CantidadItemMenu(pancho, 2);
		itemMenu papas = new itemMenu("papas", 10);
		CantidadItemMenu unasPapas = new CantidadItemMenu(papas, 1);

		Pedido pedido = new Pedido();
		pedido.añadirBebida(dosJugos);
		pedido.añadirBebida(tresCocas);
		pedido.añadirComida(unasPapas);
		pedido.añadirComida(dosPanchos);

		// System.out.println(pedido.toString());

		// Crear Tarjeta
		TarjetaCredito tarjeta = new TCreditoMastercard();

		// Crear Propina
		Propina propina = new Propina3porciento();

		System.out.println(pedido.sumarPedidoBebida());
		System.out.println(pedido.sumarPedidoComida());

		System.out.println(tarjeta.CalcularPrecioTotal(pedido, propina));

	}

}
