package ejercicio2;

public class Main {

	public static void main(String[] args) {

		// Creacion de bebias
		Bebida coca = new Bebida("Coca", 7);
		Bebida jugo = new Bebida("Jugo", 6);
		Bebida agua = new Bebida("Agua", 4);
		// Creacion de platos
		PlatoPrincipal hamburguesa = new PlatoPrincipal("Hamburguesa", 15);
		PlatoPrincipal salchicha = new PlatoPrincipal("Salchicha", 12);
		PlatoPrincipal papas = new PlatoPrincipal("Papas", 10);

		// Creacion de pedidos
		Comensal.AñadirPedido(coca, hamburguesa);
		// Comensal.AñadirPedido(jugo, papas);
		// Comensal.AñadirPedido(coca, hamburguesa);

		// Crear Tarjeta
		TarjetaCredito tarjeta = new TCreditoVisa();

		// Crear Propina
		Propina propina = new Propina3porciento();

		Comensal.ConfirmarPedido(tarjeta, propina);

	}

}
