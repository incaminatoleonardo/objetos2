package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Creo el Participante
		Cartera cartera = new Cartera();
		Participante participante1 = new Participante("Jose", "1", cartera);
		Participante participante2 = new Participante("Juan", "2", cartera);
		// Creo el concurso
		List<Participante> participantes = new ArrayList<>();
		Concurso concurso = new Concurso(participantes, LocalDate.of(2022, 03, 13), LocalDate.of(2022, 03, 20));

		// Añado el participante

		concurso.InscribirParticipante(participante1);
		concurso.InscribirParticipante(participante2);

		// Imprimo los participantes del concurso
		System.out.println(concurso.toString());
		participante1.ImprimirPuntaje();

	}

}
