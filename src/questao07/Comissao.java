package questao07;

import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da despesa do cliente: ");
        double despesa = scanner.nextDouble();

        double percentagemDaComissao = 0.10; 
        double comissao = despesa * percentagemDaComissao;

        System.out.println("Esse é o valor da comissao: R$ " + comissao);

        scanner.close();
    }
}