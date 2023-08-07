package questao27;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = lerNumero(scanner, "Digite o primeiro número: ");
        double num2 = lerNumero(scanner, "Digite o segundo número: ");
        double num3 = lerNumero(scanner, "Digite o terceiro número: ");

        if (num1 == num2 && num2 == num3) {
            System.out.println("Os números são iguais.");
        } else {
            double maior = Math.max(num1, Math.max(num2, num3));
            System.out.println("O maior número é: " + maior);
        }
    }

    public static double lerNumero(Scanner scanner, String mensagem) {
        System.out.println(mensagem);
        // Evita quebrar o programa ao inserir outros tipos de entradas que não a esperada.
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, digite um número válido.");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}


