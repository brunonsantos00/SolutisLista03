package questao50;

import java.util.Scanner;

public class FibonnaciNezimo {

		public static void main(String[] args) {
			 Scanner scanner = new Scanner(System.in);

		        System.out.print("Digite o valor de n para calcular o n-ésimo termo da sequência de Fibonacci: ");
		        int n = scanner.nextInt();

		        long fibonacciTerm = fibonacci(n);
		        System.out.println("O " + n + "-ésimo termo da sequência de Fibonacci é: " + fibonacciTerm);

		        scanner.close();
		    }

		    public static long fibonacci(int n) {
		        if (n <= 0) {
		            return 0;
		        } else if (n == 1) {
		            return 1;
		        } else {
		            return fibonacci(n - 1) + fibonacci(n - 2);
		        }
		    }
		}