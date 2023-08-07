package questao44;

import java.util.Scanner;

public class AritimeticaFornecidaUsuario {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores: ");
        int totalValores = scanner.nextInt();

        if (totalValores <= 0) {
            System.out.println("A quantidade de valores deve ser maior que zero.");
       
        }

        double soma = 0.0;

        System.out.println("Digite " + totalValores + " valores:");

        for (int i = 0; i < totalValores; i++) {
            System.out.print("Valor #" + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            soma += valor;
        }

        double media = soma / totalValores;
        System.out.println("A média aritmética dos " + totalValores + " valores é: " + media);

        scanner.close();
    }
}