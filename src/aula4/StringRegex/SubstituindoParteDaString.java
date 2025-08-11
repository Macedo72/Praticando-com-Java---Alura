package aula4.StringRegex;

import java.util.Scanner;

public class SubstituindoParteDaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();
        System.out.print("Digite a palavra a ser substituida: ");
        String palavraAntiga = scanner.nextLine();

        if (!texto.contains(palavraAntiga)){
            System.out.println("Palavra nao encontrada.");
            scanner.close();
            return;
        }
        System.out.println("Digite a nova palavra: ");
        String palavraNova = scanner.nextLine();
        String textoModificado = texto.replace(palavraAntiga, palavraNova);
        System.out.println("Texto modificado: " + textoModificado);
        scanner.close();
    }
}
