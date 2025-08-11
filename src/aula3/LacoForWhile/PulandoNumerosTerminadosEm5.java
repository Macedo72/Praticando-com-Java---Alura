package aula3.LacoForWhile;

import java.util.Scanner;

public class PulandoNumerosTerminadosEm5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int limite = scanner.nextInt();
        for (int i = 1; i <= limite ; i++) {
            if (i % 10 == 5){
                continue;
            }
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
