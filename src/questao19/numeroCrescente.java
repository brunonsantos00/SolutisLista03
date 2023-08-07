package questao19;

import java.util.Scanner;

public class numeroCrescente {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número");
        double numero1 = leitura.nextDouble();
        System.out.println("Digite outro número");
        double numero2 = leitura.nextDouble();


        if (numero1 > numero2) {
            System.out.println("O número maior é: " + numero1 + " e o número menor é: " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("O número maior é: " + numero2 + " e o número menor é: " + numero1);
        } else {
            System.out.println("Os números são iguais");
        }
    }
}