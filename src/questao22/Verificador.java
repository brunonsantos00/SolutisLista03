package questao22;

import java.util.Scanner;

public class Verificador {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe a data de nascimento da primeira pessoa.");
        System.out.println("Dia:");
        int dia1 = leitura.nextInt();
        System.out.println("Mês:");
        int mes1 = leitura.nextInt();

        System.out.println("Informe a data de nascimento da segunda pessoa.");
        System.out.println("Dia:");
        int dia2 = leitura.nextInt();
        System.out.println("Mês:");
        int mes2 = leitura.nextInt();

        if (dia1 == dia2 && mes1 == mes2){
            System.out.println("As duas datas de aniversário são iguais.");
        }
        else{
            System.out.println("As duas datas de aniversário não são iguais.");
        }


    }
}
