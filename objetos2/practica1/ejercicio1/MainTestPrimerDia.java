package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MainTestPrimerDia {

	@Test
	void test() {

		// SET UP
		// Creo el Participante
		Cartera cartera = new Cartera();
		Participante participante1 = new Participante("Jose", "1", cartera);

		// Creo el concurso
		List<Participante> participantes = new ArrayList<>();

		Concurso concurso = new Concurso(participantes, LocalDate.now(), LocalDate.now().plusDays(7));

		int cantidadPartipantes = 1;

		// EXERCISE
		concurso.InscribirParticipante(participante1);

		// VERIFY

		assertEquals(cantidadPartipantes, concurso.CantidadParticipantes());
		assertEquals(LocalDate.now(), concurso.ObtenerFechaInicial());

	}

}
