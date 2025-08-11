package aula3.LacoForWhile;

import java.util.Scanner;

public class EncontrarMaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os numeros separados por espaco = ");
        String[] numerosStr = scanner.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String numStr : numerosStr) {
            int num = Integer.parseInt(numStr);
            if (num > maior){
                maior = num;
            }
        }
        System.out.println("O maior numero eh: " + maior);
        scanner.close();
    }
}
