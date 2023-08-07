package questao17;

import java.util.Scanner;

public class Horoscopo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Digite apenas o dia de seu aniversário");
        int diaAniversario = leitura.nextInt();

        System.out.println("Digite apenas o mes, em numero, de seu aniversario");
        int mesAniversario = leitura.nextInt();


        boolean dataValida = validarDataDeAniversario(diaAniversario,mesAniversario);


        if (dataValida) {
            System.out.println("A data está ok!");
            if (mesAniversario >= 1 && mesAniversario <=3){
                System.out.println("Nascido no 1º Trimestre");
            }
            else if (mesAniversario >= 4 && mesAniversario <=6) {
                System.out.println("Nascido no 2º Trimestre");
            }
            else if (mesAniversario >= 7 && mesAniversario <=9) {
                System.out.println("Nascido no 3º Trimestre");
            }
            else{
                System.out.println("Nascido no 4º Trimestre");
            }
            switch (mesAniversario) {
                case 1:
                    System.out.println("Janeiro");
                    break;
                case 2:
                    System.out.println("Fevereiro");
                    break;
                case 3:
                    System.out.println("Março");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Maio");
                    break;
                case 6:
                    System.out.println("Junho");
                    break;
                case 7:
                    System.out.println("Julho");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Setembro");
                    break;
                case 10:
                    System.out.println("Outubro");
                    break;
                case 11:
                    System.out.println("Novembro");
                    break;
                case 12:
                    System.out.println("Dezembro");
                    break;

            }
            if (diaAniversario >= 21 && mesAniversario == 3 || diaAniversario <= 20 && mesAniversario == 4){
                    System.out.println("Signo de Áries");
                }
            else if (diaAniversario >= 21 && mesAniversario == 4 || diaAniversario <= 20 && mesAniversario == 5){
                System.out.println("Signo de Touro");
            }
            else if (diaAniversario >= 21 && mesAniversario == 5 || diaAniversario <= 20 && mesAniversario == 6){
                System.out.println("Signo de Gêmeos");
            }
            else if (diaAniversario >= 21 && mesAniversario == 6 || diaAniversario <= 22 && mesAniversario == 7){
                System.out.println("Signo de Câncer");
            }
            else if (diaAniversario >= 23 && mesAniversario == 7 || diaAniversario <= 22 && mesAniversario == 8){
                System.out.println("Signo de Leão");
            }
            else if (diaAniversario >= 23 && mesAniversario == 8 || diaAniversario <= 22 && mesAniversario == 9){
                System.out.println("Signo de Virgem");
            }
            else if (diaAniversario >= 23 && mesAniversario == 9 || diaAniversario <= 22 && mesAniversario == 10){
                System.out.println("Signo de Libra");
            }
            else if (diaAniversario >= 23 && mesAniversario == 10 || diaAniversario <= 21 && mesAniversario == 11){
                System.out.println("Signo de Escorpião");
            }
            else if (diaAniversario >= 22 && mesAniversario == 11 || diaAniversario <= 21 && mesAniversario == 12){
                System.out.println("Signo de Sagitário");
            }
            else if (diaAniversario >= 22 && mesAniversario == 12 || diaAniversario <= 20 && mesAniversario == 1){
                System.out.println("Signo de Capricórnio");
            }
            else if (diaAniversario >= 21 && mesAniversario == 1 || diaAniversario <= 19 && mesAniversario == 2){
                System.out.println("Signo de Áquario");
            }
            else {
                System.out.println("Signo de Peixes");
            }
            }

        else{
            System.out.println("Data inválida");
        }

    }

    public static boolean validarDataDeAniversario(int dia, int mes){
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }

        int[] quantidadeDeDiasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2) {
            quantidadeDeDiasPorMes[1] = 29;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            quantidadeDeDiasPorMes[mes-1] = 30;
        }

        return dia <= quantidadeDeDiasPorMes[mes-1];
    }
}

