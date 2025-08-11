package aula4.StringRegex;

import java.util.Scanner;

public class ValidaCPF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();
        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

        if (cpf.matches(regex)) {
            System.out.println("O CPF " + cpf + " esta no formato valido.");
        } else {
            System.out.println("O CPF " + cpf + " nao esta no formato valido.");
        }
        scanner.close();
    }
}
