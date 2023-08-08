package questao04;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        Double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        Double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        Double nota3 = entrada.nextDouble();

        System.out.print("Digite a quarta nota: ");
        Double nota4 = entrada.nextDouble();

        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("A média do aluno é %.2f\n", media);
    }
}