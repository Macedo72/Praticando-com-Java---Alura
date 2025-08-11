package aula4.StringRegex;

import java.util.Scanner;

public class VerificarStringNaSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra: ");
        String palavra = scanner.nextLine();

        if (texto.contains(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" esta presente no texto.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" nao esta presente no texto." );
        }
        scanner.close();
    }
}
