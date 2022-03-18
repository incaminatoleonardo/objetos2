package ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainPedidosTest {

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
		TarjetaCredito tarjetaMaster = new TCreditoMastercard();
		TarjetaCredito tarjetaVisa = new TCreditoVisa();
		TarjetaCredito tarjetaPlus = new TCreditoComPlus();
		TarjetaCredito tarjetaViedma = new TarjetaCredito();

		// Crear Propina
		Propina propina3 = new Propina3porciento();
		Propina propina2 = new Propina2porciento();
		Propina propina5 = new Propina5porciento();

		// Creo Resultado esperado
		double resultadoEsperadoMasterCard = 66.27;
		double resultadoEsperadoVisa = 66.02;
		double resultadoEsperadoPlus = 65.00;
		double resultadoEsperadoViedma = 68.25;

		// EXERCISE

		// Visa
		assertEquals(resultadoEsperadoVisa, tarjetaVisa.CalcularPrecioTotal(pedido, propina3));

		// MasterCard
		assertEquals(resultadoEsperadoMasterCard, tarjetaMaster.CalcularPrecioTotal(pedido, propina3));

		// Plus
		assertEquals(resultadoEsperadoPlus, tarjetaPlus.CalcularPrecioTotal(pedido, propina2));

		// Tarjeta Viedma
		assertEquals(resultadoEsperadoViedma, tarjetaViedma.CalcularPrecioTotal(pedido, propina5));
	}

}
