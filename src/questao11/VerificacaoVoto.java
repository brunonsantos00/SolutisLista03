package questao11;

import java.util.Scanner;

public class VerificacaoVoto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if (idade >= 16 && idade <= 65) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }
    }
}