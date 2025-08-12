package aula6.ColecoesStreams;

import java.util.ArrayList;
import java.util.List;

public class AdicionandoElementosNaLista {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Joao");
        funcionarios.add("Maria");
        funcionarios.add("Guilherme");
        funcionarios.add("Ana");

        System.out.println("Lista de funcionarios: " + funcionarios);
    }
}
