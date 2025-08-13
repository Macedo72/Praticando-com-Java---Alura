package aula7.POO;

public class ControleEstoque {
    String nome;
    int quantidade;

    void vendas(int quantidadeVendida) {
        if (quantidadeVendida <= quantidade) {
            quantidade -= quantidadeVendida;
            System.out.printf("venda realizada, estoque restante de %s: %d%n", nome, quantidade);
        } else {
            System.out.println("estoque insuficiente");
        }
    }

    public static void main(String[] args) {
        ControleEstoque controleEstoque = new ControleEstoque();

        controleEstoque.nome = "Camisa";
        controleEstoque.quantidade = 12;

        controleEstoque.vendas(3);
        controleEstoque.vendas(12);
    }
}
