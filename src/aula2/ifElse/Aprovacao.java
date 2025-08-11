package aula2.ifElse;

public class Aprovacao {
    public static void main(String[] args) {
        double media = 4.9; // apenas mudar a media.

        if (media >= 7.0){
            System.out.println("O estudante teve media de " + media + " e foi aprovado.");
        } else if (media >= 5.0) {
            System.out.println("O estudante teve media de " + media + " e esta de recuperacao.");

        } else {
            System.out.println("O estudante teve media de " + media + " e foi reprovado." );
        }


    }
}