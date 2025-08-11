package aula1.variaveisAndTipos;

public class Livro {
    public static void main(String[] args) {
        String titulo = "O pequeno Principe";
        String autor = "Antoine de Saint-Exupery";
        int paginas = 96;
        double preco = 39.90;
        char categoria = 'F';

        String categoriaDescricao;

        if (categoria == 'F'){
            categoriaDescricao = "Ficcao";
        } else if (categoria == 'N') {
            categoriaDescricao = "Nao ficcao";
        } else if (categoria == 'T') {
            categoriaDescricao = "Tecnologia";
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        } else {
            categoriaDescricao = "Categoria inválida";
        }
        System.out.println("Livro cadastrado:" +
                " \"" + titulo + "\",\nde " + autor + ".\nEle possui " + paginas +
                " páginas,\ncusta R$" + preco + " e \npertence à categoria " + categoriaDescricao +
                ".");
    }
}

