package aula4.StringRegex;

import java.util.Scanner;

public class FormatandoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor (use virgulas): ");
        double valor = scanner.nextDouble();

        String valorFormatado = String.format("R$ %.2f", valor);
        System.out.println("valor formatado: " + valorFormatado);
    }

}
