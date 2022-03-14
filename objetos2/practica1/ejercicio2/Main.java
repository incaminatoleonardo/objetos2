package ejercicio2;

public class Main {

	public static void main(String[] args) {

		// Creacion de bebias
		Alimento coca = new Bebida("Coca", 7);
		Alimento jugo = new Bebida("Jugo", 6);
		Alimento agua = new Bebida("Agua", 4);
		// Creacion de platos
		Alimento hamburguesa = new PlatoPrincipal("Hamburguesa", 15);
		Alimento salchicha = new PlatoPrincipal("Salchicha", 12);
		Alimento papas = new PlatoPrincipal("Papas", 10);

		// Creacion de pedidos
		Comensal.AñadirPedido(agua, 2);
		Comensal.AñadirPedido(coca, 3);
		Comensal.AñadirPedido(papas, 1);

		// Crear Tarjeta
		TarjetaCredito tarjeta = new CreditoVisa();

		// Crear Propina
		Propina propina = new Propina3porciento();

		Comensal.ConfirmarPedido(tarjeta, propina);

	}

}
