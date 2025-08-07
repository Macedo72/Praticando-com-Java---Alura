package ifElse.aula2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DescontoNaCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorDaCompra = scanner.nextDouble();

        if (valorDaCompra >= 100.00){
            System.out.println("Desconto de 10% aplicado!");
            double desconto = valorDaCompra * 0.10;
            double valorComDesconto = valorDaCompra - desconto;
            System.out.println("Valor total a pagar: R$" + valorComDesconto);
        } else {
            System.out.println("Nenhum desconto aplicado");
            System.out.println("Valor total a pagar: R$" + valorDaCompra);
        }
        scanner.close();
    }
}
