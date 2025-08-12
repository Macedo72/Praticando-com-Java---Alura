package aula6.ColecoesStreams;

import java.util.ArrayList;
import java.util.List;

public class AcessandoElementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Joao");
        funcionarios.add("Maria");
        funcionarios.add("Pedro");
        funcionarios.add("Guilherme");

        System.out.println("A segunda pessoa da lista eh: " + funcionarios.get(1));
        System.out.println("Total de funcionarios: " + funcionarios.size());
    }
}
