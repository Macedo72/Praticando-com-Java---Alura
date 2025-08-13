package aula7.POO;

import java.util.ArrayList;
import java.util.List;

public class ControleTarefas {
    String descricao;
    boolean concluida;

    void exibir() {
        if (concluida) {
            System.out.println("Tarefa: " + descricao + "\n  - Status: concluida");
        } else {
            System.out.println("Tarefa: " + descricao + "\n  - Status: pendente");
        }
    }

    public static void main(String[] args) {
        ControleTarefas t1 = new ControleTarefas();
        t1.descricao = "estudar POO";
        t1.concluida = false;

        ControleTarefas t2 = new ControleTarefas();
        t2.descricao = "fazer exercícios para praticar";
        t2.concluida = true;

        List<ControleTarefas> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (ControleTarefas t : lista) {
            t.exibir();
        }
    }
}
