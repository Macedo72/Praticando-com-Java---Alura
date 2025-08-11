package aula4.StringRegex;

import java.util.Scanner;

public class ValidaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: "); /*8 caracteres, Uma letra maiúscula,
        Uma letra minúscula, Um número, Um caractere especial
        */
        String senha = scanner.nextLine();

        String regex =  "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if (senha.matches(regex)) {
            System.out.println("A senha eh valida.");
        } else {
            System.out.println("A senha nao eh valida.");
        }
        scanner.close();
    }
}
