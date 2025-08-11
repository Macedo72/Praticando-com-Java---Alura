package aula2.ifElse;

import java.util.Scanner;

public class NumeroEmIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do emprestimo: ");
        double emprestimo = scanner.nextDouble();
        scanner.close();

        if (emprestimo >= 1000 && emprestimo <= 5000){
            System.out.println("O valor " + emprestimo + " esta dentro do interalo para emprestimo");
        } else {
            System.out.println("O valor " + emprestimo + " nao esta dentro do intervalo para emprestimo");
        }
    }
}
