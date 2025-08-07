package ifElse.aula2;

public class Main {
    public static void main(String[] args) {
        String nome = "Joao";
        double salario = 2890.00;
        int numeroDependentes = 2; // calculo de tributos e folha de pagamento
        boolean isento = true;

        if (salario > 2259.20 && !isento){ // ! = == false or true (ativa o boolean)
            double irrf = salario / 100 * 7.5; // imposto de renda
            System.out.println("Valor irrf: R$" + irrf);
        } else if (isento) {
            System.out.println("Contribuinte isento de irrf");
        } else {
            System.out.println("Nao ha valores de irrf");
        }
    }
}
