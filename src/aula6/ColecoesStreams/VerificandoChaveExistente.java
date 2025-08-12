package aula6.ColecoesStreams;

import java.util.HashMap;
import java.util.Map;

public class VerificandoChaveExistente {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Joao");
        clientes.put(2, "Marcio");
        clientes.put(3, "Ana");
        clientes.put(4, "Maria");
        clientes.put(5, "Guilherme");

        int IdCliente = 7;
        if (clientes.containsKey(IdCliente)) {
            String nomeCliente = clientes.get(IdCliente);
            System.out.println("O nome do cliente com ID " + IdCliente + " eh: " + nomeCliente);

        } else {
            System.out.println("Cliente com ID " + IdCliente + " nao encontrado.");
        }

    }
}
