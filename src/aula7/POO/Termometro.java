package aula7.POO;

public class Termometro {
    String local;
    double temperaturaAtual;

    void exibirRelatorio(){
        System.out.println("Sensor no local: " + local);
        System.out.printf("Temperatura: %.1f °C\n", temperaturaAtual);

        if (temperaturaAtual > 37.5) {
            System.out.println("Temperatura alta demais!");
        }
    }

    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.local = "Setor A";
        termometro.temperaturaAtual = 40.1;

        termometro.exibirRelatorio();
    }
}
