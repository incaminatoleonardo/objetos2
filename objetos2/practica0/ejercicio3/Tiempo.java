package ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Tiempo {

	public static void ImprimirfechaFormatoCorto() {

		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(LocalDate.now()));
	}

	public static void ImprimirfechaFormatoLargo() {

		System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(LocalDate.now()));
	}

}
