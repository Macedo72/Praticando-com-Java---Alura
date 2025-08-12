package aula6.ColecoesStreams;

import java.util.List;

public class CalculoTotalComImposto {
    public static void main(String[] args) {
        List<Double> precosProdutos = List.of(10.00, 29.50, 22.17, 199.99);
        double totalGasto = precosProdutos.stream().reduce(0.0, Double::sum);

        double imposto = totalGasto * 0.08;
        double totalComImposto = totalGasto + imposto;

        System.out.println("Valor Subtotal sem imposto: " + String.format("%.2f", totalGasto));
        System.out.println("Valor Total com imposto: " + String.format("%.2f", totalComImposto));
    }
}
