package questao13;

import java.util.Scanner;

public class Questao13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("Aprovado!");
        } else if (media >= 5.0) {
            System.out.println("Recuperação!");
            System.out.print("Digite a nota da prova final: ");
            double notaFinal = sc.nextDouble();

            
            if (notaFinal >= 5.0) {
                System.out.println("Aprovado após a prova final!");
            } else {
                System.out.println("Reprovado após a prova final!");
            }
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}
