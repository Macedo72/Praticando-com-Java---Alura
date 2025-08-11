package aula1.variaveisAndTipos;

public class Categoria {
    public static void main(String[] args) {
        double preco = 150.00;
        if (preco <= 50) {
            System.out.println("Categoria do produto: Economico ");

        } else if (preco > 50.00 && preco <= 200.00) {
            System.out.println("Categoria do produto: Intermediario");
        } else {
            System.out.println("Categoria do porduto: Premium");
        }
    }
}

