package aula5.DataHora;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LembretePagamento {
    public static void main(String[] args) {
        LocalDate dataVencimento = LocalDate.of(2025,8,30);
        int antecedenciaDias = 7;
        LocalDate dataLembrete = dataVencimento.minusDays(antecedenciaDias);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatada = dataLembrete.format(formatter);
        System.out.println("Data do lembrete para pagamento: " + dataFormatada);
    }
}
