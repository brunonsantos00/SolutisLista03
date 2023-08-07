package questao25;

import java.util.Scanner;

public class ValidadorHorario {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe a hora: ");
        int horas = leitura.nextInt();
        System.out.print("Informe os minutos: ");
        int minutos = leitura.nextInt();
        System.out.print("Informe os segundos: ");
        int segundos = leitura.nextInt();

        if (horas >= 0 && horas < 24){
            if(minutos >= 0 && minutos < 60){
                if(segundos >=0 && segundos <60){
                    System.out.println("Horário válido");
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
