package questao41;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacaoComFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1;
        int palpite;
        boolean acertou = false;
        int tentativa = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação! Tente adivinhar o número sorteado de 1 a 100.");

        while (!acertou) {
            tentativa++;
            System.out.print("Tentativa #" + tentativa + ": Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite < numeroSorteado) {
                System.out.println("O número sorteado é maior que o palpite.");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número sorteado é menor que o palpite.");
            } else {
                System.out.println("Parabéns, você acertou! O número sorteado era: " + numeroSorteado);
                System.out.println("Você acertou em " + tentativa + " tentativas.");
                acertou = true;
            }
        }

        scanner.close();
    }
}
