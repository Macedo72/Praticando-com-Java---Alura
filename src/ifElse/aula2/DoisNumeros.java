package ifElse.aula2;

import java.util.Scanner;

public class DoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int primeiroNum = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundoNum = scanner.nextInt();


        if (primeiroNum > segundoNum) {
            System.out.println("O maior numero eh " + primeiroNum);
        } else if (segundoNum > primeiroNum) {
            System.out.println("O maior numero eh " + segundoNum);
        } else{
            System.out.println("Os numeros sao iguais");
        }

            scanner.close();
    }
}