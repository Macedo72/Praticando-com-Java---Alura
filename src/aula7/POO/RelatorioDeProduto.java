package aula7.POO;

public class RelatorioDeProduto {
    String nome;
    double preco;
    int quantidade;

    void exibirInformacoes(){
        System.out.println("Produto: " + nome);
        System.out.printf("Preco: R$ %.2f\n" , preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }

    public static void main(String[] args) {
        RelatorioDeProduto produto = new RelatorioDeProduto();
        produto.nome = "Mouse Gamer";
        produto.preco = 399.90;
        produto.quantidade = 30;

        produto.exibirInformacoes();
    }

}
