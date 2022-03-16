package ejercicio1;

import java.time.LocalDate;
import java.util.List;

public class Concurso {

	private List<Participante> participantes;
	private LocalDate fechaInicial;
	private LocalDate fechaFinal;

	public Concurso(List<Participante> participantes, LocalDate fechaInicial, LocalDate fechaFinal) {
		super();
		this.participantes = participantes;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
	}

	public void InscribirParticipante(Participante participante) {

		if ((this.fechaInicial.isBefore(LocalDate.now()) || this.fechaInicial.isEqual(LocalDate.now()))
				&& this.fechaFinal.isAfter(LocalDate.now())) {
			participantes.add(participante);
			if (this.fechaInicial.isEqual(LocalDate.now())) {
				participante.SumarPuntaje();
				System.out.println("El participante: " + participante.toString() + "Sumo 10 puntos");
			}
		} else {
			System.out.println("Se encuentra fuera de las fechas de inscripcion");
		}

	}

	public void ImprimirFechaInicial() {
		System.out.println(this.fechaInicial);

	}

	public String toString() {
		return "Concurso [participantes=" + participantes + "]";
	}

	public int CantidadParticipantes() {

		return participantes.size();
	}

	public LocalDate ObtenerFechaInicial() {
		return this.fechaInicial;
	}

}
