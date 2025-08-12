package aula5.DataHora;

import java.time.Duration;
import java.time.LocalTime;

public class DiferencaEntreHoras {
    public static void main(String[] args) {
        LocalTime horarioInicio = LocalTime.of(14,30,0);
        LocalTime horarioFim = LocalTime.of(16,45,0);

        Duration duration = Duration.between(horarioInicio, horarioFim);
        System.out.println("Diferenca de tempo: " + duration.toHours() + " horas e " + duration.toMinutesPart() + " minutos.");
    }
}
