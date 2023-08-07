package questao36;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        for (int i = primeiroNumero; i <= segundoNumero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
