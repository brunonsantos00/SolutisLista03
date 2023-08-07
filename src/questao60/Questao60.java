package questao60;

import java.text.NumberFormat;
import java.util.Scanner;

public class Questao60 {

    public static void main(String[] args) {
        float valorDivida, taxaCorrecao;
        int quantidadeAnos;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o valor da dívida (em R$): ");
        valorDivida = scanner.nextFloat();

        System.out.print("Entre com a taxa de correção (em %): ");
        taxaCorrecao = scanner.nextFloat() / 100 + 1;

        System.out.print("Entre com a quantidade de anos: ");
        quantidadeAnos = scanner.nextInt();

        scanner.close();

        System.out.println("Anos   Jan       Fev       Mar       Abr       Mai       Jun       Jul       Ago       Set       Out       Nov       Dez");
        for (int ano = 2007; ano <= 2007 + quantidadeAnos; ano++) {
            System.out.printf("%-7d", ano);
            for (int mes = 1; mes <= 12; mes++) {
                String dividaFormatada = formatarValor(valorDivida);
                System.out.printf("%-10s", dividaFormatada);
                valorDivida *= taxaCorrecao;
            }
            System.out.println();
        }
    }

    private static String formatarValor(float valor) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        return numberFormat.format(valor);
    }
}
