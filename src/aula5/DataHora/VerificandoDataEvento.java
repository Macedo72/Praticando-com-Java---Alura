package aula5.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class VerificandoDataEvento {
    public static void main(String[] args) {
        LocalDate dataEvento = LocalDate.of(2025,8,15);
        LocalDate dataAtual = LocalDate.of(2025,8,12);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        String dataEventoFormatada = dataEvento.format(formatter);
        String dataAtualFormatada = dataAtual.format(formatter);

        System.out.println("Data do evento: " + dataEventoFormatada );
        System.out.println("Data atual: " + dataAtualFormatada);

        if (dataEvento.isBefore(dataAtual)) {
            System.out.println("O evento ja foi.");
        } else {
            System.out.println("O evento ainda nao ocorreu");
        }
    }
}
