package questao39;

import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            while (!scanner.hasNextInt()) {
                String entradaInvalida = scanner.next();
                System.out.println("\"" + entradaInvalida + "\" não é um número válido. Digite um número inteiro positivo: ");
            }
            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Número inválido. Digite apenas números inteiros positivos.");
            }
        } while (numero <= 0);

        int somaDosDivisores = calcularSomaDivisores(numero);

        if (somaDosDivisores == numero) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }

        scanner.close();
    }

    public static int calcularSomaDivisores(int numero) {
        int soma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }
        return soma;
    }
}
