package questao37;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número inteiro não negativo: ");
            while (!scanner.hasNextInt()) {
                String entradaInvalida = scanner.next();
                System.out.println("\"" + entradaInvalida + "\" não é um número válido. Digite um número inteiro não negativo: ");
            }
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número inválido. O número deve ser não negativo.");
            }
        } while (numero < 0);

        BigInteger fatorial = BigInteger.ONE;
        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);

        scanner.close();
    }
}

