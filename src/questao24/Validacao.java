package questao24;

import java.util.Scanner;

public class Validacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe o dia: ");
        int dia = leitura.nextInt();
        System.out.print("Informe o mês: ");
        int mes = leitura.nextInt();
        System.out.print("Informe o ano: ");
        int ano = leitura.nextInt();

        boolean dataValida = verificador(dia, mes, ano);

        if (dataValida) {
            System.out.println("A data informada é válida.");
        } else {
            System.out.println("A data informada é inválida.");
        }

    }



    public static boolean verificador(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }

        int[] quantidadeDeDiasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

// Verificar se o ano é bissexto
        if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
            quantidadeDeDiasPorMes[1] = 29; // Fevereiro em ano bissexto tem 29 dias
        }

        //return em true/false ao analisar se o dia informado é menor ou igual a qtdade máxima de dias daquele mês
        return dia <= quantidadeDeDiasPorMes[mes-1];
    }
}

