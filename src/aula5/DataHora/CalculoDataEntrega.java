package aula5.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalculoDataEntrega {
    public static void main(String[] args) {
        LocalDate dataInicio = LocalDate.now();
        int prazoDias = 10;
        LocalDate dataEntrega = dataInicio.plusDays(prazoDias);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataEntrega.format(formatter);

        System.out.println("Data de entrega: " + dataFormatada);
    }
}
