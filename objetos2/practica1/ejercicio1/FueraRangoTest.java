package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FueraRangoTest {

	@Test
	void test() {

		// SET UP
		// Creo el Participante
		Cartera cartera = new Cartera();

		Participante participante2 = new Participante("Juan", "2", cartera);

		// Creo el concurso

		List<Participante> participantesFueraRango = new ArrayList<>();

		Concurso concursoFueraRango = new Concurso(participantesFueraRango, LocalDate.now().plusMonths(1),
				LocalDate.now().plusMonths(2));

		int cantidadPartipantesFueraRango = 0;

		// EXERCISE
		try {
			concursoFueraRango.InscribirParticipante(participante2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		// VERIFY

		assertEquals(cantidadPartipantesFueraRango, concursoFueraRango.CantidadParticipantes());

	}

}
