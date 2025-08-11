package aula4.StringRegex;

import java.util.Scanner;

public class ExtrairParteDaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do arquivo: ");
        String arquivo = scanner.nextLine();

        int posicaoPonto = arquivo.lastIndexOf(".");
        if (posicaoPonto != -1) {
            String nomeSemExtensao = arquivo.substring(0, posicaoPonto);
            System.out.println("Nome do arquivo sem extensao: " + nomeSemExtensao);
        } else {
            System.out.println("O arquivo nao possui extensao.");
        }
        scanner.close();
    }
}
