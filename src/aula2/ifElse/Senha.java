package aula2.ifElse;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        String senhaCorreta = "123456";
        Scanner scanner = new Scanner(System.in); // capturar o que o usuario digita
        // permite que o programa leia a entrada do usuario pelo teclado

        System.out.println("Digite a senha: ");
        String tentativa = scanner.nextLine();
        scanner.close();

        if (tentativa.equals(senhaCorreta)){
            System.out.println("Acesso liberado! Bem-vindo");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
