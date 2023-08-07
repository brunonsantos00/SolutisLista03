package questao45;

import java.util.Scanner;

public class MaiorValorDaLista {

	public static void main(String[] args) {
		
	        Scanner scanner = new Scanner(System.in);
	        int totalNumeros = 100;
	        Long maiorValor = Long.MIN_VALUE;

	        System.out.println("Digite " + totalNumeros + " números:");

	        for (int i = 0; i < totalNumeros; i++) {
	            System.out.print("Número #" + (i + 1) + ": ");
	            Long numero = scanner.nextLong();
	            
	            if (numero > maiorValor) {
	                maiorValor = numero;
	            }
	        }

	        System.out.println("O maior valor é: " + maiorValor);

	        scanner.close();
	    }
	}