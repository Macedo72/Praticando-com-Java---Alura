package aula5.DataHora;

import java.time.LocalDate;
import java.time.LocalTime;

public class DataHoraAtual {
    public static void main(String[] args) {
        String tarefa = "Enviar relatorio semanal";

        LocalDate dataCriacao = LocalDate.now();
        LocalTime horaCriacao = LocalTime.now();

        System.out.println("Tarefa: \"" + tarefa + "\"");
        System.out.println("Data de criacao: " + dataCriacao);
        System.out.println("Hora de criacao: " + horaCriacao);
    }
}
