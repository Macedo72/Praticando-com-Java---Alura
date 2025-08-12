package aula6.ColecoesStreams;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ElementosUnicosDeUmaLista {
    public static void main(String[] args) {
        List<String> eventos = new ArrayList<>();

        eventos.add("Cena");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");
        eventos.add("Cena");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> eventosUnicos = new HashSet<>(eventos);

        System.out.println("Lista de eventos: " + eventosUnicos);
    }
}
