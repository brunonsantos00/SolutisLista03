package questao21;

import java.util.Scanner;

public class emprestimo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("""
                Olá! Bem vindo ao sistema de empréstimo da empresa.
                Para saber qual o seu valor possível de empréstimo, escolha qual o seu cargo, digitando o código correspondente:
                [1] Diretoria
                [2] Gerência
                [3] Operacional
                """);
        int cargo = leitura.nextInt();



        if (cargo >= 1 && cargo <=3) {
            System.out.println("Tudo certo! Agora por favor, digite qual o seu salário.");
            double salario = leitura.nextDouble();

            if (cargo == 1) {
                double empDir = salario * 0.3;
                System.out.println("O valor de empréstimo disponível é de: R$" + empDir);
            } else if (cargo == 2) {
                double empGer = salario * 0.25;
                System.out.println("O valor de empréstimo disponível é de: R$" + empGer);
            } else if (cargo == 3) {
                double empOpe = salario * 0.2;
                System.out.println("O valor de empréstimo disponível é de: R$" + empOpe);
            }
        }
        else {
            System.out.println("Código inválido.");
        }
    }
}