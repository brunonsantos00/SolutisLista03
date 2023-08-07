package questao23;

import java.util.Scanner;

public class Aniversario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        System.out.println("Informe os dados da primeira pessoa:");
        System.out.print("Nome: ");
        pessoa1.nome = leitura.nextLine();

        System.out.print("Dia de nascimento: ");
        pessoa1.diaAniversario = leitura.nextInt();

        System.out.print("Mês de nascimento: ");
        pessoa1.mesAniversario = leitura.nextInt();

        System.out.println("Informe os dados da segunda pessoa:");
        System.out.print("Nome: ");
        leitura.nextLine();
        pessoa2.nome = leitura.nextLine();

        System.out.print("Dia de nascimento: ");
        pessoa2.diaAniversario = leitura.nextInt();
        System.out.print("Mês de nascimento: ");
        pessoa2.mesAniversario = leitura.nextInt();

        if (pessoa1.mesAniversario < pessoa2.mesAniversario || (pessoa1.mesAniversario == pessoa2.mesAniversario && pessoa1.diaAniversario < pessoa2.diaAniversario)) {
            System.out.println("O primeiro aniversariante é: " + pessoa1.nome);
        } else if (pessoa2.mesAniversario < pessoa1.mesAniversario || (pessoa2.mesAniversario == pessoa1.mesAniversario && pessoa2.diaAniversario < pessoa1.diaAniversario)) {
            System.out.println("O primeiro aniversariante é: " + pessoa2.nome);
        } else {
            System.out.println("Ambas as pessoas fazem aniversário no mesmo dia!");
        }
    }
}
