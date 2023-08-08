package questao03;
import java.util.Scanner;

public class TurmaFaculdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a quantidade de homens na turma: ");
        int homens = entrada.nextInt();

        System.out.print("Digite a quantidade de mulheres na turma: ");
        int mulheres = entrada.nextInt();

        int totalAlunos = homens + mulheres;

        Double percentualHomens = (double) homens / totalAlunos * 100;
        Double percentualMulheres = (double) mulheres / totalAlunos * 100;

        System.out.printf("Percentual de homens: %.2f%%\n", percentualHomens);
        System.out.printf("Percentual de mulheres: %.2f%%\n", percentualMulheres);
    }
}