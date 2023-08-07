package questao26;

import java.util.Scanner;

public class DiferencaHorarios {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


        System.out.println("Vamos analisar o primeiro horário para efetuar a diferença de tempo:");
        System.out.print("Informe a hora: ");
        int hora1 = leitura.nextInt();
        System.out.print("Informe os minutos: ");
        int minuto1 = leitura.nextInt();
        System.out.print("Informe os segundos: ");
        int segundo1 = leitura.nextInt();

        System.out.println("Vamos analisar o segundo horário para efetuar a diferença de tempo:");
        System.out.print("Informe a hora: ");
        int hora2 = leitura.nextInt();
        System.out.print("Informe os minutos: ");
        int minuto2 = leitura.nextInt();
        System.out.print("Informe os segundos: ");
        int segundo2 = leitura.nextInt();

        // converter horario 1 para segundos
        int hora1ParaSegundo = hora1 * 3600;
        int minuto1ParaSegundo = minuto1 * 60;
        int segundosTotalHora1 = hora1ParaSegundo + minuto1ParaSegundo + segundo1;

        // converter horario 2 para segundos
        int hora2ParaSegundo = hora2 * 3600;
        int minuto2ParaSegundo = minuto2 * 60;
        int segundosTotalHora2 = hora2ParaSegundo + minuto2ParaSegundo + segundo2;

        if (hora1 >= 0 && hora1 < 24 && hora2 >=0 && hora2 < 24){
            if(minuto1 >= 0 && minuto1 < 60 && minuto2 >= 0 && minuto2 < 60){
                if(segundo1 >=0 && segundo1 < 60 && segundo2 >=0 && segundo2 <60){
                    System.out.println("Horário válido");
                    if (segundosTotalHora1 >= segundosTotalHora2){
                        System.out.println("A diferença de tempo, em segundos, é de: " + (segundosTotalHora1 - segundosTotalHora2) + " segundos");
                    }
                    else {
                        System.out.println("A diferença de tempo, em segundos, é de: " + (segundosTotalHora2 - segundosTotalHora1) + " segundos");
                    }


                }
                else{
                    System.out.println("Horário inválido");
                }
            }
            else {
                System.out.println("Horário inválido");
            }
        }
        else{
            System.out.println("Horário inválido");
        }
    }
}






