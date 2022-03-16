package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {

		// SET UP
		// Creo el Participante
		Cartera cartera = new Cartera();
		Participante participante1 = new Participante("Jose", "1", cartera);
		Participante participante2 = new Participante("Juan", "2", cartera);

		// Creo el concurso
		List<Participante> participantes = new ArrayList<>();
		List<Participante> participantesFueraRango = new ArrayList<>();
		Concurso concurso = new Concurso(participantes, LocalDate.now(), LocalDate.now().plusDays(7));
		Concurso concursoFueraRango = new Concurso(participantesFueraRango, LocalDate.now().plusMonths(1),
				LocalDate.now().plusMonths(2));
		int cantidadPartipantes = 1;
		int cantidadPartipantesFueraRango = 0;

		// EXERCISE
		concurso.InscribirParticipante(participante1);
		concursoFueraRango.InscribirParticipante(participante2);

		// VERIFY
		// System.out.println(concursoFueraRango.CantidadParticipantes());
		assertEquals(cantidadPartipantes, concurso.CantidadParticipantes());
		assertEquals(LocalDate.now(), concurso.ObtenerFechaInicial());
		assertEquals(cantidadPartipantesFueraRango, concursoFueraRango.CantidadParticipantes());

		

		/* Preguntar como ver el porcentaje del codigo abarcado por el test */

	}

}
