import java.util.Scanner;

public class SituacaoAluno {
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
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}