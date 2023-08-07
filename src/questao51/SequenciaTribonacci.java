package questao51;

import java.util.Scanner;

public class SequenciaTribonacci {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de termos (n) da sequência de Tribonacci que deseja exibir: ");
        int n = scanner.nextInt();

        System.out.println("Os " + n + " primeiros termos da sequência de Tribonacci são:");
        for (int i = 1; i <= n; i++) {
            System.out.print(tribonacci(i) + " ");
        }

        scanner.close();
    }

    public static int tribonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        } else {
            return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }
}