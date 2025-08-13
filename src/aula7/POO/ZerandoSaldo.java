package aula7.POO;

public class ZerandoSaldo  {
    double saldo;

    void zerarSaldo () {
        saldo = 0.0;
    }

    void exibirSaldo () {
        System.out.printf("Saldo atual: R$ %.2f%n" , saldo);
    }

    public static void main(String[] args) {
        ZerandoSaldo conta = new ZerandoSaldo();
        conta.saldo = 2000.98;
        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}
