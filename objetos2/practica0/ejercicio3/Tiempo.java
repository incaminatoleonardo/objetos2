package ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Tiempo {
	
	private LocalDate fecha;
	
	public Tiempo(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	// Eliminar el metodo estatico. No se usa mas
	public String ImprimirfechaFormatoCorto() {
		
		return DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(LocalDate.now());
	}

	public String ImprimirfechaFormatoLargo() {

		return DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(LocalDate.now());
	}

}
