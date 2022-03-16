package ejercicio2;

public class Main {

	public static void main(String[] args) {

		// Creacion del pedido
		itemMenu coca = new itemMenu("coca", 7);
		CantidadItemMenu tresCocas = new CantidadItemMenu(coca, 3);
		itemMenu jugo = new itemMenu("jugo", 5);
		CantidadItemMenu dosjugos = new CantidadItemMenu(jugo, 2);
		
		Pedido pedido = new Pedido();
		pedido.AñadirBebida(dosjugos);
		pedido.AñadirBebida(tresCocas);
		
		
	

		// Crear Tarjeta
		TarjetaCredito tarjeta = new TCreditoVisa();

		// Crear Propina
		Propina propina = new Propina3porciento();

		

	}

}
