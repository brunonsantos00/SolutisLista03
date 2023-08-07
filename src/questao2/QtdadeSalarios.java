package questao2;

import java.util.Scanner;

public class QtdadeSalarios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual o seu salário atual?");
        double salarioAtual = leitura.nextDouble();

        System.out.println("Qual o salário mínimo atual?");
        double minimoAtual = leitura.nextDouble();

        double resposta = quantidadeDeSalariosMinimos(salarioAtual, minimoAtual);
        System.out.println("Você recebe uma quantidade de " + resposta + " salários mínimos.");


    }

    static double quantidadeDeSalariosMinimos(double salario,double minimo){
        double resultado = salario / minimo;
        return resultado;
    }
}
