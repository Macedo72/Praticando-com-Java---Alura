package aula6.ColecoesStreams;

import java.util.ArrayList;
import java.util.List;

public class RemovendoElementos {
    public static void main(String[] args) {
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Joao");
        funcionarios.add("Lucas");
        funcionarios.add("Maria");
        funcionarios.add("Pedro");

        System.out.println("Lista sem remover: " + funcionarios);

        funcionarios.remove("Pedro");

        System.out.println("Lista depois de remover: " + funcionarios);


    }
}
