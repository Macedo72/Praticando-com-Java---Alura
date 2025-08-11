package aula1.variaveisAndTipos;

public class Viagem {
    public static void main(String[] args) {
        double consumoMedio = 12.5; // o carro faz 12,5 km/l
        double capacidadeTanque = 50; // o tanque tem capacidade para 50 litros
        double combustivelAtual = 20; // ha 20 litros disponiveis para usar
        double distanciaViagem = 200; // a viagem toda tem 200 km

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;
        System.out.println("Autonomia maxima do veiculo: " + autonomiaMaxima);
        System.out.println("Autonomia atual: " + autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem){
            System.out.println("Voce vai conseguir completar a viagem sem abastecer");
        } else {
            System.out.println("Voce nao vai conseguir completar a viagem. Va abastecer");
        }
    }
}

