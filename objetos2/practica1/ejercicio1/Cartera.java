package ejercicio1;

public class Cartera {

	private int puntaje;
	private int bonificacion = 10;

	public void Sumarpuntaje() {
		puntaje = +bonificacion;
	}

	public String toString() {
		return "Cartera [puntaje=" + puntaje + "]";
	}

}
