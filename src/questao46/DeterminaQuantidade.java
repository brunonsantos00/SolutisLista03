package questao46;

import java.util.Scanner;

public class DeterminaQuantidade {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int totalPessoas = 200;
	        int totalHomensMaioresIdade = 0;
	        int totalMulheresMaioresIdade = 0;

	        System.out.println("Digite as informações das " + totalPessoas + " pessoas:");

	        for (int i = 0; i < totalPessoas; i++) {
	            System.out.println("Pessoa #" + (i + 1));
	            System.out.print("Sexo (M/F): ");
	            char sexo = scanner.next().charAt(0);
	            System.out.print("Idade: ");
	            int idade = scanner.nextInt();

	            if (sexo == 'M' || sexo == 'm') {
	                if (idade >= 18) {
	                    totalHomensMaioresIdade++;
	                }
	            } else if (sexo == 'F' || sexo == 'f') {
	                if (idade >= 18) {
	                    totalMulheresMaioresIdade++;
	                }
	            } else {
	                System.out.println("Sexo inválido. Use 'M' ou 'F'.");
	                i--; 
	            }
	        }

	        System.out.println("Quantidade de homens maiores de idade: " + totalHomensMaioresIdade);
	        System.out.println("Quantidade de mulheres maiores de idade: " + totalMulheresMaioresIdade);

	        scanner.close();
	    }
	}