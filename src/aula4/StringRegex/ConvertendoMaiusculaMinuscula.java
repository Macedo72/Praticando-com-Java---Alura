package aula4.StringRegex;

import java.util.Scanner;

public class ConvertendoMaiusculaMinuscula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        String maiuscula = texto.toUpperCase();
        String minuscula = texto.toLowerCase();

        System.out.println("Texto em maiuscula: " + maiuscula);
        System.out.println("Texto em minuscula: " + minuscula);
        scanner.close();
    }
}
