package aula7.POO;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    String nome;
    double preco;
    int quantidade;

    double calcularTotal() {
        return preco * quantidade;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras i1 = new CarrinhoDeCompras();
        i1.nome = "teclado";
        i1.preco = 300.99;
        i1.quantidade = 1;

        CarrinhoDeCompras i2 = new CarrinhoDeCompras();
        i2.nome = "mouse";
        i2.preco = 299.90;
        i2.quantidade = 2;

        List<CarrinhoDeCompras> carrinho = new ArrayList<>();
        carrinho.add(i1);
        carrinho.add(i2);

        double totalCompra = 0;
        for (CarrinhoDeCompras item : carrinho) {
            totalCompra += item.calcularTotal();
        }

        System.out.printf("Total da compra: R$ %.2f\n", totalCompra);
    }
}
