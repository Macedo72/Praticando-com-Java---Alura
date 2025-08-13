package aula7.POO;

import aula1.variaveisAndTipos.Livro;

public class ImprimirResumoLivro {
    String titulo;
    String autor;
    int paginas;

    void exibirResumo(){
        System.out.printf("\"%s\" de %s com %d páginas%n", titulo, autor, paginas);
    }

    public static void main(String[] args) {
        ImprimirResumoLivro livro = new ImprimirResumoLivro();
        livro.titulo = "Harry Potter";
        livro.autor = "Monteiro Lobato";
        livro.paginas = 300;
        livro.exibirResumo();
    }

}
