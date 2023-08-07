package questao54;

import java.util.Scanner;

public class Questao54 {

    public static void main(String[] args) {

        double inicio, fim, incremento, dolar;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial: "); // Se os valores digitados forem de ponto flutuante, usar ","
        inicio = sc.nextDouble();

        System.out.print("Digite o valor final: ");
        fim = sc.nextDouble();

        System.out.print("Digite o valor de incremento: ");
        incremento = sc.nextDouble();

        System.out.print("Digite o valor do dólar: ");
        dolar = sc.nextDouble();

        sc.close();

        while (inicio <= fim) {
            System.out.printf("Real: R$ %.2f | Dolar: $ %.2f\n", inicio, inicio*dolar);
            inicio += incremento;
        }
    }

}
