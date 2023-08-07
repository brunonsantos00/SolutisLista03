package questao55;

import java.util.Scanner;

public class Questao55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 100.0;
        int minutosVaiVai = 50;
        double valorExcedenteOutrasOperadoras = 0.65;
        double valorExcedenteVaiVai = 0.20;

        System.out.println("Valor do plano: R$ 50,00");
        saldo -= 50.0;

        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Digite o tipo de ligação (o, v ou f): ");
            char tipoLigacao = sc.next().charAt(0);

            System.out.print("Digite a quantidade de minutos: ");
            int minutos = sc.nextInt();

            double valorPagar = 0.0;

            if (tipoLigacao == 'v' || tipoLigacao == 'V') {
                if (minutos <= minutosVaiVai) {
                    minutosVaiVai -= minutos;
                    System.out.println("Minutos Vai-Vai restantes: " + minutosVaiVai);
                } else {
                    int minutosExcedentes = minutos - minutosVaiVai;
                    minutosVaiVai = 0;
                    valorPagar += minutosExcedentes * valorExcedenteVaiVai;
                }
            } else {
                if (tipoLigacao == 'o' || tipoLigacao == 'O') {
                    valorPagar += minutos * valorExcedenteOutrasOperadoras;
                } else if (tipoLigacao == 'f' || tipoLigacao == 'F') {
                    valorPagar += (minutos / 2.0) * valorExcedenteOutrasOperadoras;
                }
            }

            saldo -= valorPagar;
            System.out.println("Saldo: R$" + saldo);
            System.out.println("Valor a pagar: R$" + valorPagar);

            System.out.print("Deseja fazer outra ligação? (s/n): ");
            continuar = sc.next().charAt(0);
        }
        sc.close();
    }
}
