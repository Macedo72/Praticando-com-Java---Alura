package aula7.POO;

public class CalculoNotas {
    String nome;
    double nota1;
    double nota2;

    void mostrarResultado (){
        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Media: " + media );

        if (media >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }

    }

    public static void main(String[] args) {
        CalculoNotas calculoNotas = new CalculoNotas();
        calculoNotas.nome = "Joao Macedo";
        calculoNotas.nota1 = 7.0;
        calculoNotas.nota2 = 9.8;

        calculoNotas.mostrarResultado();
    }
}
