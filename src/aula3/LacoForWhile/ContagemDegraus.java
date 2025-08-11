package aula3.LacoForWhile;

import java.util.Scanner;

public class ContagemDegraus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de degraus: ");
        int degraus = scanner.nextInt();

        for (int i = 1; i <= degraus ; i++) {
            System.out.println("Subindo degrau " + i);

        }
        System.out.println("Voce chegou ao topo!");
        scanner.close();
    }
}
