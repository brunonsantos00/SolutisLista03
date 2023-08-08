package questao48;

import java.util.Scanner;

public class AprovacaoAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();
        
        System.out.print("Digite a quantidade total de aulas: ");
        int qtdTotalAulas = scanner.nextInt();

        System.out.print("Digite a quantidade de notas: ");
        int qtdNotas = scanner.nextInt();

        System.out.print("Digite a quantidade de faltas: ");
        int qtdFaltas = scanner.nextInt();

        

        double[] notas = new double[qtdNotas];
        for (int i = 0; i < qtdNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double media = calcularMedia(notas);
        boolean aprovadoPorNota = verificarAprovacaoPorNota(media);
        boolean aprovadoPorFaltas = verificarAprovacaoPorFaltas(qtdFaltas, qtdTotalAulas);

        exibirResultado(nomeAluno, aprovadoPorNota, aprovadoPorFaltas);

        scanner.close();
    }

    public static double calcularMedia(double[] notas) {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static boolean verificarAprovacaoPorNota(double media) {
        return media >= 7.0 && media <= 10.0;
    }

    public static boolean verificarAprovacaoPorFaltas(int qtdFaltas, int qtdTotalAulas) {
        return qtdFaltas <= 0.25 * qtdTotalAulas;
    }

    public static void exibirResultado(String nomeAluno, boolean aprovadoPorNota, boolean aprovadoPorFaltas) {
        if (aprovadoPorNota && aprovadoPorFaltas) {
            System.out.println("Resultado para o aluno " + nomeAluno + ": Aprovado");
        } else if (!aprovadoPorNota) {
            System.out.println("Resultado para o aluno " + nomeAluno + ": Reprovado por nota");
        } else if (!aprovadoPorFaltas) {
            System.out.println("Resultado para o aluno " + nomeAluno + ": Reprovado por faltas");
        }
    }
}
