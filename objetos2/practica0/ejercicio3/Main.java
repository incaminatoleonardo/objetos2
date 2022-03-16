package ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

	public static void main(String[] args) {

		System.out.println("No anemico. Estara bien?");
		Tiempo fechaActual = new Tiempo(LocalDate.now());
		System.out.println("Formato corto: " + fechaActual.ImprimirfechaFormatoCorto());
		System.out.println("Formato largo: " + fechaActual.ImprimirfechaFormatoLargo());
		

		TiempoAnemica hora = new TiempoAnemica();

		System.out.println("Anemico. Estara bien?");
		hora.setHoraCorta(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(LocalDate.now()));
		System.out.println(hora.getHoraCorta());
		hora.setHoraLarga(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(LocalDate.now()));
		System.out.println(hora.getHoraLarga());

	}

}
