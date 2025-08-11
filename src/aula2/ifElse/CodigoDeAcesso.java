package aula2.ifElse;

import java.util.Scanner;

public class CodigoDeAcesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoCorreto = 2023;
        int nivelPermissaoMin = 1;
        int nivelPermissaoMax = 3;

        System.out.println("Digite o codigo de acesso: ");
        int codigoDeAcesso = scanner.nextInt();
        System.out.println("Digite o nivel de permissao: ");
        int nivelDePermissao = scanner.nextInt();

        boolean codigoValido = codigoDeAcesso == codigoCorreto;
        boolean permissaValida = nivelDePermissao >= nivelPermissaoMin && nivelDePermissao <= nivelPermissaoMax ;
        if (codigoValido && permissaValida){
            System.out.println("Acesso permitido. Bem-vindo!");
        } else {
            System.out.println("Acesso negado! Motivo(s): ");
            if (!codigoValido){
                System.out.println("- Codigo incorreto");
            }
            if (!permissaValida){
                System.out.println("- Nivel de permissao invalido");
            }
        }
        scanner.close();
    }
}
