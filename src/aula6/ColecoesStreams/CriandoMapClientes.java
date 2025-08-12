package aula6.ColecoesStreams;

import java.util.HashMap;
import java.util.Map;

public class CriandoMapClientes {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Joao");
        clientes.put(3, "Guilherme");

        System.out.println("O nome do cliente com ID 2 eh: " + clientes.get(2));
    }
}
