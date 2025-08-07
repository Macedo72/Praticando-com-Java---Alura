package ifElse.aula2;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o terceiro lado: ");
        double lado3 = scanner.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1){
            System.out.println("Os lados podem formar um triangulo");
        }else {
            System.out.println("Os lados nao podem formar um triangulo");
        }
        scanner.close();
    }
}
