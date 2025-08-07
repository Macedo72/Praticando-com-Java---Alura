package ifElse.aula2;

import java.util.Scanner;

public class DiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana (em letra minuscula): ");
        String diaDaSemana = scanner.nextLine();
        scanner.close();

        if (diaDaSemana.equals("segunda") || diaDaSemana.equals("terca") ||
            (diaDaSemana.equals("quarta") || (diaDaSemana.equals("quinta") ||
            (diaDaSemana.equals("sexta"))))) {
            System.out.println(diaDaSemana + " eh uim dia util.");
        } else{
            System.out.println(diaDaSemana + " nao eh um dia util.");
        }
    }
}
