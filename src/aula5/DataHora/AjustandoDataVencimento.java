package aula5.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class AjustandoDataVencimento {
    public static void main(String[] args) {
        LocalDate dataVencimentoOriginal = LocalDate.of(2025, 8, 12);
        int adiamentoMeses = 1;
        LocalDate novaDataVencimento = dataVencimentoOriginal.plusMonths(adiamentoMeses);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = novaDataVencimento.format(formatter);

        System.out.println("Nova data de vencimento: " + dataFormatada);
    }
}
