package aula7.POO;

public class AjustarCadastro {
    String nome;
    String cargo;
    int nivelAcesso;

    void atualizarDados(String novoCargo, int novoNivel) {
        System.out.println("...Antes...");
        System.out.println("Nome: " + nome  );
        System.out.println("Cargo: " + cargo );
        System.out.println("Nivel de acesso no sistema: " + nivelAcesso);

        cargo = novoCargo;
        nivelAcesso = novoNivel;

        System.out.println("...Depois...");
        System.out.println("Nome: " + nome  );
        System.out.println("Cargo: " + cargo );
        System.out.println("Nivel de acesso no sistema: " + nivelAcesso);

    }

    public static void main(String[] args) {
        AjustarCadastro ajustarCadastro = new AjustarCadastro();

        ajustarCadastro.nome = "Joao Macedo";
        ajustarCadastro.cargo = "Dev Senior";
        ajustarCadastro.nivelAcesso = 3;

        ajustarCadastro.atualizarDados("Gerente de TI", 5);
    }


}
