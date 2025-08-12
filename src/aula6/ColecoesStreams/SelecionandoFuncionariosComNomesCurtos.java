package aula6.ColecoesStreams;

import java.util.List;
import java.util.stream.Collectors;

public class SelecionandoFuncionariosComNomesCurtos {
    public static void main(String[] args) {
        List<String> funcionarios = List.of("Ana"," Maria" ,"Joao", "Guilherme");

        List<String> nomesCurtos = funcionarios.stream().filter(
                nome -> nome.length() <= 5).collect(Collectors.toList());

        System.out.println(nomesCurtos);
    }
}
