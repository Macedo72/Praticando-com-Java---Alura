package aula5.DataHora;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class ControleExpediente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.print("Digite o horario de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), formatter);

        System.out.print("Digite a carga horaria diaria (em horas): ");
        int cargaHoraria = scanner.nextInt();

        System.out.print("Digite o horario real de saida (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(scanner.next(), formatter);

        scanner.close();

        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);

        Duration diferenca = Duration.between(saidaPrevista, saidaPrevista);
        long horasExtras = diferenca.toHours();
        long minutosExtras = diferenca.toMinutesPart();

        System.out.println("\nHorario de entrada: " + entrada.format(formatter));
        System.out.println("Horario de saida previsto: " + saidaPrevista.format(formatter));
        System.out.println("Horario real de saida: " + saidaReal.format(formatter));

        if (horasExtras == 0 && minutosExtras == 0) {
            System.out.println("Saldo de horas: 0h 0min");
        } else {
            String sinal;
            if (horasExtras > 0 || minutosExtras > 0)  {
                sinal = "+";
            } else {
                sinal = "-";
            }
            System.out.println("Saldo de horas: " + sinal + Math.abs(horasExtras) + "h" + Math.abs(minutosExtras) + "min");
        }

    }
}
