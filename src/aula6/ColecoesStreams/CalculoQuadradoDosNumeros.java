package aula6.ColecoesStreams;

import java.util.List;
import java.util.stream.Collectors;

public class CalculoQuadradoDosNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2,3,4,5,6,7);

        List<Integer> quadrados = numeros.stream().map(numero -> numero * numero)
                .collect(Collectors.toList());

        System.out.println("Quadrado dos numeros " + quadrados);
    }
}
