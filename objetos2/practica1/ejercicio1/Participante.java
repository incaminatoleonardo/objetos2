package ejercicio1;

public class Participante {

	private String nombre;
	private String dni;
	private Cartera cartera;

	public Cartera ObtenerCartera() {
		return cartera;
	}

	public Participante(String nombre, String dni, Cartera cartera) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.cartera = cartera;
	}

	public void ImprimirPuntaje() {
		System.out.println(cartera.toString());
	}

	public String toString() {
		return "Participante [nombre=" + nombre + ", dni=" + dni + ", cartera=" + cartera + "]";
	}

}
