package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainPedidosTestVisa {

	@Test
	void test() {

		// SET UP
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

		// Crear Tarjeta

		TarjetaCredito tarjetaVisa = new TCreditoVisa();

		// Crear Propina
		Propina propina3 = new Propina3porciento();

		// Creo Resultado esperado

		double resultadoEsperadoVisa = 66.02;

		// EXERCISE

		// Visa
		assertEquals(resultadoEsperadoVisa, tarjetaVisa.CalcularPrecioTotal(pedido, propina3));

		assertEquals(resultadoEsperadoVisa, tarjetaVisa.CalcularPrecioTotal(pedido, propina3), 0.01);// aca me toma
																										// hasta el
																										// segundo
																										// digito

	}

}
