package aula4.StringRegex;

import java.util.Scanner;

public class RemoveEspacoEmBranco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        String nomeFormatado = nome.trim();
        System.out.print("Nome sem espacos: " + nomeFormatado);
        scanner.close();

    }
}
