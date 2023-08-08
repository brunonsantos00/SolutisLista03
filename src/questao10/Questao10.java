package questao10;

import java.util.Scanner;

//        Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu
//        salário liquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível
//        empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.

public class Questao10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário bruto: R$ ");
        double salarioBruto = sc.nextDouble();
        System.out.print("Digite o valor dos descontos: R$ ");
        double descontos = sc.nextDouble();
        System.out.print("Qual o valor em R$ do empréstimo que você precisa? R$ ");
        double emprestimo = sc.nextDouble();

        sc.close();

        double salarioLiquido = salarioBruto - descontos;

        if ((salarioLiquido * 30) / 100 >= emprestimo ) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo negado");
        }

    }

}