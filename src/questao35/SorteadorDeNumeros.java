package questao35;

import java.util.Random;
import java.util.Scanner;

public class SorteadorDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Digite a quantidade de números sorteados: ");
        int quantidade = scanner.nextInt();
        // Definir a faixa com um mínimo e um máximo
        System.out.print("Digite o valor mínimo do sorteio: ");
        int minimo = scanner.nextInt();

        System.out.print("Digite o valor máximo do sorteio: ");
        int maximo = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            int numeroSorteado = rand.nextInt(maximo - minimo + 1) + minimo;
            System.out.println(numeroSorteado);
        }
    }
}
