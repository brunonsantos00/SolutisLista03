package questao38;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.print("Digite um número inteiro positivo maior que 1: ");
            // while para validar a entrada
            while (!scanner.hasNextInt()) {
                String entradaInvalida = scanner.next();
                System.out.println("\"" + entradaInvalida + "\" não é um número válido. Digite um número inteiro positivo maior que 1: ");
            }
            numero = scanner.nextInt();

            if (numero <= 1) {
                System.out.println("Número inválido. Digite um número inteiro positivo maior que 1.");
            }
        } while (numero <= 1);

        boolean ehPrimo = true;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
