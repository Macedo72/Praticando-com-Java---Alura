package aula7.POO;

public class MultaAtraso {
    String titulo;
    int diasAtraso;

    double calcularMulta() {
        return diasAtraso * 2.50;
    }

    void exibirDetalhes() {
        double multa = calcularMulta();
        System.out.printf("livro: %s | multa por %d dias de atraso: R$ %.2f%n",
                titulo, diasAtraso, multa);
    }

    public static void main(String[] args) {
        MultaAtraso pedido = new MultaAtraso();
        pedido.titulo = "Harry Potter";
        pedido.diasAtraso = 3;

        pedido.exibirDetalhes();
    }
}
