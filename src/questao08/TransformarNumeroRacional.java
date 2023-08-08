package questao08;

import java.util.Scanner;

public class TransformarNumeroRacional {

	 public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o numerador: ");
	        int numerador = scanner.nextInt();

	        System.out.print("Digite o denominador: ");
	        int denominador = scanner.nextInt();

	        if (denominador != 0) {
	            double resultado = (double) numerador / denominador;
	            System.out.println("Esse e o numero real: " + resultado);
	        } else {
	            System.out.println("Denominador nao pode ser zero");
	        }

	        scanner.close();
	    }
	}